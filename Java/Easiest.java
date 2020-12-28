import java.util.Scanner;

class Easiest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int first = Integer.parseInt(sc.nextLine().trim());
            if (first == 0) break;
            int second = 10;
            String tmp1 = first + "";
            String tmp2 = second + "";
            int checker1 = 0;
            int checker2 = 0;
            
            for (int i = 0; i < tmp1.length(); i++)
                checker1 += Integer.parseInt(tmp1.charAt(i) + "");

            while (checker2 != checker1) {
                second++;
                tmp2 = (second * first) + "";
                checker2 = 0;
                for (int i = 0; i < tmp2.length(); i++)
                    checker2 += Integer.parseInt(tmp2.charAt(i) + "");
            }

            System.out.println(second);
        }
        sc.close();
    }
}