#include <stdio.h>
#include <string.h>
#include <ctype.h>

char *strlwr(char*);

int main() {
    char rose [] = "rose";
    char pink [] = "pink";
    int n, count;
    count = 0;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        char button [30];
        scanf("%s", &button);
        strlwr(button);

        if (strstr(button, rose) || strstr(button, pink)) {
            count++;
        }
    }

    if (count > 0) {
        printf("%d\n", count);
    } else {
        printf("%s\n", "I have to watch Star Wars with my daughter");
    }
}

char *strlwr(char *str) {
  unsigned char *p = (unsigned char *)str;

  while (*p) {
     *p = tolower((unsigned char)*p);
      p++;
  }

  return str;
}