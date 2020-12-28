import java.util.Scanner;

class Anotherbrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int bricks = sc.nextInt();
        int totH = 0, totW = 0;

        while (bricks-- > 0 && totH <= height && totW <= width) {
            totW += sc.nextInt();
            if (totW == width) {
                totW = 0;
                totH++;
            }
            if (totH == height)
                break;
        }
        System.out.println(totH == height ? "YES" : "NO");
        sc.close();
    }
}