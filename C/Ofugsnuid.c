#include <stdio.h>
#include <string.h>

int main() {
    char tbr [100000];
    int n;

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        scanf("%d", &tbr[i]);
    }

    strrev(tbr);

    for (int i = 0; i < n; i++) {
        printf("%d\n", tbr[i]);
    }
}