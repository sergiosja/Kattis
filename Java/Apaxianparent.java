import java.util.Scanner;

class Apaxianparent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = sc.nextLine().split(" ");
        String fullname = "";

        if (name[0].charAt(name[0].length()-1) == 'e') {
            fullname = name[0] + "x" + name[1];
        }
        else if (name[0].charAt(name[0].length()-1) == 'a' || name[0].charAt(name[0].length()-1) == 'i' ||
                   name[0].charAt(name[0].length()-1) == 'o' || name[0].charAt(name[0].length()-1) == 'u') {
            fullname = name[0].substring(0, name[0].length()-1) + "ex" + name[1];
        }
        else if (name[0].charAt(name[0].length()-1) == 'x' && name[0].charAt(name[0].length()-2) == 'e') {
            fullname = name[0] + name[1];
        }
        else {
            fullname = name[0] + "ex" + name[1];
        }

        System.out.println(fullname);
        sc.close();
    }
}