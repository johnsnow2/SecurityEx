package ua.danni.controllers;

/**
 * Created by Artem on 28.03.2016.
 */

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.danni.model.CustomUser;


@Controller
public class HomeController {


    @RequestMapping(value="/helloWorld", method = RequestMethod.GET)
    public String helloWorld(ModelMap model) {
        model.addAttribute("message", "Welcome to the Hello World page");
        return "helloWorld";

    }

    @RequestMapping(value="/secured/home", method = RequestMethod.GET)
    public String securedHome(ModelMap model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        CustomUser user=null;
        if (principal instanceof CustomUser) {
            user = ((CustomUser)principal);
        }

        String name = user.getUsername();
        String roleid = user.getFirstName();
        model.addAttribute("username", name);
        model.addAttribute("roleid", roleid);

        model.addAttribute("message", "Welcome to the secured page");
        return "home";

    }

}