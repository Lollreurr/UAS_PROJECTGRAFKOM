//import Engine.Object;
//import Engine.*;
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
//public class MainTest {
//    private Window window =
//            new Window
//                    (800,800,"Hello World");
//    private ArrayList<Object> objects
//            = new ArrayList<>();
//
//
//    Camera camera = new Camera();
//    Projection projection = new Projection(window.getWidth(), window.getHeight());
//    boolean grow=false;
//    int growCount=0;
//
//    public void init(){
//        window.init();
//        GL.createCapabilities();
//
//        camera.setPosition(0.0f, 0.0f, 1.5f);
//        camera.setRotation(((float)Math.toRadians(0.0f)), ((float) Math.toRadians(0.0f)));
//
//        objects.add(new Square(
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
//                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.2f, 0.2f, 0.2f
//        ));
//
//    }
//    public void input(){
//        if (window.isKeyPressed(GLFW_KEY_W)) {
//            objects.get(0).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            //objects.get(1).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//        }
//        if (window.isKeyPressed(GLFW_KEY_Q)) {
//            objects.get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            //objects.get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//        }
//        if (window.isKeyPressed(GLFW_KEY_E)) {
//            objects.get(0).scaleObject(1.1f, 1.1f, 1.1f);
//        }
//
//        if (grow){
//            objects.get(0).scaleObject(1.1f, 1.1f, 1.1f);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            growCount++;
//        }
//
//        if (growCount > 10){
//            grow = false;
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
//
//            input();
//
//            //code
//            for(Object object: objects){
//                object.draw(camera, projection);
//            }
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
//        new MainTest().run();
//    }
//}