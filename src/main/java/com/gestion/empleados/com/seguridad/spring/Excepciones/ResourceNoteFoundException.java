

package com.gestion.empleados.com.seguridad.spring.Excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNoteFoundException extends RuntimeException{
    
    private static final long serialVersionID = 1L;
    
    public ResourceNoteFoundException(String mensaje){
        super(mensaje);
    }

}
