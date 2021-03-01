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
public class Event {
    public final static Integer priceHeight = 35;
    public final static Integer priceLow = 32;
    public final static Integer EventType = 50; 
    private String event;
    private Integer nGuests;
    private Integer price;
    private Integer pricexPerson;
    
    public Event() {
        this.event = "A000";
        this.nGuests = 0;
    }

    public Event(String event, Integer nGuests) {
        this.event = event;
        this.nGuests = nGuests;
    }
 
    
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Integer getnGuests() {
        return nGuests;
    }
    public Boolean eventLarge(){
        return this.nGuests >=50;
    }
    public void setnGuests(Integer nGuests) {
        this.nGuests = nGuests;
        if (eventLarge()) {
            this.price = nGuests *priceLow; 
        }else{
            this.price = priceHeight;
        }
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPricexPerson() {
        return pricexPerson;
    }

    public void setPricexPerson(Integer pricexPerson) {
        this.pricexPerson = pricexPerson;
    }
    
}
