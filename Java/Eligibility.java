import java.util.Scanner;

class Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int study = Integer.parseInt(sc.next().substring(0, 4));
            int born = Integer.parseInt(sc.next().substring(0,4));
            int courses = sc.nextInt();

            if (study >= 2010 || born >= 1991)
                System.out.println(name + " eligible");

            else if (courses < 41)
                System.out.println(name + " coach petitions");

            else
                System.out.println(name + " ineligible");
        }
        sc.close();
    }
}