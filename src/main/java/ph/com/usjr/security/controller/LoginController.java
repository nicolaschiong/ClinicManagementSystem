package ph.com.usjr.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Nick on 31/01/2018.
 */

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login (ModelAndView modelAndView){

        modelAndView.setViewName("login");

        return modelAndView;
    }
}
