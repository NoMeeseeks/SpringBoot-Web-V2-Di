package org.example.springbootwebdi;

import org.example.springbootwebdi.models.dominio.ItemsFactura;
import org.example.springbootwebdi.models.dominio.Producto;
import org.example.springbootwebdi.models.service.IServicio;
import org.example.springbootwebdi.models.service.MiServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    @Primary

    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicio();
    }

    @Bean("itemsFactura")
    public List<ItemsFactura> registrarItems(){

        Producto objProducto1 = new Producto(1,"Calcetines",2.99f);
        Producto objProducto2 = new Producto(2,"Zapatos Prada",9000.99f);
        Producto objProducto3 = new Producto(3,"New Balance 550",49.99f);

        ItemsFactura objItemFactura1 = new ItemsFactura(objProducto1,50);
        ItemsFactura objItemFactura2 = new ItemsFactura(objProducto2,1);
        ItemsFactura objItemFactura3 = new ItemsFactura(objProducto3,250);

//        List<ItemsFactura> itemsFacturaList = new ArrayList<>();
//        itemsFacturaList.add(objItemFactura1);
//        itemsFacturaList.add(objItemFactura2);
//        itemsFacturaList.add(objItemFactura3);

        return Arrays.asList(objItemFactura1,objItemFactura2,objItemFactura3);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemsFactura> registrarItemsOficina(){

        Producto objProducto1 = new Producto(1,"Monitor",59.99f);
        Producto objProducto2 = new Producto(2,"Teclado",10f);
        Producto objProducto3 = new Producto(3,"Macbook pro m3",3500f);

        ItemsFactura objItemFactura1 = new ItemsFactura(objProducto1,90);
        ItemsFactura objItemFactura2 = new ItemsFactura(objProducto2,200);
        ItemsFactura objItemFactura3 = new ItemsFactura(objProducto3,5);

//        List<ItemsFactura> itemsFacturaList = new ArrayList<>();
//        itemsFacturaList.add(objItemFactura1);
//        itemsFacturaList.add(objItemFactura2);
//        itemsFacturaList.add(objItemFactura3);

        return Arrays.asList(objItemFactura1,objItemFactura2,objItemFactura3);
    }
}
