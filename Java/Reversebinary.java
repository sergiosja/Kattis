import java.util.Scanner;
import java.lang.Integer;

class Reversebinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        String reverseBinary = "";
        
        for (int i = binary.length()-1; i >= 0; i--)
            reverseBinary += binary.substring(i, i+1);
        
        System.out.print(Integer.parseInt(reverseBinary, 2));
        sc.close();
    }
}