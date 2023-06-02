#version 330

in vec4 out_color;
out vec4 fragColor;
void main() {
    //vec4(red,green,blue,alpha)
    //rgba -> red 100/255
    //fragColor = vec4(1.0,0.0,0.0,1.0);
    fragColor = out_color;
}