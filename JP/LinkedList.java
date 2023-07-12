class Node{
  Node next;
  int data;
  Node(int data){
    this.data = data;
    next = null;
  }
}

public class LinkedList{
  Node head;
  public static LinkedList insert(LinkedList list, int data){
    Node new_node = new Node(data);
    new_node.next = null;
    if(list.head == null){
      list.head = new_node;
    }
    else{
      Node last = list.head;
      while(last.next != null){
        last = last.next;
      }
      last.next = new_node;
    }
    return list;
  }

  public static void main(String args[]){
    LinkedList list = new LinkedList();
    list = insert(list,1);
    list = insert(list,2);
    list = insert(list,3);
    list = insert(list,4);
    list = insert(list,5);
    list = insert(list,6);
    list = insert(list,7);
    list = insert(list,8);
    printList(list);
  }

  public static void printList(LinkedList list){
    System.out.println("Ajay \n 2820052");
    Node currNode = list.head;
    while(currNode != null){
      System.out.print(currNode.data);
      System.out.print(" ");
      currNode = currNode.next;
    }
  }
}
