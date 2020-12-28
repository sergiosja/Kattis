import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

class Abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < 3; i++)
            array[i] = sc.nextInt();

        Arrays.sort(array);
        HashMap<Character, Integer> pairs = new HashMap<>();
        pairs.put('A', array[0]);
        pairs.put('B', array[1]);
        pairs.put('C', array[2]);

        sc.nextLine(); // Trimming

        Character[] order = new Character[3];
        String tmp = sc.nextLine().trim();
        for (int i = 0; i < 3; i++)
            order[i] = tmp.charAt(i);

        String output = "";
        for (int i = 0; i < 3; i++)
            output += pairs.get(order[i]) + " ";

        System.out.println(output);
        sc.close();
    }
}
