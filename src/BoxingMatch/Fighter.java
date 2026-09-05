package BoxingMatch;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter fn){

            System.out.println(this.name + "=>" + fn.name + " Damage" + this.damage);
            if(fn.isDodge()){
                System.out.println(fn.name + " hat erfolgreich Blockiert!!");
                return fn.health;
            }
            if(fn.health -this.damage < 0){
                return 0;
            }
            return fn.health - this.damage;

    }
    boolean isDodge(){
        double randomNummer = Math.random() * 100;
        return randomNummer <= this.dodge;
    }
}
