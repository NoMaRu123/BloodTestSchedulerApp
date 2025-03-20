package bloodtestschedulerapp;

import javax.swing.SwingUtilities;

/** Main app for managing patients with priority and no-show queues. */
public class BloodTestSchedulerApp {
    private PQInterface priorityQueue;
    private QueueInterface noShowQueue;
    
    /** Initializes the queues. */
    public BloodTestSchedulerApp()  {
        priorityQueue = new MyPQ();
        noShowQueue = new MyQueue();
    }
    
    /** Adds a patient to the priority queue. */
    public void addPatient(Patient patient) {
        priorityQueue.enqueue(patient.getPriority(), patient);
    }
    
    /** Retrieves and removes the next patient from the priority queue. */
    public Patient nextPatient() {
        return (Patient) priorityQueue.dequeue();
    }
    
    /** Marks a patient as a no-show (max 5 in the no-show queue). */
    public void markNoShow(Patient patient) {
        if (noShowQueue.size() >= 5) {
            noShowQueue.dequeue();
        }
        noShowQueue.enqueue(patient);
    }
    
    /** Returns a string of the current priority queue. */
    public String printPriorityQueue() {
        StringBuilder sb = new StringBuilder();
        sb.append("Priority Queue Content:\n");
        
        MyPQ pq = (MyPQ) priorityQueue;
        int n = pq.size();
        if (n == 0) {
            sb.append("No patients in the priority queue.\n");
        } else {
            for (int i = 1; i <= n; i++) {
                PQElement elem = (PQElement) pq.get(i);
                Patient p = (Patient) elem.getElement();
                sb.append("Patient: " + p.getName() + ", Priority: " + elem.getPriority() + "\n");
            }
        }
        return sb.toString();
    }
    
    /** Returns a string of the no-show queue. */
    public String getNoShowQueueString() {
        StringBuilder sb = new StringBuilder();
        sb.append("No-Show Patient List:\n");
        
        MyQueue mq = (MyQueue) noShowQueue;
        int n = mq.size();
        if (n == 0) {
            sb.append("No patients in the no-show queue.\n");
        } else {
            for (int i = 1; i <= n; i++) {
                Patient p = (Patient) mq.get(i);
                sb.append("Patient: " + p.getName() + ", Priority: " + p.getPriority() + "\n");
            }
        }
        return sb.toString();
    }
    
    /** Returns the number of patients in the no-show queue. */
    public int getNoShowQueueSize() {
        return noShowQueue.size();
    }
    
    /** Recursively searches for a patient by name. */
    public Patient searchPatientByName(String name) {
        MyPQ pq = (MyPQ) priorityQueue;
        return searchPatientByNameRecursive(pq, name, 1);
    }

    private Patient searchPatientByNameRecursive(MyPQ pq, String name, int index) {
        if (index > pq.size()) {
            return null;
        }
        PQElement elem = (PQElement) pq.get(index);
        Patient p = (Patient) elem.getElement();
        if (p.getName().equalsIgnoreCase(name)) {
            return p;
        } else {
            return searchPatientByNameRecursive(pq, name, index + 1);
        }
    }
    
    /** Launches the GUI. */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new BTSGUI().setVisible(true);
            }
        });
    }
}
