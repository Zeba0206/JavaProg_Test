package com.stackroute.tdd;

public class UpperCase {
    String name="zeba";

    public String stringDemo()
    {
        String name1= name.toUpperCase();
        return name;
    }
     public boolean checkNull(){

        if(name.equals(" ")){
            return false;
        }
        else{
            return true;
        }
     }

}
