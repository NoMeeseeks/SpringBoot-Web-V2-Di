package org.example.springbootwebdi.controller;

import org.example.springbootwebdi.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired //sirve para injectar un objeto en el contenedor de spring
    //@Qualifier("miServicioSimple")
    private IServicio miServicioService;

    /*

    Por constructor se hace de la siguiente manera pero tambien puedes dejarlo sin la etiqueta Autowired ya que spring por defecto lo enlaza

    @Autowired
    public IndexController (IServicio miServicioService){
        this.miServicioService = miServicioService;
    }
     */

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("objeto", miServicioService.operacion());
        return "index";
    }

    /*

    Inyeccion de dependencias via metodo

    @Autowired
    public void setMiServicioService(IServicio miServicioService) {
        this.miServicioService = miServicioService;
    }
     */
}
