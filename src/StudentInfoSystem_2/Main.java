package StudentInfoSystem_2;

public class Main {
    static void main(String[] args) {
        DerUnterricht MED = new DerUnterricht("Medizin", "MED", -51, 100);
        MED.result();
        DerUnterricht FIZ = new DerUnterricht("Physich", "FIZ", 100, 115);
        FIZ.result();
        DerUnterricht ENG = new DerUnterricht("English", "ENG", 100, 0);
        ENG.result();

    }
}
