package it.unibo.qa;
/**
 * Classe che rappresenta un gatto con attributi come nome, colore, razza e età.
 * Offre metodi per far miagolare il gatto, cambiare colore e confrontare colori con un altro gatto.
 */
public class Cat {
    /** Nome del gatto. */
    private String name;
    /** Colore del gatto. */
    private String color;
    /** Razza del gatto. */
    private String breed;
    /** Età del gatto. */
    private int age;
    /** Numero di vite del gatto. */
    private static final int NUMBER_OF_LIVES = 9;
    /** Numero attuale di vite del gatto. */
    private static int numberOfLives = NUMBER_OF_LIVES;

    /**
     * Costruttore per creare una nuova istanza di Cat.
     *
     * @param name  Il nome del gatto.
     * @param color Il colore del gatto.
     * @param age   L'età del gatto.
     * @param breed La razza del gatto.
     */
    public Cat(final String name, final String color, final int age, final String breed) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    /**
     * Fa miagolare il gatto e lo presenta.
     *
     * @return Una stringa con il miagolio e la presentazione del gatto.
     */
    public String meow() {
        return "Meow, meow, I am " + name + ", hear me purr. " 
            + "In this feline world, I'm the star, that's for sure. " 
            + "With whiskers long and fur so sleek, I'm here to share my story, so take a peek!";
    }

    /**
     * Imposta il colore del gatto.
     *
     * @param color Il nuovo colore del gatto.
     */
    public void setColor(final String color) {
        this.color = color;
    }

    /**
     * Restituisce il colore del gatto.
     *
     * @return Il colore del gatto.
     */
    public String getColor() {
        return color;
    }

    /**
     * Confronta il colore di questo gatto con quello di un altro gatto.
     *
     * @param otherCat Un altro gatto da confrontare.
     * @return 1 se i colori sono uguali, altrimenti 0.
     */
    public int hasSameColor(final Cat otherCat) {
        return this.color.equals(otherCat.color) ? 1 : 0;
    }

    /**
     * Restituisce il nome del gatto.
     *
     * @return Il nome del gatto.
     */
    public String getName() {
        return name;
    }

    /**
     * Restituisce la razza del gatto.
     *
     * @return La razza del gatto.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Metodo main per testare la classe Cat.
     *
     * @param args Argomenti della linea di comando.
     */
    public static void main(final String[] args) {
        Cat cat = new Cat("Kiri", "Gray", 4, "Korat");
        System.out.println(cat.meow());
    }
}
