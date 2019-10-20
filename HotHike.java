import java.util.Scanner;

class HotHike {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] temp = new int[in.nextInt()];
        in.nextLine();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = in.nextInt();
        }

        int minI = -1;
        int minTot = Integer.MAX_VALUE;

        for (int i = 0; i < temp.length-2; i++) {
            int currTot = temp[i] > temp[i+2]?temp[i]:temp[i+2];
            if(currTot < minTot){
                minTot = currTot;
                minI = i;
            }
        }
        System.out.println((minI+1) + " " + (temp[minI] > temp[minI+2]?temp[minI]:temp[minI+2]));

    }
}