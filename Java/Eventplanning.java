import java.util.Scanner;

class Eventplanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int budget = sc.nextInt();
        int hotels = sc.nextInt();
        int weekends = sc.nextInt();
        int cheapest = Integer.MAX_VALUE;

        for (int i = 0; i < hotels; i++) {
            int price = sc.nextInt();
            for (int j = 0; j < weekends; j++) {
                int rooms = sc.nextInt();
                if (rooms >= people) {
                    int checker = people * price;
                    if (checker <= budget && checker < cheapest) {
                        cheapest = checker;
                    }
                }
            }
        }
        System.out.println(cheapest < Integer.MAX_VALUE ? cheapest : "stay home");
        sc.close();
    }
}