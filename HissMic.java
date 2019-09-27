import java.util.*;
class HissMic {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String x = in.nextLine();
    boolean y = false;
    for (int index = x.indexOf('s'); index >= 0 && index < x.length()-1; index = x.indexOf('s', index + 1)) {
    if(x.charAt(index+1) == ('s')){
        y = true;
      }
    }
    if(y){
      System.out.println("hiss");
    }else {
      System.out.println("no hiss");
    }
  }
}