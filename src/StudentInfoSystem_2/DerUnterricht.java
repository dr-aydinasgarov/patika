package StudentInfoSystem_2;

public class DerUnterricht {
    String name;
    String prefix;
    String exam;
    int untNote = 0;
    int exmNote = 0;
    double result;

    DerUnterricht(String name, String prefix, int untNote, int exmNote) {
        this.name = name;
        this.prefix = prefix;
        this.exmNote = exmNote;
        this.untNote = untNote;
    }


    void result() {
        if (this.exmNote >= 0 && this.exmNote <= 100 && this.untNote <= 100 && this.untNote >= 0) {
            if (this.prefix == "MED") {
                this.result = (this.exmNote * 0.3) + (this.untNote * 0.7);
                Print();
            }
            if (this.prefix == "FIZ") {
                this.result = (this.exmNote * 0.4) + (this.untNote * 0.6);
                Print();
            }
            if (this.prefix == "ENG") {
                this.result = (this.exmNote * 0.2) + (this.untNote * 0.8);
                Print();
            }
        if (this.result >=60){
            System.out.println("Erfolgreich Bestanden");
        }else {
            System.out.println("Leider nicht Bestanden");
        }
        } else {
            System.out.println("Geben Sie die richtige Noten bitte!");
        }
    }

    void Print() {
        System.out.println("Ihre Resultat ist: " + result);
    }

}
