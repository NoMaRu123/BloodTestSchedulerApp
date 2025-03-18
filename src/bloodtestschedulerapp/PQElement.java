/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author <TeephopAlex MacHugh>
 */
public class PQElement {
    private int priority;
    private Object element;
    
    public PQElement(int priority, Object e){
        this.priority = priority;
        element = e;
    }

    public int getPriority() {
        return priority;
    }

    public Object getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "Element: " + element.toString() + ",Priority: " + priority;
    }
}
