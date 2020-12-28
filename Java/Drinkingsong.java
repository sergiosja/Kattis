import java.util.Scanner;

class Drinkingsong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine().trim());
        String word = sc.nextLine();
        int count = amount;
        for (int i = 2; i < amount; i++) {
            System.out.println(count + " bottles of " + word + " on the wall, " + count + " bottles of " + word + ".");
            count--;
            System.out.println("Take one down, pass it around, " + count + " bottles of " + word + " on the wall.\n");
        }
        
        if (amount > 1) {
            System.out.println("2 bottles of " + word + " on the wall, 2 bottles of " + word + ".");
            System.out.println("Take one down, pass it around, 1 bottle of " + word + " on the wall.\n");
        }

        System.out.println("1 bottle of " + word + " on the wall, 1 bottle of " + word + ".");
        System.out.println("Take it down, pass it around, no more bottles of " + word + ".");

        sc.close();
    }
}