import java.util.Scanner;

class Combinationlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            if (a + b + c + d == 0)
                break;
            
            int degrees = 120;
            int first = (40 + a - b) % 40;
            int second = (40 - b + c) % 40;
            int third = (40 + c - d) % 40;
            System.out.println((degrees + first + second + third) * 9);
        }
        sc.close();
      }
  }