import java.util.Scanner;

class Simon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String order = sc.nextLine();
            if (order.contains("Simon says"))
                System.out.println(order.substring(11));
        }
        sc.close();
    }
}