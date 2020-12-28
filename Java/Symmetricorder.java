import java.util.Scanner;

class Symmetricorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        int count = 1;

        while (n != 0) {
            n = Integer.parseInt(sc.nextLine().trim());
            if (n == 0) break;
            System.out.println("SET " + count++);

            String[] names = new String[n];
            for (int i = 0; i < n; i++)
                names[i] = sc.nextLine();

            if (n % 2 != 0) {
                for (int i = 0; i < names.length; i+=2)
                    System.out.println(names[i]);
                
                for (int i = names.length-2; i > 0; i-=2)
                    System.out.println(names[i]);

            } else {
                for (int i = 0; i < names.length; i+=2)
                    System.out.println(names[i]);
                
                for (int i = names.length-1; i > 0; i-=2)
                    System.out.println(names[i]);
            }
        }
        sc.close();
    }
}