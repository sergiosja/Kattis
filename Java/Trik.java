import java.util.Scanner;

class Trik {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ball = 1;
        String br = sc.nextLine();
        
        for (int i = 0; i < br.length(); i++) {
            if (br.charAt(i) == 'A' && ball == 1)
                ball = 2;
            else if (br.charAt(i) == 'A' && ball == 2)
                ball = 1;
            else if (br.charAt(i) == 'B' && ball == 2)
                ball = 3;
            else if (br.charAt(i) == 'B' && ball == 3)
                ball = 2;
            else if (br.charAt(i) == 'C' && ball == 1)
                ball = 3;
            else if (br.charAt(i) == 'C' && ball == 3)
                ball = 1;
        }
        
        System.out.println(ball);
        sc.close();
    }
}