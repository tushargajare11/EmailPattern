package EmailRegistration;
import java.util.regex.*;
import java.util.*;

public class EmailValidation {
    public static void main(String args[]){
        ArrayList<String> emails = new ArrayList<String>();

        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111abc.com");
        emails.add("abc-100@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc.100@1.com");
        emails.add("abc2gmail.com.com");
        emails.add("abc+100@gmail.com");
        //Add invalid emails in list
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");

        emails.add("abc..2002@gmail.com");

        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");

        emails.add("abc@gmail.com.aa.au");



        //Regular Expression
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        //Compile regular expression to get the pattern
        Pattern pattern = Pattern.compile(regex);
        //Iterate emails array list
        for(String email : emails){
            //Create instance of matcher
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
    }
}
