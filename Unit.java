import java.util.Comparator;

/**
 * Created by Max Towery on 2/9/2015.
 */
public class Unit implements Comparable, Comparator {

    private String name;
    private int hp;
    private int attackSpeed;
    private int attackCounter;

    public Unit(){}
    protected Unit(String name, int hp, int attackSpeed) {
        this.name = name;
        this.hp = hp;
        this.attackSpeed = attackSpeed;
        this.attackCounter = attackSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public int getAttackCounter() {return attackCounter;}

    public void setAttackCounter(int attackCounter) {this.attackCounter = attackCounter;}

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    //compare by AttackCounter
    public int compareTo(Object o) {
        Unit unit = (Unit)o;
        return (int)(this.attackCounter - unit.getAttackCounter());
    }
    //compare by HP

    public int compare(Object o1, Object o2) {
        Unit c1 = (Unit)o1;
        Unit c2 = (Unit)o2;
        return c1.getHp() - c2.getHp();
    }

}
