/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

public class DLList implements LinearListInterface {
    private Node head;
    private Node last;
    private Node curr;
    private int size;
    
    public DLList() {
        head = null;
        last = null;
        curr = head;
        size = 0;
    }
    
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
    
    @Override
    public int size() {
        return size;
    }
    
    // Sets 'curr' to the node at the given 1-based index.
    private void setCurrent(int index) {
        if(index < 1 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        curr = head; // Start at the head
        for (int i = 1; i < index; i++) {
            curr = curr.getNext();
        }
    }
    
    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr.getElement();
    }
    
    @Override
    public void add(int index, Object element) {
        if(index < 1 || index > size + 1) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node newNode = new Node(element, null, null);
        
        if (size == 0) {  // If the list is empty
            head = newNode;
            last = newNode;
        } else if (index == 1) { // Insert at the beginning
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else if (index == size + 1) { // Insert at the end
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        } else { // Insert in the middle
            setCurrent(index);
            newNode.setNext(curr);
            Node previous = curr.getPrev();
            newNode.setPrev(previous);
            previous.setNext(newNode);
            curr.setPrev(newNode);
        }
        size++; // Increase the list size
    }
    
@Override
public Object remove(int index) {
    if (index < 1 || index > size) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
    Object removedElement = null;
    
    if (index == 1) {
        // Removing the head
        removedElement = head.getElement();
        if (size == 1) { // Only one node exists
            head = null;
            last = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    } else if (index == size) {
        // Removing the last node
        removedElement = last.getElement();
        last = last.getPrev();
        last.setNext(null);
    } else {
        // Removing a node in the middle
        setCurrent(index);
        removedElement = curr.getElement();
        Node previous = curr.getPrev();
        Node next = curr.getNext();
        previous.setNext(next);
        next.setPrev(previous);
    }
    size--; // Decrement the list size
    return removedElement;
}

    
    @Override
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        System.out.println("Elements in the list (forward): ");
        Node current = head;
        int position = 1;
        while (current != null) {
            System.out.println("Node " + position + ": " + current.getElement());
            current = current.getNext();
            position++;
        }
    }
    
    // New method: print the list in reverse order
    public void printListBackward() {
        if (last == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        System.out.println("Elements in the list (backward): ");
        Node current = last;
        int position = size;
        while (current != null) {
            System.out.println("Node " + position + ": " + current.getElement());
            current = current.getPrev();
            position--;
        }
    }
}

