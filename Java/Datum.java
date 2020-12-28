import java.util.Scanner;
import java.time.LocalDate;

class Datum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    int month = sc.nextInt();
    LocalDate date = LocalDate.of(2009, month, day);
    
    System.out.println(date.getDayOfWeek());
    sc.close();
  }
}