package com.company;
import static java.lang.Math.random;
public enum Place {
    LAKE(12,23),
    MOUNTAINS(9, 5),
    SEA(1,1),
    FIELD(34,45);


    private int xp;
    private int yp;
    Place(int xp, int yp) {
        this.xp=xp;
        this.yp=yp;
    }

    public int getXp() {
        return xp;
    }
    public int getYp() {
        return yp;
    }
}
