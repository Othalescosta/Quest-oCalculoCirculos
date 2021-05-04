/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.prova;

import java.util.Scanner;

/**
 *
 * @author th4le
 */
public class QuestãoProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner (System.in);
        double pi=3.14;
        
        System.out.println("Digite o Radio:");
        double radio=scn.nextDouble ();
        
        double diametro=2*radio;
        double perimetro=2*radio*pi;
        double area=pi*Math.pow(radio, 2);
        
        System.out.println("Diametro: "+diametro+"\nPerimetro: "+perimetro+"\narea: "+area);
        
        
        
        
        
        
        
    }
    
}
