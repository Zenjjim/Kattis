import java.util.*;
class Ant {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String x = in.nextLine();
    String[] parts = x.split(" ");
    int part1 = Integer.parseInt(parts[0]);
    int part2 = Integer.parseInt(parts[1]);
    for(int n = 0; n < part1; n++){
        in.nextLine();
    }
    System.out.println(part2);
  }
}