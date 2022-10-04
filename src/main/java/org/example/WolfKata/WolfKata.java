package org.example.WolfKata;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WolfKata {



    public String finalMensage(int postion, List<String> animalsList){

        if (animalsList.size() == postion ){
            return "Pls go away and stop eating my sheep";
        } else if (animalsList.get(0).contains("Wolf")) {
            return "No Danger";
        } else {
            return "Oi! Sheep number "+ (postion -1 )  + " ! You are about to be eaten by a wolf!";
        }
    }


}
