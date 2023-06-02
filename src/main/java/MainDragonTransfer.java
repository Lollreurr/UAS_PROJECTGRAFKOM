//import Engine.Box_Kristofer;
//import Engine.Object;
//
//import Engine.*;
//
//import Engine.Curve_Kristofer;
//import Engine.Curve_wing_IceCubeD;
//import Engine.Elipsoid_Kristofer;
//import Engine.Object_IceCubeD;
//import Engine.Box_Kristofer;
//import Engine.Camera_IceCubeD;
//import Engine.Projection_IceCubeD;
//import Engine.Object_Kristofer;
//import Engine.Camera_Kristofer;
//import Engine.Projection_Kristofer;
//import Engine.Object2d_Gummy;
//import Engine.Projection_Gummy;
//import Engine.Camera_Gummy;
//import Engine.ShaderProgram_Kristofer;
//import Engine.Tube_Kristofer;
//import Engine.Sphere_Kristofer;
//import Engine.Sphere_IceCubeD;
//import Engine.plane_Kristofer;
//import Engine.sphere_Gummy;
//import Engine.Rectangle_Gummy;
//
//
//import Engine.*;
//import Engine.Object_IceCubeD;
//import Engine.Object_Kristofer;
//import Engine.ShaderProgram_Kristofer;
//import Engine.Sphere_IceCubeD;
//import Engine.Sphere_Kristofer;
//import Engine.Tube_Kristofer;
//import org.joml.Math;
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
//public class MainDragonTransfer {
//    private Window window =
//            new Window
//                    (800,800,"Dragon");
//
////    private ArrayList<ObjectBlockDragon> background
////            = new ArrayList<>();
//
//    private ArrayList<ObjectBlockDragon> blockDragon
//            = new ArrayList<>();
//
//    private ArrayList<ObjectBlockDragon> anchorPoint
//            = new ArrayList<>();
//
//    private ArrayList<Object_IceCubeD> background = new ArrayList<>();
//    private ArrayList<Object_Kristofer> object_bg = new ArrayList<>();
//
//
//
//    Camera camera = new Camera();
//    Projection projection = new Projection(window.getWidth(), window.getHeight());
//
//    Camera_Kristofer camera_Kristofer = new Camera_Kristofer();
//    Projection_Kristofer projection_Kristofer = new Projection_Kristofer(window.getWidth(), window.getHeight());
//
//    Camera_IceCubeD cameraIceCubeD = new Camera_IceCubeD();
//    Projection_IceCubeD projectionIceCubeD = new Projection_IceCubeD(window.getWidth(), window.getHeight());
//
//    // block dragon position
//    int blockX=0;
//    int blockY=0;
//    int blockZ=0;
//
//    // block dragon rotation
//    int blockDegreeX=0;
//    int blockDegreeY=0;
//    int blockDegreeZ=0;
//
//    // block dragon hands variable
//    int blockHandZ=0;
//    boolean blockHandMin=false;
//    boolean blockHandMax=false;
//    boolean blockHandToggle=false;
//
//    // block dragon wings variable
//    int blockWingY=0;
//    boolean blockWingMin=false;
//    boolean blockWingMax=false;
//
//    // block dragon flying variable
//    int blockHeight=0;
//
//    // block dragon sit animation variable
//    boolean blockSit=false;
//
//    // block dragon scaling
//    boolean big=true;
//    int bigCount=0;
//
//    boolean spin = false;
//
//    public void initBg(){
//        object_bg.add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.352f,0.960f,0.00f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                50f,
//                1f,
//                50f,
//                36,18
//        ));
//        object_bg.get(0).translateObject(0.5f, -1f, 0.0f);
//        object_bg.add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.15f
//        ));
//        object_bg.get(1).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).translateObject(-0.7f, -0.05f, 0.2f);
//        object_bg.get(1).scaleObject(1.0f, 1.5f, 1.0f);
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.640f, 0.510f, 0.250f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.15f
//        ));
//        object_bg.get(1).getChildObject().get(0).scaleObject(0.9f, 0.9f, 0.9f);
//        object_bg.get(1).getChildObject().get(0).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(0).translateObject(-0.7f, -0.049f, 0.2f);
//        object_bg.get(1).getChildObject().get(0).scaleObject(1.0f, 1.5f, 1.0f);
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.3f
//        ));
//        object_bg.get(1).getChildObject().get(1).scaleObject(0.7f, 0.7f, 0.9f);
//        object_bg.get(1).getChildObject().get(1).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(1).translateObject(-0.7f, 0.05f, 0.2f);
//        object_bg.get(1).getChildObject().get(1).scaleObject(1.0f, 1.2f, 1.0f);
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.640f, 0.510f, 0.250f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.3f
//        ));
//        object_bg.get(1).getChildObject().get(2).scaleObject(0.5f, 0.5f, 0.7f);
//        object_bg.get(1).getChildObject().get(2).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(2).translateObject(-0.7f, 0.051f, 0.2f);
//        object_bg.get(1).getChildObject().get(2).scaleObject(1.0f, 1.2f, 1.0f);
//
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.2f
//        ));
//        object_bg.get(1).getChildObject().get(3).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(3).scaleObject(0.5f, 1.2f, 0.5f);
//        object_bg.get(1).getChildObject().get(3).translateObject(-0.5f, -0.065f, 0.2f);
//
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.640f, 0.510f, 0.250f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.2f
//        ));
//        object_bg.get(1).getChildObject().get(4).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(4).scaleObject(0.4f, 1.2f, 0.4f);
//        object_bg.get(1).getChildObject().get(4).translateObject(-0.5f, -0.064f, 0.2f);
//
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.2f
//        ));
//        object_bg.get(1).getChildObject().get(5).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(5).scaleObject(0.5f, 1.7f, 0.5f);
//        object_bg.get(1).getChildObject().get(5).translateObject(-0.9f, -0.025f, 0.2f);
//
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.640f, 0.510f, 0.250f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.2f
//        ));
//        object_bg.get(1).getChildObject().get(6).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(6).scaleObject(0.4f, 1.7f, 0.4f);
//        object_bg.get(1).getChildObject().get(6).translateObject(-0.9f, -0.024f, 0.2f);
//
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.2f
//        ));
//        object_bg.get(1).getChildObject().get(7).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(7).scaleObject(0.5f, 0.6f, 0.5f);
//        object_bg.get(1).getChildObject().get(7).translateObject(-0.7f, -0.13f, 0.4f);
//
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.640f, 0.510f, 0.250f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.2f
//        ));
//        object_bg.get(1).getChildObject().get(8).rotateObject(Math.toRadians(90), 1.0f, 0.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(8).scaleObject(0.4f, 0.6f, 0.4f);
//        object_bg.get(1).getChildObject().get(8).translateObject(-0.7f, -0.129f, 0.4f);
//
//        object_bg.get(1).scaleObject(1.0f, 1.5f, 1.0f);
//
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(9).translateObject(-1.36f, 0.2f, 1.45f);
//        object_bg.get(1).getChildObject().get(9).scaleObject(0.5f, 0.5f, 0.2f);
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(10).scaleObject(0.5f, 0.5f, 0.2f);
//        object_bg.get(1).getChildObject().get(10).rotateObject(Math.toRadians(-280), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(10).translateObject(-0.61f, 0.1f, 0.22f);
//
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(11).scaleObject(0.5f, 0.5f, 0.2f);
//        object_bg.get(1).getChildObject().get(11).rotateObject(Math.toRadians(160), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(11).translateObject(-0.66f, 0.1f, 0.12f);
//
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(12).scaleObject(0.5f, 0.5f, 0.2f);
//        object_bg.get(1).getChildObject().get(12).rotateObject(Math.toRadians(60), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(12).translateObject(-0.76f, 0.1f, 0.14f);
//
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(13).scaleObject(0.5f, 0.5f, 0.2f);
//        object_bg.get(1).getChildObject().get(13).rotateObject(Math.toRadians(300), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(13).translateObject(-0.78f, 0.1f, 0.24f);
//
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(14).translateObject(-1.35f, -0.2f, 1.67f);
//        object_bg.get(1).getChildObject().get(14).scaleObject(0.5f, 0.5f, 0.2f);
//
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(15).scaleObject(0.5f, 0.5f, 0.2f);
//        object_bg.get(1).getChildObject().get(15).rotateObject(Math.toRadians(-280), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(15).translateObject(-0.57f, -0.1f, 0.22f);
//
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(16).scaleObject(0.5f, 0.5f, 0.2f);
//        object_bg.get(1).getChildObject().get(16).rotateObject(Math.toRadians(160), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(16).translateObject(-0.62f, -0.1f, 0.08f);
//
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(17).scaleObject(0.5f, 0.5f, 0.2f);
//        object_bg.get(1).getChildObject().get(17).rotateObject(Math.toRadians(60), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(17).translateObject(-0.8f, -0.1f, 0.1f);
//
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.850f, 0.677f, 0.332f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.13f,
//                0.05f,
//                0.1f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(18).scaleObject(0.5f, 0.5f, 0.2f);
//        object_bg.get(1).getChildObject().get(18).rotateObject(Math.toRadians(300), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(18).translateObject(-0.83f, -0.1f, 0.25f);
//        //pintu
//        object_bg.get(1).getChildObject().add(new Tube_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.640f, 0.510f, 0.250f,1.0f),
//                Arrays.asList(0.0f,0.0f,00.0f),
//                0.15f,
//                0.15f,
//                0.0f,
//                0.15f,
//                1f
//        ));
//        object_bg.get(1).getChildObject().add(new Box_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.640f, 0.510f, 0.250f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.3f,
//                0.2f,
//                0.07f,
//                36,18
//        ));
//        object_bg.get(1).getChildObject().get(20).translateObject(0.0f,-0.09f,0.05f);
//        object_bg.get(1).getChildObject().get(19).scaleObject(0.3f,0.3f,0.3f);
//        object_bg.get(1).getChildObject().get(20).scaleObject(0.3f,0.3f,0.3f);
//        object_bg.get(1).getChildObject().get(19).rotateObject(Math.toRadians(80), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(20).rotateObject(Math.toRadians(80), 0.0f, 1.0f, 0.0f);
//        object_bg.get(1).getChildObject().get(19).translateObject(-0.43f, -0.22f, 0.2f);
//        object_bg.get(1).getChildObject().get(20).translateObject(-0.434f, -0.22f, 0.2f);
//
//        //gunung
//        object_bg.add(new Sphere_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.525f, 0.525f, 0.525f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18
//        ));
//        object_bg.get(2).scaleObject(0.7f, 0.7f, 0.9f);
//        object_bg.get(2).rotateObject(Math.toRadians(90), 1.0f,0.0f, 0.0f);
//
//        object_bg.get(2).getChildObject().add(new Sphere_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.525f, 0.525f, 0.525f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18
//        ));
//        object_bg.get(2).getChildObject().get(0).scaleObject(0.7f, 0.7f, 0.5f);
//        object_bg.get(2).getChildObject().get(0).rotateObject(Math.toRadians(90), 1.0f,0.0f, 0.0f);
//        object_bg.get(2).getChildObject().get(0).translateObject(0.1f,-0.1f, 0.2f);
//
//        object_bg.get(2).getChildObject().add(new Sphere_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.525f, 0.525f, 0.525f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18
//        ));
//        object_bg.get(2).getChildObject().get(1).scaleObject(0.7f, 0.7f, 0.3f);
//        object_bg.get(2).getChildObject().get(1).rotateObject(Math.toRadians(90), 1.0f,0.0f, 0.0f);
//        object_bg.get(2).getChildObject().get(1).translateObject(-0.1f,-0.2f, 0.2f);
//
//        object_bg.get(2).getChildObject().add(new Sphere_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.525f, 0.525f, 0.525f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18
//        ));
//        object_bg.get(2).getChildObject().get(2).scaleObject(0.7f, 0.7f, 0.7f);
//        object_bg.get(2).getChildObject().get(2).rotateObject(Math.toRadians(90), 1.0f,0.0f, 0.0f);
//        object_bg.get(2).getChildObject().get(2).translateObject(0.3f,-0.05f, 0.2f);
//
//        object_bg.get(2).getChildObject().add(new Sphere_Kristofer(
//                Arrays.asList(
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram_Kristofer.ShaderModuleData("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.525f, 0.525f, 0.525f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18
//        ));
//        object_bg.get(2).getChildObject().get(3).scaleObject(1.5f, 1.5f, 0.2f);
//        object_bg.get(2).getChildObject().get(3).rotateObject(Math.toRadians(90), 1.0f,0.0f, 0.0f);
//        object_bg.get(2).getChildObject().get(3).translateObject(0.4f,-0.2f, 0.2f);
//
//        object_bg.get(2).translateObject(0.0f, 0.0f, -0.9f);
//        object_bg.get(2).scaleObject(12f, 15f, 8f);
//        object_bg.get(2).translateObject(-1.5f, 2.85f, -2f);
//
//        object_bg.get(1).translateObject(1.0f,0.0f,-0.25f);
//        object_bg.get(1).scaleObject(2f,2f,2f);
//
//        object_bg.remove(1);
//
//        background.add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,0.0f),
//                new Vector3f(0.0f, -0.5f, 0.0f),10.0f, 10.0f, 10.0f,36,18,0
//        ));
//        background.get(0).translateObject(0.5f,0.6f,-0.7f);
//        background.get(0).scaleObject(10f,5f,10f);
//        background.add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,0.0f),
//                new Vector3f(0.0f, -0.5f, 0.0f),10.0f, 10.0f, 10.0f,36,18,0
//        ));
//        background.get(1).translateObject(0.35f,0.6f,-0.7f);
//        background.get(1).scaleObject(10f,5f,10f);
//        background.add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,0.0f),
//                new Vector3f(0.0f, -0.5f, 0.0f),10.0f, 10.0f, 10.0f,36,18,0
//        ));
//        background.get(2).translateObject(0.45f,0.7f,-0.7f);
//        background.get(2).scaleObject(10f,5f,10f);
//        background.add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,0.0f),
//                new Vector3f(0.0f, -0.5f, 0.0f),10.0f, 10.0f, 10.0f,36,18,0
//        ));
//        background.get(3).translateObject(0.0f,0.8f,-0.7f);
//        background.get(3).scaleObject(10f,5f,10f);
//        background.add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,0.0f),
//                new Vector3f(0.0f, -0.5f, 0.0f),10.0f, 10.0f, 10.0f,36,18,0
//        ));
//        background.get(4).translateObject(0.1f,0.9f,-0.7f);
//        background.get(4).scaleObject(10f,5f,10f);
//        background.add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,0.0f),
//                new Vector3f(0.0f, -0.5f, 0.0f),10.0f, 10.0f, 10.0f,36,18,0
//        ));
//        background.get(5).translateObject(-0.4f,0.7f,-0.7f);
//        background.get(5).scaleObject(10f,5f,10f);
//        background.add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,0.0f),
//                new Vector3f(0.0f, -0.5f, 0.0f),10.0f, 10.0f, 10.0f,36,18,0
//        ));
//        background.get(6).translateObject(-0.5f,0.65f,-0.7f);
//        background.get(6).scaleObject(10f,5f,10f);
//        background.add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,0.0f),
//                new Vector3f(0.0f, -0.5f, 0.0f),10.0f, 10.0f, 10.0f,36,18,0
//        ));
//        background.get(7).translateObject(-0.3f,0.65f,-0.7f);
//        background.get(7).scaleObject(10f,5f,10f);
//    }
//
//    public void initBlockDragon(){
//        window.init();
//        GL.createCapabilities();
//
//        camera.setPosition(0.0f, 0.0f, 1.5f);
//        camera.setRotation(((float)Math.toRadians(0.0f)), ((float) Math.toRadians(0.0f)));
//
//        //code
////        background.add(new SquareBlockDragon(
////                Arrays.asList(
////                        //shaderFile lokasi menyesuaikan objectnya
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
////                                        , GL_VERTEX_SHADER),
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
////                                        , GL_FRAGMENT_SHADER)
////                ),
////                new ArrayList<>(
////                        List.of(
////                        )
////                ),
////                new Vector4f(0.6f,1.0f,1.0f,0.0f),
////                new Vector3f(0.0f, 0.0f, 0.0f),50.0f, 50.0f, 50.0f
////        ));
////        background.add(new SquareBlockDragon(
////                Arrays.asList(
////                        //shaderFile lokasi menyesuaikan objectnya
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
////                                        , GL_VERTEX_SHADER),
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
////                                        , GL_FRAGMENT_SHADER)
////                ),
////                new ArrayList<>(
////                        List.of(
////                        )
////                ),
////                new Vector4f(0.950f,0.813f,0.608f,0.0f),
////                new Vector3f(0.0f, -0.5f, 0.0f),50.0f, 1.0f, 50.0f
////        ));
////        background.add(new TubeBlockDragon(
////                Arrays.asList(
////                        //shaderFile lokasi menyesuaikan objectnya
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
////                                        , GL_VERTEX_SHADER),
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
////                                        , GL_FRAGMENT_SHADER)
////                ),
////                new ArrayList<>(
////                        List.of(
////                        )
////                ),
////                new Vector4f(1.0f,1.0f,1.0f,0.0f),
////                new Vector3f(-0.5f, 0.0f, -5.0f),1.0f, 0.5f, 1.0f
////        ));
////        background.add(new TubeBlockDragon(
////                Arrays.asList(
////                        //shaderFile lokasi menyesuaikan objectnya
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
////                                        , GL_VERTEX_SHADER),
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
////                                        , GL_FRAGMENT_SHADER)
////                ),
////                new ArrayList<>(
////                        List.of(
////                        )
////                ),
////                new Vector4f(1.0f,1.0f,1.0f,0.0f),
////                new Vector3f(0.9f, 0.0f, 0.5f),0.2f, 0.5f, 0.5f
////        ));
////        background.add(new TubeBlockDragon(
////                Arrays.asList(
////                        //shaderFile lokasi menyesuaikan objectnya
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
////                                        , GL_VERTEX_SHADER),
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
////                                        , GL_FRAGMENT_SHADER)
////                ),
////                new ArrayList<>(
////                        List.of(
////                        )
////                ),
////                new Vector4f(1.0f,1.0f,1.0f,0.0f),
////                new Vector3f(-0.9f, 0.0f, 0.6f),0.3f, 0.8f, 0.5f
////        ));
//    }
//
//    public void blockinit(){
//        camera.setPosition(0.0f, 0.0f, 1.5f);
//        camera.setRotation(((float)Math.toRadians(0.0f)), ((float) Math.toRadians(0.0f)));
//
//        //code
////        background.add(new SquareBlockDragon(
////                Arrays.asList(
////                        //shaderFile lokasi menyesuaikan objectnya
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
////                                        , GL_VERTEX_SHADER),
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
////                                        , GL_FRAGMENT_SHADER)
////                ),
////                new ArrayList<>(
////                        List.of(
////                        )
////                ),
////                new Vector4f(0.6f,1.0f,1.0f,0.0f),
////                new Vector3f(0.0f, 0.0f, 0.0f),50.0f, 50.0f, 50.0f
////        ));
////        background.add(new SquareBlockDragon(
////                Arrays.asList(
////                        //shaderFile lokasi menyesuaikan objectnya
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
////                                        , GL_VERTEX_SHADER),
////                        new ShaderProgram.ShaderModuleData
////                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
////                                        , GL_FRAGMENT_SHADER)
////                ),
////                new ArrayList<>(
////                        List.of(
////                        )
////                ),
////                new Vector4f(0.950f,0.813f,0.608f,0.0f),
////                new Vector3f(0.0f, -0.5f, 0.0f),50.0f, 1.0f, 50.0f
////        ));
//
//        // mid body
//        blockDragon.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.37f, 0.1f, 0.39f
//        ));
//        anchorPoint.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(0).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(0).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(1).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(0.0f, 0.3f, 0.05f),
//                0.35f, 0.12f, 0.33f
//        ));
//        anchorPoint.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(1).getChildObject().get(0).getChildObject().add(new TubeBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                new Vector3f(-0.075f, 0.37f, 0.15f),
//                0.05f, 0.05f, 0.05f
//        ));
//        blockDragon.get(1).getChildObject().get(0).getChildObject().add(new TubeBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(1).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(-0.20f, 0.34f, -0.05f),
//                0.05f, 0.15f, 0.15f
//        ));
//        blockDragon.get(1).getChildObject().get(1).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(1).getChildObject().get(1).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 1.0f, 0.0f, 0.0f),
//                new Vector3f(-0.21f, 0.34f, -0.05f),
//                0.05f, 0.12f, 0.12f
//        ));
//        blockDragon.get(1).getChildObject().get(1).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.5f, 0.1f, 0.0f),
//                new Vector3f(-0.22f, 0.33f, -0.04f),
//                0.05f, 0.10f, 0.10f
//        ));
//        blockDragon.get(1).getChildObject().get(1).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(1).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 0.2f, 0.3f, 0.0f),
//                new Vector3f(0.20f, 0.34f, -0.05f),
//                0.05f, 0.15f, 0.15f
//        ));
//        blockDragon.get(1).getChildObject().get(2).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(1).getChildObject().get(2).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.9f, 1.0f, 0.0f, 0.0f),
//                new Vector3f(0.21f, 0.34f, -0.05f),
//                0.05f, 0.12f, 0.12f
//        ));
//        blockDragon.get(1).getChildObject().get(2).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.5f, 0.1f, 0.0f),
//                new Vector3f(0.22f, 0.33f, -0.04f),
//                0.05f, 0.10f, 0.10f
//        ));
//        blockDragon.get(1).getChildObject().get(2).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(2).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(2).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(2).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        anchorPoint.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(3).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(2).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(2).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        anchorPoint.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        anchorPoint.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(4).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(4).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(4).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(4).getChildObject().add(new SphereBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        anchorPoint.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(5).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(5).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(5).getChildObject().add(new PawBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.get(5).getChildObject().add(new SphereBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(0.32f, 0.1f, -0.28f),
//                0.35f, 0.1f, 0.05f
//        ));
//        blockDragon.get(6).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        anchorPoint.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.0f, 0.4f, 0.9f, 0.0f),
//                new Vector3f(-0.32f, 0.1f, -0.28f),
//                0.35f, 0.1f, 0.05f
//        ));
//        blockDragon.get(7).getChildObject().add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        anchorPoint.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        blockDragon.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.6f, 0.3f, 0.1f, 0.0f),
//                new Vector3f(0.0f, 0.0f, 0.0f),
//                0.6f, 0.05f, 0.6f
//        ));
//        blockDragon.get(8).getChildObject().add(new TubeBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.6f, 0.3f, 0.1f, 0.0f),
//                new Vector3f(-0.15f, -0.13f, 0.2f),
//                0.05f, 0.21f, 0.05f
//        ));
//        blockDragon.get(8).getChildObject().add(new TubeBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.6f, 0.3f, 0.1f, 0.0f),
//                new Vector3f(0.15f, -0.13f, 0.2f),
//                0.05f, 0.21f, 0.05f
//        ));
//        blockDragon.get(8).getChildObject().add(new TubeBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of()
//                ),
//                new Vector4f(0.6f, 0.3f, 0.1f, 0.0f),
//                new Vector3f(-0.15f, -0.13f, -0.2f),
//                0.05f, 0.21f, 0.05f
//        ));
//        blockDragon.get(8).getChildObject().add(new TubeBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        anchorPoint.add(new SquareBlockDragon(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
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
//        for (ObjectBlockDragon object:blockDragon){
//            object.scaleObject(0.7f, 0.7f, 0.7f);
//        }
//        for (ObjectBlockDragon object:anchorPoint){
//            object.scaleObject(0.7f, 0.7f, 0.7f);
//        }
//
//    }
//    public void inputBlockDragon(){
//
//        if (window.isKeyPressed(GLFW_KEY_A) &&
//                (!window.isKeyPressed(GLFW_KEY_W) && !window.isKeyPressed(GLFW_KEY_S) && !window.isKeyPressed(GLFW_KEY_D))){
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            if (blockDegreeY > 359){
//                blockDegreeY = 0;
//            }
//            if (blockDegreeY < 0){
//                blockDegreeY = 359;
//            }
//            if (blockDegreeY != 270) {
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                if (blockDegreeY > 90 && blockDegreeY <= 270) {
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                    }
//                    blockDegreeY++;
//                } else {
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                    }
//                    blockDegreeY--;
//                }
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_W) &&
//        (!window.isKeyPressed(GLFW_KEY_A) && !window.isKeyPressed(GLFW_KEY_S) && !window.isKeyPressed(GLFW_KEY_D))){
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            if (blockDegreeY > 359){
//                blockDegreeY = 0;
//            }
//            if (blockDegreeY < 0){
//                blockDegreeY = 359;
//            }
//            if (blockDegreeY != 180) {
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                if (blockDegreeY > 0 && blockDegreeY <= 180) {
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                    }
//                    blockDegreeY++;
//                } else {
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                    }
//                    blockDegreeY--;
//                }
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_S) &&
//                (!window.isKeyPressed(GLFW_KEY_A) && !window.isKeyPressed(GLFW_KEY_W) && !window.isKeyPressed(GLFW_KEY_D))){
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            if (blockDegreeY > 359){
//                blockDegreeY = 0;
//            }
//            if (blockDegreeY < 0){
//                blockDegreeY = 359;
//            }
//            if (blockDegreeY != 0) {
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                if (blockDegreeY > 180) {
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                    }
//                    blockDegreeY++;
//                } else {
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                    }
//                    blockDegreeY--;
//                }
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_D) &&
//                (!window.isKeyPressed(GLFW_KEY_A) && !window.isKeyPressed(GLFW_KEY_W) && !window.isKeyPressed(GLFW_KEY_S))){
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            if (blockDegreeY > 359){
//                blockDegreeY = 0;
//            }
//            if (blockDegreeY < 0){
//                blockDegreeY = 359;
//            }
//            if (blockDegreeY != 90) {
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                if (blockDegreeY <= 90 || blockDegreeY >= 270) {
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                    }
//                    blockDegreeY++;
//                } else{
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                    }
//                    blockDegreeY--;
//                }
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_Z)){
//            spin = true;
//        }
//
//        if (spin == true){
//            if (blockDegreeY > 359){
//                blockDegreeY = 0;
//            }
//            blockDegreeY++;
//            for (ObjectBlockDragon object:blockDragon){
//                object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_X)){
//            if (blockDegreeX > 359){
//                blockDegreeX = 0;
//            }
//            blockDegreeX++;
//            for (ObjectBlockDragon object:blockDragon){
//                object.rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_Q) && !blockHandToggle){
//            blockHandToggle = true;
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_E) && blockHandToggle){
//            blockHandToggle = false;
//        }
//
//
//        if (blockHandToggle){
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            if (blockHandZ > 359){
//                blockHandZ = 0;
//            }
//            else if (blockHandZ < 0){
//                blockHandZ = 359;
//            }
//
//            if (blockHandZ == 25){
//                blockHandMin = true;
//                blockHandMax = false;
//            }
//
//            if (blockHandZ == 330){
//                blockHandMax = true;
//                blockHandMin = false;
//            }
//
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            Vector3f pos1 = anchorPoint.get(4).model.transformPosition(new Vector3f());
//            Vector3f pos2 = anchorPoint.get(5).model.transformPosition(new Vector3f());
//
//            int tempX = blockDegreeX;
//            int tempY = blockDegreeY;
//            int tempZ = blockDegreeZ;
//
//
//            blockDragon.get(4).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(5).translateObject(-pos.x, -pos.y, -pos.z);
//            while (blockDegreeX < 0){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                blockDegreeX--;
//            }
//
//            while (blockDegreeY > 0){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                blockDegreeY--;
//            }
//
//            while (blockDegreeZ > 0){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                blockDegreeZ--;
//            }
//
//            blockDragon.get(4).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(5).translateObject(pos.x, pos.y, pos.z);
//
//            blockDragon.get(4).translateObject(-pos1.x, -pos1.y, -pos1.z);
//            blockDragon.get(5).translateObject(-pos2.x, -pos2.y, -pos2.z);
//
//            if (!blockHandMin){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                blockHandZ++;
//            }
//            else if (!blockHandMax){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                blockHandZ--;
//            }
//
//            blockDragon.get(4).translateObject(pos1.x, pos1.y, pos1.z);
//            blockDragon.get(5).translateObject(pos2.x, pos2.y, pos2.z);
//
//
//            blockDragon.get(4).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(5).translateObject(-pos.x, -pos.y, -pos.z);
//            while (blockDegreeX < tempX){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                blockDegreeX++;
//            }
//
//            while (blockDegreeY < tempY){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                blockDegreeY++;
//            }
//
//            while (blockDegreeZ < tempZ){
//                blockDragon.get(4).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                blockDragon.get(5).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                blockDegreeZ++;
//            }
//
//            blockDragon.get(4).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(5).translateObject(pos.x, pos.y, pos.z);
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//        }
//
//        if (blockHeight > 0){
//
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0) {
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object : anchorPoint) {
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            if (blockWingY == 20){
//                blockWingMax = true;
//                blockWingMin = false;
//            }
//
//            if (blockWingY == 0){
//                blockWingMin = true;
//                blockWingMax = false;
//            }
//
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            Vector3f pos1 = anchorPoint.get(6).model.transformPosition(new Vector3f());
//            Vector3f pos2 = anchorPoint.get(7).model.transformPosition(new Vector3f());
//
//
//
//            int tempX = blockDegreeX;
//            int tempY = blockDegreeY;
//            int tempZ = blockDegreeZ;
//
//            blockDragon.get(6).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(7).translateObject(-pos.x, -pos.y, -pos.z);
//
//            while (blockDegreeX < 0){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                blockDegreeX--;
//            }
//
//            while (blockDegreeY > 0){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                blockDegreeY--;
//            }
//
//            while (blockDegreeZ > 0){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                blockDegreeZ--;
//            }
//
//            blockDragon.get(6).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(7).translateObject(pos.x, pos.y, pos.z);
//
//
//
//            blockDragon.get(6).translateObject(-pos1.x, -pos1.y, -pos1.z);
//            blockDragon.get(7).translateObject(-pos2.x, -pos2.y, -pos2.z);
//            if (blockWingMin) {
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(2.0f)), 0.0f, 1.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(2.0f)), 0.0f, -1.0f, 0.0f);
//                blockWingY++;
//            }
//            else if (blockWingMax){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(2.0f)), 0.0f, -1.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(2.0f)), 0.0f, 1.0f, 0.0f);
//                blockWingY--;
//            }
//            blockDragon.get(6).translateObject(pos1.x, pos1.y, pos1.z);
//            blockDragon.get(7).translateObject(pos2.x, pos2.y, pos2.z);
//
//            blockDragon.get(6).translateObject(-pos.x, -pos.y, -pos.z);
//            blockDragon.get(7).translateObject(-pos.x, -pos.y, -pos.z);
//            while (blockDegreeX < tempX){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                blockDegreeX++;
//            }
//
//            while (blockDegreeY < tempY){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                blockDegreeY++;
//            }
//
//            while (blockDegreeZ < tempZ){
//                blockDragon.get(6).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                blockDragon.get(7).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                blockDegreeZ++;
//            }
//            blockDragon.get(6).translateObject(pos.x, pos.y, pos.z);
//            blockDragon.get(7).translateObject(pos.x, pos.y, pos.z);
//
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_J) && blockHeight==0){
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            int tempY = blockDegreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            for (ObjectBlockDragon object: blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//
//            while (blockDegreeY !=0){
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                blockDegreeY--;
//            }
//
//            while (blockDegreeX != 30) {
//                if (blockDegreeX > 30) {
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                    }
//                    blockDegreeX--;
//                }
//                else{
//                    for (ObjectBlockDragon object : blockDragon) {
//                        object.rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                    }
//                    blockDegreeX++;
//                }
//            }
//
//            while (blockDegreeY != tempY){
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                blockDegreeY++;
//            }
//
//            for (ObjectBlockDragon object: blockDragon){
//                object.translateObject(0.0f, 0.25f, 0.0f);
//            }
//
//            for (ObjectBlockDragon object: anchorPoint){
//                object.translateObject(0.0f, 0.25f, 0.0f);
//            }
//            blockHeight++;
//
//            for (ObjectBlockDragon object: blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_K) && blockHeight==1){
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            int tempY = blockDegreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//
//            for (ObjectBlockDragon object: blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//
//            while (blockDegreeY !=0){
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                blockDegreeY--;
//            }
//
//
//            while (blockDegreeX != 0) {
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
//                }
//                blockDegreeX--;
//            }
//
//            while (blockDegreeY != tempY){
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                blockDegreeY++;
//            }
//
//            for (ObjectBlockDragon object: blockDragon){
//                object.translateObject(0.0f, -0.25f, 0.0f);
//            }
//
//            for (ObjectBlockDragon object: anchorPoint){
//                object.translateObject(0.0f, -0.25f, 0.0f);
//            }
//            blockHeight--;
//
//            for (ObjectBlockDragon object: blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_M)){
//
//            int tempY = blockDegreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//
//
//            while (blockDegreeY !=0){
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                for (ObjectBlockDragon object : blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//                blockDegreeY--;
//            }
//
//            for (ObjectBlockDragon object: blockDragon){
//                object.translateObject(0.0f, 0.0f, 0.01f);
//            }
//            for (ObjectBlockDragon object2: anchorPoint){
//                object2.translateObject(0.0f, 0.0f, 0.01f);
//            }
//
//            blockX = (int) (anchorPoint.get(0).model.transformPosition(new Vector3f()).x * 100);
//            blockY = (int) (anchorPoint.get(0).model.transformPosition(new Vector3f()).y * 100);
//            blockZ = (int) (anchorPoint.get(0).model.transformPosition(new Vector3f()).z * 10);
//
//
//            while (blockDegreeY != tempY){
//                for (ObjectBlockDragon object: blockDragon){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                for (ObjectBlockDragon object: anchorPoint){
//                    object.translateObject(-pos.x, -pos.y, -pos.z);
//                }
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                for (ObjectBlockDragon object : anchorPoint) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                for (ObjectBlockDragon object: blockDragon){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//                for (ObjectBlockDragon object: anchorPoint){
//                    object.translateObject(pos.x, pos.y, pos.z);
//                }
//                blockDegreeY++;
//            }
//
//            pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            for (ObjectBlockDragon object : anchorPoint){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (tempY != 0) {
//                for (ObjectBlockDragon object : anchorPoint) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                tempY--;
//            }
//            for (ObjectBlockDragon object : anchorPoint){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_B)){
//
//            if (big){
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.scaleObject(1.1f, 1.1f, 1.1f);
//                }
//                for (ObjectBlockDragon object : anchorPoint) {
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
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.scaleObject(0.91f, 0.91f, 0.91f);
//                }
//                for (ObjectBlockDragon object : anchorPoint) {
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
//        if (window.isKeyPressed(GLFW_KEY_N) && !blockSit){
//            blockSit = true;
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            int tempY = blockDegreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//
//            for (ObjectBlockDragon object : blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (blockDegreeY !=0){
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                blockDegreeY--;
//            }
//            for (ObjectBlockDragon object : blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            for (int i=0; i<3; i++) {
//                blockDragon.get(8).scaleObject(2.0f, 2.0f, 2.0f);
//            }
//
//            for (int i=0; i<3; i++) {
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.translateObject(0.0f, 0.05f, 0.0f);
//                }
//                blockDragon.get(8).translateObject(0.0f, -0.05f, 0.0f);
//            }
//            for (int i=0; i<3; i++) {
//                for (ObjectBlockDragon object : blockDragon) {
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
//            for (ObjectBlockDragon object:blockDragon){
//                object.translateObject(0.0f, -0.15f, 0.0f);
//            }
//            blockDragon.get(8).translateObject(0.0f,0.15f,0.0f);
//
//            pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//            for (ObjectBlockDragon object : blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (blockDegreeY != tempY) {
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                blockDegreeY++;
//            }
//            for (ObjectBlockDragon object : blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//
//
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_F) && blockSit){
//            blockDragon.get(8).translateObject((float)blockX*0.65f, (float)blockY, (float)blockZ*0.65f);
//            blockSit = false;
//            int tempBlockX = blockX;
//            int tempBlockY = blockY;
//            int tempBlockZ = blockZ;
//
//            if (blockX <= 0){
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            else {
//                while (blockX != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//
//            if (blockY <= 0){
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//            else {
//                while (blockY != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//
//            if (blockZ <= 0){
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    blockZ++;
//                }
//            }
//            else {
//                while (blockZ != 0){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//
//            int tempY = blockDegreeY;
//            Vector3f pos = anchorPoint.get(0).model.transformPosition(new Vector3f());
//
//            for (ObjectBlockDragon object : blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (blockDegreeY !=0){
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
//                }
//                blockDegreeY--;
//            }
//            for (ObjectBlockDragon object : blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            blockDragon.get(8).translateObject(0.0f,-0.15f,0.0f);
//            for (ObjectBlockDragon object:blockDragon){
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
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.translateObject(0.0f, -0.05f, 0.0f);
//                }
//                blockDragon.get(8).translateObject(0.0f, 0.05f, 0.0f);
//            }
//
//            for (int i=0; i<3; i++) {
//                for (ObjectBlockDragon object : blockDragon) {
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
//            for (ObjectBlockDragon object : blockDragon){
//                object.translateObject(-pos.x, -pos.y, -pos.z);
//            }
//            while (blockDegreeY != tempY) {
//                for (ObjectBlockDragon object : blockDragon) {
//                    object.rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                }
//                blockDegreeY++;
//            }
//            for (ObjectBlockDragon object : blockDragon){
//                object.translateObject(pos.x, pos.y, pos.z);
//            }
//
//            if (tempBlockX <= 0){
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(-0.01f, 0.0f, 0.0f);
//                    }
//                    blockX--;
//                }
//            }
//            else {
//                while (blockX != tempBlockX){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.01f, 0.0f, 0.0f);
//                    }
//                    blockX++;
//                }
//            }
//            if (tempBlockY <= 0){
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, -0.01f, 0.0f);
//                    }
//                    blockY--;
//                }
//            }
//            else {
//                while (blockY != tempBlockY){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.01f, 0.0f);
//                    }
//                    blockY++;
//                }
//            }
//
//            if (tempBlockZ <= 0){
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
//                        object.translateObject(0.0f, 0.0f, -0.01f);
//                    }
//                    blockZ--;
//                }
//            }
//            else {
//                while (blockZ != tempBlockZ){
//                    for (ObjectBlockDragon object:blockDragon){
//                        object.translateObject(0.0f, 0.0f, 0.01f);
//                    }
//                    for (ObjectBlockDragon object:anchorPoint){
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
//            glClearColor(0.7f,
//                    1.0f, 1.0f,
//                    0.0f);
//            GL.createCapabilities();
//            inputBlockDragon();
//
//            //code
//
//
////            for(ObjectBlockDragon object: background){
////                object.draw(camera, projection);
////            }
////
////            for (ObjectBlockDragon object: blockDragon){
////                object.draw(camera, projection);
////            }
//
//            for (Object_Kristofer object2d : object_bg) {
//                object2d.draw(camera_Kristofer, projection_Kristofer);
//            }
//            for (Object_IceCubeD object2d : background) {
//                object2d.draw(cameraIceCubeD, projectionIceCubeD);
//            }
//
//            for (int i=0; i<blockDragon.size(); i++){
//                if ( i!=6 || i != 7){
//                    blockDragon.get(i).draw(camera, projection);
//                }
//            }
//
////            for (ObjectBlockDragon object: anchorPoint){
////                object.draw(camera, projection);
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
//        initBlockDragon();
//        blockinit();
//        initBg();
//        loop();
//
//        // Terminate GLFW and
//        // free the error callback
//        glfwTerminate();
//        glfwSetErrorCallback(null).free();
//    }
//    public static void main(String[] args) {
//        new MainDragonTransfer().run();
//    }
//}
