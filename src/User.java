/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author InfoEnum-1010
 */
class User {
   private int sno;
   private  String username, password;
    public User(int sno, String username,String password){
        this.sno=sno;
        this.username= username;
        this.password= password;
        
    }
    public int getsno(){
        return sno;
        
    }
    public String getusername(){
        return username;
        
    }
    public String getpassword(){
        return password;
        
    }
    
}
