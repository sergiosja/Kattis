#include <stdio.h>
#include <math.h>

int max(int a, int b)
{
    return a > b ? a : b;
}

int main()
{
    int h, k, v, s, sum = 0;
    scanf("%d %d %d %d", &h, &k, &v, &s);

    while (h > 0)
    {
        v += s;
        v -= max(1, floor(v / 10));
        if (v >= k)
            h++;

        if (0 < v < k)
        {
            h--;
            if (h == 0)
                v = 0;
        }

        if (v <= 0)
        {
            h = 0;
            v = 0;
        }

        sum += v;

        if (s > 0)
            s--;
    }

    printf("%d\n", sum);
}