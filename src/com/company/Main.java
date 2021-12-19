package com.company;

import java.util.*;

public class Main {
    /**City деген класс тузунуз. (code, name, ...)
     Эгерде code так сан болсо TreeSetke салыныз.
     Аларды чонунан кичинесине караган тартипте чыгарыныз.*/

    public static void main(String[] args) {
        City city = new City(7,"Moscow","Red square");
        City city2 = new City(30,"Berlin","Berlin Wall");
        City city1 = new City(242,"Antalya","Aquarium");
        City city3 = new City(312,"Bishkek","Ala-Too square");

        TreeSet<City> treeSet = new TreeSet<>();
        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(city);
        arrayList.add(city2);
        arrayList.add(city1);
        arrayList.add(city3);

        for (City c : arrayList) {
            if (c.getCode() % 2 == 1) {
                treeSet.add(c);
            }


        }

        System.out.println(treeSet);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

    }
}
