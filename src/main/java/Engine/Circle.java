package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.List;

import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL15.GL_STATIC_DRAW;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glVertexAttribPointer;

public class Circle extends Object2d{

    //index buffer object || element buffer object

    public Circle(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color, Vector3f centerPoint, double r) {
        super(shaderModuleDataList, vertices, color);
        float x, y = 0, z;
        for(double i=0;i<360;i+=360/360){
            x = (float)(centerPoint.x + r*Math.cos(Math.toRadians(i)));
            z = (float)(centerPoint.z + r*Math.sin(Math.toRadians(i)));
            this.vertices.add(new Vector3f(x, y, z));
        }
        setupVAOVBO();
    }
    public void draw(){
        drawSetup();
        // Draw the vertices
        //optional
        glDrawArrays(GL_POLYGON,0,
                vertices.size());
    }

    public Vector3f getVerticeIndex(float index){
        return this.vertices.get((int)index);
    }
}
