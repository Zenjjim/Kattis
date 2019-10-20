import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Incognito {
  public static List<String> taken;
  public static String arr[][];
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    for (int i = 0; i < a; i++) {
      int b = in.nextInt();
      arr = new String[b][2];
      for (int x = 0; x < b; x++) {
        arr[x][0] = in.next();
        arr[x][1] = in.next();
      }
      taken = new ArrayList<String>();
      taken.add(arr[0][1]);
      int sum = b;
      for (int x = 0; x < b; x++) {
        for (int y = 0; y < b; y++) {
          if (!taken.contains(arr[x][1])) {
            if (!arr[x][1].equals(arr[y][1])) {
              taken.add(arr[x][1])
              sum++;
            }
          }
        }
      }
      System.out.println(sum);
    }
  }
  static boolean contains(int x){
    for (String string : taken) {
      if(arr[x][1].equals(string)){
        return false;
      }
    }
    return true;
  }
}