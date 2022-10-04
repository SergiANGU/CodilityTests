package org.example.WoltTestKata;

import org.assertj.core.api.Assert;
import org.example.WolfKata.WolfKata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class WolfKataTest {



    private WolfKata wolf = new WolfKata();


    @Test
    public void givedAListWhenProcesedReturnTheWolfPosition(){
        List<String> animals = List.of("Sheep", "Sheep", "Sheep", "Sheep", "Wolf", "Sheep", "Sheep");
        String msg = wolf.finalMensage(4,animals);
        Assertions.assertTrue(msg.contains("Oi! Sheep number "+ (3)  + " ! You are about to be eaten by a wolf!"));    }

    @Test
    public void givedAListWhenProcesedReturnTheWolfInFinalPosition(){
        List<String> animals = List.of("Sheep", "Sheep", "Sheep", "Sheep","Sheep", "Wolf");
        String msg = wolf.finalMensage(6, animals);
        Assertions.assertTrue(msg.contains("Pls go away and stop eating my sheep"));
    }

    @Test
    public void givedAListWhenProcesedReturnTheWolfInFirst(){
        List<String> animals = List.of("Wolf", "Sheep", "Sheep", "Sheep","Sheep", "Sheep");
        String msg = wolf.finalMensage(0, animals);
        Assertions.assertTrue(msg.contains("No Danger"));
    }




}