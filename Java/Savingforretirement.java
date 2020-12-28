import java.util.Scanner;

class Savingforretirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bobAge = sc.nextInt();
        int bobRetire = sc.nextInt();
        int bobSaving = sc.nextInt();
        int bobTotal = 0;

        int aliceAge = sc.nextInt();
        int aliceSaving = sc.nextInt();
        int aliceTotal = 0;

        for (int i = 0; i < bobRetire - bobAge; i++)
            bobTotal += bobSaving;

        while (aliceTotal <= bobTotal) {
            aliceTotal += aliceSaving;
            aliceAge++;
        }

        System.out.println(aliceAge);
        sc.close();
    }
}