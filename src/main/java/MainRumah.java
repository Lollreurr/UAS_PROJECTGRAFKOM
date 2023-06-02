//import Engine.*;
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
//public class MainRumah {
//
//    private Window window =
//            new Window
//                    (800,800,"Rumah");
//
//    private ArrayList<Object2d> Background
//            = new ArrayList<>();
//    private ArrayList<Object2d> Grass
//            = new ArrayList<>();
//    private ArrayList<Object2d> HouseBody
//            = new ArrayList<>();
//    private ArrayList<Object2d> HouseBodyTop
//            = new ArrayList<>();
//    private ArrayList<Object2d> Roof
//            = new ArrayList<>();
//    private ArrayList<Object2d> Chimney1
//            = new ArrayList<>();
//    private ArrayList<Object2d> Chimney2
//            = new ArrayList<>();
//    private ArrayList<Object2d> moonYellow
//            = new ArrayList<>();
//    private ArrayList<Object2d> moonBlue
//            = new ArrayList<>();
//    private ArrayList<Object2d> star1
//            = new ArrayList<>();
//    private ArrayList<Object2d> star2
//            = new ArrayList<>();
//    private ArrayList<Object2d> star3
//            = new ArrayList<>();
//    private ArrayList<Object2d> smoke1
//            = new ArrayList<>();
//    private ArrayList<Object2d> smoke2
//            = new ArrayList<>();
//    private ArrayList<Object2d> smoke3
//            = new ArrayList<>();
//
//
//    public void init() {
//        window.init();
//        GL.createCapabilities();
//
//        Background.add(new Rectangle(
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
//                        List.of(
//                                new Vector3f(-1.0f,1.0f,0.0f),
//                                new Vector3f(-1.0f,-1.0f,0.0f),
//                                new Vector3f(1.0f,-1.0f,0.0f),
//                                new Vector3f(1.0f,1.0f,0.0f)
//                        )
//                ),
//                new Vector4f(0.0f,0.0f,0.8f,0.0f),
//                Arrays.asList(0,1,2,0,2,3)
//        ));
//        Grass.add(new Rectangle(
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
//                        List.of(
//                                new Vector3f(-1.0f,-0.7f,0.0f),
//                                new Vector3f(-1.0f,-1.0f,0.0f),
//                                new Vector3f(1.0f,-1.0f,0.0f),
//                                new Vector3f(1.0f,-0.7f,0.0f)
//                        )
//                ),
//                new Vector4f(0.0f,0.5f,0.0f,0.0f),
//                Arrays.asList(0,1,2,0,2,3)
//        ));
//        Roof.add(new Rectangle(
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
//                        List.of(
//                                new Vector3f(-0.4f,0.05f,0.0f),
//                                new Vector3f(-0.6f,-0.3f,0.0f),
//                                new Vector3f(0.6f,-0.3f,0.0f),
//                                new Vector3f(0.4f,0.05f,0.0f)
//                        )
//                ),
//                new Vector4f(0.9f,0.0f,0.0f,0.0f),
//                Arrays.asList(0,1,2,0,2,3)
//        ));
//        HouseBody.add(new Rectangle(
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
//                        List.of(
//                                new Vector3f(-0.5f,-0.3f,0.0f),
//                                new Vector3f(-0.5f,-0.75f,0.0f),
//                                new Vector3f(0.5f,-0.75f,0.0f),
//                                new Vector3f(0.5f,-0.3f,0.0f)
//                        )
//                ),
//                new Vector4f(0.8f,0.6f,0.0f,0.0f),
//                Arrays.asList(0,1,2,0,2,3)
//        ));
//        HouseBodyTop.add(new Rectangle(
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
//                        List.of(
//                                new Vector3f(-0.5f,-0.25f,0.0f),
//                                new Vector3f(-0.5f,-0.75f,0.0f),
//                                new Vector3f(-0.05f,-0.75f,0.0f),
//                                new Vector3f(-0.35f,0.0f,0.0f)
//                        )
//                ),
//                new Vector4f(0.8f,0.6f,0.0f,0.0f),
//                Arrays.asList(0,1,2,0,2,3)
//        ));
//        Chimney1.add(new Rectangle(
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
//                        List.of(
//                                new Vector3f(0.2f,0.15f,0.0f),
//                                new Vector3f(0.2f,0.0f,0.0f),
//                                new Vector3f(0.3f,0.0f,0.0f),
//                                new Vector3f(0.3f,0.15f,0.0f)
//                        )
//                ),
//                new Vector4f(0.8f,0.6f,0.0f,0.0f),
//                Arrays.asList(0,1,2,0,2,3)
//        ));
//        Chimney2.add(new Rectangle(
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
//                        List.of(
//                                new Vector3f(0.175f,0.2f,0.0f),
//                                new Vector3f(0.175f,0.15f,0.0f),
//                                new Vector3f(0.325f,0.15f,0.0f),
//                                new Vector3f(0.325f,0.2f,0.0f)
//                        )
//                ),
//                new Vector4f(0.9f,0.0f,0.0f,0.0f),
//                Arrays.asList(0,1,2,0,2,3)
//        ));
//
//        moonYellow.add(new Circle(
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
//                        List.of(
//
//                        )
//                ),
//                new Vector4f(1.0f,1.0f,0f,0.0f),
//                new Vector3f(-0.6f, 0.6f, 0.0f), 0.15
//        ));
//
//        moonBlue.add(new Circle(
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
//                        List.of(
//
//                        )
//                ),
//                new Vector4f(0.0f,0.0f,0.8f,0.0f),
//                new Vector3f(-0.55f, 0.6f, 0.0f), 0.15
//        ));
//
//        star1.add(new Star(
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
//                        List.of(
//                        )
//                ),
//                new Vector4f(1.0f,1.0f,0.0f,0.0f),
//                new Vector3f(-0.3f, 0.4f, 0.0f), //Arrays.asList(0,1,2,3,4),
//                Arrays.asList(0,3,1,4,2),
//                0.05f, 1.225
//        ));
//        star2.add(new Star(
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
//                        List.of(
//                        )
//                ),
//                new Vector4f(1.0f,1.0f,0.0f,0.0f),
//                new Vector3f(0.0f, 0.7f, 0.0f), //Arrays.asList(0,1,2,3,4),
//                Arrays.asList(0,3,1,4,2),
//                0.02f, 1.225
//        ));
//        star3.add(new Star(
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
//                        List.of(
//                        )
//                ),
//                new Vector4f(1.0f,1.0f,0.0f,0.0f),
//                new Vector3f(0.7f, 0.6f, 0.0f), //Arrays.asList(0,1,2,3,4),
//                Arrays.asList(0,3,1,4,2),
//                0.05f, 1.225
//        ));
//
//        smoke1.add(new Oval(
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
//                        List.of(
//
//                        )
//                ),
//                new Vector4f(0.5f,0.5f,0.5f,0.0f),
//                new Vector3f(0.25f, 0.26f, 0.0f), 0.08f, 0.04f
//        ));
//        smoke2.add(new Oval(
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
//                        List.of(
//
//                        )
//                ),
//                new Vector4f(0.5f,0.5f,0.5f,0.0f),
//                new Vector3f(0.34f, 0.32f, 0.0f), 0.12f, 0.06f
//        ));
//        smoke3.add(new Oval(
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
//                        List.of(
//
//                        )
//                ),
//                new Vector4f(0.5f,0.5f,0.5f,0.0f),
//                new Vector3f(0.5f, 0.38f, 0.0f), 0.2f, 0.07f
//        ));
//    }
//    public void loop(){
//        while (window.isOpen()) {
//            window.update();
//            glClearColor(0.0f,
//                    0.0f, 0.0f,
//                    0.0f);
//            GL.createCapabilities();
//
//            //code
//
//            for(Object2d object: Background){
//                object.draw();
//            }
//            for(Object2d object: Grass){
//                object.draw();
//            }
//            for(Object2d object: Roof){
//                object.draw();
//            }
//            for(Object2d object: Chimney2){
//                object.draw();
//            }
//            for(Object2d object: Chimney1){
//                object.draw();
//            }
//            for(Object2d object: HouseBodyTop){
//                object.draw();
//            }
//            for(Object2d object: HouseBody){
//                object.draw();
//            }
//            for(Object2d object: moonYellow){
//                object.draw();
//            }
//            for(Object2d object: moonBlue){
//                object.draw();
//            }
//            for(Object2d object: star1){
//                object.draw();
//            }
//            for(Object2d object: star2){
//                object.draw();
//            }
//            for(Object2d object: star3){
//                object.draw();
//            }
//            for(Object2d object: smoke1){
//                object.draw();
//            }
//            for(Object2d object: smoke2){
//                object.draw();
//            }
//            for(Object2d object: smoke3){
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
//        new MainRumah().run();
//    }
//}
