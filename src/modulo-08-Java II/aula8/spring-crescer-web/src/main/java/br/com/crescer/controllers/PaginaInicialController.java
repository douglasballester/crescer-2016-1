package br.com.crescer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DOUGLAS
 */
@Controller
@RequestMapping("/")
public class PaginaInicialController {
    @RequestMapping(method = RequestMethod.GET)
    public String PaginaInicial(){
    
    return "index";
    }
}
