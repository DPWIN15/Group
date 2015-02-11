import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Max Towery on 2/9/2015.
 */
public class CreatureGroup {

    ArrayList<CreatureUnit> groupList;

    public CreatureGroup(ListContainer container) {
        this.groupList = container.randomCreatureGroup(5);
        Collections.sort(this.groupList, new CreatureUnit() );
    }

    public void attack(CreatureGroup group){
        Collections.sort(group.getGroupList(), new CreatureUnit());

    }

    public ArrayList<CreatureUnit> getGroupList() {
        return groupList;
    }

}
