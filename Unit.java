/**
 * Created by Max Towery on 2/9/2015.
 */
public abstract class Unit implements Comparable{

    private String name;
    private int hp;
    private int attackSpeed;
    private int attackCounter;

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

    public abstract String attack(Unit unit);
}
