import java.util.Scanner;

class Guess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[1000];
        for (int i = 0; i < 1000; i++)
            list[i] = i;

        int left = 0;
        int right = list.length - 1;

        for (int i = 0; i < 10; i++) {
            int middle = (left + right) / 2;
            System.out.println(middle);
            String s = sc.nextLine();
            
            if (s.equals("lower"))
                right = middle - 2;
            else if (s.equals("higher"))
                left = middle + 2;
            else
                System.exit(0);
        }
        
        sc.close();
    }
}