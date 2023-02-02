package ru.netologu;
public class BonusService {

    public int calcBonus(int amount) {
        if (amount < 1000) {
            return 0;
        }
        int bonus = (amount - 1000) / 100;
        if (bonus > 100) {
            return 100;
        }
        return bonus;
    }
}