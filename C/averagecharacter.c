#include <stdio.h>
#include <string.h>

int main()
{
    char w[101];
    gets(w);

    int sum = 0;
    for (int i = 0; i < strlen(w); i++)
    {
        sum += (int) w[i];
    }

    printf("%c\n", sum / strlen(w));
    return 0;
}