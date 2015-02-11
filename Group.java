import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Towery on 2/10/2015.
 */
public interface Group{

    public abstract ArrayList<CreatureUnit> getGroupList();
    public abstract int first();
    public abstract void attack(Group group);
    public abstract void printGroup();

}
