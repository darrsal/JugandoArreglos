/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*Probando webhook*/

package itszn.edu.mx.jugandoarreglos;

/**
 *
 * @author Darre
 */
public class JugandoArreglos {

    public static void main(String[] args) {
        OperacionesArreglos op=new OperacionesArreglos();
        
        float[] pesos={12f, 45f, 3.5f};
        
        float sum=op.calcularSuma(pesos);
        System.out.println("La suma es "+sum);
    }
}
