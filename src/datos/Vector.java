/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.Random;

/**
 *
 * @author Jhon
 */
public class Vector {
    private int[] vector =new int[0];
    private int longitud=0;
    public Vector(){
        
    }
    public Vector(int longitud){
        this.longitud = longitud;
        vector = new int[longitud];
    }
    public int longitud(){
        return longitud;
    }
    public void cargarAleatoriamente(int cantidad){
        vector = new int[cantidad];
        longitud=cantidad;
        int elemento;
        Random randon = new Random();
        for(int i=0;i< longitud; i++){
            elemento = randon.nextInt(50);
            vector[i]=elemento;
        }
    }
    public void mostrar(){
        String s = "";
        for (int i =0;i<longitud;i++){
            s += vector[i] + " ";
        }
        System.out.println("Vector =["+s+"]");
    }
    public static void  main(String[] args){
        Vector v = new Vector();
        v.cargarAleatoriamente(10);
        v.mostrar();
    }
}
