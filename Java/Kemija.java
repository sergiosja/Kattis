import java.util.Scanner;

class Kemija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String sentence = sc.nextLine();
        String decode = "";

        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (sentence.charAt(i) == vowels[j])
                    i += 2;
            }
            decode += sentence.charAt(i);
        }
        System.out.println(decode);
        sc.close();
    }
}