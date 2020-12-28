import java.util.Scanner;

class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String first = "" + name.charAt(0);

        for (int i = 0; i < name.length(); i++)
            if (name.charAt(i) == '-') first += name.charAt(i+1);

        System.out.println(first);
        sc.close();
    }
}