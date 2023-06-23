#version 330

uniform vec4 uni_color;
out vec4 fragColor;

// normal
uniform vec3 lightColor;
in vec3 Normal;

// diffuse
uniform vec3 lightPos;
in vec3 FragPos;

// specular
uniform vec3 viewPos;

void main() {
    //vec4(red,green,blue,alpha)
    //rgba -> red 100/255
    //fragColor = vec4(1.0,0.0,0.0,1.0);

    // ambient
    float ambientStrength = 0.1f; // biasanya 0.1 sampe 0.5 supaya ada warna gelapnya kalo ngak keliatan cahaya
    vec3 ambient = ambientStrength * lightColor; // warna lampu dikaliin kekuatan supaya ngak terlalu terang

    // diffuse
    vec3 lightDirection = normalize(lightPos - FragPos);
    float diff = max(dot(Normal, lightDirection), 0.0);
    vec3 diffuse = diff * lightColor;

    // specular
    float specularStrength = 0.5f;
    vec3 viewDir = normalize(viewPos - FragPos);

    // blinn phong butuh halfway direction
    vec3 halfwayDir = normalize(lightDirection + viewDir);
                                                // selalu dikali 3
    float spec = pow(max(dot(Normal, halfwayDir), 0.0), 64.0 * 3.0);

    // original phong
//    vec3 reflectDir = reflect(-lightDirection, Normal);
//    float spec = pow(max(dot(viewDir, reflectDir), 0.0), 64.0);

    vec3 specular = specularStrength * spec * lightColor;

    // warna cahaya dikalikan warna object
    vec3 result = (ambient + diffuse + specular) * vec3(uni_color);

    // fragColor diubah jadi hasil akhirnya
    fragColor = vec4(result, 1.0);

    //fragColor = uni_color;
}