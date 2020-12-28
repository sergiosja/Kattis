import java.util.Scanner;

class Judgingmoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        
        System.out.println(first == 0 && second == 0 ? "Not a moose" :
                           first == second ? "Even " + first * 2 :
                           first > second ? "Odd " + first * 2 :
                           "Odd " + second * 2);
        sc.close();
    }
}