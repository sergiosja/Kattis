import java.util.Scanner;

class Alphabetspam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        String lc = "qwertyuiopasdfghjklzxcvbnm", uc = "QWERTYUIOPASDFGHJKLZXCVBNM";
        double wsRatio = 0, lcRatio = 0, ucRatio = 0, smbRatio = 0;
        boolean smb = true;

        for (int i = 0; i < msg.length(); i++) {
            for (int j = 0; j < lc.length(); j++)
                if (msg.charAt(i) == lc.charAt(j)) {
                    lcRatio++;
                    smb = false;
                }

            for (int j = 0; j < uc.length(); j++)
                if (msg.charAt(i) == uc.charAt(j)) {
                    ucRatio++;
                    smb = false;
                }

            if (msg.charAt(i) == '_') {
                wsRatio++;
                smb = false;
            }

            if (smb) {
                smbRatio++;
            }

            smb = true;
        }

        wsRatio /= msg.length();
        lcRatio /= msg.length();
        ucRatio /= msg.length();
        smbRatio /= msg.length();

        System.out.println(wsRatio + "\n" + lcRatio + "\n" + ucRatio + "\n" + smbRatio);
        sc.close();
    }
}