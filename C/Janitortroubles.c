#include <stdio.h>
#include <math.h>

int main() {
    float s1, s2, s3, s4;
    scanf("%f %f %f %f", &s1, &s2, &s3, &s4);
    float x = (s1 + s2 + s3 + s4) / 2;
    float area = sqrt((x - s1) * (x - s2) * (x - s3) * (x - s4));
    
    printf("%f\n", area);
}