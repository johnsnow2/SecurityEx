package ua.danni.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.danni.model.CoursesEntity;
import ua.danni.service.CourseList;

import java.util.List;

/**
 * Created by Artem on 09.04.2016.
 */
@Controller
public class AdminController {

    @Autowired
    CourseList courseList;

 /*   @RequestMapping(value="/admin/list_courses_adm", method = RequestMethod.GET)
    public String helloWorld(ModelMap model) {

        model.addAttribute("coursesList", courseList.loadCoursesAdm());
        return "list_courses_adm";

    }*/

    @RequestMapping(value="/admin/list_courses_adm", method = RequestMethod.GET)
    public ModelAndView listCourses() {

        return new ModelAndView("list_courses_adm","coursesList",courseList.loadCoursesAdm());

    }




    @RequestMapping(value = "/admin/delete/idcourse/{idcourse}", method=RequestMethod.GET)
    public ModelAndView deleteCourse(@PathVariable(value="idcourse") int idcourse) {
        boolean result = courseList.deleteCourse(idcourse);
        return new ModelAndView("redirect:/admin/list_courses_adm");
    }

}
