package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturnSumIfAmountIsUnder1000() {

        int amount = 550;
        int actual = cashbackHackService.remain(amount);
        int expected = 450;


        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnSumIfAmountBorderIsUnder1000() {

        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnSumIfAmountBorderIsOver1000() {

        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnSumIfAmountIsOver1000() {

        int amount = 1500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {

        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }

}