import java.util.Scanner;

class Basketballoneonone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String winner = sc.nextLine();
        System.out.println(winner.charAt(winner.length() - 2));
        sc.close();
    }
}