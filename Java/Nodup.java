import java.util.Scanner;
import java.util.ArrayList;

class Nodup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        ArrayList<String> first = new ArrayList<String>();
        ArrayList<String> second = new ArrayList<String>();

        for (int i = 0; i < words.length; i++)
            second.add(words[i]);
        
        for (int i = 0; i < second.size(); i++)
            if (!first.contains(second.get(i)))
                first.add(second.get(i));

        System.out.println(second.size() == first.size() ? "yes" : "no");
        sc.close();
    }
}