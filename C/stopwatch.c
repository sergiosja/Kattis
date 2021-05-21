#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, s = 0;
    scanf("%d", &n);

    if (n % 2 != 0) {
        printf("still running\n");
        return 0;
    }

    for (int i = 0; i < n; i+= 2) {
        int a, b;
        scanf("%d %d", &a, &b);
        s += abs(a - b);
    }


    printf("%d\n", s);
}