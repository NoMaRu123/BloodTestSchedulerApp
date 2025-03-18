package bloodtestschedulerapp;

public class MyQueue implements QueueInterface {
    private DLList storage;
    
    public MyQueue() {
        storage = new DLList();
    }
    
    @Override
    public void enqueue(Object element) {
        // Enqueue by adding at the end (tail) of the list.
        // Assuming DLList is 0-indexed, we add at index equal to the current size.
        storage.add(storage.size(), element);
    }
    
    @Override
    public Object dequeue() {
        // Dequeue by removing from the front (head) of the list.
        // If the list is empty, DLList.remove(0) should handle that or return null.
        return storage.remove(0);
    }
    
    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }
    
    @Override
    public int size() {
        return storage.size();
    }
}
