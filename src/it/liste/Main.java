package it.liste;

/**
 * <p>Test entry point</p>
 *
 * Created by Andrea Brisotto and Matteo Formenti on 19/04/16.
 */
public class Main
{
    public static void main(String arg[])
    {
        String s1 = new String("ciao");
        String s2 = new String("test");
        List<String> l = new List();
        l.add(new String("stringa 1"));
        l.add(new String("stringa 2"));
        l.add(s1);
        l.add(new String("stringa 3"));
        l.add(new String("stringa 4"));

        System.out.println("Start Size: " + l.size());
        for (String s:l)
        {
            System.out.println(s);
        }
        l.remove(s1);

        System.out.println("\nSize after removing object: " + l.size());
        for (String s : l)
            System.out.println(s);

        l.add(s2, 2);
        System.out.println("\nSize after adding object: " + l.size());
        for (String s : l)
            System.out.println(s);
    }
}
