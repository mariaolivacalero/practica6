package com.icai.practicas.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class DNITest {
    
    @Test
    public void validarDNItesting(){
        
        //DNIS validos
        DNI dni = new DNI("45132222N");
        assertEquals(true, dni.validar()); 

        dni = new DNI("45132223J");
        assertEquals(true, dni.validar());

        dni = new DNI("45132224Z");
        assertEquals(true, dni.validar());



        //DNIs no validos
        dni = new DNI("00000000T");
        assertEquals(false, dni.validar());

        dni = new DNI("1234");
        assertEquals(false, dni.validar());

        dni = new DNI("85532@");
        assertEquals(false, dni.validar());

        dni = new DNI("E342138388");
        assertEquals(false, dni.validar());

        dni = new DNI("123456789");
        assertEquals(false, dni.validar());

        



        





        
    }
}
