/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author <TeephopAlex MacHugh>
 */
public class MyPQ implements PQInterface {
    private DLList storage;
    
    public MyPQ() {
        storage = new DLList();
    }
    
    /**
     * Inserts a new PQElement in order based on its key.
     * Lower key values have higher priority.
     */
    @Override
    public void enqueue(int key, Object element) {
        PQElement newElement = new PQElement(key, element);
        int index = 1; // start at the beginning (1-indexed)
        
        // Traverse the list until we find a node with a higher key value
        // (i.e., a lower priority) or reach the end of the list.
        while (index <= storage.size()) {
            PQElement current = (PQElement) storage.get(index);
            if (newElement.getPriority() < current.getPriority()) {
                break;
            }
            index++;
        }
        // Insert the new element at the found position.
        storage.add(index, newElement);
    }
    
    /**
     * Removes and returns the element with the highest priority.
     * Since the list is sorted, this is always at index 1.
     */
    @Override
    public Object dequeue() {
        if (storage.isEmpty()) {
            return null;
        }
        // Retrieve the highest priority element (first element in the list)
        PQElement highest = (PQElement) storage.get(1);
        storage.remove(1);
        return highest.getElement();
    }
    
    @Override
    public int size() {
        return storage.size();
    }
    
    public boolean isEmpty() {
        return storage.isEmpty();
    }
    
    @Override
    public void printPQueue() {
        if (storage.isEmpty()) {
            System.out.println("Priority Queue is Empty");
        } else {
            System.out.println("Priority Queue:");
            for (int i = 1; i <= storage.size(); i++) {
                System.out.println(storage.get(i));
            }
        }
    }

    @Override
    public boolean isempty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
