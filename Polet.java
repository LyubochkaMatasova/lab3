package com.company;
import java.util.Arrays;
import static java.lang.Math.*;

public class Polet {
    Object map = Map.getMap();

    public Polet(int x1, int y1, int x2, int y2, Place place) {
        int a = x1;
        int b = y1;
        while (a <= x2 && b <= y2) {
            a=a+2;
            b++;
            System.out.println("MumiTroll Снорк летит в точке " + "(" + a + "," + b + ")" + "");
            if (a==3 && b==2) {
                System.out.println("На пути встретил MumiTrollGirl Лили");
            }
            if (a==7 && b==4) {
                System.out.println("На пути встретилась Loveofhislife Фридриха " );
            }
        }

        ((MumiTroll) (Map.getByCoordinate(x1, y1))).setPlace(place);
        Map.placeOnMap((Map.getByCoordinate(x1, y1)), x2, y2);
        Map.placeOnMap(0, x2, y2);
    }
}
