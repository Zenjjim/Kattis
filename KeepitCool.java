import java.util.ArrayList;
import java.util.Scanner;

class KeepitCool {
    public static void main(String[] args) {
        //initialize
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int student = in.nextInt();
        int row = in.nextInt();
        int depth = in.nextInt();
        int antOld = 0;
        in.nextLine();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < row; i++) {
            int old = in.nextInt();
            arr.add(old);
            antOld += old;
        }
        int[] print = new int[row];

        //code:
        int sjekkTall = 0;
        for (int i = 0; i <= n;) {
            int index = arr.indexOf(sjekkTall);
            while (index == -1){ 
                sjekkTall++;
                index = arr.indexOf(sjekkTall);

            }
            int antSettInn = depth - sjekkTall;
            boolean ferdig = false;
            if (antSettInn >= n-i) {
                antSettInn = n-i;
                ferdig = true;
            }
            antOld -= arr.get(index);
            arr.set(index, (arr.get(index)+antSettInn));
            i += antSettInn;
            print[index] = antSettInn;
            if(ferdig) {
                break;
            }
        }

        if(antOld >= student){
            String out = "";
            for (int i = 0; i < print.length; i++) {
                out += print[i] + " "; 
            }
            System.out.println(out);
        } else {
            System.out.println("impossible");
        }
    }
}