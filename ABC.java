import java.util.Arrays;
import java.util.Scanner;

class ABC{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[3];
    arr[0] = in.nextInt();
    arr[1] = in.nextInt();
    arr[2] = in.nextInt();
    Arrays.sort(arr);
    in.nextLine();
    String x = in.nextLine();
    String ans = "";
    for (int i = 0; i < 3; i++) {
      if(x.charAt(i) == 'A')ans += arr[0];
      if(x.charAt(i) == 'B')ans += arr[1];
      if(x.charAt(i) == 'C')ans += arr[2];
      if(i < 2){
        ans += ' ';
      }
    }
    System.out.println(ans);
  }
}