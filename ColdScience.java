import java.util.*;
class ColdScience {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int ant = in.nextInt();
    in.nextLine();
    String x = in.nextLine();
    String[] parts = x.split(" ");
    int tot = 0;
    for(int n = 0; n < parts.length; n++){
      if(Integer.parseInt(parts[n]) < 0) tot++;
    };
    System.out.println(tot);
  }
}