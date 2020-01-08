package com.company;
public class MumiTrollGirl extends Troll {
    private String speak;

    public MumiTrollGirl(int x, int y, String name, String speak) {
        setX(x);
        setY(y);
        setName(name);
        this.speak = speak;
    }

    @Override
    public String toString() {
        return "MumiTrollGirl "+getName()+ " на координатах " + "x=" +
                getX()  +
                " y=" + getY();
    }

    @Override
    public void speak() {
        System.out.println(getName() + " MumiTrollGirl Лили говорит: Я люблю Снорка, а он меня нет ");

    }

}

