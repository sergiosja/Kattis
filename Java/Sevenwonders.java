import java.util.Scanner;

class Sevenwonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cards = sc.nextLine();
        int t = 0;
        int g = 0;
        int c = 0;
        int count = 0;

        for (int i = 0; i < cards.length(); i++) {
            if (cards.charAt(i) == 'T')
                t++;
            if (cards.charAt(i) == 'G')
                g++;
            if (cards.charAt(i) == 'C')
                c++;
        }

        if (t > 0 && g > 0 && c > 0) {
            if (t <= g && t <= c)
                count = t * 7;
            else if (c <= g && c <= t)
                count = c * 7;
            else if (g <= c && g <= t)
                count = g * 7;
        }

        System.out.println(Math.round(Math.pow(t, 2) + Math.pow(g, 2) + Math.pow(c, 2) + count));
        sc.close();
    }
}