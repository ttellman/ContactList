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
public abstract class Contact {
    private String fName;
    private String lName;
    private String emailAdd;
    private String conAdd;
    private String pNum;
    private String type;
    
public Contact (String fName, String lName, String emailAdd, String conAdd, String pNum, String type){
    this.fName = fName;
    this.lName = lName;
    this.conAdd = conAdd;
    this.emailAdd = emailAdd;
    this.pNum = pNum;
    this.type = type;
            
}
public Contact(){
}
public String getFName(){
    return fName;
}
public void setFName(String fName){
    this.fName = fName;
}
public String getLName(){
    return lName;
}
public void setLName(String lName){
    this.lName = lName;
}
public String getEmailAdd(){
    return emailAdd;
}
public void setConAdd(String conAdd){
    this.conAdd = conAdd;
}
public void setEmailAdd(String emailAdd){
    this.emailAdd = emailAdd;
}
public String getConAdd(){
    return conAdd;
}
public String getPnum(){
    return pNum;
}
public void setPNum(String pNum){
    this.pNum = pNum;
}
public String getType(){
    return type;
}
public void setType(String type){
    this.type = type;
}
@Override
public String toString() {
    return fName + " " + lName + " " + emailAdd + " " + conAdd + " " + pNum + " " ;
}
}
