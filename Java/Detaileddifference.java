import java.util.Scanner;

class Detailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        
        for (int i = 0; i < n; i++) {
            String upper = sc.nextLine();
            String lower = sc.nextLine();
            String total = "";
            
            for (int j = 0; j < upper.length(); j++) {
                if (upper.charAt(j) == lower.charAt(j))
                    total += ".";
                else
                    total += "*";
            }

            System.out.println(upper);
            System.out.println(lower);
            System.out.println(total + "\n");
        }
        sc.close();
    }
}