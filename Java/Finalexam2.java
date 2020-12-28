import java.util.Scanner;

class Finalexam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] score = new String[n];
        int count = 0;
        
        for (int i = 0; i < n; i++)
            score[i] = sc.nextLine();

        for (int i = 1; i < n; i++)
            if (score[i-1].equals(score[i]))
                count++;

       System.out.println(count); 
       sc.close();
    }
}