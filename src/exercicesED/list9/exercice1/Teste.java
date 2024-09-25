package exercicesED.list9.exercice1;
// class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// class LinkedList {
// Node head;

// public void addElement(int position, int data) {
// head = addElementRecursive(head, position, data);
// }

// private Node addElementRecursive(Node current, int position, int data) {
// if (position == 0) {
// Node newNode = new Node(data);
// newNode.next = current;
// return newNode;
// }

// if (current == null) {
// throw new IndexOutOfBoundsException("Position out of bounds");
// }

// current.next = addElementRecursive(current.next, position - 1, data);
// return current;
// }

// public void displayList() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }
// }

// public class Main {
// public static void main(String[] args) {
// LinkedList list = new LinkedList();

// list.addElement(0, 10); // Add element 10 at position 0
// list.addElement(1, 20); // Add element 20 at position 1
// list.addElement(2, 30); // Add element 30 at position 2

// list.displayList(); // Output: 10 20 30
// }
// }