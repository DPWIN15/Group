import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Max Towery on 2/9/2015.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//maintains all file loaded lists and provides units/items/spells
    //to the program.
public class ListContainer {
    //TODO: add item list, add spell list, add WizardUnit list
    ArrayList <Unit> creatureUnitList = new ArrayList();

    public ListContainer() throws FileNotFoundException {
        ArrayList<String> list = FileUtil.loadList("creatures.txt");
        int listIndex = 0;
        for (int i = 0; i < list.size() / 4; i++) {
            String name = list.get(listIndex);
            listIndex++;
            int hp = Integer.parseInt(list.get(listIndex));
            listIndex++;
            int attackSpeed = Integer.parseInt(list.get(listIndex));
            listIndex++;
            int damage = Integer.parseInt(list.get(listIndex));
            listIndex++;
            creatureUnitList.add(new CreatureUnit(name, hp, attackSpeed, damage));
        }
        Collections.sort(creatureUnitList);
    }

    public ArrayList <CreatureUnit> randomCreatureGroup(int size){
        Random rand = new Random();
        int partySize = rand.nextInt(size) + 1;
        ArrayList <CreatureUnit> randomCreatureGroup = new ArrayList();
        for (int i = 0; i < partySize; i++){
            randomCreatureGroup.add((CreatureUnit)creatureUnitList.get(rand.nextInt(creatureUnitList.size())));
        }
        return randomCreatureGroup;
    }
}
