package it.unibo.encapsulation;

public class Smartphone {

    private static final boolean DEF_HAS_GPS = true;
    private static final boolean DEF_HAS_3G = true;
    private static final boolean DEF_HAS_NFC = true;
    private static final int DEF_SD_SIZE = 65536;
    private static final int DEF_RAM_SIZE = 8192;
    private static final int DEF_N_CPU = 8;

    private int cpuCount;
    private int ram;
    private int sdSize;
    private String brand;
    private String model;
    private boolean hasGPS;
    private boolean has3G;
    private boolean hasNFC;

    public Smartphone(
        int cpuCount,
        int ram,
        int sdSize,
        String brand,
        String model,
        boolean hasGPS,
        boolean has3G,
        boolean hasNFC
    ) {
        this.cpuCount = cpuCount;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.hasNFC = hasNFC;
    }

    public Smartphone(final String brand, final String model) {
        this(brand, model, DEF_SD_SIZE);
    }

    public Smartphone(final String brand, final String model, final int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, sdSize, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasGPS, final boolean has3G) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, hasGPS, has3G, DEF_HAS_NFC);
    }

    // Getting e Setting

    // Metodo getCpuCount
    public int getCpuCount() {
        return cpuCount;
    }

    // Metodo setCpuCount
    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    // Metodo getRam
    public int getRam() {
        return ram;
    }

    // Metodo setRam
    public void setRam(int ram) {
        this.ram = ram;
    }

    // Metodo getSdSize
    public int getSdSize() {
        return sdSize;
    }

    // Metodo setSdSize
    public void setSdSize(int sdSize) {
        this.sdSize = sdSize;
    }

    // Metodo getBrand
    public String getBrand() {
        return brand;
    }

    // Metodo setBrand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Metodo getModel
    public String getModel() {
        return model;
    }

    // Metodo setModel
    public void setModel(String model) {
        this.model = model;
    }

    // Metodo getHasGPS
    public boolean getHasGPS() {
        return hasGPS;
    }

    // Metodo setHasGPS
    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    // Metodo getHas3G
    public boolean getHas3G() {
        return has3G;
    }

    // Metodo setHas3G
    public void setHas3G(boolean has3G) {
        this.has3G = has3G;
    }

    // Metodo getHasNFC
    public boolean getHasNFC() {
        return hasNFC;
    }

    // Metodo setHasNFC
    public void setHasNFC(boolean hasNFC) {
        this.hasNFC = hasNFC;
    }


    public void printStringRep() {
        System.out.println("n CPU(s): " + cpuCount);
        System.out.println("RAM amount: " + ram);
        System.out.println("SD size: " + sdSize);
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("hasGPS: " + hasGPS);
        System.out.println("has3G: " + has3G);
        System.out.println("hasNFC: " + hasNFC + "\n");
    }
}
