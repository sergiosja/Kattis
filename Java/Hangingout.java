import java.util.Scanner;

class Hangingout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] max = sc.nextLine().split(" ");
        int hadtoleave = 0;
        int inside = 0;

        for (int i = 0; i < Integer.parseInt(max[1]) && sc.hasNextLine(); i++) {
            String[] people = sc.nextLine().split(" ");

            if (people[0].equals("enter") && (inside + Integer.parseInt(people[1])) <= Integer.parseInt(max[0]))
                inside += Integer.parseInt(people[1]);

            else if (people[0].equals("leave"))
                inside -= Integer.parseInt(people[1]);

            else
                hadtoleave++;
        }
        System.out.println(hadtoleave);
        sc.close();
    }
}