package com.company;

import java.util.Objects;
import static java.lang.Math.random;
public class MumiTroll extends Troll {
    private Place place;
    private int nice;
    private Directions direction;
    private Directions n;
    int s;
    int a = 0;
    int b = 3;

    public MumiTroll(Place place, String name) {
        this.place = place;
        setName(name);
        setX(place.getXp());
        setY(place.getYp());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MumiTroll mumitroll = (MumiTroll) o;
        return nice == mumitroll.nice &&
                place == mumitroll.place;
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, nice);
    }

    @Override
    public String toString() {
        return "MumiTroll " +
                getName() + " в месте  " + place + "  " + "кричит:'А ну давай!Гоп!'";
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return this.place;
    }

    public void like() {
        this.nice += (int) (random() * 100.0);
        System.out.println(getName() + "" + "причесался перед встречей с любовью всей его жизни" +
                " и стал намного уверенней с привлекательностью " + getNice());
        Love love=new Love();
    }

    public void control() {
        int s = a + (int) (Math.random() + b);
        if (s == 1) {
            direction = Directions.ONELEG;
        } else if (s == 2) {
            direction = Directions.TWOLEG;
        } else direction = Directions.SWAY;

        System.out.println("MumiTroll быстрее всех научился управлять тучками, лекгим движение он " + direction);
    }

    public int getNice() {
        return this.nice;
    }

    public void move(Place place) {
        Polet p = new Polet(this.place.getXp(), this.place.getYp(), place.getXp(), place.getYp(), place);
        setX(place.getXp());
        setY(place.getYp());

    }
}


