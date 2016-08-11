/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoListSpring.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author onovikov
 */
public class viewTasksController {
    @RequestMapping(value = "/resultViewTasks", method = RequestMethod.GET, params={"date"})
    public String getTasks(@ModelAttribute("date")String date, ModelMap model) {

    model.addAttribute("date", date);//ToDoListInstance.taskList.getTasks(date));
    return "resultViewTasks";
    }
    
}
