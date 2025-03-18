package bloodtestschedulerapp;

public class BloodTestSchedulerApp {
    private PQInterface priorityQueue;
    private QueueInterface noShowQueue;
    
    public BloodTestSchedulerApp() {
        // Replace MyPQ with the actual concrete class name for your priority queue
        priorityQueue = new MyPQ();
        noShowQueue = new MyQueue();
    }
    
    // Add a new patient to the scheduler
    public void addPatient(Patient patient) {
        // Enqueue the patient into the priority queue based on their priority
        priorityQueue.enqueue(patient.getPriority(), patient);
    }
    
    // Retrieve the next patient (based on priority)
    public Patient nextPatient() {
        return (Patient) priorityQueue.dequeue();
    }
    
    // Mark a patient as a no-show
    public void markNoShow(Patient patient) {
        // If the no-show queue already has 5 patients, remove the oldest one
        if (noShowQueue.size() >= 5) {
            noShowQueue.dequeue();
        }
        noShowQueue.enqueue(patient);
    }
    
    // Print the current state of the priority queue
    public void printPriorityQueue() {
        System.out.println("Priority Queue Content:");
        priorityQueue.printPQueue();  // This method should be implemented in your MyPQ class.
    }
    
    // Get the size of the no-show queue
    public int getNoShowQueueSize() {
        return noShowQueue.size();
    }
    
    public static void main(String[] args) {
        // Create an instance of the scheduler
        BloodTestSchedulerApp scheduler = new BloodTestSchedulerApp();
        
        // Add sample patients to the scheduler
        scheduler.addPatient(new Patient("Alice", 2, 30, "Dr. Smith", false));
        scheduler.addPatient(new Patient("Bob", 1, 65, "Dr. Jones", true));
        scheduler.addPatient(new Patient("Charlie", 3, 45, "Dr. Taylor", false));
        scheduler.addPatient(new Patient("Diana", 1, 55, "Dr. White", false));
        scheduler.addPatient(new Patient("Eve", 2, 40, "Dr. Green", true));
        
        // Display the initial state of the priority queue
        System.out.println("=== Initial Priority Queue ===");
        scheduler.printPriorityQueue();
        
        // Retrieve and display the next patient (highest priority)
        Patient nextPatient = scheduler.nextPatient();
        System.out.println("\nNext patient to be served: " + nextPatient);
        
        // Mark the served patient as a no-show
        scheduler.markNoShow(nextPatient);
        System.out.println("Marked as no-show: " + nextPatient);
        
        // Display the updated state of the priority queue
        System.out.println("\n=== Priority Queue After Serving One Patient ===");
        scheduler.printPriorityQueue();
        
        // Display the current no-show queue size
        System.out.println("\nNo-show Queue Size: " + scheduler.getNoShowQueueSize());
    }
}
