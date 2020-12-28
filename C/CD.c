#include <stdio.h>

int main() {
    long n, m;
    scanf("%ld %ld", &n, &m);

    int jacks[n];
    int jills[m];

    for (long i = 0; i < n; i++) {
        int j1;
        scanf("%ld", &j1);
        jacks[i] = j1;
    }

    for (long i = 0; i < m; i++) {
        int j2;
        scanf("%ld", &j2);
        jills[i] = j2;
    }

    long count = 0;
    for (long i = 0; i < n; i++) {
        for (long j = 0; j < m; j++) {
            if (jacks[i] == jills[j]) {
                count++;
            }
        }
    }

    printf("%ld\n", count);
}