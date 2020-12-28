import java.util.Scanner;

class Helpaphd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            int first = 0;
            int second = 0;
            String equation = sc.nextLine();
            for (int j = 0; j < equation.length(); j++) {
                if (equation.charAt(j) == 'N') {
                    System.out.println("skipped");
                }
                else if (equation.charAt(j) == '+') {
                    first = Integer.parseInt(equation.substring(0, j));
                    second = Integer.parseInt(equation.substring(j+1));
                    System.out.println(first + second);
                }
            }
        }
        sc.close();
    }
}