package assignment02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntSetImpl extends BoundedArray implements IntSet  {

/*public class IntSetImpl extends ArrayList<Integer> implements IntSet  {
    private static final long serialVersionUID = 5465283085896313084L;
    Set<Integer> records=new HashSet<>();

    @Override
    public boolean addToSet(int e) {
        return records.contains(e) ? false : records.add(e);
    }

    @Override
    public boolean deleteFromSet(int e) {
        return records.contains(e) ? records.remove(Integer.valueOf(e)) : false;
    }

    @Override
    public boolean setContains(int e) {
        return records.contains(e);
    }

    @Override
    public int sizeOfSet() {
        return records.size();
    }*/

    BoundedArray ba=new BoundedArray();
    @Override
    public boolean addToSet(int e) {
        if(!ba.isTrue(e)){
            ba.flip(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteFromSet(int e) {
        if(ba.isTrue(e)){
            ba.flip(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean setContains(int e) {
        return ba.isTrue(e);
    }

    @Override
    public int sizeOfSet() {
        return ba.trueCount();
    }


}
