import java.util.Scanner;

class Babybites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine().trim());
        String[] bites = sc.nextLine().split(" ");
        int count = 0;

        for (int i = 1; i < amount+1; i++) {
            if (bites[i-1].equals("mumble") || bites[i-1].equals(i + "")) {
                count++;
            }
        }
        System.out.println(count == amount ? "makes sense" : "something is fishy");
        sc.close();
    }
}