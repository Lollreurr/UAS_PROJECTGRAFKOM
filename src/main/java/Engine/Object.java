package Engine;

import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glVertexAttribPointer;
import static org.lwjgl.opengl.GL30.glBindVertexArray;
import static org.lwjgl.opengl.GL30.glGenVertexArrays;

public class Object extends ShaderProgram{

    List<Vector3f> vertices;
    List<Vector3f> verticesColor;
    int vao;
    int vbo;
    int vboColor;
    Vector4f color;
    UniformsMap uniformsmap;

    public Matrix4f model;

    List<Object> childObject;

    List<Vector3f> normal;
    List<Integer> index;
    int ibo;

    public List<Object> getChildObject(){
        return childObject;
    }

    public void setChildObject(List<Object> childObject){
        this.childObject = childObject;
    }

    public Vector3f updateCenterPoint(){
        Vector3f centerTemp = new Vector3f();
        model.transformPosition(0.0f, 0.0f, 0.0f, centerTemp);
        return centerTemp;
    }

    public Object(){

    }

    public Object(List<ShaderModuleData> shaderModuleDataList
            , List<Vector3f> vertices, Vector4f color) {
        super(shaderModuleDataList);
        this.vertices = vertices;
        //setupVAOVBO();
        this.color = color;
        uniformsmap = new UniformsMap(getProgramId());
//        uniformsmap.createUniform("uni_color");
//        uniformsmap.createUniform("model");
//        uniformsmap.createUniform("view");
//        uniformsmap.createUniform("projection");
        model = new Matrix4f();
        childObject = new ArrayList<>();

    }

    public Object(List<ShaderModuleData> shaderModuleDataList
            , List<Vector3f> vertices, List<Vector3f> verticesColor) {
        super(shaderModuleDataList);
        this.vertices = vertices;
        this.verticesColor = verticesColor;
        setupVAOVBOWithVerticesColor();
    }


    public void setupVAOVBO(){
        //set vao
        vao = glGenVertexArrays();
        glBindVertexArray(vao);

        //set vbo
        vbo = glGenBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, vbo);
        glBufferData(GL_ARRAY_BUFFER,
                Utils.listoFloat(vertices),
                GL_STATIC_DRAW);
    }

    public void setupVAOVBOWithVerticesColor(){
        //set vao
        vao = glGenVertexArrays();
        glBindVertexArray(vao);

        //set vbo
        vbo = glGenBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, vbo);
        glBufferData(GL_ARRAY_BUFFER,
                Utils.listoFloat(vertices),
                GL_STATIC_DRAW);

        //set vbo color
        vboColor = glGenBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, vboColor);
        glBufferData(GL_ARRAY_BUFFER,
                Utils.listoFloat(verticesColor),
                GL_STATIC_DRAW);
    }

    public void drawSetup(Camera camera, Projection projection){
        bind();
        uniformsmap.setUniform("uni_color", color);
        uniformsmap.setUniform("model", model);
        uniformsmap.setUniform("view", camera.getViewMatrix());
        uniformsmap.setUniform("projection", projection.getProjMatrix());
        // Bind VBO
        glEnableVertexAttribArray(0);
        glBindBuffer(GL_ARRAY_BUFFER, vbo);
        glVertexAttribPointer(0, 3,
                GL_FLOAT,
                false,
                0, 0);
    }


    public void drawSetupWithVerticesColor(){
        bind();
        // Bind VBO
        glEnableVertexAttribArray(0);
        glBindBuffer(GL_ARRAY_BUFFER, vbo);
        glVertexAttribPointer(0, 3,
                GL_FLOAT,
                false,
                0, 0);
        glEnableVertexAttribArray(1);
        glBindBuffer(GL_ARRAY_BUFFER, vboColor);
        glVertexAttribPointer(1, 3,
                GL_FLOAT,
                false,
                0, 0);
    }

    public void draw(Camera camera, Projection projection){
        drawSetup(camera, projection);
        // Draw the vertices
        //optional
        glLineWidth(10); //ketebalan garis
        glPointSize(10); //besar kecil vertex
        //wajib
        glDrawArrays(GL_TRIANGLES,0,
                vertices.size());
        for(Object child:childObject){
            child.draw(camera, projection);
        }
    }

    public void drawObject(Camera camera, Projection projection) {
        drawSetup(camera, projection);
        // Draw the vertices
        //optional
        glDrawElements(GL_TRIANGLES, index.size(), GL_UNSIGNED_INT, 0);
        for (Object child: childObject){
            child.draw(camera, projection);
        }
    }

    public void drawWithVerticesColor(){
        drawSetupWithVerticesColor();
        // Draw the vertices
        //optional
        glLineWidth(10); //ketebalan garis
        glPointSize(10); //besar kecil vertex
        //wajib
        glDrawArrays(GL_POLYGON,0,
                vertices.size());
    }

    public void translateObject(Float offsetX, Float offsetY, Float offsetZ){
        model = new Matrix4f().translate(offsetX, offsetY, offsetZ).mul(new Matrix4f(model));
        for (Object child:childObject){
            child.translateObject(offsetX, offsetY, offsetZ);
        }
    }

    public void rotateObject(Float degree, Float offsetX, Float offsetY, Float offsetZ){
        model = new Matrix4f().rotate(degree, offsetX, offsetY, offsetZ).mul(new Matrix4f(model));
        for (Object child:childObject){
            child.rotateObject(degree, offsetX, offsetY, offsetZ);
        }
    }

    public void scaleObject(Float x, Float y, Float z){
        model = new Matrix4f().scale(x,y,z).mul(new Matrix4f(model));
        for (Object child:childObject){
            child.scaleObject(x, y, z);
        }
    }

    public void setVertices(List<Vector3f> vertices) {
        this.vertices = vertices;
        setupVAOVBO();
    }

    public void setNormal(List<Vector3f> normal) {
        this.normal = normal;
        setupVAOVBO();
    }

    public void setIndicies(List<Integer> indicies){
        this.index = indicies;
        setupVAOVBO();
        //ibo
        ibo = glGenBuffers();
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER,ibo);
        glBufferData(GL_ELEMENT_ARRAY_BUFFER,Utils.listoInt(index),GL_STATIC_DRAW);
    }
}