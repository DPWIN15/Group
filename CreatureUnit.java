import java.util.Comparator;

/**
 * Created by Max Towery on 2/9/2015.
 */
public class CreatureUnit  extends Unit implements Comparator{

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
        return super.getName() + "\nHP: " + super.getHp() + "\nAttack Speed: " +
                            super.getAttackSpeed() + "\nDamage: " + this.damage + "\n";
    }

    //compare by attackCounter
    @Override
    public int compareTo(Object o) {
        CreatureUnit creatureUnit = (CreatureUnit)o;
        return (int)(super.getAttackCounter() - creatureUnit.getAttackCounter());
    }

    //compare by HP
    @Override
    public int compare(Object o1, Object o2) {
        CreatureUnit c1 = (CreatureUnit)o1;
        CreatureUnit c2 = (CreatureUnit)o2;
        return c1.getHp() - c2.getHp();
    }

    @Override
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
