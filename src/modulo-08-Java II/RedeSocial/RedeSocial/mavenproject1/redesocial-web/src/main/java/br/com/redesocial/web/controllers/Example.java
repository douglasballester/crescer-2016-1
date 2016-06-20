package br.com.redesocial.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Carlos H. Nonnemacher
 */
@Controller
public class Example {

    @RequestMapping(value = "/")
    String toIndex(Model model) {
        model.addAttribute("name", "Douglas");
        return "index";
    }

}