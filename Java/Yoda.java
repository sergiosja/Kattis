import java.util.Scanner;

class Yoda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String upper = sc.nextLine();
        String lower = sc.nextLine();
        String upperAnswer = "";
        String lowerAnswer = "";

        if (upper.length() > lower.length()) {
            int tmp = upper.length() - lower.length();

            for (int i = 0; i < tmp; i++)
                upperAnswer += upper.charAt(i);

            for (int i = 0; i < lower.length(); i++) {
                int first = Character.getNumericValue(upper.charAt(i + tmp));
                int second = Character.getNumericValue(lower.charAt(i));

                if (first > second) {
                    upperAnswer += upper.charAt(i + tmp);
                } else if (first < second) {
                    lowerAnswer += lower.charAt(i);
                } else {
                    upperAnswer += upper.charAt(i + tmp);
                    lowerAnswer += lower.charAt(i);
                }
            }

        } else if (upper.length() < lower.length()) {
            int tmp = lower.length() - upper.length();

            for (int i = 0; i < tmp; i++)
                lowerAnswer += lower.charAt(i);

            for (int i = 0; i < upper.length(); i++) {
                int first = Character.getNumericValue(upper.charAt(i));
                int second = Character.getNumericValue(lower.charAt(i + tmp));

                if (first > second) {
                    upperAnswer += upper.charAt(i);
                } else if (first < second) {
                    lowerAnswer += lower.charAt(i + tmp);
                } else {
                    upperAnswer += upper.charAt(i);
                    lowerAnswer += lower.charAt(i + tmp);
                }
            }

        } else {
            for (int i = 0; i < upper.length(); i++) {
                int first = Character.getNumericValue(upper.charAt(i));
                int second = Character.getNumericValue(lower.charAt(i));

                if (first > second) {
                    upperAnswer += upper.charAt(i);
                } else if (first < second) {
                    lowerAnswer += lower.charAt(i);
                } else {
                    upperAnswer += upper.charAt(i);
                    lowerAnswer += lower.charAt(i);
                }
            }
        }

        if (upperAnswer == "")
            upperAnswer = "YODA";
        if (Integer.parseInt(upperAnswer) == 00)
            upperAnswer = "0";

        if (lowerAnswer == "")
            lowerAnswer = "YODA";
        if (Integer.parseInt(lowerAnswer) == 00)
            lowerAnswer = "0";

        System.out.println(upperAnswer);
        System.out.println(lowerAnswer);
        sc.close();
    }
}