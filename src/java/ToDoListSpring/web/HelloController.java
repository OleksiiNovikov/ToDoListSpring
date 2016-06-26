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
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 
import java.io.IOException;
import java.util.Date;
import ToDoListSpring.web.toDoList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;


 
 
public class HelloController implements Controller { 
    protected final Log logger = LogFactory.getLog(getClass()); 
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String today = sdf.format(new Date()).toString();
        
        toDoList list1 = new toDoList();
        list1.addTask("2016-06-21", "Be happy!");
        list1.addTask("2016-06-21", "Say Hello!");
        list1.addTask(today, "Say Hello!");
        list1.addTask(today, "Write code");
        logger.info("Returning hello view with "+ today);
        
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("today", today);
        myModel.put("daytasks", list1.getTasks(today));
        
        return new ModelAndView("hello", "model", myModel);
    } 
}
