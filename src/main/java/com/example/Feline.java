package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> getFood(String type) throws Exception {
        // Реализация метода из интерфейса Predator
        return List.of("Животные", "Птицы", "Рыба");
    }

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}

