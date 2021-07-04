package com.tom.lottery;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BigGame extends NumberGame{
    int numberCount = 6;
    Set<Integer> numbers = new HashSet<>();
    int[] numberTem = new int[numberCount];

    @Override
    public void generate() {
        for(int i=0; i<numberCount; i++){
            numberTem[i] = new Random().nextInt(49)+1;
            numbers.add(numberTem[i]);
        }
        if(numbers.size() != numberCount){
            numbers.add(new Random().nextInt(9)+1);
        }
        System.out.println(numbers);
        /*for (int bigGame : numbers){
            System.out.println(bigGame);
        }*/

    }
}
