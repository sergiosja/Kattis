#include <stdio.h>

int main() {
    int _, p, s;
    scanf("%d %d %d", &_, &p, &s);

    for (int i = 0; i < s; i++) {
        int n, keep = 0;
        scanf("%d", &n);

        for (int j = 0; j < n; j++) {
            int r;
            scanf("%d", &r);
            keep = r == p ? 1 : keep;
        }
        
        printf("%s\n", keep ? "KEEP" : "REMOVE");
    }
}