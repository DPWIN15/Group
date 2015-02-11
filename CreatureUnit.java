import java.util.Comparator;
import javax.swing.*;
/**
 * Created by Max Towery on 2/9/2015.
 */
public class CreatureUnit  extends Unit{

    private int damage;

    //used for compare method
    public CreatureUnit(){
        super("", 0, 0);
    }
    public CreatureUnit(String name, int hp, int attackSpeed, int damage) {
        super(name, hp, attackSpeed);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {

        return super.getName()  + "\n" + "HP: " + super.getHp() + "\nAttack Speed: " +
                            super.getAttackSpeed() + "\nDamage: " + this.damage + "\n";

    }


    public String attack(Unit unit) {
        unit.setHp(unit.getHp() - this.damage);
        this.setAttackCounter(this.getAttackCounter() + this.getAttackSpeed());
        if (unit.getHp() > 0){
            return this.getName() + " attacks " + unit.getName() + " for " + this.getDamage() +
                    " damage";
        }
        else
            return this.getName() + " attacks " + unit.getName() + " for " + this.getDamage() +
                    " damage" + "\n" + unit.getName() + " has been slain!";
    }
}
