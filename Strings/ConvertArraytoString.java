package strings;

public class ConvertArraytoString {

    public static void main(String[] args) {
        String [] array={"1","2","3","4"};
        System.out.println(convert(array));
    }

    private static String convert(String[] array){
        return String.join("",array);
    }


}
