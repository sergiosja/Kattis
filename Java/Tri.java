import java.util.Scanner;

class Tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if (first + second == third)
            System.out.println(first + "+" + second + "=" + third);
        else if (first - second == third)
            System.out.println(first + "-" + second + "=" + third);
        else if (first * second == third)
            System.out.println(first + "*" + second + "=" + third);
        else if (first / second == third)
            System.out.println(first + "/" + second + "=" + third);

        else if (second + third == first)
            System.out.println(first + "=" + second + "+" + third);
        else if (second - third == first)
            System.out.println(first + "=" + second + "-" + third);
        else if (second * third == first)
            System.out.println(first + "=" + second + "*" + third);
        else if (second / third == first)
            System.out.println(first + "=" + second + "/" + third);

        sc.close();
    }
}