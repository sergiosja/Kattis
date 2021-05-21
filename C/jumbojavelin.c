#include <stdio.h>

int main() {
    int n, l = 0;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        int r;
        scanf("%d", &r);
        l += r;
    }

    printf("%d", l-(n-1));
}