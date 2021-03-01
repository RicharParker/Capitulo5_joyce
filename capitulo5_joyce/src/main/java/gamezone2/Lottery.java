/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author ARCHV
 */
public class Lottery {
    private Integer one ;
    private Integer two;
    private Integer three;

    public Lottery() {
      this.one =(int) (Math.random()*9+1);
      this.three = (int) (Math.random()*9+1);
      this.three = (int) (Math.random()*9+1);
    }
   
    
    public void jugar (Integer a, Integer b, Integer c){
       if ((a == this.one)&&(b == this.two)&&(c == this.three)) {
            System.out.println("Ganste 1,000,000");
        }else if(((a==this.two)||(a==this.three)) && ((b==this.one)||(b==this.three))&&((c==this.one)||(c==this.two))){
            System.out.println("Ganaste 1000");
        }else if ((a==this.one)||(a==this.three)||(a==this.two)) {
            if ((b==this.one)||(b==this.two)||(b==this.three)) {
                System.out.println("Ganaste 100");
            }else if ((c==this.one)||(c== this.two)||(c==this.three))  {
                System.out.println("Ganaste 100");
            }else{
                System.out.println("Has ganado 10");
            }
            }else if ((b==this.one)||(b==this.two)||(c==this.three)){
                System.out.println("Ganste 10");
            }else if ((c==this.one||(c==this.two)||(c==this.three)))  {
                System.out.println("Ganaste 10");
            }else{
                System.out.println("No has ganado nada");
            }
        }
    


    
        
}
