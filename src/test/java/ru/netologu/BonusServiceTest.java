package ru.netologu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calcBonus() {


        BonusService bonusService = new BonusService();
        int amount = 2000;

        int actual = bonusService.calcBonus(amount);
        int expected =10;
        assertEquals(expected,actual);

    }
}