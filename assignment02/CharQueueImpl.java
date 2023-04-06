package assignment02;

public class CharQueueImpl implements CharQueue{

    private StringBuilder bldr;
    public CharQueueImpl(StringBuilder builderIn) {
        bldr = builderIn;
    }

    @Override
    public char deQueue() {
        char returnEle=' ';
        if(bldr.length() > 0){
            returnEle=bldr.charAt(0);
            bldr.deleteCharAt(0);
        }
        return returnEle;
    }

    @Override
    public void enQueue(char e) {
        bldr.append(e+"");
    }

    @Override
    public boolean isEmpty() {
        return bldr.length()==0?true:false;
    }

    @Override
    public boolean remove(char e) {
        int index=bldr.indexOf(e+"");
        if(index!=-1){
            bldr.deleteCharAt(index);
            return true;
        }
        return false;
    }
}
