import java.util.Scanner;

class Pokerhand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cards = sc.nextLine().split(" ");
        int count = 0;

        for (int i = 0; i < cards.length; i++) {
            int rankCount = 0;
            
            for (int j = i+1; j < cards.length; j++)
                if (cards[i].charAt(0) == cards[j].charAt(0))
                    rankCount++;

            if (rankCount > count)
                count = rankCount;
        }

        System.out.println(count +1);
        sc.close();
    }
}