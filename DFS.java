import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class DFS {

  public static void main(String[] args) {
    Graph g = new Graph(4);
    g.addEdge(0, 3);
    g.addEdge(1, 2);
    g.addEdge(2, 3);
    g.addEdge(1, 0);
    g.addEdge(2, 1);
    g.addEdge(3, 2);

    g.setG(3);
    g.DFS(1);
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
      if (v <= this.V) {
        adj[v].push(w);
      }
    }

    void setG(int i) {
      this.G = i;
    }

    void DFS(int x) {
      boolean[] visited = new boolean[this.V];
      if (visited[x] == false) {
        DFSFind(x, visited);
      }
    }
    void DFSFind(int i, boolean[] visited) {
      visited[i] = true;
      s.push(i);
      System.out.print(i + " ");
      Node temp = adj[i].head;
      if (i == G) {
        System.out.println("dab");
        System.out.println(s.getStack());
        return;
      }
      while (temp != null) {
        int n = temp.value;
        temp = temp.next;
        if (!visited[n]) {
          DFSFind(n, visited);
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

  Stack() {
    stack = new ArrayList<>();
  }

  void push(int i) {
    stack.add(i);
  }

  void pop() {
    stack.remove(stack.size() - 1);
  }

  ArrayList<Integer> getStack() {
    return stack;
  }
}