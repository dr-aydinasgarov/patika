package BoxingMatch;

public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;
    int a = 1;
    double z;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (Ischeck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("\n===== Neue Round =====");
                start();
                if(z>50){

                    this.f1.health = this.f2.hit(f1);
                    if (IsWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (IsWin()) {
                        break;
                    }


                }else if(z<=50){
                    this.f2.health = this.f1.hit(f2);
                    if (IsWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (IsWin()) {
                        break;
                    }
                }
                a++;
                System.out.println(this.f1.name + "'s Gesundheit ist: " + this.f1.health);
                System.out.println(this.f2.name + "'s Gesundheit ist: " + this.f2.health);
            }

        } else {
            System.out.println("Die Gewichte passen nicht zusammen");
        }

    }

    boolean Ischeck() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean IsWin() {
        if (this.f1.health == 0) {
            System.out.println("Winner is: " + this.f2.name);
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println("Winner is: " + this.f1.name);
            return true;
        }
        return false;
    }

    int start() {
        if (a == 1) {
            double random = Math.random() * 100;
            z = random;
        }
        return 0;
    }
}
