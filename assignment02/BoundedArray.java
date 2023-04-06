package assignment02;

public class BoundedArray {

    private boolean[] array = new boolean[100];
    public void flip(int i) {
        array[i] = !array[i];
    }
    public int trueCount() {
        int i = 0;
        for(boolean v : array)
        if(v) i++;
        return i;
    }
    public boolean isTrue(int i){
        return array[i];
    }

}
