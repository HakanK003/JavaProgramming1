package day24_CustumMethodsReturn;

public class DisplayDomainOfEmail {

    public static void main(String[] args) {

        String email = "abc123@gmail.com";
        domainFinder(email);

    }

    public static void domainFinder(String email){
        System.out.println(email.substring(email.indexOf("@")+1,email.indexOf(".")));
    }
}

/*
Create a method that can display the domain of the email
 */