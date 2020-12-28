import java.util.ArrayList;
import java.util.Scanner;

class Missingnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> rest = new ArrayList<Integer>();

        for (int i = 0; i < n; i++)
            numbers.add(sc.nextInt());

        if (numbers.get(n-1) == n)
            System.out.println("good job");
        else
            for (int i = 1; i < numbers.get(n-1); i++)
                if (!numbers.contains(i))
                    rest.add(i);

        for (int i : rest)
            System.out.println(i);

        sc.close();
    }
}