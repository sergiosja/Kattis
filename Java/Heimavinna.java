import java.util.Scanner;

class Heimavinna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tasks = sc.nextLine().split(";");
        int sum = 0;

        for (int i = 0; i < tasks.length; i++) {
            for (int j = 0; j < tasks[i].length(); j++) {
                if (tasks[i].charAt(j) == '-') {
                    int start = Integer.parseInt(tasks[i].substring(0, j));
                    int end = Integer.parseInt(tasks[i].substring(j+1));
                    sum += end - start;
                }
            }
            sum ++;
        }
        System.out.println(sum);
        sc.close();
    }
}