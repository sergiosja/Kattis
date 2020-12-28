import java.util.Scanner;
import java.lang.Math;

class Exam {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int correct = Integer.parseInt(sc.nextLine());
        String yours = sc.nextLine();
        String friends = sc.nextLine();
        int like = 0;
        
        for (int i = 0; i < yours.length(); i ++)
            if (yours.charAt(i) == friends.charAt(i))
                like++;

        System.out.println(friends.length() - Math.abs(like - correct));
        sc.close();
    }
}