/**
 *
 * @author <TeephopAlex MacHugh>
 */
package bloodtestschedulerapp;


public class MyPQ implements PQInterface {
    private DLList storage;
    
    public MyPQ() {
        storage = new DLList();
    }
    
    @Override
    public void enqueue(int key, Object element) {
        PQElement newElement = new PQElement(key, element);
        int index = 1;

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
    
    
    @Override
    public Object dequeue() {
        if (storage.isEmpty()) {
            return null;
        }

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
    
    public Object get(int index) {
        return storage.get(index);
    }
}
