import java.util.Scanner;

class Heartrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double beats = sc.nextDouble();
            double time = sc.nextDouble();
            double BPM = (beats * 60) / time;
            double tmp = BPM / beats;
            
            System.out.println((BPM - tmp) + " " + BPM + " " + (BPM + tmp));
        }
        sc.close();
    }
}