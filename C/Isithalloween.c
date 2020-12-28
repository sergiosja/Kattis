#include <stdio.h>
#include <string.h>

int main() {
    char month [3];
    int day;
    scanf("%s %d", &month, &day);

    if (strstr(month, "OCT") && day == 31 || strstr(month, "DEC") && day == 25)
        printf("%s", "yup");
    else
        printf("%s", "nope");
}