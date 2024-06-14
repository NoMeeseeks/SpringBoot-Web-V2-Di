package org.example.springbootwebdi.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("miServicioComplejo")
@Primary
public class MiServicioComplejo implements IServicio{

    //es una singelton y se crea una sola vez
    public String operacion(){
        //el service interactuo con el dao
        //puede interactuar con repository
        return "Ejecutando alugn proceso del crud complicado";
    }
}
