/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class RandomGuess2 {
   private Integer aleatorio;
   private Integer pronostic;
   Scanner sc = new Scanner(System.in);
   
   public void jugar (){
       setAleatorio();
       System.out.println("tu numero aleatorio es : "+getAleatorio());
       System.out.println("Escribe un nuevo numero: "); 
       pronostic = sc.nextInt();
       if (pronostic == getAleatorio ()) {
           System.out.println("Correcto");
       }else{
           if (pronostic > getAleatorio()) {
               System.out.println(" Muy alto");
           }else{
               System.out.println("Muy bajo");
           }
       }
   } 
   


    public Integer getPronostic() {
        return pronostic;
    }

    public void setPronostic() {
        this.pronostic = pronostic;
    }

    public Integer getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio() {
        this.aleatorio = (int) (Math.random()*100+1);
    }
}
