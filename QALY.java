import java.util.*;

class QALY{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int antallLinje = in.nextInt();
    in.nextLine();

    int counter = 0;
    double output = 0;
    while(counter < antallLinje){
      double d1 = Double.parseDouble(in.next());
      double d2 = Double.parseDouble(in.next());
      output +=  d1 * d2;
      counter++;
    }
    System.out.println(output);
  }
}
