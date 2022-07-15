package summerClasses.BusTicketSystem;

import java.util.ArrayList;
import java.util.List;

public class SignUpLogin {

    //userList will store the details of all users
    List<User> userList=new ArrayList<>();

    //This method will be called when a new user will register
    public String signup(String name,int phone,String email,String street,String city,String state,String password){
        for(User user:userList){

            //it will check that the new users email id is unique
            if(user.getContact().getEmail().equals(email)){
                return "Signup unsuccesfull Email already exist.";
            }
        }
        Contact contact=new Contact(name,phone,email);
        Address address=new Address(street,city,state);
        User user=new User(contact,address,password);
        userList.add(user);
        return "Signup succesfull";
    }



    //This method will be called when user wants to login
    public String login(String email,String password){
        for(User user:userList){

            //It Checks if the provided email id and password from the user is correct or not
        if(!email.equals(user.getContact().getEmail()) ){
            return "User email id incorrect";
        }
        if(!password.equals(user.getPassword())){
                return "password incorrect";
        }
            return "Login succesfull";
        }
        return " ";
        }


        //This method will be called when user wants to change his/her password
        public String changePass(String ema,String pass){
        for(User user: userList){
            if(ema.equals(user.getContact().getEmail())){
                user.setPassword(pass);
                return "Password changed sucessfully";
            }
        }
        return "";
        }

    }

