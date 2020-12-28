import java.util.Scanner;

class Conundrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int sum = str.length();

        for (int i = 0; i < str.length(); i+=3)
            if (str.charAt(i) == 'p')
                sum--;

        for (int i = 1; i < str.length(); i+=3)
            if (str.charAt(i) == 'e')
                sum--;

        for (int i = 2; i < str.length(); i+=3)
            if (str.charAt(i) == 'r')
                sum--;

        System.out.println(sum);
        sc.close();
    }
}