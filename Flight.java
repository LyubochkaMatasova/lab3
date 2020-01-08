package com.company;


import java.util.Objects;
import static java.lang.Math.*;
public class Flight {
    Map map = new Map(50, 50);

    public Flight(){

    }

    public void addMumiTroll(Place place, Place placeTo, String name) {
        MumiTroll mumiTroll = new MumiTroll(place, name);
        System.out.println(mumiTroll.getName());
        Map.placeOnMap(mumiTroll, mumiTroll.getX(),mumiTroll.getY());
        System.out.println(mumiTroll.toString());
        mumiTroll.think(name," Куда бы мне полететь? ", place);
        mumiTroll.like();
        mumiTroll.control();
        System.out.println(name + " вылетел из  " + mumiTroll.getPlace());
        mumiTroll.move(placeTo);
        System.out.println(name + " прилетел на " + mumiTroll.getPlace());
    }
    public void addMumiTrollGirl(int x, int y,String name, String say) {
        MumiTrollGirl mumiTrollGirl= new MumiTrollGirl(x, y, name, say);
        System.out.println(mumiTrollGirl.getName());
        Map.placeOnMap(mumiTrollGirl, x, y);
        mumiTrollGirl.speak();
        System.out.println(mumiTrollGirl.toString());
    }
    public void addLoveofhislife(int x, int y, String name,String mood){
        Loveofhislife loveofhislife = new Loveofhislife(x, y,name,mood);
        System.out.println(loveofhislife.toString());
        System.out.println(loveofhislife.getMood());
        loveofhislife.speak();
        Map.placeOnMap(loveofhislife, x, y);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return map.equals(flight.map);
    }
    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
