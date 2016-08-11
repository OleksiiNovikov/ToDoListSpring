/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoListSpring.web;

/**
 *
 * @author onovikov
 */
public interface ToDoInterface {
    
    // Task should be added to a particular date.
    public void addTask(String date, String task);
    
    // Delete all tasks for the selected date
    public void deleteAllDayTasks(String date);
    
    // Delete a particular task for the date
    public void deleteTask(String date, String task);
    
}
