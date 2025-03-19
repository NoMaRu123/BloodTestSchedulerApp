package bloodtestschedulerapp;

import javax.swing.SwingUtilities;

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
    
    // Main method launches the GUI instead of a console-based version.
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new BTSApp().setVisible(true);
            }
        });
    }
}
