package main.com.codecookies.TotalNumberOfVowelsInString;

public class TotalNumberOfVowelsInString {

    public static void main(String[] args) {
        System.out.println(numberOfVowelsInString("RHYTHMS Euouae"));
    }
    public static boolean isVowel(char ch){
        ch =Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }

    public static int numberOfVowelsInString ( String input){
        char[] charArray = input.toCharArray();
        int numberOfVowels =0;
        for (int i = 0; i <charArray.length ; i++) {
            if (isVowel(charArray[i])){
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }
}
