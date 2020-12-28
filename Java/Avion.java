import java.util.Scanner;

class Avion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            String jet = sc.nextLine();
            for (int j = 2; j < jet.length(); j++) {
                if (jet.charAt(j-2) == 'F' && jet.charAt(j-1) == 'B' && jet.charAt(j) == 'I') {
                    count++;
                    System.out.println(i+1);
                }
            }
        }
        if (count == 0)
            System.out.println("HE GOT AWAY!");
        sc.close();
    }
}