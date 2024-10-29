package it.unibo.qa;

public class Cat {
    // Questa classe descrive un gatto

    private String name;
    private String color;
    private String breed;
    private int age;

    private static final int NUMBER_OF_LIVES = 9;
    public static int numberOfLives = NUMBER_OF_LIVES;

    public Cat(String name, String color, int age, String breed) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    // Questo metodo permette al gatto di miagolare e presentarsi.
    public String meow() {
        return "Meow, meow, I am " + name + ", hear me purr. " +
               "In this feline world, I'm the star, that's for sure. " +
               "With whiskers long and fur so sleek, I'm here to share my story, so take a peek!";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int hasSameColor(Cat otherCat) {
        return this.color.equals(otherCat.color) ? 1 : 0;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kiri", "Gray", 4, "Korat");
        System.out.println(cat.meow());
    }
}
