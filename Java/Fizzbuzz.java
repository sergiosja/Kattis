import java.util.Scanner;

class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int n = sc.nextInt();
        int j = 1;
        
        for (int i = 0; i < n; i++) {
            if (j % first == 0 && j % second == 0) {
                System.out.println("FizzBuzz");
                j++;
            } else if (j % first == 0) {
                System.out.println("Fizz");
                j++;
            } else if (j % second == 0) {
                System.out.println("Buzz");
                j++;
            } else {
                System.out.println(j);
                j++;
            }
        }
        sc.close();
    }
}