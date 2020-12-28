import java.util.Scanner;

class Sumkindofproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            int task = sc.nextInt();
            int num = sc.nextInt();
            int s1 = 0, s2 = 0, s3 = 0;
            int odd = 2, even = 1;
            
            for (int i = 0; i < num + 1; i++)
                s1 += i;

            for (int i = 0; i < num; i++) {
                s2 += even;
                even +=2;
            }

            for (int i = 0; i < num; i++) {
                s3 += odd;
                odd +=2;
            }

            System.out.println(task + " " + s1 + " " + s2 + " " + s3);
        }
        sc.close();
    }
}