package assignment02;

import java.util.ArrayList;

public class CharSetImpl implements CharSet{

    /*private StringBuilder bldr;
    public CharSetImpl (StringBuilder builderIn) {
        bldr = builderIn;
    }

    @Override
    public boolean addToSet(char e) {
        if(bldr.indexOf(e+"")==-1){
            bldr.append(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteFromSet(char e) {
        if(bldr.indexOf(e+"")!=-1){
            bldr.deleteCharAt(bldr.indexOf(e+""));
            return true;
        }
        return false;
    }

    @Override
    public boolean setContains(char e) {
        return bldr.indexOf(e+"")!=-1 ? true:false;
    }

    @Override
    public int sizeOfSet() {
        return bldr.length();
    }*/

    private ArrayList<Character> list;
    public CharSetImpl (ArrayList<Character> listIn) {
        list = listIn;
    }

    @Override
    public boolean addToSet(char e) {
        if(!list.contains(e))
            return list.add(e);
        return false;
    }

    @Override
    public boolean deleteFromSet(char e) {
        if(list.contains(e))
            return list.remove(Character.valueOf(e));
        return false;
    }

    @Override
    public boolean setContains(char e) {
        return list.contains(e);
    }

    @Override
    public int sizeOfSet() {
        return list.size();
    }
}
