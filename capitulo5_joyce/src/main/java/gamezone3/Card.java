/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone3;

/**
 *
 * @author ARCHV
 */
public class Card {
    private char suit;
    private Integer numero;
    public char getSuit() {
        return suit;
    }
    
    public void calcularMayor(Card carta1){
        if (this.numero> carta1.getNumero()) {
            System.out.println("El jugaor gano");
        }else if (this.numero< carta1.getNumero()) {
            System.out.println("El jugador 2 gano");
        }else{
            System.out.println("Empate");
        }
    }
    public void setSuit(char suit) {
        this.suit = suit;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        final int CARDS_IN_SUIT = 13;
        this.numero = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    }
   
    
}
