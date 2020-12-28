#include <stdio.h>
#include <stdlib.h>

int main() {

    char abra[] = "Abracadabra";
    int n;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("%d %s \n", i+1, abra);
    }
}