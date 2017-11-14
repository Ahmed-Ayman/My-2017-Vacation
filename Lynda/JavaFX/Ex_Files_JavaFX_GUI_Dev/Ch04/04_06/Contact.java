/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displaycontactlist;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Peggy Fisher
 */
public class Contact {
    
 private final SimpleStringProperty firstName = new SimpleStringProperty("");
 private final SimpleStringProperty lastName = new SimpleStringProperty("");
 private final SimpleStringProperty cellPhone= new SimpleStringProperty("");

public Contact() {
        this("", "", "");
    }
 
    public Contact(String firstName, String lastName, String cellPhone) {
        setFirstName(firstName);
        setLastName(lastName);
        setCellPhone(cellPhone);
    }

    public String getFirstName() {
        return firstName.get();
    }
 
    public void setFirstName(String fName) {
        firstName.set(fName);
    }
        
    public String getLastName() {
        return lastName.get();
    }
    
    public void setLastName(String fName) {
        lastName.set(fName);
    }
    
    public String getCellPhone() {
        return cellPhone.get();
    }
    
    public void setCellPhone(String cell) {
       cellPhone.set(cell);
    }
  
}

