import java.util.Scanner;

class Sodaslurper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bottles = sc.nextInt() + sc.nextInt();
        int price = sc.nextInt();
        int total = 0;

        while (bottles >= price) {
            bottles -= price;
            bottles++;
            total++;
        }

        System.out.println(total);
        sc.close();
    }
}