/**
 * Created by Max Towery on 2/9/2015.
 */
import java.util.*;
import java.io.*;
public class FileUtil {

    //load any list from file name specified
    public static ArrayList<String> loadList(String name) throws FileNotFoundException {

        Scanner fin;
        fin = new Scanner(new File(name));
        ArrayList<String> myList = new ArrayList();
        while (fin.hasNextLine()){
            myList.add(fin.nextLine());
        }
        fin.close();
        return myList;
    }
    
    //Opens Spells file and fills list with spells and returns the list JAD
    public static ArrayList<Spell> buildSpells()throws FileNotFoundException
    {
        ArrayList<Spell> spells = new ArrayList<Spell>();
        int j = 0;
        int damage, coolDown;
        String name, type;
        File f = new File("spells.txt");
        Scanner fin = new Scanner(f);

        while(fin.hasNext())
        {
            name = fin.next();
            damage = fin.nextInt();
            coolDown = fin.nextInt();
            type = fin.next();
            fin.nextLine();
            Spell temp = new Spell(name, damage, coolDown, type);
            spells.add(temp);
            j++;
        }
}
