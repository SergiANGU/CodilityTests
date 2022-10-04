package org.example.WoltTestKata;

import org.assertj.core.api.Assert;
import org.example.WolfKata.WolfKata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class WolfKataTest {

    @Test
    public void checkIfClassExist(){
        new WolfKata();
    }

    WolfKata wolf = new WolfKata();

    @Test
    public void givedSheepThenProcesedReturnOne(){

        List<String> sheeps = wolf.createSheeps(1);
        Assertions.assertEquals(1,sheeps.size());

    }

    @Test
    public void givedAnIntervalReturnOneRandomNumber(){
        int min =1, max = 10;
        int randomNumber = wolf.randomNumberGenerator(min, max);
        Assertions.assertTrue(max >= randomNumber);
        Assertions.assertTrue(min  <= randomNumber);
    }

    @Test
    public void givedRandomNumberThenGenerateListOfRandomNumberOfSheeps(){
        int min =1, max = 10;
        int randomNumber = wolf.randomNumberGenerator(min, max);
        List<String> sheeps = wolf.createSheeps(randomNumber);
        Assertions.assertEquals(randomNumber,sheeps.size());
    }

    @Test
    public void givedASheepListAddAWolfOnLastPosition(){
        List<String> sheeps = new ArrayList<>();
        sheeps.add("Sheep");
        sheeps.add("Sheep");
        sheeps.add("Sheep");
        sheeps.add("Sheep");
        List<String> animals = wolf.addWolf(sheeps);
        Assertions.assertEquals("Wolf", animals.get(animals.size()-1));
    }

    @Test
    public void givedAListWhenProcesedThenShuffled(){
        List<String> sheeps = new ArrayList<>();
        sheeps.add("Sheep");
        sheeps.add("Sheep");
        sheeps.add("Sheep");
        sheeps.add("Sheep");
        sheeps.add("Wolf");
        List<String> animalsShuffled = wolf.shuffleList(sheeps);

        Assertions.assertFalse(Collections.disjoint(sheeps, animalsShuffled));
    }

    @Test
    public void givedAListWhenProcesedReturnTheWolfPosition(){
        List<String> animals = List.of("Sheep", "Sheep", "Sheep", "Sheep", "Wolf", "Sheep", "Sheep");
        int postition = wolf.wolfPosition(animals);
        Assertions.assertEquals(postition, 4);
    }

    @Test
    public void givedAListWhenProcesedReturnTheWolfInFinalPosition(){
        List<String> animals = List.of("Sheep", "Sheep", "Sheep", "Sheep","Sheep", "Wolf");
        int postition = wolf.wolfPosition(animals);
        Assertions.assertEquals(postition, 5);
    }

    @Test void globalTest(){
        wolf.inicia();
    }





}