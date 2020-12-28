import java.util.Scanner;

class Commercials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int price = sc.nextInt();
        int[] commercials = new int[amount];

        for (int i = 0; i < amount; i++)
            commercials[i] = sc.nextInt() - price;
        
        int current = commercials[0];
        int profit = commercials[0];

        for (int i = 0; i < commercials.length; i++) {
            if (current < 0)
                current = commercials[i];
            else
                current += commercials[i];
            
            if (current >= profit)
                profit = current;
        }
        System.out.println(profit);
        sc.close();
    }
}