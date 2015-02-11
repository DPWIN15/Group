import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Thread.sleep;

/**
 * Created by Max Towery on 2/9/2015.
 */
public class Battle {

    Group group1;
    ArrayList<Unit> test1;
    Group group2;
    ArrayList<Unit> test2;

    public Battle(Group group1, Group group2) {
        this.group1 = group1;
        this.group2 = group2;
        test1 = (ArrayList<Unit>)group1.getGroupList().clone();
        test2 = (ArrayList<Unit>)group2.getGroupList().clone();
    }

    //add BattleRunner display back in as parameter
    public void doBattle(BattleRunner display) throws InterruptedException {

        System.out.println("*************BEGIN BATTLE*************");
        System.out.println("______________________________________\n");
        while(group1.getGroupList().size() > 0 && group2.getGroupList().size() > 0){
            sleep(2000);
            //sort first on attack speed to compare both groups
            Collections.sort(group1.getGroupList());
            Collections.sort(group2.getGroupList());

            //compare by attackCounter
            if (group1.first() < group2.first()){
                Collections.sort(group2.getGroupList(), new Unit());
                System.out.println("Group 1 attacks Group 2");
                group1.attack(group2);
            }
            else{
                Collections.sort(group1.getGroupList(), new Unit());
                System.out.println("Group 2 attacks Group 1");
                group2.attack(group1);
            }
            display.setUnitText();
        }
        if(group1.getGroupList().size() > group2.getGroupList().size()){
            System.out.println("Group 1 Wins!");
        }
        else
            System.out.println("Group 2 Wins!");
    }
}
