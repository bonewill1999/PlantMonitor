package com.example.johnnybahama.plantmonitor;

public class Profile {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;


    public Profile(){

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastNameName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }


    public boolean checkPassword(String password){
        return true;
    }


}
