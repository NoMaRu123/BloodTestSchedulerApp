/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author <TeephopAlex MacHugh>
 */
public class Node {
    private Object element;
    private Node next;
    private Node prev;
    
    public Node(Object element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    
    public Object getElement() {
        return element;
    }
    
    public void setElement(Object element) {
        this.element = element;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
    public Node getPrev() {
        return prev;
    }
    
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
