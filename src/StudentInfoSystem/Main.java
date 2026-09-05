package StudentInfoSystem;

public class Main {
    static void main(String[] args) {
        Teacher Aydin = new Teacher("Aydin", "MED", "555");
        Teacher Lala = new Teacher("Lalə", "FİZ", "444");
        Teacher Turkan = new Teacher("Turkan", "Mat", "333");

        Course tarix = new Course("Tarix", "051","MED");
        tarix.addTeacher(Aydin);
        Course fizik = new Course("Fizik", "052","FİZ");
        fizik.addTeacher(Lala);
        Course math = new Course("Math", "053","Mat");
        math.addTeacher(Turkan);

        Student Xaqani = new Student("Xaqani", "013", "5",tarix, fizik, math);
        Xaqani.addBulkExamNote(23,72,15);
        Xaqani.isPass();

        Student Zarifa = new Student("Zarifa", "013", "5",tarix, fizik, math);
        Zarifa.addBulkExamNote(100,99,22);
        Zarifa.isPass();


    }
}
