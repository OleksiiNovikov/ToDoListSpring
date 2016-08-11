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
import ToDoListSpring.web.toDoList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ToDoListInstance {
    public toDoList taskList;
    
    public  void main(String[] args) {
        taskList = new toDoList();
        taskList.addTask("2016-06-21", "Say Hello!");
        taskList.addTask("2016-06-21", "Be happy!");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sdf.format(new Date()).toString();
    
        taskList.addTask(today, "Say Hello!");
        taskList.addTask(today, "Write code");
        this.taskList = taskList;
        //taskList.deleteAllDayTasks(today);
        System.out.println(taskList.getTasks(today));
    }
    public toDoList listTasks(){
        return taskList;
    }
    
}
