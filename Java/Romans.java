import java.util.Scanner;

class Romans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = Double.parseDouble(sc.nextLine());
        System.out.println(Math.round(feet * 1087.76266));
        sc.close();
    }
}