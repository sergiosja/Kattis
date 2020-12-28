import java.util.Scanner;
import java.util.HashMap;

class Anewalphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <Character, String> new_word = new HashMap <Character, String>();
        new_word.put('a', "@");
        new_word.put('b', "8");
        new_word.put('c', "(");
        new_word.put('d', "|)");
        new_word.put('e', "3");
        new_word.put('f', "#");
        new_word.put('g', "6");
        new_word.put('h', "[-]");
        new_word.put('i', "|");
        new_word.put('j', "_|");
        new_word.put('k', "|<");
        new_word.put('l', "1");
        new_word.put('m', "[]\\/[]");
        new_word.put('n', "[]\\[]");
        new_word.put('o', "0");
        new_word.put('p', "|D");
        new_word.put('q', "(,)");
        new_word.put('r', "|Z");
        new_word.put('s', "$");
        new_word.put('t', "']['");
        new_word.put('u', "|_|");
        new_word.put('v', "\\/");
        new_word.put('w', "\\/\\/");
        new_word.put('x', "}{");
        new_word.put('y', "`/");
        new_word.put('z', "2");

        Character[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                             'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
  
        String sentence = sc.nextLine().toLowerCase();
        String newsentence = "";

        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < chars.length; j++)
                if (sentence.charAt(i) == chars[j])
                    newsentence += new_word.get(chars[j]);

            if (!new_word.containsKey(sentence.charAt(i)))
                newsentence += sentence.charAt(i);
        }
        System.out.println(newsentence);
        sc.close();
      }
  }