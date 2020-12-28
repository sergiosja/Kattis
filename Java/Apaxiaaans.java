import java.util.Scanner;

class Apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String first = "";

        for (int i = 1; i < word.length(); i++)
            if (word.charAt(i-1) != word.charAt(i))
                first += word.charAt(i-1);


        System.out.println(first + word.charAt(word.length() - 1));
        sc.close();
    }
}