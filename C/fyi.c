#include <stdio.h>
#include <string.h>

int main() {
    char nr[8];
    scanf("%s", &nr);
    
    if (nr[0] == '5' && nr[1] == '5' && nr[2] == '5') {
        printf("1");
    } else {
        printf("0");
    }
}