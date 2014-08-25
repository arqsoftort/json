/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsontest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Usuario
 */
public class JSONTest {

    public static void main(String[] args) {
        // Creamos un objeto A para serializarlo en formato JSON
        ObjetoA a = new ObjetoA();
        a.setNombre("Prueba JSON");
        a.setNumero(12321);
        
        // Creamos un ObjetoB para que pertenezca al ObjetoA
        ObjetoB b = new ObjetoB();
        b.setAtt1("PRUEBA OBJETOS");
        b.setAtt2(123);
        b.setAtt3(true);
        a.setObjetoB(b);
        
        // Creamos una instancia del serializador
        Gson transformer = new GsonBuilder().create();
        // Serializamos el objeto en formato JSON
        String objetoSerializado = transformer.toJson(a);
        System.out.println(objetoSerializado);
        
        // Ahora transformaremos el string en formato JSON en un objeto 
        // para poder obtener el valor de sus atributos
        ObjetoA objeto = transformer.fromJson(objetoSerializado, ObjetoA.class);
        System.out.println(objeto.getNombre());
        
    }
}
