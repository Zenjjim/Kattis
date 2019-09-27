import java.util.*;
class Autori {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String x = in.next();
    String y = "";
    String[] parts = x.split("-");
    for(String s : parts) {
      y += s.charAt(0);
    }
    System.out.println(y);
  }
}