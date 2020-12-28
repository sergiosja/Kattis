import java.util.Scanner;

class Provincesandgold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = (sc.nextInt() * 3) + (sc.nextInt() * 2) + (sc.nextInt() * 1);

        System.out.println(total >= 8 ? "Province or Gold" :
                           total >= 6 ? "Duchy or Gold" :
                           total == 5 ? "Duchy or Silver" :
                           total >= 3 ? "Estate or Silver" :
                           total == 2 ? "Estate or Copper" :
                           "Copper");
        sc.close();
    }
}