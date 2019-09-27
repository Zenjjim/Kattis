import java.util.*;

class SumKindofProblem {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] svar = new String[n];
    for(int i = 0; i < n; i++) {
      int check = in.nextInt();
      int x = in.nextInt();
      if(check == i+1){
        svar[i] = i+1 + " " + S1(x) + " " + S2(x) + " " + S3(x);
      }
    }
    for(int i = 0; i < n; i++) {
      System.out.println(svar[i]);
    }
  }

  public static int S1(int x) {
    int sum = 0;
    for(int i = 0; i <= x; i++){
      sum += i;
    }
    return sum;
  }

  public static int S2(int x) {
    int teller = 0;
    int i = 1;
    int sum = 0;
    while( teller < x){
      if(i%2==1){
        sum += i;
        teller ++;
      }
      i++;
    }
    return sum;
  }
  public static int S3(int x) {
    int teller = 0;
    int i = 1;
    int sum = 0;
    while( teller < x){
      if(i%2==0){
        sum += i;
        teller ++;
      }
      i++;
    }
    return sum;
  }
}