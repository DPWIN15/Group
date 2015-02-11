import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Max Towery on 2/9/2015.
 */
public class CreatureGroup implements Group{

    ArrayList<CreatureUnit> groupList;

    public CreatureGroup(ListContainer container) {
        this.groupList = container.randomCreatureGroup(5);
        Collections.sort(this.groupList, new CreatureUnit());
    }

    public void attack(Group group){
        //sort by HP
        Collections.sort(group.getGroupList(), new CreatureUnit());
        System.out.println(this.groupList.get(0).attack(group.getGroupList().get(0)));

        //remove enemy group member from list if hp is <= 0
        if (group.getGroupList().get(0).getHp() <= 0){
            group.getGroupList().remove(0);
        }
    }

    public int first(){return this.getGroupList().get(0).getAttackCounter();}

    public ArrayList<CreatureUnit> getGroupList() {
        return groupList;
    }public void printGroup(){
        for (int i = 0; i < this.groupList.size(); i++){
            System.out.println(groupList.get(i));
        }
    }

}
