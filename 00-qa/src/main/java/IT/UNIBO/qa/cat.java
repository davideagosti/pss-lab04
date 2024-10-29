package it.unibo.qa;

/**
 * Questa classe rappresenta un gatto con attributi come nome, colore, razza e età.
 * Offre metodi per miagolare, cambiare colore e confrontare colori con un altro gatto.
 */
public class Cat {
    // Questa classe descrive un gatto

    private String name;
    private String color;
    private String breed;
    private int age;

    private static final int NUMBER_OF_LIVES = 9;
    public static int numberOfLives = NUMBER_OF_LIVES;      // indica il numero di vite del gatto

    // Questo oggetto "Cat" mostra i dettagli del gatto 
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

    // Questo metodo setta il colore
    public void setColor(String color) {
        // Setta colore
        this.color = color;
    }

    // Questo metodo mostra il colore dato
    public String getColor() {
        // Mostra il colore
        return color;
    }

    // Questo metodo verifica se ha lo stesso colore
    public int hasSameColor(Cat otherCat) {
        // Verifica se ha lo stesso colore su altri gatti
        return this.color.equals(otherCat.color) ? 1 : 0;
    }

    // Questo metodo mostra il nome
    public String getName() {
        // Mostra nome
        return name;
    }

    // Questo metodo mostra l'incrocio
    public String getBreed() {
        // Mostra l'incrocio
        return breed;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kiri", "Gray", 4, "Korat");
        System.out.println(cat.meow());
    }
}
