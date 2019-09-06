import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
            The Map interface is a generic. The first type is the type of the key;
                the second, the type of the value.
         */
        Map<String, Color> favoriteColors = new HashMap<>();

        favoriteColors.put("Wyatt", Color.blue);
        favoriteColors.put("Ethan", Color.red);
        favoriteColors.put("Andrew", Color.green);
        favoriteColors.put("Eric", Color.blue);
        favoriteColors.put("Connor", Color.yellow);

        // create a set of all keys in the map
        Set<String> keySet = favoriteColors.keySet();

        // print all the keys and values  in the map
        for(String key : keySet)
        {
            System.out.println(key + ": " + favoriteColors.get(key));
        }
    }
}
