/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.isms.entities;

import java.util.List;

/**
 *
 * @author Administrateur
 */
public class PojoSms {
    
  private List<String> addresses;
  private String senderName,message;

    public PojoSms(List<String> addresses, String senderName, String message) {
        this.addresses = addresses;
        this.senderName = senderName;
        this.message = message;
    }

    public PojoSms() {
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
  
  
}
