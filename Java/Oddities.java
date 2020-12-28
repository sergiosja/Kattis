import java.util.Scanner;

class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            System.out.println(j % 2 == 0 ? j + " is even" : j + " is odd");
        }
        
        sc.close();
    }
}