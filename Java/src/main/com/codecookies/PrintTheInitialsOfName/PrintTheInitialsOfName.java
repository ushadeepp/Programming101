package main.com.codecookies.PrintTheInitialsOfName;

public class PrintTheInitialsOfName {
    public static void main(String[] args) {
        System.out.println(printTheInitialsOfName("code cookies"));
    }

    public static String printTheInitialsOfName(String string){
        String[] strArray = string.split(" ");
        String newName="";
        for (int i = 0; i <strArray.length-1 ; i++) {
            newName = newName+strArray[i].toUpperCase().charAt(0)+".";
        }
        char lastNameFirstLetter = strArray[strArray.length-1].toUpperCase().charAt(0);
        String restOfLastName = strArray[strArray.length-1].toLowerCase().substring(1);
        newName = newName+lastNameFirstLetter+restOfLastName;
        return newName;
    }
}
