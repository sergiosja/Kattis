#include <stdio.h>
#include <limits.h>

int main() {
    int people, budget, hotels, weekends;
    scanf("%d %d %d %d", &people, &budget, &hotels, &weekends);

    int cheapest = INT_MAX;
    for (int i = 0; i < hotels; i++) {
        int price;
        scanf("%d", &price);
        for (int j = 0; j < weekends; j++) {
            int rooms;
            scanf("%d", &rooms);
            if (rooms >= people) {
                int checker = people * price;
                if (checker <= budget && checker < cheapest) {
                    cheapest = checker;
                }
            }
        }
    }
    if (cheapest < INT_MAX)
        printf("%d", cheapest);
    else
        printf("stay home");
}