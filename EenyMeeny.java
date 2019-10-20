import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class EenyMeeny {
    public static void main(String[] args){
        boolean team = false;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> team1 = new ArrayList<String>();
        ArrayList<String> team2 = new ArrayList<String>();

        String regle = sc.nextLine();
        int intervall = regle.split(" ").length;

        int N = Integer.parseInt(sc.nextLine());
        LinkedList<String> navn = new LinkedList<String>();

        for (int i = 0; i < N; i++) {
            navn.add(sc.nextLine());
        }
        int currentIndex = 0;
        while( N > 1) {
            currentIndex += intervall-1;
            currentIndex = currentIndex%N;
            if(!team){
                team1.add(navn.get(currentIndex));
            }
            else {
                team2.add(navn.get(currentIndex));
            }
            team = !team; 
            navn.remove(currentIndex);
            N--;
        }
        
        if(!team){
            team1.add(navn.get(0));
        }
        else {
            team2.add(navn.get(0));
        }
        
        System.out.println(team1.size());
        for(int i = 0; i < team1.size(); i++) System.out.println(team1.get(i));

        System.out.println(team2.size());
        for(int i = 0; i < team2.size(); i++) System.out.println(team2.get(i));
    }
}