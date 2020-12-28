import java.util.Scanner;

class Speedlimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int miles = 0;
        int time = 0;
        int tmp = 0;
        
        while (sc.hasNextLine()) {
            int amount = sc.nextInt();
            
            if (amount > 0) {
                for (int i = 0; i < amount; i++) {
                    miles = sc.nextInt();
                    time = sc.nextInt();
                    time -= tmp;
                    total += miles * time;
                    tmp += time;
                }
                
                System.out.println(total + " miles");
                total = 0;
                tmp = 0;
            } else {
                break;
            }
        }
        sc.close();
    }
}