import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;

class Cd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (!line.equals("0 0")) {
            String[] nums = line.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);

            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < a; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }
            
            int ops = set.size();
            for (int i = 0; i < b; i++) {
                set.add(Integer.parseInt(br.readLine()));
                if (set.size() > ops) {
                    a--;
                    ops++;
                }
            }
            
            System.out.println(a);
            line = br.readLine();
        }
        br.close();
    }
}