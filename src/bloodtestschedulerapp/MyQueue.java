package bloodtestschedulerapp;

public class MyQueue implements QueueInterface {
    private DLList storage;
    
    public MyQueue() {
        storage = new DLList();
    }
    
    @Override
    public void enqueue(Object element) {
        // For a one-indexed DLList, the new element should be added at index size+1.
        storage.add(storage.size() + 1, element);
    }
    
    @Override
    public Object dequeue() {
        // For a one-indexed DLList, remove the element at index 1 (the head).
        return storage.remove(1);
    }
    
    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }
    
    @Override
    public int size() {
        return storage.size();
    }
    
    // Adjusted get method: valid indices are 1 to size.
    public Object get(int index) {
        return storage.get(index);
    }
}
