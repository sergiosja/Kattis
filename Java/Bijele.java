import java.util.Scanner;

class Bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        int[] list = new int[6];
        String ans = "";
        list[0] = 1;
        list[1] = 1;
        list[2] = 2;
        list[3] = 2;
        list[4] = 2;
        list[5] = 8;

        for (int i = 0; i < 6; i++) {
            if (Integer.parseInt(n[i]) == list[i]) {
                ans += "0 ";
            } else if (Integer.parseInt(n[i]) > list[i]) {
                ans += (~((Integer.parseInt(n[i]) - list[i]) - 1)) + " ";
            } else {
                ans += (list[i] - Integer.parseInt(n[i])) + " ";
            }
        }
        System.out.println(ans.substring(0, ans.length() - 1));
        sc.close();
    }
}