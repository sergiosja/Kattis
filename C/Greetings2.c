#include <stdio.h>
#include <string.h>

int main() {
    char greeting[1000], response[1996];
    
    scanf("%s", &greeting);
    strcpy(response, "h");

    for (int i = 0; i < (strlen(greeting) - 2) * 2; i++)
        strcat(response, "e");

    strcat(response, "y");
    printf("%s\n", response);
}