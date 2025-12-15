package com.Oussama_Oujamaa.Calculator_p;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


import static com.Oussama_Oujamaa.Calculator_p.FizzBuzz.FizzBuzz_de;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    private FizzBuzz f1 ;

    @BeforeEach
    public void start(){f1 = new FizzBuzz();}

    @AfterEach
    public void end(){System.out.println("Le system et pret pour un nouvelle test:");}

    @Test
    public void Fizz_de1_test_0(){
        assertThat(FizzBuzz_de(0.0)).isEqualTo("FizzBuzz");
    }
    @Test
    public void Fizz_test_avec_5(){
        assertThat(FizzBuzz_de(5.0)).isEqualTo("Buzz");

    }

    @Test
    public void Fizz_test_avec_3(){
        assertThat(FizzBuzz_de(3.0)).isEqualTo("Fizz");

    }

    @Test
    public void Test_de_1_100(){
        String test="";
        for(int i =0;i<100 ;i++){
            if(i%3==0){
                test += "Fizz";
            }else if(i%5==0){
                test +="Buzz";
            }else{
                test+=(double)i;
            }
            assertThat(FizzBuzz_de((double)i)).isEqualTo(test);
            test ="";
        }
    }


}