#include <stdio.h>

int main() {
    int a, b, c = 0;
    scanf("%d %d", &a, &b);

    while (a != b) {
        a = (a > b && a % 2 == 0 ? a / 2 : a + 1);
        c++;
    }
    printf("%d", c);
}