#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char you[999], doc[999];
    printf("%s", strlen(gets(you)) >= strlen(gets(doc)) ? "go" : "no");
}