import java.util.Scanner;

class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fnum = Integer.parseInt(new StringBuffer(sc.next()).reverse().toString());
        int snum = Integer.parseInt(new StringBuffer(sc.next()).reverse().toString());

        System.out.println(fnum > snum ? fnum : snum);
        sc.close();
    }
}