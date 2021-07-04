package com.tom.lottery;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Game539 extends NumberGame{
    int numberCount = 5;
    Set<Integer> numbers = new HashSet<>();
    int[] numberTem = new int[numberCount];

    @Override
    public void generate() {
        for(int i=0; i<numberCount; i++){
            numberTem[i] = new Random().nextInt(39)+1;
            numbers.add(numberTem[i]);
        }
        if(numbers.size() != numberCount){
            numbers.add(new Random().nextInt(39)+1);
        }
        System.out.println(numbers);
        /*for (int game539 : numbers){
            System.out.println(game539);
        }*/

    }

}
