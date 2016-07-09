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
class toDoList{
    private HashMap<String, ArrayList<String>> tasksMap = new HashMap<String, ArrayList<String>>();
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
    
    public void addTask(String date, String task) {
        if(tasksMap.get(date)!= null){
            ArrayList<String> tasks = tasksMap.get(date);
            tasks.add(task);
            tasksMap.put(date, tasks);
        } else{
            ArrayList<String> lists = new ArrayList<String>();
            lists.add(task);
            tasksMap.put(date, lists);
        }
        
    }
}
