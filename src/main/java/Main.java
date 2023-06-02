import Engine.*;
import Engine.Object;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class Main {
    private Window window =
            new Window
                    (800,800,"Hello World");
    private ArrayList<Object> objects
            = new ArrayList<>();
    private ArrayList<Object> point
            = new ArrayList<>();

    Camera camera = new Camera();
    Projection projection = new Projection(window.getWidth(), window.getHeight());

    boolean pressed = false;
    boolean pressed1 = false;
    float rotation = 0.0f;
    float move = 1f;

    public void init(){
        window.init();
        GL.createCapabilities();

        camera.setPosition(0.0f, 0.0f, 1.5f);
        camera.setRotation(((float)Math.toRadians(0.0f)), ((float) Math.toRadians(0.0f)));

        //code

        ObjectLoader objectLoader = new ObjectLoader("resources/models/MStad.obj", "obj");
        objects.add(new Square(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/shaders/scene.vert"
                                , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/shaders/scene.frag"
                                , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of()
                ),
                new Vector4f(1.0f,1.0f,1.0f,1.0f),
                new Vector3f(0.0f,0.0f,0.0f),
                0.1f,
                0.1f,
                0.1f
        ));

        ((Square)objects.get(0)).setVertices(objectLoader.vertices);
        ((Square)objects.get(0)).setNormal(objectLoader.normals);
        ((Square)objects.get(0)).setIndicies(objectLoader.indicies);

        objects.get(0).scaleObject(0.1f, 0.1f,0.1f);

        //objects.get(0).scaleObject(0.005f, 0.005f,0.005f);


//        objects.add(new Square(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.5f,0.5f,0.0f),
//                                new Vector3f(-0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,0.5f,0.0f)
//                        )
//                ),
//                new Vector4f(0.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.125f,
//                0.125f,
//                0.125f
//        ));
////        objects.get(0).translateObject(0.5f,0.0f,0.0f);
//        objects.get(0).scaleObject(2.0f,2.0f,2.0f);
//
//        objects.get(0).getChildObject().add(new Square(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.5f,0.5f,0.0f),
//                                new Vector3f(-0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,0.5f,0.0f)
//                        )
//                ),
//                new Vector4f(0.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.125f,
//                0.125f,
//                0.125f
//        ));
//        objects.get(0).getChildObject().get(0).translateObject(0.25f,0.0f,0.0f);
//
//        objects.get(0).getChildObject().add(new Square(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.5f,0.5f,0.0f),
//                                new Vector3f(-0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,0.5f,0.0f)
//                        )
//                ),
//                new Vector4f(0.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.125f,
//                0.125f,
//                0.125f
//        ));
//        objects.get(0).getChildObject().get(1).translateObject(0.5f,0.0f,0.0f);
//
//        objects.get(0).getChildObject().get(1).getChildObject().add(new Square(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.5f,0.5f,0.0f),
//                                new Vector3f(-0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,0.5f,0.0f)
//                        )
//                ),
//                new Vector4f(0.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.125f,
//                0.125f,
//                0.125f
//        ));
//        objects.get(0).getChildObject().get(1).getChildObject().get(0).scaleObject(0.5f,0.5f,0.0f);
//        objects.get(0).getChildObject().get(1).getChildObject().get(0).translateObject(0.5f,-0.1f,0.0f);
//
//        Vector3f pos = objects.get(0).model.transformPosition(new Vector3f());
//        point.add(new Square(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.5f,0.5f,0.0f),
//                                new Vector3f(-0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,0.5f,0.0f)
//                        )
//                ),
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.25f),
//                0.05f,
//                0.05f,
//                0.05f
//        ));
    }

    public void setPos(){
        Vector3f pos = objects.get(0).model.transformPosition(new Vector3f());

        ArrayList<Vector3f> vertices = new ArrayList<>(List.of());

        for(double i=0;i<360;i+=360/360){
            float x = (float)(pos.x + 50f*Math.sin(Math.toRadians(i)));
            float z = (float)(pos.z + 50f*Math.cos(Math.toRadians(i)));
            vertices.add(new Vector3f(x, pos.y, z));
        }

        camera.setPosition(vertices.get((int)rotation).x,vertices.get((int)rotation).y, vertices.get((int)rotation).z);
    }

    public void input(){
//        if (window.isKeyPressed(GLFW_KEY_W)) {
//            objects.get(0).rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
//
//            for(Object child: objects.get(0).getChildObject()){
//                Vector3f tempCenterPoint = child.updateCenterPoint();
//                child.translateObject(tempCenterPoint.x*-1,tempCenterPoint.y*-1,tempCenterPoint.z*-1);
//                child.rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
//                child.translateObject(tempCenterPoint.x*1,tempCenterPoint.y*1,tempCenterPoint.z*1);
//            }
//            for(Object child: objects.get(0).getChildObject().get(1).getChildObject()){
//                Vector3f tempCenterPoint = objects.get(0).getChildObject().get(1).updateCenterPoint();
//                child.translateObject(tempCenterPoint.x*-1,tempCenterPoint.y*-1,tempCenterPoint.z*-1);
//                child.rotateObject((float) Math.toRadians(0.7f),0.0f,0.0f,1.0f);
//                child.translateObject(tempCenterPoint.x*1,tempCenterPoint.y*1,tempCenterPoint.z*1);
//            }
//        }
//        if(window.getMouseInput().isLeftButtonPressed()){
//            Vector2f pos = window.getMouseInput().getCurrentPos();
//            //System.out.println("x : "+pos.x+" y : "+pos.y);
//            pos.x = (pos.x - (window.getWidth())/2.0f) / (window.getWidth()/2.0f);
//            pos.y = (pos.y - (window.getHeight())/2.0f) / (-window.getHeight()/2.0f);
//            //System.out.println("x : "+pos.x+" y : "+pos.y);
//            if((!(pos.x > 1 || pos.x < -0.97) && !(pos.y > 0.97 || pos.y < -1))){
//                System.out.println("x : "+pos.x+" y : "+pos.y);
//                //objectsPointsControl.get(0).addVertices(new Vector3f(pos.x,pos.y,0));
//            }
//
//        }

        float move = 1f;

        if (window.isKeyPressed(GLFW_KEY_Q)){
            camera.moveUp(move);
        }
        if (window.isKeyPressed(GLFW_KEY_E)){
            camera.moveDown(move);
        }
        if (window.isKeyPressed(GLFW_KEY_W)){
            camera.moveForward(move);
        }
        else if (window.isKeyPressed(GLFW_KEY_S)){
            camera.moveBackwards(move);
        }

        if (window.isKeyPressed(GLFW_KEY_A)){
            camera.moveLeft(move);
        }
        else if (window.isKeyPressed(GLFW_KEY_D)){
            camera.moveRight(move);
        }

//        if (window.isKeyPressed(GLFW_KEY_UP)){
//            camera.moveUp(move);
//        }
//        else if (window.isKeyPressed(GLFW_KEY_DOWN)){
//            camera.moveDown(move);
//        }

        if (window.getMouseInput().isLeftButtonPressed()){
            Vector2f displVec = window.getMouseInput().getDisplVec();
            camera.addRotation((float) Math.toRadians(displVec.x * 0.1f), (float) Math.toRadians(displVec.y * 0.1f));
        }

        if (window.getMouseInput().getScroll().y != 0){
            projection.setFOV(projection.getFOV() - (window.getMouseInput().getScroll().y * 0.1f));
            window.getMouseInput().setScroll(new Vector2f());
        }

//        if (window.isKeyPressed(GLFW_KEY_LEFT)){
//            objects.get(0).translateObject(-0.05f, 0.0f, 0.0f);
//            setPos();
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_RIGHT)){
//            objects.get(0).translateObject(0.05f, 0.0f, 0.0f);
//            setPos();
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_UP)){
//            objects.get(0).translateObject(0.0f, 0.0f, -0.05f);
//            setPos();
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_DOWN)){
//            objects.get(0).translateObject(0.0f, 0.0f, 0.05f);
//            setPos();
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_P)){
//            objects.get(0).translateObject(0.0f, 0.05f, 0.0f);
//            setPos();
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_O)){
//            objects.get(0).translateObject(0.0f, -0.05f, 0.0f);
//            setPos();
//        }


        //muter camera
        if (window.isKeyPressed(GLFW_KEY_M)){
            pressed = true;
        }

        if (pressed){
            float posx = camera.getPosition().x;
            float posy = camera.getPosition().y;
            float posz = camera.getPosition().z;

            camera.setPosition(-posx, -posy, -posz);
            camera.addRotation(0.0f, (float) Math.toRadians(move));
            camera.setPosition(posx, posy, posz);

            rotation += move;

            if (rotation >= 360.0f){
                rotation = 0.0f;
                pressed = false;
            }
        }

        //muter obj
        if (window.isKeyPressed(GLFW_KEY_B)){
            Vector3f pos = objects.get(0).model.transformPosition(new Vector3f());
            Vector3f posCam = camera.getPosition();

            ArrayList<Vector3f> vertices = new ArrayList<>(List.of());

            for(double i=0;i<360;i+=360/360){
                float x = (float)(pos.x + 1.5f*Math.sin(Math.toRadians(i)));
                float z = (float)(pos.z + 1.5f*Math.cos(Math.toRadians(i)));
                vertices.add(new Vector3f(x, pos.y+0.5f, z));
            }

            camera.setPosition(vertices.get(0).x, vertices.get(0).y, vertices.get(0).z);

            camera.setPosition(-posCam.x, 0, -posCam.z);
            camera.addRotation(0.0f, (float) Math.toRadians(-move));
            camera.setPosition(posCam.x, 0, posCam.z);

            rotation += move;

            if (rotation > 359.0f){
                rotation = 0.0f;
            }

            camera.setPosition(vertices.get((int)rotation).x,vertices.get((int)rotation).y, vertices.get((int)rotation).z );
        }

        if (window.isKeyPressed(GLFW_KEY_V)){
            pressed1 = false;
        }

        if (window.isKeyPressed(GLFW_KEY_C)){
            camera.setPosition(0,0, 1.5f);
        }
    }

    public void loop(){
        while (window.isOpen()) {
            window.update();
            glClearColor(0.0f,
                    0.0f, 0.0f,
                    0.0f);
            GL.createCapabilities();

            input();

            //code

            for(Object object: objects){
                object.drawObject(camera, projection);
            }
//
//            for(Object object: point){
//                object.draw(camera, projection);
//            }


//
//            for(Object2d object: objectsRectangle){
//                object.draw();
//            }
//            for(Object2d object: objectSquare){
//                object.draw();
//            }


            // Restore state
            glDisableVertexAttribArray(0);

            // Poll for window events.
            // The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
        }
    }
    public void run() {

        init();
        loop();

        // Terminate GLFW and
        // free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }
    public static void main(String[] args) {
        new Main().run();
    }
}