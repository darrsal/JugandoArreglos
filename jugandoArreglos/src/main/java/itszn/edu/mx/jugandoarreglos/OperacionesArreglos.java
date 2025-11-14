package itszn.edu.mx.jugandoarreglos;

public class OperacionesArreglos {

    public float calcularSuma(float[] num) {
        if(num==null)
            return 0f;
        
        float suma = 0f;
        
        //Recorrer el arreglo
        for (int i = 0; i < num.length; i++) {
            suma = suma + num[i];
        }
        return suma;
        
    }
    
}
