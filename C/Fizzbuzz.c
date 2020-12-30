#include <stdio.h>

int main() {
    int x, y, n;
    scanf("%d %d %d", &x, &y, &n);

    for (int i = 1; i <= n; i++) {
        if (i % x == 0 && i % y == 0)
            printf("%s\n", "FizzBuzz");
        else if (i % x == 0)
            printf("%s\n", "Fizz");
        else if (i % y == 0)
            printf("%s\n", "Buzz");
        else
            printf("%d\n", i);
    }
}