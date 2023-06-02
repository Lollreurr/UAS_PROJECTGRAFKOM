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
//public class MainGaris {
//    private boolean add = true;
//    private Window window =
//            new Window
//                    (800,800,"Hello World");
//    private ArrayList<Object2d> objects
//            = new ArrayList<>();
//    private ArrayList<Object2d> objectsPointsControl
//            = new ArrayList<>();
//    private ArrayList<Object2d> squares
//            = new ArrayList<>();
//    private ArrayList<Object2d> curve;
//
//    public void init(){
//        window.init();
//        GL.createCapabilities();
//
//        //code
////        objects.add(new Object2d(
////                Arrays.asList(
////                        //shaderFile lokasi menyesuaikan objectnya
////                        new ShaderProgram.ShaderModuleData
////                                ("resources/shaders/scene.vert.glsl"
////                                        , GL_VERTEX_SHADER),
////                        new ShaderProgram.ShaderModuleData
////                                ("resources/shaders/scene.frag.glsl"
////                                        , GL_FRAGMENT_SHADER)
////                ),
////                new ArrayList<>(
////                        List.of(
////                                new Vector3f(0.0f,0.5f,0.0f),
////                                new Vector3f(-0.5f,-0.5f,0.0f),
////                                new Vector3f(0.5f,-0.5f,0.0f)
////                        )
////                ),
////                new Vector4f(0.0f,1.0f,1.0f,1.0f)
////        ));
////        objects.add(new Object2d(
////                Arrays.asList(
////                        //shaderFile lokasi menyesuaikan objectnya
////                        new ShaderProgram.ShaderModuleData
////                                ("resources/shaders/sceneWithVerticesColor.vert"
////                                        , GL_VERTEX_SHADER),
////                        new ShaderProgram.ShaderModuleData
////                                ("resources/shaders/sceneWithVerticesColor.frag"
////                                        , GL_FRAGMENT_SHADER)
////                ),
////                new ArrayList<>(
////                        List.of(
////                                new Vector3f(0.0f,0.5f,0.0f),
////                                new Vector3f(-0.5f,-0.5f,0.0f),
////                                new Vector3f(0.5f,-0.5f,0.0f)
////                        )
////                ),
////                new ArrayList<>(
////                        List.of(
////                                new Vector3f(1.0f,0.0f,0.0f),
////                                new Vector3f(0.0f,1.0f,0.0f),
////                                new Vector3f(0.0f,0.0f,1.0f)
////                        )
////                )
////        ));
//        objectsPointsControl.add(new Object2d(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert.glsl"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag.glsl"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f,1.0f,1.0f,1.0f)
//        ));
//    }
//    public void input(){
//
//        if (window.isKeyPressed(GLFW_KEY_W)){
//            System.out.println("W");
//        }
//
//        if (!window.getMouseInput().isLeftButtonPressed()){
//            add = true;
//        }
//
//        if (window.getMouseInput().isLeftButtonPressed()){
//
//            Vector2f pos = window.getMouseInput().getCurrentPos();
//            //System.out.println("x : "+pos.x+" y : "+pos.y);
//
//            pos.x = (pos.x - (window.getWidth())/2.0f) / (window.getWidth()/2.0f);
//            pos.y = (pos.y - (window.getHeight())/2.0f) / (-window.getHeight()/2.0f);
//            //System.out.println("x : "+pos.x+" y : "+pos.y);
//
//            int index = 0;
//            boolean collision = false;
//            for (Object2d square: squares){
//                if ((pos.x >= square.getVertice().x - 0.1 && pos.x <= square.getVertice().x) ||
//                        (pos.x <= square.getVertice().x + 0.1 && pos.x >= square.getVertice().x)){
//                    if ((pos.y >= square.getVertice().y - 0.1 && pos.y <= square.getVertice().y) ||
//                            (pos.y <= square.getVertice().y + 0.1 && pos.y >= square.getVertice().y)){
//                        collision = true;
//                        add = false;
//                        break;
//                    }
//                }
//                index += 1;
//            }
//
//            if ((!(pos.x > 1 || pos.x < -0.97) && !(pos.y > 0.97 || pos.y < - 1)) && collision){
//                squares.get(index).moveSquare(new Vector3f(pos.x, pos.y, 0));
//                objectsPointsControl.get(0).moveLine(index, new Vector3f(pos.x, pos.y, 0));
//            }
//            else if(((!(pos.x > 1 || pos.x < -0.97) && !(pos.y > 0.97 || pos.y < - 1)) && !collision) && add){
//
//                System.out.println("x : " + pos.x + " y : " + pos.y);
//                objectsPointsControl.get(0).addVertices(new Vector3f(pos.x, pos.y, 0));
//                squares.add(new RectangleCircle(
//                        Arrays.asList(
//                                //shaderFile lokasi menyesuaikan objectnya
//                                new ShaderProgram.ShaderModuleData
//                                        ("resources/shaders/scene.vert.glsl"
//                                                , GL_VERTEX_SHADER),
//                                new ShaderProgram.ShaderModuleData
//                                        ("resources/shaders/scene.frag.glsl"
//                                                , GL_FRAGMENT_SHADER)
//                        ),
//                        new ArrayList<>(
//                                List.of()
//                        ),
//                        new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
//                        new Vector3f(pos.x, pos.y, 0.0f),
//                        Arrays.asList(1, 2, 3, 1, 3, 4),
//                        0.05f, 0.05f, 0
//                ));
//            }
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
////            for(Object2d object: objects){
////                object.drawWithVerticesColor();
////            }
////
////            for(Object2d object: objectsRectangle){
////                object.draw();
////            }
//            for(Object2d object: objectsPointsControl){
//                object.drawLine();
//                object.drawCurve();
//            }
//            for(Object2d object: squares){
//                object.draw();
//            }
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
//        new MainGaris().run();
//    }
//}