package leksion7_Ool.enumExample;

public enum Laptops {
    HP ("Procesor: i5 Ram: 8GB", Generate.Gen_7),
    DELL("Procesor: i5 Ram: 16GB", Generate.Gen_8),
    PACKARDBELL("Procesor: i7 Ram: 16GB", Generate.Gen_7),
    TOSHIBA ("Procesor: i5 Ram: 16GB", Generate.Gen_9);
    private final String desc;
    private final Generate gen;
    Laptops(String desc, Generate gen){
        this.desc=desc;
        this.gen=gen;
    }

    public String getDesc() {
        return desc;
    }
    public Generate getGen() {
        return gen;
    }
    enum Generate{
        Gen_7,
        Gen_8,
        Gen_9;
    }
}
