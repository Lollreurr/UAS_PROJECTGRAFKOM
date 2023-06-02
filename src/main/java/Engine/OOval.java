package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.List;

import static org.lwjgl.opengl.GL11.GL_POLYGON;
import static org.lwjgl.opengl.GL11.glDrawArrays;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL15.GL_STATIC_DRAW;

public class OOval extends Object{
    //index buffer object || element buffer object

    float radiusX;
    float radiusY;
    Vector3f centerPoint;

    List<Vector3f> normal;
    List<Integer> index;
    int ibo;

    public OOval(){

    }

    public OOval(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color, Vector3f centerPoint, float rX, float rY) {
        super(shaderModuleDataList, vertices, color);
        this.radiusX = rX;
        this.radiusY = rY;
        this.centerPoint = centerPoint;
        float x, y, z = 0;
        for (double i = 0; i < 360; i += 360 / 360) {
            x = (float) (centerPoint.x + rX * Math.cos(i));
            y = (float) (centerPoint.y + rY * Math.sin(i));
            this.vertices.add(new Vector3f(x, y, z));
        }
        // di comment supaya square bisa jalan
        //setupVAOVBO();
    }

//    public void draw() {
//        drawSetup();
//        // Draw the vertices
//        //optional
//        glDrawArrays(GL_POLYGON, 0,
//                vertices.size());
//    }

    public void drawObject(Camera camera, Projection projection) {
        drawSetup(camera, projection);
        // Draw the vertices
        //optional
        glDrawElements(GL_TRIANGLES, index.size(), GL_UNSIGNED_INT, 0);
        for (Object child: childObject){
            child.draw(camera, projection);
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