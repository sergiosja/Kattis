#include <stdio.h>

int main() {
    int cases;
    scanf("%d", &cases);

    for (int i = 0; i < cases; i++) {
        int passangers = 0;
        int stops;
        scanf("%d", &stops);

        for (int j = 0; j < stops; j++) {
            passangers = passangers * 2 + 1;
        }
        
        printf("%d\n", passangers);
    }
}
