package assignment02;

import java.util.ArrayList;

public class CharSetTest {

    public static void main(String[] args) {

        /*StringBuilder bldr = new StringBuilder();
        CharSet set = new CharSetImpl(bldr);
        System.out.println(set.addToSet('1'));
        System.out.println(set.addToSet('2'));
        System.out.println(set.addToSet('2'));
        System.out.println(set.addToSet('3'));
        System.out.println(set.sizeOfSet());
        System.out.println(set.setContains('2'));
        System.out.println(set.deleteFromSet('2'));
        System.out.println(set.setContains('2'));
        System.out.println(set.deleteFromSet('2'));
        System.out.println(set.sizeOfSet());*/

        ArrayList<Character> list=new ArrayList<>();
        CharSet set = new CharSetImpl(list);
        System.out.println(set.addToSet('a'));
        System.out.println(set.addToSet('b'));
        System.out.println(set.addToSet('b'));
        System.out.println(set.addToSet('c'));
        System.out.println(set.sizeOfSet());
        System.out.println(set.setContains('b'));
        System.out.println(set.deleteFromSet('b'));
        System.out.println(set.setContains('b'));
        System.out.println(set.deleteFromSet('b'));
        System.out.println(set.sizeOfSet());

    }

}
