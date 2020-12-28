import java.util.Scanner;

class Carrots {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        System.out.println(line[1]);
        sc.close();
    }
}