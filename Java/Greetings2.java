import java.util.Scanner;
import java.lang.StringBuilder;

class Greetings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greeting = sc.nextLine();
        int newe = (greeting.length() - 2) * 2;

        StringBuilder sb = new StringBuilder();

        sb.append('h');
        for (int i = 0; i < newe; i++)
            sb.append('e');
        sb.append('y');

        System.out.println(sb);
        sc.close();
    }
}