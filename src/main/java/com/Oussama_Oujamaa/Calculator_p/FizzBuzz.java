package com.Oussama_Oujamaa.Calculator_p;
public class FizzBuzz {
    public static String FizzBuzz_de(Double nbr){
        String result = "";
        if(nbr%3==0){
            result +="Fizz";
        } if (nbr%5==0){
            result +="Buzz";
        }
        if((nbr%3!=0) && (nbr%6!=0)){
            result+=nbr;
        }
        return result;
    }
}