import java.util.Scanner;
import java.util.Arrays;

class Permutedarithmeticsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int count = 0;

            int[] nums = new int[m];
            for (int j = 0; j < m; j++)
                nums[j] = sc.nextInt();

            // Checking ari
            boolean ari = false;
            int diff = nums[1] - nums[0];
            for (int j = 1; j < m; j++)
                if (nums[j] - nums[j-1] == diff)
                    count++;

            if (count == m-1)
                ari = true;

            // Checking per-ari
            count = 0;
            boolean perari = false;
            Arrays.sort(nums);
            diff = nums[1] - nums[0];
            for (int j = 1; j < m; j++)
                if (nums[j] - nums[j-1] == diff)
                    count++;

            if (count == m-1)
                perari = true;
            
            System.out.println(ari == true ? "arithmetic" :
                               perari == true ? "permuted arithmetic" :
                               "non-arithmetic");
        }
        sc.close();
    }
}