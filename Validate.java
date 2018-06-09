package com.example.yifeizhao.password_validator;

public class Validate {
    String password;
    int count;

    public Validate(String s){
        password=s;
        count=s.length();
    }

    public int length(){
        if(count>=8){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int same(){
        if(password.equals("password")){
            return 0;
        }
        else{
            return 1;
        }
    }

    public int numberPassed(){
        return same()+length();
    }
}
