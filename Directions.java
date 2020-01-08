package com.company;

public enum Directions {
    ONELEG("Поворот"),
    TWOLEG("Полный вперед"),
    SWAY("Набирает высоту");
    private final String directionName;
    private Directions(String name){
        directionName = name;
    }

    public String toString(){
        return directionName;
    }
}
