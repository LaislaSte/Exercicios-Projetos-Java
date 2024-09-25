package exercicesED.util;

import util.No;

class LinkedList {
    No<Livro> head;

    // Method to add an element at the beginning of the list
    void addAtBeginning(Livro data) {
        No<Livro> newNode = new No<>(data);
        newNode.setNext(head);
        head = newNode;
    }

    // Method to add an element at any position in the list
    void addAtPosition(Livro data, int position) {
        // If position is invalid, return
        if (position < 0 || position > getSize()) {
            System.out.println("Invalid position");
            return;
        }

        head = addAtPositionRecursive(head, data, position);
    }

    // Recursive method to add an element at any position in the list
    No<Livro> addAtPositionRecursive(No<Livro> current, Livro data, int position) {
        // Base case: if position is 0, insert the new node
        if (position == 0) {
            No<Livro> newNode = new No<Livro>(data);
            newNode.setNext(current);
            return newNode;
        }

        // If position is not 0, recursively traverse the list
        current.setNext(addAtPositionRecursive(current.getNext(), data, position - 1));
        return current;
    }

    // Method to calculate the size of the list
    int getSize() {
        int count = 0;
        No<Livro> current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // Method to display the elements of the list
    void display() {
        No<Livro> current = head;
        while (current != null) {
            System.out.print(current.getBegin() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtBeginning(new Livro("a", 1));
        list.addAtBeginning(new Livro("b", 1));
        list.addAtBeginning(new Livro("c", 1));
        list.addAtBeginning(new Livro("d", 1));
        list.addAtPosition(new Livro("e", 1), 2);
        list.addAtPosition(new Livro("f", 1), 1);
        list.display(); // Output: a e b c d
    }

}

// class No<Livro> {
// int data;
// No prev;
// No next;

// public No(int data) {
// this.data = data;
// this.prev = null;
// this.next = null;
// }
// }

// class DoublyLinkedList {
// No head;

// // Add element at any position
// void addElement(int data, int position) {
// if (position < 1 || position > getSize() + 1) {
// System.out.println("Invalid position.");
// return;
// }

// Node newNode = new Node(data);

// // If list is empty or position is 1, add at the beginning
// if (head == null || position == 1) {
// addBegin(newNode);
// return;
// }

// addElementRecursive(newNode, head, position);
// }

// // Recursive method to add element at any position
// void addElementRecursive(Node newNode, Node currentNode, int position) {
// if (position == 1) {
// newNode.next = currentNode;
// newNode.prev = currentNode.prev;
// currentNode.prev.next = newNode;
// currentNode.prev = newNode;
// return;
// }

// addElementRecursive(newNode, currentNode.next, position - 1);
// }

// // Add element at the beginning
// void addBegin(Node newNode) {
// if (head == null) {
// head = newNode;
// } else {
// newNode.next = head;
// head.prev = newNode;
// head = newNode;
// }
// }

// // Get size of the list
// int getSize() {
// int size = 0;
// Node temp = head;
// while (temp != null) {
// size++;
// temp = temp.next;
// }
// return size;
// }

// // Display the list
// void displayList() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// System.out.println();
// }
// }

// public class Main {
// public static void main(String[] args) {
// DoublyLinkedList list = new DoublyLinkedList();

// list.addElement(10, 1); // Adding 10 at position 1
// list.addElement(20, 2); // Adding 20 at position 2
// list.addElement(30, 2); // Adding 30 at position 2
// list.addElement(40, 3); // Adding 40 at position 3

// list.displayList(); // Output: 10 30 40 20
// }
// }