import java.util.Scanner;

class Hissingmicrophone {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) == 's' && word.charAt(i) == 's') {
                System.out.println("hiss");
                System.exit(0);
            }
        }

        System.out.println("no hiss");
        sc.close();
    }
}