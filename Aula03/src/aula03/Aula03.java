/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03;

/**
 *
 * @author wesle
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Crystal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 90;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}