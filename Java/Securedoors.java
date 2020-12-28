import java.util.ArrayList;
import java.util.Scanner;

class Securedoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String status = sc.next();
            String name = sc.next();

            if (!names.contains(name) && status.equals("entry")) {
                names.add(name);
                System.out.println(name + " entered");
            }

            else if (names.contains(name) && status.equals("entry")) {
                System.out.println(name + " entered (ANOMALY)");
            }

            else if (names.contains(name) && status.equals("exit")) {
                names.remove(name);
                System.out.println(name + " exited");
            }

            else if (!names.contains(name) && status.equals("exit")) {
                System.out.println(name + " exited (ANOMALY)");
            }
        }
        sc.close();
    }
}