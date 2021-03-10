import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.lang.Math;

class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (!line.equals("0 0")) {
            int a = Integer.parseInt(line.substring(0, line.indexOf(" ")));
            int b = Integer.parseInt(line.substring(line.indexOf(" ") +1));
            int output = Math.min(a, b);

            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < a; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }
            
            int ops = set.size();

            for (int i = 0; i < b; i++) {
                set.add(Integer.parseInt(br.readLine()));
                if (set.size() > ops) {
                    output--;
                    ops = set.size();
                }
            }
            
            System.out.println(output);
            line = br.readLine();
        }
        br.close();
    }
}