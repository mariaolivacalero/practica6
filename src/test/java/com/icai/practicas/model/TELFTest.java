package com.icai.practicas.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TELFTest {
    
    @Test
    public void validarTELFtesting(){
        
        //Telefonos validos
        Telefono tlf = new Telefono("927632919");
        assertEquals(true, tlf.validar()); 

        tlf = new Telefono("616604513");
        assertEquals(true, tlf.validar());
        
        //Telefonos no validos

        tlf = new Telefono("ljfc");
        assertEquals(false, tlf.validar());

        tlf = new Telefono("1234");
        assertEquals(false, tlf.validar());

        tlf = new Telefono("1234-");
        assertEquals(false, tlf.validar());

        tlf = new Telefono("33214t539"); 
        assertEquals(false, tlf.validar());



        

        

    }
}