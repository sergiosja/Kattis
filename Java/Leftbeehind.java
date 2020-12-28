import java.util.Scanner;

class Leftbeehind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] jars = sc.nextLine().split(" ");
            int good = Integer.parseInt(jars[0]);
            int bad = Integer.parseInt(jars[1]);

            if (good == 0 && bad == 0) break;
            System.out.println(good + bad == 13 ? "Never speak again." :
                               good > bad ? "To the convention." :
                               good == bad ? "Undecided." :
                               "Left beehind.");
        }
        sc.close();
    }
}