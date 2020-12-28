import java.util.Scanner;

class Onechicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(second > first && second - first == 1 ? "Dr. Chaz will have 1 piece of chicken left over!" :
                           second > first && second - first != 1 ? "Dr. Chaz will have " + (second - first) + " pieces of chicken left over!" :
                           second <= first && first - second == 1 ? "Dr. Chaz needs 1 more piece of chicken!" :
                           "Dr. Chaz needs " + (first - second) + " more pieces of chicken!");
        sc.close();
    }
}