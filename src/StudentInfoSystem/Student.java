package StudentInfoSystem;

public class Student {
    String name;
    String StuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double Avarage;
    boolean isPass;

    Student(String name, String StuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.StuNo = StuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        double Avarage = 0.0;
        boolean isPass = false;
    }

    void addBulkExamNote(int note1,int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void isPass(){
        this.Avarage = (this.c1.note + this.c2.note + this.c3.note) / 3;
        if (this.Avarage >= 60) {
            System.out.println(" Erfolgreich bestanden");
            this.isPass = true;
        } else {
            System.out.println(" Leider nicht bestanden");
            this.isPass = false;
        }
        PrintNote();
    }

        void PrintNote(){
            System.out.println(this.c1.name + " Vorlesung: " + this.c1.note);
            System.out.println(this.c2.name + " Vorlesung: " + this.c2.note);
            System.out.println(this.c3.name + " Vorlesung: " + this.c3.note);
            System.out.println("Ihre Durchschnichtsnote ist: " + this.Avarage + "\n");
        }

    }




