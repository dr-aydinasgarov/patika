package BoxingMatch;

public class Main {
    static void main(String[] args) {
        Fighter Vandam = new Fighter("Vandam", 20, 120, 98,100);
        Fighter Ceki = new Fighter("Ceki", 10, 150, 88,0);

        Match first = new Match(Vandam, Ceki, 100, 80);

        first.run();
    }
}
