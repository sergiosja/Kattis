#include <stdio.h>

int main() {
    long l, n;
    scanf("%lld %lld", &l, &n);
    int res = 1;

    while (l % n != 0) {
        n -= l % n;
        res++;
    }

    printf("%d\n", res);
}