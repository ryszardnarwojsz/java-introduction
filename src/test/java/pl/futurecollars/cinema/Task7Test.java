package pl.futurecollars.cinema;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task7Test {

    @Test
    void shouldVerify0MinutesConverted20Seconds(){
        //given, when
        long secons = Minutes2SecondsConverter.convertMinutes2Seconds(0);
        //then
        Assertions.assertEquals(0, secons);
    }


    @Test
    void shouldVerifyMinutesConverted2SecondsProperly_1(){
        //given, when
        long secons = Minutes2SecondsConverter.convertMinutes2Seconds(10);
        //then
        Assertions.assertEquals(600, secons);
    }


    @Test
    void shouldVerifyMinutesConverted2SecondsProperly_2(){
        //given, when
        long secons = Minutes2SecondsConverter.convertMinutes2Seconds(19);
        //then
        Assertions.assertEquals(1140, secons);
    }

    @Test
    void shouldVerifyMinutesConverted2SecondsProperly_3(){
        //given, when
        long secons = Minutes2SecondsConverter.convertMinutes2Seconds(66);
        //then
        Assertions.assertEquals(3960, secons);
    }

}