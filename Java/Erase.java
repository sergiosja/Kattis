import java.util.Scanner;

class Erase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String before = sc.nextLine();
        String after = sc.nextLine();
        int count = 0;
        
        if (n % 2 == 0) {
            for (int i = 0; i < before.length(); i++)
                if (before.charAt(i) == after.charAt(i))
                    count++;

            System.out.println(count == before.length() ? "Deletion succeeded" : "Deletion failed");
        }
        else {
            for (int i = 0; i < before.length(); i++)
                if (before.charAt(i) != after.charAt(i))
                    count++;
            
            System.out.println(count == before.length() ? "Deletion succeeded" : "Deletion failed");
        }
        
        sc.close();
    }
}