import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Dominoes2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p = in.nextInt();
    for(int i = 0; i < p; i++){
      int n = in.nextInt();
      int m = in.nextInt();
      int l = in.nextInt();
      int sum = 0;
      Node[] arr = new Node[n];
      Q q = new Q();
      for(int j = 0; j < n; j++){
        arr[j] = new Node(j);
      }
      for (int j = 0; j < m; j++) {
        arr[in.nextInt()-1].next.add(in.nextInt()-1);
      }
      for (int j = 0; j < l; j++) {
        Node temp = arr[in.nextInt()-1];
        q.add(temp.value);
        while(q.isEmpty()){
          temp = arr[q.pull()];
          temp.taken = true;
          sum++;
          for (int x : temp.next) {
            if(!arr[x].taken){
              q.add(x);
            }
          }
        }
      }
      System.out.println(sum);
    }
  }
}
class Q {
  List<Integer> q = new ArrayList<>();
  int pull(){
    int x = q.get(0);
    q.remove(0);
    return x;
  }
  void add(int x){
    q.add(x);
  }
  boolean isEmpty(){
    return q.size() > 0;
  }
}
class Node {
  List<Integer> next = new ArrayList<>();;
  int value;
  boolean taken = false;

  Node(int v){
    this.value = v;
  }
}