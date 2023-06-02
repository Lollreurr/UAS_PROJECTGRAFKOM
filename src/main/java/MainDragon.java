//import Engine.*;
//import Engine.Object;
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
//import static org.lwjgl.opengl.GL20.*;
//
//public class MainDragon {
//    private Window window =
//            new Window
//                    (800,800,"Dragon");
//
//    private ArrayList<Object> background
//            = new ArrayList<>();
//
//    private ArrayList<Object> blockDragon
//            = new ArrayList<>();
//
//    private ArrayList<Object> anchorPoint
//            = new ArrayList<>();
//
//
//
//    Camera camera = new Camera();
//    Projection projection = new Projection(window.getWidth(), window.getHeight());
//
//    // block dragon position
//    int blockX=0;
//    int blockY=0;
//    int blockZ=0;
//
//    // block dragon rotation
//    int degreeX=0;
//    int degreeY=0;
//    int degreeZ=0;
//
//    // block dragon hands variable
//    int handZ=0;
//    boolean handMin=false;
//    boolean handMax=false;
//    boolean handToogle=false;
//
//    // block dragon wings variable
//    int wingY=0;
//    boolean wingMin=false;
//    boolean wingMax=false;
//
//    // block dragon flying variable
//    int height=0;
//
//    // block dragon sit animation variable
//    boolean sit=false;
//
//    // block dragon scaling
//    boolean big=true;
//    int bigCount=0;
//
//    // block dragon moving
//    boolean move=false;
//
//
//    public void init(){
//        window.init();
//        GL.createCapabilities();
//
//        camera.setPosition(0.0f, 0.0f, 1.5f);
//        camera.setRotation(((float)Math.toRadians(0.0f)), ((float) Math.toRadians(0.0f)));
//
//        //code
//        background.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                        )
//                ),
//                new Vector4f(0.6f,1.0f,1.0f,0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),50.0f, 50.0f, 50.0f
//        ));
//        background.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                        )
//                ),
//                new Vector4f(0.950f,0.813f,0.608f,0.0f),
//                new Vector3f(0.0f, -0.5f, 0.0f),50.0f, 1.0f, 50.0f
//        ));
//
//        // mid body
//        blockDragon.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.37f, 0.1f, 0.39f
//        ));
//        anchorPoint.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.05f, 0.05f, 0.05f
//        ));
//
//        // upper body
//        blockDragon.get(0).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.7f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.38f, 0.2f, 0.4f
//        ));
//        blockDragon.get(0).getChildObject().get(0).translateObject(0.0f, 0.12f, 0.0f);
//
//        // lower body
//        blockDragon.get(0).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.7f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.38f, 0.13f, 0.4f
//        ));
//        blockDragon.get(0).getChildObject().get(1).translateObject(0.0f, -0.076f, 0.0f);
//
//        // head (lower jaw)
//        blockDragon.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(0.0f, 0.18f, 0.05f),
//                0.4f, 0.1f, 0.35f
//        ));
//
//        // head (upper)
//        blockDragon.get(1).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(0.0f, 0.3f, 0.05f),
//                0.35f, 0.12f, 0.33f
//        ));
//        anchorPoint.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.3f, -0.28f),
//                0.05f, 0.05f, 0.05f
//        ));
//
//        blockDragon.get(1).getChildObject().get(0).getChildObject().add(new Tube(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(-0.075f, 0.37f, 0.15f),
//                0.05f, 0.05f, 0.05f
//        ));
//        blockDragon.get(1).getChildObject().get(0).getChildObject().add(new Tube(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.075f, 0.37f, 0.15f),
//                0.05f, 0.05f, 0.05f
//        ));
//
//        // right eye
//        blockDragon.get(1).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(-0.20f, 0.34f, -0.05f),
//                0.05f, 0.15f, 0.15f
//        ));
//        blockDragon.get(1).getChildObject().get(1).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(-0.20f, 0.39f, -0.15f),
//                0.05f, 0.05f, 0.05f
//        ));
//
//        // right eye pupils
//        blockDragon.get(1).getChildObject().get(1).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 1.0f, 0.0f, 0.0f),
//                new Vector3f(-0.21f, 0.34f, -0.05f),
//                0.05f, 0.12f, 0.12f
//        ));
//        blockDragon.get(1).getChildObject().get(1).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.5f, 0.1f, 0.0f),
//                new Vector3f(-0.22f, 0.33f, -0.04f),
//                0.05f, 0.10f, 0.10f
//        ));
//        blockDragon.get(1).getChildObject().get(1).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(-0.23f, 0.33f, -0.03f),
//                0.05f, 0.07f, 0.07f
//        ));
//
//        // left eye
//        blockDragon.get(1).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.20f, 0.34f, -0.05f),
//                0.05f, 0.15f, 0.15f
//        ));
//        blockDragon.get(1).getChildObject().get(2).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.20f, 0.39f, -0.15f),
//                0.05f, 0.05f, 0.05f
//        ));
//
//
//        // left eye pupils
//        blockDragon.get(1).getChildObject().get(2).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 1.0f, 0.0f, 0.0f),
//                new Vector3f(0.21f, 0.34f, -0.05f),
//                0.05f, 0.12f, 0.12f
//        ));
//        blockDragon.get(1).getChildObject().get(2).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.5f, 0.1f, 0.0f),
//                new Vector3f(0.22f, 0.33f, -0.04f),
//                0.05f, 0.10f, 0.10f
//        ));
//        blockDragon.get(1).getChildObject().get(2).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.23f, 0.33f, -0.03f),
//                0.05f, 0.07f, 0.07f
//        ));
//
//        // left feet (index = 2)
//        blockDragon.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.1f, -0.2f, 0.0f),
//                0.1f, 0.07f, 0.3f
//        ));
//
//        blockDragon.get(2).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.1f, -0.15f, -0.05f),
//                0.1f, 0.07f, 0.1f
//        ));
//
//        blockDragon.get(2).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(0.125f, -0.21f, 0.18f),
//                0.03f, 0.05f, 0.06f
//        ));
//
//        blockDragon.get(2).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(0.075f, -0.21f, 0.18f),
//                0.03f, 0.05f, 0.06f
//        ));
//
//
//
//        anchorPoint.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.3f, -0.28f),
//                0.05f, 0.05f, 0.05f
//        ));
//
//        // right feet (index = 3)
//        blockDragon.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(-0.1f, -0.2f, 0.0f),
//                0.1f, 0.07f, 0.3f
//        ));
//
//        blockDragon.get(3).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(-0.1f, -0.15f, -0.05f),
//                0.1f, 0.07f, 0.1f
//        ));
//
//        blockDragon.get(2).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(-0.125f, -0.21f, 0.18f),
//                0.03f, 0.05f, 0.06f
//        ));
//
//        blockDragon.get(2).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(-0.075f, -0.21f, 0.18f),
//                0.03f, 0.05f, 0.06f
//        ));
//
//        anchorPoint.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.3f, -0.28f),
//                0.05f, 0.05f, 0.05f
//        ));
//
//        // left hand (index = 4)
//        blockDragon.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(-0.3f, 0.065f, 0.0f),
//                0.2f, 0.06f, 0.14f
//        ));
//
//        anchorPoint.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.05f, 0.05f, 0.05f
//        ));
//        anchorPoint.get(4).translateObject(-0.15f, 0.065f, 0.0f);
//
//        blockDragon.get(4).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(-0.5f, 0.2f, 0.07f),
//                0.03f, 0.05f, 0.06f
//        ));
//        Vector3f pos = anchorPoint.get(4).model.transformPosition(new Vector3f());
//
//        blockDragon.get(4).getChildObject().get(0).translateObject(-pos.x, -pos.y, pos.z);
//        for (int i=0; i<90; i++) {
//            blockDragon.get(4).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//        }
//        blockDragon.get(4).getChildObject().get(0).translateObject(pos.x, pos.y, -pos.z);
//        blockDragon.get(4).getChildObject().get(0).translateObject(-0.2f, -0.12f, 0.3f);
//
//        blockDragon.get(4).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(-0.5f, 0.2f, 0.07f),
//                0.03f, 0.05f, 0.06f
//        ));
//
//        blockDragon.get(4).getChildObject().get(1).translateObject(-pos.x, -pos.y, pos.z);
//        for (int i=0; i<90; i++) {
//            blockDragon.get(4).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//        }
//        blockDragon.get(4).getChildObject().get(1).translateObject(pos.x, pos.y, -pos.z);
//        blockDragon.get(4).getChildObject().get(1).translateObject(-0.2f, -0.12f, 0.35f);
//
//        blockDragon.get(4).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(-0.5f, 0.2f, 0.07f),
//                0.03f, 0.05f, 0.06f
//        ));
//
//
//        blockDragon.get(4).getChildObject().get(2).translateObject(-pos.x, -pos.y, pos.z);
//        for (int i=0; i<90; i++) {
//            blockDragon.get(4).getChildObject().get(2).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//        }
//        blockDragon.get(4).getChildObject().get(2).translateObject(pos.x, pos.y, -pos.z);
//        blockDragon.get(4).getChildObject().get(2).translateObject(-0.2f, -0.12f, 0.4f);
//
//        blockDragon.get(4).translateObject(-pos.x, -pos.y, pos.z);
//        for (int i=0; i<30; i++) {
//            blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//        }
//        blockDragon.get(4).translateObject(pos.x, pos.y, -pos.z);
//
//        blockDragon.get(4).getChildObject().add(new Sphere(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.12f, 0.08f, 0.12f
//        ));
//        blockDragon.get(4).getChildObject().get(3).translateObject(-0.15f, 0.05f, 0.0f);
//
//        // right hand (index = 5)
//        blockDragon.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(0.3f, 0.065f, 0.0f),
//                0.2f, 0.06f, 0.14f
//        ));
//
//        anchorPoint.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.05f, 0.05f, 0.05f
//        ));
//        anchorPoint.get(5).translateObject(0.15f, 0.065f, 0.0f);
//
//        blockDragon.get(5).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.5f, 0.2f, 0.07f),
//                0.03f, 0.05f, 0.06f
//        ));
//        pos = anchorPoint.get(5).model.transformPosition(new Vector3f());
//
//        blockDragon.get(5).getChildObject().get(0).translateObject(-pos.x, -pos.y, pos.z);
//        for (int i=0; i<90; i++) {
//            blockDragon.get(5).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//        }
//        blockDragon.get(5).getChildObject().get(0).translateObject(pos.x, pos.y, -pos.z);
//        blockDragon.get(5).getChildObject().get(0).translateObject(0.2f, -0.12f, 0.3f);
//
//        blockDragon.get(5).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.5f, 0.2f, 0.07f),
//                0.03f, 0.05f, 0.06f
//        ));
//
//        blockDragon.get(5).getChildObject().get(1).translateObject(-pos.x, -pos.y, pos.z);
//        for (int i=0; i<90; i++) {
//            blockDragon.get(5).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//        }
//        blockDragon.get(5).getChildObject().get(1).translateObject(pos.x, pos.y, -pos.z);
//        blockDragon.get(5).getChildObject().get(1).translateObject(0.2f, -0.12f, 0.35f);
//
//        blockDragon.get(5).getChildObject().add(new Paw(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.5f, 0.2f, 0.07f),
//                0.03f, 0.05f, 0.06f
//        ));
//
//
//        blockDragon.get(5).getChildObject().get(2).translateObject(-pos.x, -pos.y, pos.z);
//        for (int i=0; i<90; i++) {
//            blockDragon.get(5).getChildObject().get(2).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//        }
//        blockDragon.get(5).getChildObject().get(2).translateObject(pos.x, pos.y, -pos.z);
//        blockDragon.get(5).getChildObject().get(2).translateObject(0.2f, -0.12f, 0.4f);
//
//
//        blockDragon.get(5).translateObject(-pos.x, -pos.y, pos.z);
//        for (int i=0; i<30; i++) {
//            blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//        }
//        blockDragon.get(5).translateObject(pos.x, pos.y, -pos.z);
//
//        blockDragon.get(5).getChildObject().add(new Sphere(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.12f, 0.08f, 0.12f
//        ));
//        blockDragon.get(5).getChildObject().get(3).translateObject(0.15f, 0.05f, 0.0f);
//
//        // left wing (index = 6)
//        blockDragon.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(0.32f, 0.1f, -0.28f),
//                0.35f, 0.1f, 0.05f
//        ));
//        blockDragon.get(6).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.6f, 0.9f, 0.0f),
//                new Vector3f(0.25f, 0.0f, -0.28f),
//                0.25f, 0.08f, 0.05f
//        ));
//
//        anchorPoint.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.05f, 0.05f, 0.05f
//        ));
//        anchorPoint.get(6).translateObject(0.05f, 0.03f, -0.28f);
//
//        blockDragon.get(6).translateObject(-0.05f, -0.03f, 0.28f);
//        blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 30.0f);
//        blockDragon.get(6).translateObject(0.05f, 0.03f, -0.28f);
//
//        blockDragon.get(6).getChildObject().get(0).translateObject(-0.05f, -0.03f, 0.28f);
//        blockDragon.get(6).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -10.0f);
//        blockDragon.get(6).getChildObject().get(0).translateObject(0.05f, 0.03f, -0.28f);
//
//        // rightt wing (index = 7)
//        blockDragon.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(-0.32f, 0.1f, -0.28f),
//                0.35f, 0.1f, 0.05f
//        ));
//        blockDragon.get(7).getChildObject().add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.6f, 0.9f, 0.0f),
//                new Vector3f(-0.25f, 0.0f, -0.28f),
//                0.25f, 0.08f, 0.05f
//        ));
//
//        anchorPoint.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.05f, 0.05f, 0.05f
//        ));
//
//        anchorPoint.get(7).translateObject(-0.05f, 0.03f, -0.28f);
//
//        blockDragon.get(7).translateObject(0.05f, 0.03f, 0.28f);
//        blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -30.0f);
//        blockDragon.get(7).translateObject(-0.05f, -0.03f, -0.28f);
//
//        blockDragon.get(7).getChildObject().get(0).translateObject(0.05f, 0.03f, 0.28f);
//        blockDragon.get(7).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 10.0f);
//        blockDragon.get(7).getChildObject().get(0).translateObject(-0.05f, -0.03f, -0.28f);
//
//        // chair (index = 8)
//        blockDragon.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.6f, 0.3f, 0.1f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.6f, 0.05f, 0.6f
//        ));
//        blockDragon.get(8).getChildObject().add(new Tube(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.6f, 0.3f, 0.1f, 0.0f),
//                new Vector3f(-0.15f, -0.13f, 0.2f),
//                0.05f, 0.21f, 0.05f
//        ));
//        blockDragon.get(8).getChildObject().add(new Tube(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.6f, 0.3f, 0.1f, 0.0f),
//                new Vector3f(0.15f, -0.13f, 0.2f),
//                0.05f, 0.21f, 0.05f
//        ));
//        blockDragon.get(8).getChildObject().add(new Tube(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.6f, 0.3f, 0.1f, 0.0f),
//                new Vector3f(-0.15f, -0.13f, -0.2f),
//                0.05f, 0.21f, 0.05f
//        ));
//        blockDragon.get(8).getChildObject().add(new Tube(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.6f, 0.3f, 0.1f, 0.0f),
//                new Vector3f(0.15f, -0.13f, -0.2f),
//                0.05f, 0.21f, 0.05f
//        ));
//
//        blockDragon.get(8).scaleObject(0.1f, 0.1f, 0.1f);
//
//        anchorPoint.add(new Square(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\Java Intellij\Grafkom\Week 2\Grafkom2223\resources\shaders\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.05f, 0.05f, 0.05f
//        ));
//
//    }
//    public void input(){
//
//
//
//        if (window.isKeyPressed(GLFW_KEY_A) &&
//                (!window.isKeyPressed(GLFW_KEY_W) && !window.isKeyPressed(GLFW_KEY_S) && !window.isKeyPressed(GLFW_KEY_D))){
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            if (degreeY > 359){
//                degreeY = 0;
//            }
//            if (degreeY < 0){
//                degreeY = 359;
//            }
//            if (degreeY != 270) {
//                for (Object object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                if (degreeY > 90 && degreeY <= 270) {
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                    }
//                    degreeY++;
//                } else {
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                    }
//                    degreeY--;
//                }
//                for (Object object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_W) &&
//        (!window.isKeyPressed(GLFW_KEY_A) && !window.isKeyPressed(GLFW_KEY_S) && !window.isKeyPressed(GLFW_KEY_D))){
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            if (degreeY > 359){
//                degreeY = 0;
//            }
//            if (degreeY < 0){
//                degreeY = 359;
//            }
//            if (degreeY != 180) {
//                for (Object object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                if (degreeY > 0 && degreeY <= 180) {
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                    }
//                    degreeY++;
//                } else {
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                    }
//                    degreeY--;
//                }
//                for (Object object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_S) &&
//                (!window.isKeyPressed(GLFW_KEY_A) && !window.isKeyPressed(GLFW_KEY_W) && !window.isKeyPressed(GLFW_KEY_D))){
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            if (degreeY > 359){
//                degreeY = 0;
//            }
//            if (degreeY < 0){
//                degreeY = 359;
//            }
//            if (degreeY != 0) {
//                for (Object object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                if (degreeY > 180) {
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                    }
//                    degreeY++;
//                } else {
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                    }
//                    degreeY--;
//                }
//                for (Object object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_D) &&
//                (!window.isKeyPressed(GLFW_KEY_A) && !window.isKeyPressed(GLFW_KEY_W) && !window.isKeyPressed(GLFW_KEY_S))){
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            if (degreeY > 359){
//                degreeY = 0;
//            }
//            if (degreeY < 0){
//                degreeY = 359;
//            }
//            if (degreeY != 90) {
//                for (Object object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                if (degreeY <= 90 || degreeY >= 270) {
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                    }
//                    degreeY++;
//                } else{
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                    }
//                    degreeY--;
//                }
//                for (Object object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_Z)){
//            if (degreeY > 359){
//                degreeY = 0;
//            }
//            degreeY++;
//            for (Object object:blockDragon){
//                object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_X)){
//            if (degreeX > 359){
//                degreeX = 0;
//            }
//            degreeX++;
//            for (Object object:blockDragon){
//                object.rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_Q) && !handToogle){
//            handToogle = true;
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_E) && handToogle){
//            handToogle = false;
//        }
//
//
//        if (handToogle){
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            if (handZ > 359){
//                handZ = 0;
//            }
//            else if (handZ < 0){
//                handZ = 359;
//            }
//
//            if (handZ == 25){
//                handMin = true;
//                handMax = false;
//            }
//
//            if (handZ == 330){
//                handMax = true;
//                handMin = false;
//            }
//
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            Vector3f pos1 = anchorPoint.get(4).model.transformPosition(new Vector3f());
//            Vector3f pos2 = anchorPoint.get(5).model.transformPosition(new Vector3f());
//
//            int tempX = degreeX;
//            int tempY = degreeY;
//            int tempZ = degreeZ;
//
//
//            blockDragon.get(4).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(5).translateObject(-pos.x, -pos.y, -pos.z);
//            while (degreeX < 0){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                degreeX--;
//            }
//
//            while (degreeY > 0){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                degreeY--;
//            }
//
//            while (degreeZ > 0){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                degreeZ--;
//            }
//
//            blockDragon.get(4).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(5).translateObject(pos.x, pos.y, pos.z);
//
//            blockDragon.get(4).translateObject(-pos1.x, -pos1.y, -pos1.z);
//            blockDragon.get(5).translateObject(-pos2.x, -pos2.y, -pos2.z);
//
//            if (!handMin){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                handZ++;
//            }
//            else if (!handMax){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                handZ--;
//            }
//
//            blockDragon.get(4).translateObject(pos1.x, pos1.y, pos1.z);
//            blockDragon.get(5).translateObject(pos2.x, pos2.y, pos2.z);
//
//
//            blockDragon.get(4).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(5).translateObject(-pos.x, -pos.y, -pos.z);
//            while (degreeX < tempX){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                degreeX++;
//            }
//
//            while (degreeY < tempY){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                degreeY++;
//            }
//
//            while (degreeZ < tempZ){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                degreeZ++;
//            }
//
//            blockDragon.get(4).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(5).translateObject(pos.x, pos.y, pos.z);
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//        }
//
//        if (height > 0){
//
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0) {
//                    for (Object object : blockDragon) {
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object : anchorPoint) {
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            if (wingY == 20){
//                wingMax = true;
//                wingMin = false;
//            }
//
//            if (wingY == 0){
//                wingMin = true;
//                wingMax = false;
//            }
//
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            Vector3f pos1 = anchorPoint.get(6).model.transformPosition(new Vector3f());
//            Vector3f pos2 = anchorPoint.get(7).model.transformPosition(new Vector3f());
//
//
//
//            int tempX = degreeX;
//            int tempY = degreeY;
//            int tempZ = degreeZ;
//
//            blockDragon.get(6).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(7).translateObject(-pos.x, -pos.y, -pos.z);
//
//            while (degreeX < 0){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                degreeX--;
//            }
//
//            while (degreeY > 0){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                degreeY--;
//            }
//
//            while (degreeZ > 0){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                degreeZ--;
//            }
//
//            blockDragon.get(6).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(7).translateObject(pos.x, pos.y, pos.z);
//
//
//
//            blockDragon.get(6).translateObject(-pos1.x, -pos1.y, -pos1.z);
//            blockDragon.get(7).translateObject(-pos2.x, -pos2.y, -pos2.z);
//            if (wingMin) {
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(2.0f)), 0.0f, 1.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(2.0f)), 0.0f, -1.0f, 0.0f);
//                wingY++;
//            }
//            else if (wingMax){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(2.0f)), 0.0f, -1.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(2.0f)), 0.0f, 1.0f, 0.0f);
//                wingY--;
//            }
//            blockDragon.get(6).translateObject(pos1.x, pos1.y, pos1.z);
//            blockDragon.get(7).translateObject(pos2.x, pos2.y, pos2.z);
//
//            blockDragon.get(6).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(7).translateObject(-pos.x, -pos.y, -pos.z);
//            while (degreeX < tempX){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                degreeX++;
//            }
//
//            while (degreeY < tempY){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                degreeY++;
//            }
//
//            while (degreeZ < tempZ){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                degreeZ++;
//            }
//            blockDragon.get(6).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(7).translateObject(pos.x, pos.y, pos.z);
//
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_J) && height==0){
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            int tempY = degreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            for (Object object: blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//
//            while (degreeY !=0){
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                degreeY--;
//            }
//
//            while (degreeX != 30) {
//                if (degreeX > 30) {
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                    }
//                    degreeX--;
//                }
//                else{
//                    for (Object object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                    }
//                    degreeX++;
//                }
//            }
//
//            while (degreeY != tempY){
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                degreeY++;
//            }
//
//            for (Object object: blockDragon){
//                object.translateObject(0.0f, 0.25f, 0.0f);
//            }
//
//            for (Object object: anchorPoint){
//                object.translateObject(0.0f, 0.25f, 0.0f);
//            }
//            height++;
//
//            for (Object object: blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_K) && height==1){
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            int tempY = degreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//
//            for (Object object: blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//
//            while (degreeY !=0){
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                degreeY--;
//            }
//
//
//            while (degreeX != 0) {
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                }
//                degreeX--;
//            }
//
//            while (degreeY != tempY){
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                degreeY++;
//            }
//
//            for (Object object: blockDragon){
//                object.translateObject(0.0f, -0.25f, 0.0f);
//            }
//
//            for (Object object: anchorPoint){
//                object.translateObject(0.0f, -0.25f, 0.0f);
//            }
//            height--;
//
//            for (Object object: blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_M)){
//
//            int tempY = degreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//
//
//            while (degreeY !=0){
//                for (Object object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                for (Object object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//                degreeY--;
//            }
//
//            for (Object object: blockDragon){
//                object.translateObject(0.0f, 0.0f, 0.01f);
//            }
//            for (Object object2: anchorPoint){
//                object2.translateObject(0.0f, 0.0f, 0.01f);
//            }
//
//            blockX = (int) (anchorPoint.get(0).model.transformPosition(new Vector3f()).x * 100);
//            blockY = (int) (anchorPoint.get(0).model.transformPosition(new Vector3f()).y * 100);
//            blockZ = (int) (anchorPoint.get(0).model.transformPosition(new Vector3f()).z * 10);
//
//
//            while (degreeY != tempY){
//                for (Object object: blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                for (Object object: anchorPoint){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                for (Object object : anchorPoint) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                for (Object object: blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//                for (Object object: anchorPoint){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//                degreeY++;
//            }
//
//            pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            for (Object object : anchorPoint){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (tempY != 0) {
//                for (Object object : anchorPoint) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                tempY--;
//            }
//            for (Object object : anchorPoint){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_B)){
//
//            if (big){
//                for (Object object : blockDragon) {
//                    object.scaleObject(1.1f, 1.1f, 1.1f);
//                }
//                for (Object object : anchorPoint) {
//                    object.scaleObject(1.1f, 1.1f, 1.1f);
//                }
//                bigCount++;
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            else {
//                for (Object object : blockDragon) {
//                    object.scaleObject(0.91f, 0.91f, 0.91f);
//                }
//                for (Object object : anchorPoint) {
//                    object.scaleObject(0.91f, 0.91f, 0.91f);
//                }
//                bigCount--;
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if (bigCount > 0){
//                big=false;
//            }
//            else if (bigCount == 0){
//                big=true;
//            }
//
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_N) && !sit){
//            sit = true;
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            int tempY = degreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//
//            for (Object object : blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (degreeY !=0){
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                degreeY--;
//            }
//            for (Object object : blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            for (int i=0; i<3; i++) {
//                blockDragon.get(8).scaleObject(2.0f, 2.0f, 2.0f);
//            }
//
//            for (int i=0; i<3; i++) {
//                for (Object object : blockDragon) {
//                    object.translateObject(0.0f, 0.05f, 0.0f);
//                }
//                blockDragon.get(8).translateObject(0.0f, -0.05f, 0.0f);
//            }
//            for (int i=0; i<3; i++) {
//                for (Object object : blockDragon) {
//                    object.translateObject(0.0f, 0.05f, 0.0f);
//                }
//                blockDragon.get(8).translateObject(0.0f, -0.05f, 0.0f);
//            }
//
//
//            pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            blockDragon.get(2).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(3).translateObject(-pos.x, -pos.y, -pos.z);
//            for (int i=0; i<90; i++){
//                blockDragon.get(2).rotateObject((float)(Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                blockDragon.get(3).rotateObject((float)(Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//            }
//            blockDragon.get(2).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(3).translateObject(pos.x, pos.y, pos.z);
//
//            blockDragon.get(2).translateObject(0.0f, 0.3f, 0.37f);
//            blockDragon.get(3).translateObject(0.0f, 0.3f, 0.37f);
//
//            for (Object object:blockDragon){
//                object.translateObject(0.0f, -0.15f, 0.0f);
//            }
//            blockDragon.get(8).translateObject(0.0f,0.15f,0.0f);
//
//            pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            for (Object object : blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (degreeY != tempY) {
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                degreeY++;
//            }
//            for (Object object : blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//
//
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_F) && sit){
//            blockDragon.get(8).translateObject((float)blockX*0.65f, (float)blockY, (float)blockZ*0.65f);
//            sit = false;
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            int tempY = degreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//
//            for (Object object : blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (degreeY !=0){
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                degreeY--;
//            }
//            for (Object object : blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            blockDragon.get(8).translateObject(0.0f,-0.15f,0.0f);
//            for (Object object:blockDragon){
//                object.translateObject(0.0f, 0.15f, 0.0f);
//            }
//            blockDragon.get(2).translateObject(0.0f, -0.3f, -0.37f);
//            blockDragon.get(3).translateObject(0.0f, -0.3f, -0.37f);
//
//            pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            blockDragon.get(2).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(3).translateObject(-pos.x, -pos.y, -pos.z);
//            for (int i=0; i<90; i++){
//                blockDragon.get(2).rotateObject((float)(Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                blockDragon.get(3).rotateObject((float)(Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//            blockDragon.get(2).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(3).translateObject(pos.x, pos.y, pos.z);
//
//            for (int i=0; i<3; i++) {
//                for (Object object : blockDragon) {
//                    object.translateObject(0.0f, -0.05f, 0.0f);
//                }
//                blockDragon.get(8).translateObject(0.0f, 0.05f, 0.0f);
//            }
//
//            for (int i=0; i<3; i++) {
//                for (Object object : blockDragon) {
//                    object.translateObject(0.0f, -0.05f, 0.0f);
//                }
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            for (int i=0; i<3; i++) {
//                blockDragon.get(8).scaleObject(0.5f, 0.5f, 0.5f);
//            }
//            blockDragon.get(8).translateObject(0.0f, 0.01875f, 0.0f);
//
//            pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            for (Object object : blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (degreeY != tempY) {
//                for (Object object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                degreeY++;
//            }
//            for (Object object : blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (Object object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (Object object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
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
//
//            for(Object object: background){
//                object.draw(camera, projection);
//            }
//
//            for (Object object: blockDragon){
//                object.draw(camera, projection);
//            }
//            blockDragon.get(8).draw(camera,projection);
//
//            for (Object object: anchorPoint){
//                object.draw(camera, projection);
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
//        new MainDragon().run();
//    }
//}
