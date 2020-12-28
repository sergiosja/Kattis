import java.util.Scanner;

class Justaminute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double mins = 0, secs = 0;
        
        for (int i = 0; i < n; i++) {
            mins += sc.nextInt() * 60;
            secs += sc.nextInt();
        }

        System.out.println(secs/mins <= 1 ? "measurement error" : secs/mins);
        sc.close();
    }
}