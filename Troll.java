package com.company;
public class Troll extends Coordinates implements Speak, Think {
        private String name;

        @Override
        public void speak() {
            System.out.println(getName()+" говорит: Гоп!");
        }

        public void think(String name, String think, Place place) {
            System.out.println(name +"думает:Куда полететь");
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


}


