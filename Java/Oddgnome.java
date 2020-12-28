import java.util.Scanner;

class Oddgnome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int max = sc.nextInt();
            int[] gnomes = new int[max];

            for (int j = 0; j < max; j++) {
                gnomes[i] = sc.nextInt();
            }
            
            int first = 0, second = 0;

            for (int j = 1; j < gnomes.length; j++) {
                first = gnomes[j-1];
                second = gnomes[j];
                
                if (first + 1 != second) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
        sc.close();
    }
}