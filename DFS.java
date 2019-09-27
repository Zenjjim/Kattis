import java.util.ArrayList;
import java.util.Iterator;

class DFS {

  public static void main(String[] args) {
    Graph g = new Graph(5);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 2);
    g.addEdge(3, 4);
    g.addEdge(4, 2);

    System.out.println(g.toString());

    g.DFS();
  }
}

class Graph {
  LinkedList adj[];
  int V;
  Stack s;
  int G;
  Graph(int v) {
    this.V = v;
    s = new Stack();
    adj = new LinkedList[this.V];
    for (int i = 0; i < this.V; i++) {
      adj[i] = new LinkedList();
    }
  }

  void addEdge(int v, int w) {
    if(v <= this.V){
      adj[v].push(w);
    }
  }

  void setG(int i) {
    this.G = i;
  }

  void DFS(int x) {
    boolean[] visited = new boolean[this.V];
    for(int i = 0; i < this.V; i++){
      if(visited[i] == false ){
        DFSFind(i, visited);
      }
    }
  }

  void DFSFind(int i, boolean[] visited){
    visited[i] = true;
    s.push(i);
    System.out.print(i+" ");
    Node temp = adj[i].head;
    if(i == G){
      System.out.println(s.getStack());
      return;
    }
    while (temp.next != null) {
      temp = temp.next;
      int n = temp.value;
      if (!visited[n]){
          DFSFind(n,visited);
      }
    }
    s.pop();
  }

  public String toString() {
    String s = "";
    for (int i = 0; i < this.V; i++) {
      s += "Node " + i + ": " + adj[i].toString() + "\n";
    }
    return s;
  }
}

class LinkedList {
  Node head;

  public LinkedList() {
  }

  void push(int n) {
    if (this.head == null) {
      this.head = new Node(n);
      return;
    }
    Node temp = this.head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = new Node(n);
  }

  public String toString() {
    Node temp = this.head;
    String s = temp.value + " ";
    while (temp.next != null) {
      temp = temp.next;
      s += temp.toString();
    }
    return s;
  }
}

class Node {
  int value;
  Node next;

  public Node(int v) {
    this.value = v;
  }

  public String toString() {
    return this.value + " ";
  }
}

class Stack {
  ArrayList<Integer> stack;
  Stack(){
    stack = new ArrayList<>();
  }
  void push(int i){
    stack.add(i);
  }
  void pop() {
    stack.remove(stack.size()-1);
  }
  ArrayList<Integer> getStack() {
    return stack;
  }
}