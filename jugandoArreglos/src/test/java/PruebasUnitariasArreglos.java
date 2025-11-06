/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itszn.edu.mx.jugandoarreglos.OperacionesArreglos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Darre
 */
public class PruebasUnitariasArreglos {
    
    public PruebasUnitariasArreglos() {
    }
    
    private OperacionesArreglos  opa;
    
    @BeforeEach
    public void setUp() {
        opa=new OperacionesArreglos();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void pruebaSuma1(){
        float[] entrada={10f,15f,10f};
        float salidaEsperada=35f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaSuma2nulo(){
        float[] entrada=null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada, salidaReal);
    }
}
