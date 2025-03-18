/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author <TeephopAlex MacHugh>
 */
public interface LinearListInterface {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public Object remove(int index);
    public void add (int index, Object element);
    public void printList();
    
}
