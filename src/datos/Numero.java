/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author Jhon
 */
public class Numero {
    int nro;

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    public int sumaDigitos(){
        int nroAux=nro;
        int suma=0;
        int residuo;
        while(nroAux>0){
            residuo=nroAux%10;
            suma += residuo;
            nroAux=nroAux/10;                    
        }
        return suma;        
    }
    public static void main(String[] args){
        Numero n =new Numero();
        n.setNro(1234);
        System.out.println("Suma: "+n.sumaDigitos());
    }
}
