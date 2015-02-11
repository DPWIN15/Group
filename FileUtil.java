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
}
