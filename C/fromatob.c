#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    int c = 0;

    while (a != b) {
        if (a > b && (a % 2 == 0)) {
            a /= 2;
            c++;
        }
        else {
            a++;
            c++;
        }
    }
    printf("%d", c);
}