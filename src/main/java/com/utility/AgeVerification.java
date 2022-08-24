package com.utility;

import com.Exception.InvalidAgeException;
import com.data.User;

public class AgeVerification {
    public boolean isValidAge(User user,int minimumAge)throws InvalidAgeException{
        if (user.getAge()<user.MINIMUM_AGE){
            throw new InvalidAgeException("your age less to use  social media");
        }else {
            return true;

        }
    }
}
