package com.hr.securitylab.WebControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/main")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        return "main";
    }


}
