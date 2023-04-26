package org.ezequiel.clientews;

import org.ezequiel.webapp.jxws.services.Curso;
import org.ezequiel.webapp.jxws.services.ServicioWs;
import org.ezequiel.webapp.jxws.services.ServicioWsImplService;

public class Main {
    public static void main(String[]args){

        ServicioWs service = new ServicioWsImplService().getServicioWsImplPort();
        System.out.println("el saludo: " + service.saludar("Ezequiel"));

        Curso curso = new Curso();
        curso.setNombre("angular");
        Curso respuesta = service.crear(curso);
        System.out.println("nuevo curso: " + curso.getNombre());

        service.listar().forEach(curso1 -> System.out.println(curso.getNombre()));

        //Webservices con Restful JAX RS RESTEasy con HTTP
        
    }
}
