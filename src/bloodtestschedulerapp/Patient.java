/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author <TeephopAlex MacHugh>
 */
public class Patient {
    private String name;
    private int priority;  // e.g., lower numbers = higher priority
    private int age;
    private String gpDetails;
    private boolean isFromWard;
    
    public Patient(String name, int priority, int age, String gpDetails, boolean isFromWard) {
        this.name = name;
        this.priority = priority;
        this.age = age;
        this.gpDetails = gpDetails;
        this.isFromWard = isFromWard;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPriority() {
        return priority;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getGpDetails() {
        return gpDetails;
    }
    
    public boolean isFromWard() {
        return isFromWard;
    }
    
    @Override
    public String toString() {
        return "Patient: " + name + ", Priority: " + priority +
               ", Age: " + age + ", GP: " + gpDetails + ", From Ward: " + isFromWard;
    }
}
