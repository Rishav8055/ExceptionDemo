package main;

import com.Exception.InvalidAgeException;
import com.data.User;
import com.utility.AgeVerification;

public class SocialMediaMain {
    public static void main(String[] args) {
        User user = new User("rishav",20);
        AgeVerification ageVerification = new AgeVerification();
        try {
            ageVerification.isValidAge(user,User.MINIMUM_AGE);
            System.out.println("name ="+user.getName());
            System.out.println("age = "+user.getAge());
        }catch (InvalidAgeException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}