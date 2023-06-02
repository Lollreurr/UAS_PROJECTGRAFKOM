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
//import static org.lwjgl.opengl.GL30.*;
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
//public class Main_UTS_IceCubeD {
//    private Window window =
//            new Window
//                    (800,800,"Hello World");
//    private ArrayList<Object_IceCubeD> objectIceCubeDS
//            = new ArrayList<>();
//    private ArrayList<Object_IceCubeD> background
//            = new ArrayList<>();
//    private ArrayList<Object_IceCubeD> objectsRectangle
//            = new ArrayList<>();
//
//    private ArrayList<Object_Kristofer> object_bg = new ArrayList<>();
//
//    private ArrayList<Object_IceCubeD> objectIceCubeDPointsControl
//            = new ArrayList<>();
//    int degX, degY, degZ, tempX, tempY, tempZ, rotZ;
//    int tempDot;
//    boolean rotMax, rotMin;
//
//    boolean spin = false;
//
//    Camera_IceCubeD cameraIceCubeD = new Camera_IceCubeD();
//    Projection_IceCubeD projectionIceCubeD = new Projection_IceCubeD(window.getWidth(), window.getHeight());
//
//    Camera_Kristofer camera_Kristofer = new Camera_Kristofer();
//    Projection_Kristofer projection_Kristofer = new Projection_Kristofer(window.getWidth(), window.getHeight());
//
//
//
//    public void init_IceCubeD(){
//        window.init();
//        GL.createCapabilities();
////        cameraIceCubeD.setPosition(0.0f, 0.0f, 1.0f);
////        cameraIceCubeD.setRotation((float)Math.toRadians(0.0f),(float)Math.toRadians(0.0f));
//
//        camera_Kristofer.setPosition(0.0f,0.0f,1.0f);
//        camera_Kristofer.setRotation((float)Math.toRadians(0.0f), (float)Math.toRadians(0.0f));
//
//        //code
//        //scale - rotasi - traslate --> untuk program
//        //translate - rotasi - scale --> biasanya
//
//        //Badan
//        objectIceCubeDS.add(new Sphere_IceCubeD(
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
//                new Vector4f(0.65f,0.95f,0.85f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18,
//                1
//        ));
//        objectIceCubeDS.get(0).translateObject(0.0f, 0.0f,0.0f);
//        objectIceCubeDS.get(0).scaleObject(2.5f,2.5f,2.5f);
//
//        //Tangan kiri
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.4f,0.698f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                1.0f,
//                1.25f,
//                1.2f,
//                36,
//                18,
//                2
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(0).translateObject(-0.45f,-0.1f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(0).scaleObject(1.45f,1.45f,1.45f);
//
//        //Jari tangan kiri
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                6
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().get(0).translateObject(-2.2f, -5.3f,-0.65f);
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(1.0f),-15.0f,0.0f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().get(0).scaleObject(0.3f,0.1f,0.3f);
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                6
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().get(1).translateObject(-2.3f, -6.5f,-0.7f);
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().get(1).rotateObject((float) Math.toRadians(1.0f),-12.0f,0.0f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().get(1).scaleObject(0.3f,0.1f,0.3f);
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                6
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().get(2).translateObject(-2.4f, -6.8f,-0.72f);
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().get(2).rotateObject((float) Math.toRadians(1.0f),-8.0f,0.0f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(0).getChildObject().get(2).scaleObject(0.3f,0.1f,0.3f);
//
//        //Tangan kanan
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.4f,0.698f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.0f,
//                0.0f,
//                0.0f,
//                36,
//                18,
//                2
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(1).translateObject(0.45f, -0.1f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(1).scaleObject(1.45f,1.45f,1.45f);
//
//        //Jari tangan Kanan
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                6
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().get(0).translateObject(2.2f, -5.3f,-0.65f);
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().get(0).rotateObject((float) Math.toRadians(1.0f),-15.0f,0.0f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().get(0).scaleObject(0.3f,0.1f,0.3f);
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                6
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().get(1).translateObject(2.3f, -6.5f,-0.7f);
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().get(1).rotateObject((float) Math.toRadians(1.0f),-12.0f,0.0f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().get(1).scaleObject(0.3f,0.1f,0.3f);
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                6
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().get(2).translateObject(2.4f, -6.8f,-0.72f);
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().get(2).rotateObject((float) Math.toRadians(1.0f),-8.0f,0.0f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(1).getChildObject().get(2).scaleObject(0.3f,0.1f,0.3f);
//
//        objectIceCubeDS.get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,-25.0f);
//        objectIceCubeDS.get(0).getChildObject().get(1).rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,25.0f);
//
//
//
//        //Mata
//        //--hitam
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.0f,0.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(2).translateObject(-0.22f, 0.135f,0.59f);
//        objectIceCubeDS.get(0).getChildObject().get(2).scaleObject(1.8f,2.35f,1.005f);
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.0f,0.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(3).translateObject(0.18f, 0.135f,0.59f);
//        objectIceCubeDS.get(0).getChildObject().get(3).scaleObject(1.8f,2.35f,1.005f);
//        //--putih
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(4).translateObject(-0.26f, 0.16f,0.6f);
//        objectIceCubeDS.get(0).getChildObject().get(4).scaleObject(1.5f,2.0f,1.0f);
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(5).translateObject(0.22f, 0.16f,0.6f);
//        objectIceCubeDS.get(0).getChildObject().get(5).scaleObject(1.5f,2.0f,1.0f);
//        //--baby pink
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.8f,0.0f,0.4f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(6).translateObject(-0.33f, 0.21f,0.61f);
//        objectIceCubeDS.get(0).getChildObject().get(6).scaleObject(1.15f,1.5f,1.0f);
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.8f,0.0f,0.4f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(7).translateObject(0.28f, 0.2f,0.61f);
//        objectIceCubeDS.get(0).getChildObject().get(7).scaleObject(1.15f,1.5f,1.0f);
//        //--pupil hitam
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.0f,0.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(8).translateObject(-0.34f, 0.24f,0.43f);
//        objectIceCubeDS.get(0).getChildObject().get(8).scaleObject(1.1f,1.3f,1.3f);
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.0f,0.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(9).translateObject(0.3f, 0.24f,0.43f);
//        objectIceCubeDS.get(0).getChildObject().get(9).scaleObject(1.1f,1.3f,1.3f);
//        //--tambahan putih
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(10).translateObject(-1.48f, 0.675f,0.623f);
//        objectIceCubeDS.get(0).getChildObject().get(10).scaleObject(0.3f,0.5f,1.0f);
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(11).translateObject(1.28f, 0.56f,0.623f);
//        objectIceCubeDS.get(0).getChildObject().get(11).scaleObject(0.3f,0.5f,1.0f);
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(12).translateObject(-0.98f, 0.57f,0.623f);
//        objectIceCubeDS.get(0).getChildObject().get(12).scaleObject(0.3f,0.5f,1.0f);
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(13).translateObject(0.8f, 0.66f,0.623f);
//        objectIceCubeDS.get(0).getChildObject().get(13).scaleObject(0.3f,0.5f,1.0f);
//
//        //pipi - pink
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.9f,0.9f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(14).translateObject(-0.37f, 0.002f,0.47f);
//        objectIceCubeDS.get(0).getChildObject().get(14).scaleObject(1.2f,1.0f,1.25f);
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.vert"
//                                , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "C:/Java Intellij/Grafkom/Week 2/Grafkom2223/resources/shaders/scene.frag"
//                                , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.9f,0.9f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(15).translateObject(0.35f, 0.002f,0.47f);
//        objectIceCubeDS.get(0).getChildObject().get(15).scaleObject(1.2f,1.0f,1.25f);
//
//        //Kaki
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.4f,0.698f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                4
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(16).translateObject(-0.2f, -0.3f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(16).scaleObject(2.0f,2.5f,1.0f);
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.4f,0.698f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                4
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(17).translateObject(0.2f, -0.3f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(17).scaleObject(2.0f,2.5f,1.0f);
//
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.4f,0.698f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).translateObject(-0.18f, -0.55f,0.03f);
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).scaleObject(2.2f,1.6f,3.0f);
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.4f,0.698f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).translateObject(0.18f, -0.55f,0.03f);
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).scaleObject(2.2f,1.6f,3.0f);
//        //jari kaki kiri
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                8
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).getChildObject().get(0).translateObject(-0.7f, -1.55f,0.2f);
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).getChildObject().get(0).scaleObject(0.4f,0.6f,1.4f);
//
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                8
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).getChildObject().get(1).translateObject(-1.2f, -1.55f,0.2f);
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).getChildObject().get(1).scaleObject(0.4f,0.6f,1.4f);
//
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                8
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).getChildObject().get(2).translateObject(-0.95f, -1.55f,0.2f);
//        objectIceCubeDS.get(0).getChildObject().get(16).getChildObject().get(0).getChildObject().get(2).scaleObject(0.4f,0.6f,1.4f);
//        //jari kaki kanan
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                8
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).getChildObject().get(0).translateObject(0.7f, -1.55f,0.2f);
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).getChildObject().get(0).scaleObject(0.4f,0.6f,1.4f);
//
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                8
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).getChildObject().get(1).translateObject(1.2f, -1.55f,0.2f);
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).getChildObject().get(1).scaleObject(0.4f,0.6f,1.4f);
//
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.5f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                8
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).getChildObject().get(2).translateObject(0.95f, -1.55f,0.2f);
//        objectIceCubeDS.get(0).getChildObject().get(17).getChildObject().get(0).getChildObject().get(2).scaleObject(0.4f,0.6f,1.4f);
//
//
//        //tail
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.4f,0.698f,1.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.2f,
//                0.2f,
//                0.2f,
//                36,
//                18,
//                5
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(18).translateObject(0.0f, -0.15f,-3.5f);
//        objectIceCubeDS.get(0).getChildObject().get(18).scaleObject(1.5f,1.5f,0.3f);
//
//        //mulut
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,0.0f,0.0f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(19).translateObject(0.0f, -0.17f,0.6f);
//        objectIceCubeDS.get(0).getChildObject().get(19).scaleObject(1.5f,1.5f,1.0f);
//
//        //Dot
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(1.0f,0.0f,0.498f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(20).translateObject(0.0f, -0.1f,0.635f);
//        objectIceCubeDS.get(0).getChildObject().get(20).scaleObject(2.5f,2.5f,1.0f);
//        objectIceCubeDS.get(0).getChildObject().get(20).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(1.0f,0.6f,0.8f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                3
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(20).getChildObject().get(0).translateObject(0.0f, -0.35f,0.71f);
//        objectIceCubeDS.get(0).getChildObject().get(20).getChildObject().get(0).scaleObject(1.0f,0.7f,1.0f);
//        objectIceCubeDS.get(0).getChildObject().get(20).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(1.0f,0.6f,0.8f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                4
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(20).getChildObject().get(1).translateObject(0.0f, -0.35f,0.85f);
//        objectIceCubeDS.get(0).getChildObject().get(20).getChildObject().get(1).scaleObject(1.4f,0.7f,1.0f);
//        objectIceCubeDS.get(0).getChildObject().get(20).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.75f,0.75f,0.75f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                4
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(20).getChildObject().get(2).translateObject(0.0f, -0.45f,1.7f);
//        objectIceCubeDS.get(0).getChildObject().get(20).getChildObject().get(2).scaleObject(0.4f,0.5f,0.5f);
//
//        //Wing - left
//        objectIceCubeDS.get(0).getChildObject().add(new Curve_wing_IceCubeD(
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
//                new Vector4f(0.0f,1f,1f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.3f,
//                0.3f,
//                0.3f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(21).translateObject(-2.5f,-0.45f,-0.25f);
//        objectIceCubeDS.get(0).getChildObject().get(21).rotateObject((float) Math.toRadians(0.5f),30.0f,-10.0f,-40.0f);
//        objectIceCubeDS.get(0).getChildObject().get(21).scaleObject(0.2f,1.5f,1.5f);
//        //Wing - right
//        objectIceCubeDS.get(0).getChildObject().add(new Curve_wing_IceCubeD(
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
//                new Vector4f(0.0f,1f,1f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.3f,
//                0.3f,
//                0.3f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(22).translateObject(2.5f,-0.45f,-0.25f);
//        objectIceCubeDS.get(0).getChildObject().get(22).rotateObject((float) Math.toRadians(0.5f),30.0f,10.0f,40.0f);
//        objectIceCubeDS.get(0).getChildObject().get(22).scaleObject(0.2f,1.5f,1.5f);
//
//        //horn
//        objectIceCubeDS.get(0).getChildObject().add(new Curve_wing_IceCubeD(
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
//                new Vector4f(0.0f,1f,1f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.3f,
//                0.3f,
//                0.3f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(23).translateObject(0.0f,0.9f,0.6f);
//        objectIceCubeDS.get(0).getChildObject().get(23).scaleObject(0.8f,0.8f,0.8f);
//        //poros tangan kiri
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,1f,1f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(24).translateObject(-1.1f,0.7f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(24).scaleObject(0.5f,0.5f,0.5f);
//        //poros tangan kanan
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,1f,1f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(25).translateObject(1.1f,0.7f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(25).scaleObject(0.5f,0.5f,0.5f);
//        //poros kaki kiri
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,1f,1f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(26).translateObject(-0.75f,-1.2f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(26).scaleObject(0.5f,0.5f,0.5f);
//        //poros kaki kanan
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,1f,1f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(27).translateObject(0.75f,-1.2f,0.0f);
//        objectIceCubeDS.get(0).getChildObject().get(27).scaleObject(0.5f,0.5f,0.5f);
//        //poros sayap kiri
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,1f,1f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(28).translateObject(-1.1f,1.0f,-1.1f);
//        objectIceCubeDS.get(0).getChildObject().get(28).scaleObject(0.5f,0.5f,0.5f);
//        //poros sayap kanan
//        objectIceCubeDS.get(0).getChildObject().add(new Sphere_IceCubeD(
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
//                new Vector4f(0.0f,1f,1f,1.0f),
//                new Vector3f(0.0f,0.0f,0.0f),
//                0.1f,
//                0.1f,
//                0.1f,
//                36,
//                18,
//                0
//        ));
//        objectIceCubeDS.get(0).getChildObject().get(29).translateObject(1.1f,1.0f,-1.1f);
//        objectIceCubeDS.get(0).getChildObject().get(29).scaleObject(0.5f,0.5f,0.5f);
//
//        for (Object_IceCubeD object: objectIceCubeDS){
//            object.scaleObject(0.3f, 0.3f, 0.3f);
//        }
//        for (Object_IceCubeD object: objectIceCubeDS){
//            object.translateObject(0.0f, 0f, -1.5f);
//        }
//    }
//
//    public void input_IceCubeD(){
//        //tangan gerak
//        if (window.isKeyPressed(GLFW_KEY_G)){
//            if (rotZ > 359){
//                rotZ = 0;
//            }
//            else if (rotZ < 0){
//                rotZ = 359;
//            }
//
//            if (rotZ == 5){
//                rotMin = true;
//                rotMax = false;
//            }
//
//            if (rotZ == 330){
//                rotMax = true;
//                rotMin = false;
//            }
//
//            Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(24).model.transformPosition(new Vector3f());
//            Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(25).model.transformPosition(new Vector3f());
//
//            int rotate1 = 360 - degZ;
//            int rotate2 = 360 - degY;
//            int rotate3 = 360 - degX;
//
//            for (int i=0; i<rotate1; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//            for (int i=0; i<rotate2; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<rotate3; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(0).translateObject(-pos1.x, -pos1.y, pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(1).translateObject(-pos2.x, -pos2.y, pos2.z);
//
//            if (!rotMin){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                rotZ++;
//            }
//            else if (!rotMax){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                rotZ--;
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(0).translateObject(pos1.x, pos1.y, -pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(1).translateObject(pos2.x, pos2.y, -pos2.z);
//            for (int i=0; i<degX; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//            for (int i=0; i<degY; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<degZ; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//
//        }
//        if (window.isKeyPressed(GLFW_KEY_H)){
//            if (rotZ > 359){
//                rotZ = 0;
//            }
//            else if (rotZ < 0){
//                rotZ = 359;
//            }
//
//            if (rotZ == 10){
//                rotMin = true;
//                rotMax = false;
//            }
//
//            if (rotZ == 330){
//                rotMax = true;
//                rotMin = false;
//            }
//
//            Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(28).model.transformPosition(new Vector3f());
//            Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(29).model.transformPosition(new Vector3f());
//
//            int rotate1 = 360 - degZ;
//            int rotate2 = 360 - degY;
//            int rotate3 = 360 - degX;
//
//            for (int i=0; i<rotate1; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//            }
//            for (int i=0; i<rotate2; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<rotate3; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(21).translateObject(-pos1.x, -pos1.y, pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(22).translateObject(-pos2.x, -pos2.y, pos2.z);
//
//            if (!rotMin){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                rotZ++;
//            }
//            else if (!rotMax){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                rotZ--;
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(21).translateObject(pos1.x, pos1.y, -pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(22).translateObject(pos2.x, pos2.y, -pos2.z);
//            for (int i=0; i<degX; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//            }
//            for (int i=0; i<degY; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<degZ; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//            }
//        }
////        if (window.isKeyPressed(GLFW_KEY_K)){
//////            objects.get(0).getChildObject().get(21).rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
////        }
//
//        //rotate kiri
//        if (window.isKeyPressed(GLFW_KEY_A)){
//            objectIceCubeDS.get(0).rotateObject((float) Math.toRadians(1.0f), 0.0f, 1.0f, 0.0f);
//        }
//
//
//
//        if(window.isKeyPressed(GLFW_KEY_V)){
//            Vector3f pos1 = objectIceCubeDS.get(0).model.transformPosition(new Vector3f());
//
//            objectIceCubeDS.get(0).translateObject(-0.3f,0.0f,1.5f);
//            for(Object_IceCubeD obj: objectIceCubeDS){
//                obj.rotateObject((float) Math.toRadians(1f), 0f, 1f,0f);
//            }
//            objectIceCubeDS.get(0).translateObject(0.3f,0f,-1.5f);
//        }
//
//        if(window.isKeyPressed(GLFW_KEY_B)){
//            Vector3f pos1 = objectIceCubeDS.get(0).model.transformPosition(new Vector3f());
//
//            objectIceCubeDS.get(0).translateObject(-0.3f,0.0f,1.5f);
//            for(Object_IceCubeD obj: objectIceCubeDS){
//                obj.rotateObject((float) Math.toRadians(1f), 0f, -1f,0f);
//            }
//            objectIceCubeDS.get(0).translateObject(0.3f,0f,-1.5f);
//        }
//
//
//        //rotate atas
//        if (window.isKeyPressed(GLFW_KEY_W)){
//            objectIceCubeDS.get(0).rotateObject((float) Math.toRadians(1.0f),-1.0f,0.0f,0.0f);
//
////            for(Object child: objects.get(0).getChildObject()){
////                Vector3f tempCenterPoint = child.updateCenterPoint();
////                child.translateObject(tempCenterPoint.x*-1,tempCenterPoint.y*-1,tempCenterPoint.z*-1);
////                child.rotateObject((float) Math.toRadians(1.0f),-1.0f,0.0f,0.0f);
////                child.translateObject(tempCenterPoint.x*1,tempCenterPoint.y*1,tempCenterPoint.z*1);
////            }
////            for(Object child: objects.get(0).getChildObject().get(1).getChildObject()){
////                Vector3f tempCenterPoint = objects.get(0).getChildObject().get(1).updateCenterPoint();
////                child.translateObject(tempCenterPoint.x*-1,tempCenterPoint.y*-1,tempCenterPoint.z*-1);
////                child.rotateObject((float) Math.toRadians(0.7f),0.0f,0.0f,1.0f);
////                child.translateObject(tempCenterPoint.x*1,tempCenterPoint.y*1,tempCenterPoint.z*1);
////            }
//        }
//        //rotate kanan
//        if (window.isKeyPressed(GLFW_KEY_D)){
//            objectIceCubeDS.get(0).rotateObject((float) Math.toRadians(1.0f), 0.0f, -1.0f, 0.0f);
//        }
//        //rotate bawah
//        if (window.isKeyPressed(GLFW_KEY_S)){
//            objectIceCubeDS.get(0).rotateObject((float) Math.toRadians(1.0f), 1.0f, 0.0f, 0.0f);
//        }
//
////        if (window.isKeyPressed(GLFW_KEY_F)){
////            while (degX < 0){
////                objects.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
////                objects.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), -1.0f, 0.0f, 0.0f);
////                degX--;
////            }
////
////            while (degY > 0){
////                objects.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
////                objects.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, -1.0f, 0.0f);
////                degY--;
////            }
////
////            while (degZ > 0){
////                objects.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
////                objects.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, -1.0f);
////                degZ--;
////            }
////            while (degX < tempX){
////                objects.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
////                objects.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
////                degX++;
////            }
////
////            while (degY < tempY){
////                objects.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
////                objects.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
////                degY++;
////            }
////
////            while (degZ < tempZ){
////                objects.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
////                objects.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
////                degZ++;
////            }
////        }
//        //dot lepas
//        if (window.isKeyPressed(GLFW_KEY_C)){
//            float temp = 0.01f;
//
//            objectIceCubeDS.get(0).getChildObject().get(20).translateObject(0.0f, 0.0f, temp);
//            tempDot = tempDot + 1;
//
//            if (rotZ > 359){
//                rotZ = 0;
//            }
//            else if (rotZ < 0){
//                rotZ = 359;
//            }
//
//            if (rotZ == 5){
//                rotMin = true;
//                rotMax = false;
//            }
//
//            if (rotZ == 330){
//                rotMax = true;
//                rotMin = false;
//            }
//
//            Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(24).model.transformPosition(new Vector3f());
//            Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(25).model.transformPosition(new Vector3f());
//
//            int rotate1 = 360 - degZ;
//            int rotate2 = 360 - degY;
//            int rotate3 = 360 - degX;
//
//            for (int i=0; i<rotate1; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//            }
//            for (int i=0; i<rotate2; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<rotate3; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(0).translateObject(-pos1.x, -pos1.y, pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(1).translateObject(-pos2.x, -pos2.y, pos2.z);
//
//            if (!rotMin){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                rotZ++;
//            }
//            else if (!rotMax){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                rotZ--;
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(0).translateObject(pos1.x, pos1.y, -pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(1).translateObject(pos2.x, pos2.y, -pos2.z);
//            for (int i=0; i<degX; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//            }
//            for (int i=0; i<degY; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<degZ; i++){
//                objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//            }
//
//        }
//        //dot kembali
//        if (window.isKeyPressed(GLFW_KEY_V)){
//            float temp = 0.01f;
//
//            if (tempDot != 0){
//                Vector3f posss = objectIceCubeDS.get(0).getChildObject().get(19).model.transformPosition(new Vector3f());
//                objectIceCubeDS.get(0).getChildObject().get(20).translateObject(-posss.x, -posss.y, posss.z);
//                objectIceCubeDS.get(0).getChildObject().get(20).translateObject(0.0f, 0.0f, -temp);
//                objectIceCubeDS.get(0).getChildObject().get(20).translateObject(posss.x, posss.y, -posss.z);
//                tempDot = tempDot - 1;
//                if (rotZ > 359){
//                    rotZ = 0;
//                }
//                else if (rotZ < 0){
//                    rotZ = 359;
//                }
//
//                if (rotZ == 5){
//                    rotMin = true;
//                    rotMax = false;
//                }
//
//                if (rotZ == 330){
//                    rotMax = true;
//                    rotMin = false;
//                }
//
//                Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(24).model.transformPosition(new Vector3f());
//                Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(25).model.transformPosition(new Vector3f());
//
//                int rotate1 = 360 - degZ;
//                int rotate2 = 360 - degY;
//                int rotate3 = 360 - degX;
//
//                for (int i=0; i<rotate1; i++){
//                    objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                    objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                }
//                for (int i=0; i<rotate2; i++){
//                    objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                    objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                }
//                for (int i=0; i<rotate3; i++){
//                    objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                    objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                }
//
//                objectIceCubeDS.get(0).getChildObject().get(0).translateObject(-pos1.x, -pos1.y, pos1.z);
//                objectIceCubeDS.get(0).getChildObject().get(1).translateObject(-pos2.x, -pos2.y, pos2.z);
//
//                if (!rotMin){
//                    objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                    objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                    rotZ++;
//                }
//                else if (!rotMax){
//                    objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                    objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                    rotZ--;
//                }
//
//                objectIceCubeDS.get(0).getChildObject().get(0).translateObject(pos1.x, pos1.y, -pos1.z);
//                objectIceCubeDS.get(0).getChildObject().get(1).translateObject(pos2.x, pos2.y, -pos2.z);
//                for (int i=0; i<degX; i++){
//                    objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                    objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                }
//                for (int i=0; i<degY; i++){
//                    objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                    objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                }
//                for (int i=0; i<degZ; i++){
//                    objectIceCubeDS.get(0).getChildObject().get(0).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                    objectIceCubeDS.get(0).getChildObject().get(1).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                }
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_DOWN)){
//            objectIceCubeDS.get(0).translateObject(0.0f,0.0f,0.01f);
//            if (rotZ > 359){
//                rotZ = 0;
//            }
//            else if (rotZ < 0){
//                rotZ = 359;
//            }
//
//            if (rotZ == 10){
//                rotMin = true;
//                rotMax = false;
//            }
//
//            if (rotZ == 330){
//                rotMax = true;
//                rotMin = false;
//            }
//
//            Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(26).model.transformPosition(new Vector3f());
//            Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(27).model.transformPosition(new Vector3f());
//
//            int rotate1 = 360 - degZ;
//            int rotate2 = 360 - degY;
//            int rotate3 = 360 - degX;
//
//            for (int i=0; i<rotate1; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//            for (int i=0; i<rotate2; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<rotate3; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(16).translateObject(pos1.x, -pos1.y, -pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(17).translateObject(pos2.x, -pos2.y, -pos2.z);
//
//            if (!rotMin){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.5f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), -0.5f, 0.0f, 0.0f);
//                rotZ++;
//            }
//            else if (!rotMax){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), -0.5f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.5f, 0.0f, 0.0f);
//                rotZ--;
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(16).translateObject(-pos1.x, pos1.y, pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(17).translateObject(-pos2.x, pos2.y, pos2.z);
//            for (int i=0; i<degX; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//            for (int i=0; i<degY; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<degZ; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_UP)){
//            objectIceCubeDS.get(0).translateObject(0.0f,0.0f,-0.01f);
//            if (rotZ > 359){
//                rotZ = 0;
//            }
//            else if (rotZ < 0){
//                rotZ = 359;
//            }
//
//            if (rotZ == 10){
//                rotMin = true;
//                rotMax = false;
//            }
//
//            if (rotZ == 330){
//                rotMax = true;
//                rotMin = false;
//            }
//
//            Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(26).model.transformPosition(new Vector3f());
//            Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(27).model.transformPosition(new Vector3f());
//
//            int rotate1 = 360 - degZ;
//            int rotate2 = 360 - degY;
//            int rotate3 = 360 - degX;
//
//            for (int i=0; i<rotate1; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//            for (int i=0; i<rotate2; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<rotate3; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(16).translateObject(pos1.x, -pos1.y, -pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(17).translateObject(pos2.x, -pos2.y, -pos2.z);
//
//            if (!rotMin){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.5f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), -0.5f, 0.0f, 0.0f);
//                rotZ++;
//            }
//            else if (!rotMax){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), -0.5f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.5f, 0.0f, 0.0f);
//                rotZ--;
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(16).translateObject(-pos1.x, pos1.y, pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(17).translateObject(-pos2.x, pos2.y, pos2.z);
//            for (int i=0; i<degX; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//            for (int i=0; i<degY; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<degZ; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_LEFT)){
//            objectIceCubeDS.get(0).translateObject(-0.01f,0.0f,0.0f);
//            if (rotZ > 359){
//                rotZ = 0;
//            }
//            else if (rotZ < 0){
//                rotZ = 359;
//            }
//
//            if (rotZ == 10){
//                rotMin = true;
//                rotMax = false;
//            }
//
//            if (rotZ == 330){
//                rotMax = true;
//                rotMin = false;
//            }
//
//            Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(26).model.transformPosition(new Vector3f());
//            Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(27).model.transformPosition(new Vector3f());
//
//            int rotate1 = 360 - degZ;
//            int rotate2 = 360 - degY;
//            int rotate3 = 360 - degX;
//
//            for (int i=0; i<rotate1; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//            for (int i=0; i<rotate2; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<rotate3; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(16).translateObject(pos1.x, -pos1.y, -pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(17).translateObject(pos2.x, -pos2.y, -pos2.z);
//
//            if (!rotMin){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.5f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), -0.5f, 0.0f, 0.0f);
//                rotZ++;
//            }
//            else if (!rotMax){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), -0.5f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.5f, 0.0f, 0.0f);
//                rotZ--;
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(16).translateObject(-pos1.x, pos1.y, pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(17).translateObject(-pos2.x, pos2.y, pos2.z);
//            for (int i=0; i<degX; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//            for (int i=0; i<degY; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<degZ; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_RIGHT)){
//            objectIceCubeDS.get(0).translateObject(0.01f,0.0f,0.0f);
//            if (rotZ > 359){
//                rotZ = 0;
//            }
//            else if (rotZ < 0){
//                rotZ = 359;
//            }
//
//            if (rotZ == 10){
//                rotMin = true;
//                rotMax = false;
//            }
//
//            if (rotZ == 330){
//                rotMax = true;
//                rotMin = false;
//            }
//
//            Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(26).model.transformPosition(new Vector3f());
//            Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(27).model.transformPosition(new Vector3f());
//
//            int rotate1 = 360 - degZ;
//            int rotate2 = 360 - degY;
//            int rotate3 = 360 - degX;
//
//            for (int i=0; i<rotate1; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//            for (int i=0; i<rotate2; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<rotate3; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(16).translateObject(pos1.x, -pos1.y, -pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(17).translateObject(pos2.x, -pos2.y, -pos2.z);
//
//            if (!rotMin){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.5f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), -0.5f, 0.0f, 0.0f);
//                rotZ++;
//            }
//            else if (!rotMax){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), -0.5f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.5f, 0.0f, 0.0f);
//                rotZ--;
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(16).translateObject(-pos1.x, pos1.y, pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(17).translateObject(-pos2.x, pos2.y, pos2.z);
//            for (int i=0; i<degX; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 1.0f, 0.0f, 0.0f);
//            }
//            for (int i=0; i<degY; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<degZ; i++){
//                objectIceCubeDS.get(0).getChildObject().get(16).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(17).rotateObject(((float) Math.toRadians(1.0f)), 0.0f, 0.0f, 1.0f);
//            }
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_PAGE_UP)){
//            objectIceCubeDS.get(0).translateObject(0.0f,0.01f,0.0f);
//            if (rotZ > 359){
//                rotZ = 0;
//            }
//            else if (rotZ < 0){
//                rotZ = 359;
//            }
//
//            if (rotZ == 5){
//                rotMin = true;
//                rotMax = false;
//            }
//
//            if (rotZ == 330){
//                rotMax = true;
//                rotMin = false;
//            }
//
//            Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(28).model.transformPosition(new Vector3f());
//            Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(29).model.transformPosition(new Vector3f());
//
//            int rotate1 = 360 - degZ;
//            int rotate2 = 360 - degY;
//            int rotate3 = 360 - degX;
//
//            for (int i=0; i<rotate1; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//            }
//            for (int i=0; i<rotate2; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<rotate3; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(21).translateObject(-pos1.x, -pos1.y, pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(22).translateObject(-pos2.x, -pos2.y, pos2.z);
//
//            if (!rotMin){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                rotZ++;
//            }
//            else if (!rotMax){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                rotZ--;
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(21).translateObject(pos1.x, pos1.y, -pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(22).translateObject(pos2.x, pos2.y, -pos2.z);
//            for (int i=0; i<degX; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//            }
//            for (int i=0; i<degY; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<degZ; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_PAGE_DOWN)){
//            objectIceCubeDS.get(0).translateObject(0.0f,-0.01f,0.0f);
//            if (rotZ > 359){
//                rotZ = 0;
//            }
//            else if (rotZ < 0){
//                rotZ = 359;
//            }
//
//            if (rotZ == 5){
//                rotMin = true;
//                rotMax = false;
//            }
//
//            if (rotZ == 330){
//                rotMax = true;
//                rotMin = false;
//            }
//
//            Vector3f pos1 = objectIceCubeDS.get(0).getChildObject().get(28).model.transformPosition(new Vector3f());
//            Vector3f pos2 = objectIceCubeDS.get(0).getChildObject().get(29).model.transformPosition(new Vector3f());
//
//            int rotate1 = 360 - degZ;
//            int rotate2 = 360 - degY;
//            int rotate3 = 360 - degX;
//
//            for (int i=0; i<rotate1; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//            }
//            for (int i=0; i<rotate2; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<rotate3; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(21).translateObject(-pos1.x, -pos1.y, pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(22).translateObject(-pos2.x, -pos2.y, pos2.z);
//
//            if (!rotMin){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                rotZ++;
//            }
//            else if (!rotMax){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, -1.0f);
//                rotZ--;
//            }
//
//            objectIceCubeDS.get(0).getChildObject().get(21).translateObject(pos1.x, pos1.y, -pos1.z);
//            objectIceCubeDS.get(0).getChildObject().get(22).translateObject(pos2.x, pos2.y, -pos2.z);
//            for (int i=0; i<degX; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 1.0f, 0.0f, 0.0f);
//            }
//            for (int i=0; i<degY; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 1.0f, 0.0f);
//            }
//            for (int i=0; i<degZ; i++){
//                objectIceCubeDS.get(0).getChildObject().get(21).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//                objectIceCubeDS.get(0).getChildObject().get(22).rotateObject(((float) Math.toRadians(1.5f)), 0.0f, 0.0f, 1.0f);
//            }
//        }
//
//
//        if (window.isKeyPressed(GLFW_KEY_1)){
//            objectIceCubeDS.get(0).scaleObject(1.011f,1.011f,1.011f);
//        }
//        if (window.isKeyPressed(GLFW_KEY_2)){
//            objectIceCubeDS.get(0).scaleObject(0.991f,0.991f,0.991f);
//        }
//
////        if(window.getMouseInput().isLeftButtonPressed()){
////            Vector2f pos = window.getMouseInput().getCurrentPos();
////            //System.out.println("x : "+pos.x+" y : "+pos.y);
////            pos.x = (pos.x - (window.getWidth())/2.0f) / (window.getWidth()/2.0f);
////            pos.y = (pos.y - (window.getHeight())/2.0f) / (-window.getHeight()/2.0f);
////            //System.out.println("x : "+pos.x+" y : "+pos.y);
////            if((!(pos.x > 1 || pos.x < -0.97) && !(pos.y > 0.97 || pos.y < -1))){
////                System.out.println("x : "+pos.x+" y : "+pos.y);
////                //objectsPointsControl.get(0).addVertices(new Vector3f(pos.x,pos.y,0));
////            }
////        }
//
//    }
//    public void loop(){
//        while (window.isOpen()) {
//            window.update();
//            glClearColor(0.7f,
//                    1.0f, 1.0f,
//                    0.0f);
//            GL.createCapabilities();
//            input_IceCubeD();
//
//            //code
//            for (Object_IceCubeD objectIceCubeD : background){
//                objectIceCubeD.draw(cameraIceCubeD, projectionIceCubeD);
//            }
//            for(Object_IceCubeD objectIceCubeD : objectIceCubeDS){
//                objectIceCubeD.drawWithVerticesColor();
//            }
//            for (Object_IceCubeD objectIceCubeD : objectsRectangle){
//                objectIceCubeD.draw(cameraIceCubeD, projectionIceCubeD);
//            }
//            for (Object_IceCubeD objectIceCubeD : objectIceCubeDPointsControl){
//                objectIceCubeD.drawLine();
//            }
//            for (Object_IceCubeD objectIceCubeD : objectIceCubeDS){
//                objectIceCubeD.draw(cameraIceCubeD, projectionIceCubeD);
//            }
//            for (Object_Kristofer object2d : object_bg) {
//                object2d.draw(camera_Kristofer, projection_Kristofer);
//            }
//
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
//
//    public void initbg(){
//        //ALL BACKGROUND
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
//
//        object_bg.remove(1);
//    }
//
//    public void run() {
//
//        init_IceCubeD();
//        initbg();
//        loop();
//
//        // Terminate GLFW and
//        // free the error callback
//        glfwTerminate();
//        glfwSetErrorCallback(null).free();
//    }
//    public static void main(String[] args) {
//        new Main_UTS_IceCubeD().run();
//    }
//}