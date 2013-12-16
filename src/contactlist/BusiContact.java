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
public class BusiContact  extends Contact{
    private String jTitle;
    private String org;
    
    public BusiContact(String fName, String lName, String emailAdd, String conAdd, String pNum, String type, String jTitle, String org ){
        super(fName, lName, emailAdd, conAdd, pNum, type);
        this.jTitle = jTitle;
        this.org = org;
    }
    public BusiContact(){  
    }
    public String getJTitle(){
        return jTitle;
    }
    public void setJTitle(String jTitle){
        this.jTitle = jTitle;
    }
    public String getOrg(){
        return org;
    }
    public void setOrg(String org){
        this.org = org;
    }
    @Override
    public String toString(){
        return " A Business Contact was assigned to " +super.toString() + " " + jTitle + " " + org;
    }
            
    
    
}
