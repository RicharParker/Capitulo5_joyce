/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems1;

/**
 *
 * @author ARCHV
 */
public class EventDemo {
    public static void main(String[] args) {
        Event evento1 = new Event();
        Event evento2 = new Event();
        evento1.setnGuests(45);
        System.out.println(evento1.eventLarge());
        evento2.setnGuests(35);
        System.out.println(evento2.eventLarge());
    }
}
