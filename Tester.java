import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by Max Towery on 2/9/2015.
 */
public class Tester {
    public static void main(String [] args) throws FileNotFoundException, InterruptedException {

        ListContainer listContainer = new ListContainer();

        Group group1 = new CreatureGroup(listContainer);
        Group group2 = new CreatureGroup(listContainer);

        Battle battle = new Battle(group1, group2);

        //BattleRunner display = new BattleRunner(battle);
        //display.displayBattle();







        battle.doBattle();

    }
}
