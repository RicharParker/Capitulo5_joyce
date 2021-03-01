/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

/**
 *
 * @author ARCHV
 */
public class TwoDice2 {
    public static void main(String[] args) {
        Die dado1 = new Die();
        Die dado2 = new Die();
        
        dado1.lanzar();
        dado2.lanzar();
        if (dado1.getCara()==dado2.getCara()) {
            System.out.println("Ha sido un empate");
        }else if (dado1.getCara()>dado2.getCara()) {
            System.out.println("dado 1 es mayor");
        } else {
            System.out.println("dado 2 es mayor");
        }

    }

}
