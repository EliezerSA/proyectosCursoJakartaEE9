package org.ezequiel.webapp.jxws.services;

import jakarta.jws.WebService;
import org.ezequiel.webapp.jxws.models.Curso;

import java.util.List;

@WebService
public interface ServicioWs {
    String saludar(String persona);
    List<Curso> listar();
    Curso crear (Curso curso);
}
