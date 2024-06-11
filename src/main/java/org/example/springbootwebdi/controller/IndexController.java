package org.example.springbootwebdi.controller;

import org.example.springbootwebdi.models.service.MiServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final MiServicio miServicioService = new MiServicio();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("objeto", miServicioService.operacion());
        return "index";
    }
}
