import java.util.Scanner;

class Simon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String order = sc.nextLine();
            System.out.println(order.indexOf("simon says ") == 0 ? order.replace("simon says ", "") : "");
        }
        sc.close();
    }
}