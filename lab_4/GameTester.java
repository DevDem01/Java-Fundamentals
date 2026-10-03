package lab_4;
public class GameTester {
    public static void main(String[] args) {
        BossCharacter boss = new BossCharacter("Yoyo", 100);

        System.out.println("Name: " + boss.getName());
        System.out.println("Health: " + boss.getHealth());

      
        System.out.println("Attack damage: " + boss.attack());

    
        System.out.println("Type: " + boss.getType());

        
        System.out.println("Detailed type: " + boss.getType(true));

       
        System.out.println("Short type: " + boss.getType(false));
    }
}

