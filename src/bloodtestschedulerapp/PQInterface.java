/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author <TeephopAlex MacHugh>
 */
public interface PQInterface {
    public void enqueue(int key, Object element);
    public int size();
    public boolean isempty();
    public Object dequeue();
    public void printPQueue();
}
