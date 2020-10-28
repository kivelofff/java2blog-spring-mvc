package org.notyourbuisness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
   @RequestMapping("/helloworld")
    public ModelAndView helloWorld() {
        String helloWorldMessage = "Hello world form nobody";
        return new ModelAndView("hello", "message", helloWorldMessage);
    }
}
