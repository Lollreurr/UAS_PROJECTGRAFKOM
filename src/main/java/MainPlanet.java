//import Engine.*;
//import Engine.Object;
//import org.joml.Vector2f;
//import org.joml.Vector3f;
//import org.joml.Vector4f;
//import org.lwjgl.opengl.GL;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.lwjgl.glfw.GLFW.*;
//import static org.lwjgl.opengl.GL11.glClearColor;
//import static org.lwjgl.opengl.GL30.*;
//
//public class MainPlanet {
//    private Window window =
//            new Window
//                    (800,800,"Hello World");
//    private ArrayList<Object> solar_system
//            = new ArrayList<>();
//    private ArrayList<Object> temp
//            = new ArrayList<>();
//
//    Camera camera = new Camera();
//    Projection projection = new Projection(window.getWidth(), window.getHeight());
//
//    public void init(){
//        window.init();
//        GL.createCapabilities();
//
//        camera.setPosition(0.0f, 0.0f, 1.5f);
//        camera.setRotation(((float)Math.toRadians(1.0f)), ((float) Math.toRadians(0.0f)));
//
//        // Sun
//        solar_system.add(new Sphere(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(1.0f,1.0f,0.0f,1.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f), 0.5f, 0.5f, 0.5f
//        ));
//        solar_system.get(0).scaleObject(0.45f, 0.45f, 0.0f);
//
//        // Mercury
//        solar_system.add(new Sphere(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.2f,0.0f,0.0f,1.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f), 0.5f, 0.5f, 0.5f
//        ));
//        solar_system.get(1).scaleObject(0.1f, 0.1f,0.0f);
//        solar_system.get(1).translateObject(0.25f, 0.0f, 0.0f);
//
//        // Venus
//        solar_system.add(new Sphere(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.5f,0.0f,0.0f,1.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f), 0.5f, 0.5f, 0.5f
//        ));
//        solar_system.get(2).scaleObject(0.25f, 0.25f,0.0f);
//        solar_system.get(2).translateObject(0.4f, 0.0f, 0.0f);
//
//        // Earth
//        solar_system.add(new Sphere(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f,1.0f,0.0f,1.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f), 0.5f, 0.5f, 0.5f
//        ));
//        solar_system.get(3).scaleObject(0.3f, 0.3f,0.0f);
//        solar_system.get(3).translateObject(0.65f, 0.0f, 0.0f);
//
//        // Moon
//        solar_system.add(new Sphere(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f), 0.5f, 0.5f, 0.5f
//        ));
//        solar_system.get(4).scaleObject(0.05f, 0.05f,0.0f);
//        solar_system.get(4).translateObject(0.52f, 0.0f, 0.0f);
//
//        // Mars
//        solar_system.add(new Sphere(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.4f,0.0f,0.0f,1.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f), 0.5f, 0.5f, 0.5f
//        ));
//        solar_system.get(5).scaleObject(0.2f, 0.2f,0.0f);
//        solar_system.get(5).translateObject(0.9f, 0.0f, 0.0f);
//    }
//    public void input(){
//        if (window.isKeyPressed(GLFW_KEY_F)){
//            solar_system.get(1).rotateObject((float) Math.toRadians(1.0f), 0.0f, 0.0f, 1.0f);
//            solar_system.get(2).rotateObject((float) Math.toRadians(2.0f), 0.0f, 0.0f, 1.0f);
//            solar_system.get(3).rotateObject((float) Math.toRadians(3.0f), 0.0f, 0.0f, 1.0f);
//            solar_system.get(4).rotateObject((float) Math.toRadians(3.0f), 0.0f, 0.0f, 1.0f);
//            solar_system.get(5).rotateObject((float) Math.toRadians(4.0f), 0.0f, 0.0f, 1.0f);
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_G)){
//            Vector3f pos = solar_system.get(1).model.transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            solar_system.get(1).translateObject(-pos.x, -pos.y, 0.0f);
//            solar_system.get(1).rotateObject((float) Math.toRadians(3.0f), 0.0f, 0.0f, 1.0f);
//            solar_system.get(1).translateObject(pos.x, pos.y, 0.0f);
//
//            pos = solar_system.get(2).model.transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            solar_system.get(2).translateObject(-pos.x, -pos.y, 0.0f);
//            solar_system.get(2).rotateObject((float) Math.toRadians(3.0f), 0.0f, 0.0f, 1.0f);
//            solar_system.get(2).translateObject(pos.x, pos.y, 0.0f);
//
//            pos = solar_system.get(3).model.transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            solar_system.get(3).translateObject(-pos.x, -pos.y, 0.0f);
//            solar_system.get(3).rotateObject((float) Math.toRadians(3.0f), 0.0f, 0.0f, 1.0f);
//            solar_system.get(3).translateObject(pos.x, pos.y, 0.0f);
//
//            pos = solar_system.get(5).model.transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            solar_system.get(5).translateObject(-pos.x, -pos.y, 0.0f);
//            solar_system.get(5).rotateObject((float) Math.toRadians(3.0f), 0.0f, 0.0f, 1.0f);
//            solar_system.get(5).translateObject(pos.x, pos.y, 0.0f);
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_H)){
//            Vector3f pos = solar_system.get(3).model.transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//
//            solar_system.get(4).translateObject(-pos.x, -pos.y, 0.0f);
//            solar_system.get(4).rotateObject((float) Math.toRadians(-3.0f), 0.0f, 0.0f, -1.0f);
//            solar_system.get(4).translateObject(pos.x, pos.y, 0.0f);
//        }
//    }
//
//    public void loop(){
//        while (window.isOpen()) {
//            window.update();
//            glClearColor(0.0f,
//                    0.0f, 0.0f,
//                    0.0f);
//            GL.createCapabilities();
//            input();
//
//            //code
//            for(Object object: solar_system){
//                object.draw(camera, projection);
//            }
////
////            for(Object2d object: objectsRectangle){
////                object.draw();
////            }
////            for(Object2d object: objectSphere){
////                object.draw();
////            }
//
//
//            // Restore state
//            glDisableVertexAttribArray(0);
//
//            // Poll for window events.
//            // The key callback above will only be
//            // invoked during this call.
//            glfwPollEvents();
//        }
//    }
//    public void run() {
//
//        init();
//        loop();
//
//        // Terminate GLFW and
//        // free the error callback
//        glfwTerminate();
//        glfwSetErrorCallback(null).free();
//    }
//    public static void main(String[] args) {
//        new MainPlanet().run();
//    }
//}