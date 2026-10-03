package lab_4;

public class BossCharacter extends GameCharacter {

    public BossCharacter(String name, int health) {
       super(name,health);
    }

    @Override
    public int attack() {
        return super.attack() + 20; 
    }

    @Override
    public String getType() {
        return "Boss Character";
    }

   
    public String getType(boolean detailed) {
        if (detailed) {
            return "Boss Character with High Damage";
        }
        return "Boss Character";
    }
}

