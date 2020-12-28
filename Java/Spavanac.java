import java.util.Scanner;

class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int new_hours = 0, new_mins = 0;
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        if (hours < 1) {
            new_hours = 23;
            new_mins = minutes + 15;
        }
        else if (minutes > 45) {
            new_hours = hours;
            new_mins = minutes - 45;
        }
        else if (minutes < 45) {
            new_hours = hours - 1;
            new_mins = minutes + 15;
        }

        System.out.println(new_hours + " " + new_mins);
        sc.close();
    }
}