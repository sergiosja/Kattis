import java.util.Scanner;

class Ofugsnuid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        for (int i = nums.length - 1; i >= 0; i--)
            System.out.println(nums[i]);

        sc.close();
    }
}
