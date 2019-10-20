import java.util.ArrayList;
import java.util.Scanner;

class AboveAverage{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int c = in.nextInt();
    for (int i = 0; i < c; i++) {
      int x = in.nextInt();
      ArrayList<Integer> arr = new ArrayList<>();
      double sum = 0;
      for (int j = 0; j < x; j++) {
        int h = (in.nextInt());
        arr.add(h);
        sum += h;
      }
      sum = sum/x;
      double y = 0;
      for (int n : arr) {
        if(n > sum) y++;
      }
      System.out.format("%.3f", y/x*100.000);
      System.out.println("%");
    }
  }
}