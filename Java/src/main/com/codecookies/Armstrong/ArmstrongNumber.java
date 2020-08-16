package main.com.codecookies.Armstrong;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(armstrongNumber(1253));
    }

    public static boolean armstrongNumber(int number){
        int size = numberOfDigits(number);
        int temp ;
        int result= 0;
        int value = number;
        while (number>0){
            temp = number%10;
            result= result+powerOfNumber(temp,size);
            number= number/10;
        }
        if(value==result){
            return true;
        }
        else {
            return false;
        }
    }

    public static int numberOfDigits(int number){
        int noofDigits= 0;
        while (number>0){
            noofDigits++;
            number=number/10;
        }
        return noofDigits;
    }

    public static int powerOfNumber(int num,int exponent){
        if (exponent==0){
            return 1;
        }
        int temp= num;
        while (exponent>1){
            num=temp*num;
            exponent--;
        }
        return num;
    }


}
