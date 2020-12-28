import java.util.Scanner;

class Isithalloween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        int day = sc.nextInt();
        System.out.println(month.equals("OCT") && day == 31 || month.equals("DEC") && day == 25 ? "yup" : "nope");

        sc.close();
    }
}
