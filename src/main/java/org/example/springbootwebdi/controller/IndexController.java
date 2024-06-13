package org.example.springbootwebdi.controller;

import org.example.springbootwebdi.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired //sirve para injectar un objeto en el contenedor de spring
    private IServicio miServicioService;


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("objeto", miServicioService.operacion());
        return "index";
    }
}
