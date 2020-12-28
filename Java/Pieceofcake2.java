import java.util.Scanner;

class Pieceofcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();

        if (h < l - h)
            h = l - h;
        
        if (v < l - v)
            v = l - v;

        System.out.println(h * v * 4);
        sc.close();
    }
}