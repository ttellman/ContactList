/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contactlist;

/**
 *
 * @author Tim
 */
public class PersContact extends Contact {
    private String dateB;
    
    public PersContact(String fName, String lName, String emailAdd, String conAdd, String pNum, String type, String dateB){
        super(fName, lName, emailAdd, conAdd, pNum, type);
        this.dateB = dateB; 
    }
    public PersContact(){
        super();
    }
    
    public String getDateB(){
        return dateB;
    }
    public void setDateB(String dateB){
        this.dateB = dateB;
    }
    @Override
    public String toString() {
        return " A Personal Contact was assigned to " +super.toString() + " " + dateB;
    }
}
