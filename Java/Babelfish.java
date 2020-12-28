import java.util.Scanner;
import java.util.HashMap;

class Babelfish {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> words = new HashMap<String, String>();
        String[] line = sc.nextLine().split(" ");
        
        while (line.length > 1) {
            words.put(line[1], line[0]);
            line = sc.nextLine().split(" ");
        }
        
        while (sc.hasNextLine()) {
            String value = sc.nextLine();
            System.out.println(words.containsKey(value) ? words.get(value) : "eh");
        }
        sc.close();
    }
}