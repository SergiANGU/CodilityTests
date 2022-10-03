package org.example.WolfKata;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WolfKata {

    public void inicia(){
        List<String> sheeps = createSheeps(randomNumberGenerator(1,10));
        List<String> animals = addWolf(sheeps);
        List<String> animalsShufled = shuffleList(animals);
    }

    public List<String> createSheeps(int numberOfSheeps){
        List<String> sheeps = new ArrayList<>();
        for (int i = 0; i<numberOfSheeps; i++){
            sheeps.add("Sheep");
        }
        return sheeps;
    }

    public int randomNumberGenerator(int min, int max){
        int number = (int )Math.floor(Math.random()*(max-min+1)+min);
        return number;
    }

    public List<String> addWolf(List<String> animals){
        animals.add("Wolf");
        return animals;
    }

    public List<String> shuffleList(List<String> animals){

        Collections.shuffle(animals);
        return animals;
    }


}
