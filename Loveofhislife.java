package com.company;
import java.util.Objects;
import static java.lang.Math.random;
public class Loveofhislife extends Coordinates implements Speak {

    private String mood;
    private String name;
    private double nice;

        public Loveofhislife(int x, int y,String name, String mood) {
            setX(x);
            setY(y);
            setName(name);
            this.mood = mood;
            this.nice = random();
        }

        public String getMood() {
            return this.mood;
        }

        public double getNice() {
            return this.nice;
        }
    public void setName(String name) {
        this.name = name;
    }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Loveofhislife loveofhislife = (Loveofhislife) o;
            return Double.compare(loveofhislife.nice,nice) == 0 &&
                    mood.equals(loveofhislife.mood);
        }

        @Override
        public int hashCode() {
            return Objects.hash(mood, nice);
        }

        @Override
        public void speak() {
            System.out.println("Loveofhislife Фредриха говорит: Я самая красивая");
        }


        @Override
        public String toString() {
            return " Loveofhislife Фредриха с" +
                    " Настроением=" + mood +""+
                    "и привлекательностью=" + (double)Math.round(nice*100)/100 +
                    " на координатах x=" + getX() + " y="+ getY();
        }
    }

