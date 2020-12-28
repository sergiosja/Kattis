import java.util.Scanner;
import java.lang.StringBuilder;

class Backspace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '<')
                ans.deleteCharAt(ans.length() - 1);
            else
                ans.append(word.charAt(i));
        }
        System.out.println(ans);
        sc.close();
    }
}