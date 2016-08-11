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
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    protected final Log logger = LogFactory.getLog(getClass());
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        Map<String, Object> myModel = new HashMap<>();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sdf.format(new Date()).toString();
        myModel.put("today", today);
        return new ModelAndView("hello", "model", myModel);
    }
    
    @RequestMapping(value = "/resultViewTasks", method = RequestMethod.GET)
    public ModelAndView resultViewTasks(@PathVariable(value="date") String date, ModelMap model) {
        //model.addAttribute("date", date);//ToDoListInstance.taskList.getTasks(date));
        Map<String, Object> myModel1 = new HashMap<>();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sdf.format(new Date()).toString();
        myModel1.put("date", today);
        return new ModelAndView("resultViewTasks", "model", myModel1);    
    }

}
 
/*
public class HelloController implements Controller { 
    protected final Log logger = LogFactory.getLog(getClass()); 
    /*
    @RequestMapping(value = "/resultViewTasks", method = RequestMethod.GET, params={"date"})
    public ModelAndView getTasks(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="date") String date) {
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("tasks", ToDoListInstance.returnList().getTasks(date));
        return new ModelAndView("resultViewTasks", "model", myModel);
    }*/
    /*
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sdf.format(new Date()).toString();
        ArrayList<String> tasks;
        //tasks = ToDoListInstance.taskList.getTasks(today);
        logger.info("Returning hello view with "+ today);
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("today", today);
        myModel.put("tasks", "tasks");
        //logger.info(taskList);
        return new ModelAndView("hello", "model", myModel);
    } 
    
}*/
