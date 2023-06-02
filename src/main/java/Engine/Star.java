package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.List;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;

public class Star extends Object2d {

    List<Integer> index;
    //index buffer object || element buffer object
    int ibo;

    public Star(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color, Vector3f centerPoint,
                List<Integer> index, float r, double angle) {
        super(shaderModuleDataList, vertices, color);
        this.index = index;
        ibo = glGenBuffers();
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ibo);
        glBufferData(GL_ELEMENT_ARRAY_BUFFER,
                Utils.listoInt(index),
                GL_STATIC_DRAW);
        float x, y, z = 0;
        for (double i=angle; i < 360+angle; i+=360/5){
            x = (float)(centerPoint.x + r*Math.cos(Math.toRadians(i)));
            y = (float)(centerPoint.y + r*Math.sin(Math.toRadians(i)));
            this.vertices.add(new Vector3f(x, y,z));
        }
        setupVAOVBO();
    }

    public void draw(){
        drawSetup();
        // Draw the vertices
        //optional
        glPointSize(10);
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ibo);
        glDrawElements(GL_LINE_LOOP, index.size(), GL_UNSIGNED_INT, 0);
    }
}
