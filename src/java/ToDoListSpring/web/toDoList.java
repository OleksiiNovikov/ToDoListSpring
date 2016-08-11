/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoListSpring.web;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author onovikov
 */
class toDoList implements ToDoInterface {
    private HashMap<String, ArrayList<String>> tasksMap = new HashMap<String, ArrayList<String>>();
    public String date;
    public String task;
    public static int count = 0;
    public int id;
  
    
    toDoList() {
        id = count;
        System.out.printf("Created object toDoList with id: %d", id);
        count++;
    }
    
    public ArrayList<String> getTasks(String date) {
        return tasksMap.get(date);
    }
    
    @Override
    public void addTask(String date, String task) {
        if(tasksMap.get(date)!= null){
            ArrayList<String> tasks = tasksMap.get(date);
            tasks.add(task);
            tasksMap.put(date, tasks);
        } else{
            ArrayList<String> tasks = new ArrayList<String>();
            tasks.add(task);
            tasksMap.put(date, tasks);
        }   
        
    }

    @Override
    public void deleteAllDayTasks(String date) {
        if(tasksMap.get(date) != null) {
            tasksMap.remove(date);
            System.out.println("All tasks for day: " + date + " have been removed");
        } else {
            System.out.println("Nothing to remove. There are no tasks for day: " + date);
        }
        
    }

    @Override
    public void deleteTask(String date, String task) {
        if(tasksMap.get(date) != null && tasksMap.get(date).contains(task)) {
            tasksMap.get(date).remove(task);
        } else if(tasksMap.get(date).contains(task) == false) {
            System.out.println("Task: " + task + " for the day:" + date + " does not exist!" );
        } else {
            System.out.println("There is no tasks for the date: " + date + "Nothing to delete");
        }
    }
}
