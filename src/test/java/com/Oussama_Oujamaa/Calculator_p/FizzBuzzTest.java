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
    public void start(){
        f1 = new FizzBuzz();
    }

    @AfterEach
    public void end(){
        System.out.println("Le system et pret pour un nouvelle test:");
    }


    @Test
    public void Fizz_de1_test_0(){
        assertThat(FizzBuzz_de(0.0)).isEqualTo("FizzBuzz");
    }



}