package com.company;

import java.util.Comparator;

public class City implements Comparable<City>{
    private int code;
    private String name;
    private String sights;

    public City(int code, String name, String sights) {
        this.code = code;
        this.name = name;
        this.sights = sights;
    }

    Comparator<City>compareByCode=new Comparator<City>() {
        @Override
        public int compare(City code03, City codeo2) {
            return code03.getCode()-compare(code03, codeo2);
        }
    };

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSights() {
        return sights;
    }

    public void setSights(String sights) {
        this.sights = sights;
    }

    public City() {
    }

    @Override
    public String toString() {
        return "City" +
                " code: " + code +
                ", City name: " + name  +
                ", City sight: " + sights;
    }

    @Override
    public int compareTo(City o) {
        return 0;
    }
}


