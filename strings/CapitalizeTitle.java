package strings;

public class CapitalizeTitle {

    public static void main(String[] args) {
        String title="capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));

        String title1="First leTTeR of EACH Word";
        System.out.println(capitalizeTitle(title1));

        String title2="i lOve leetcode";
        System.out.println(capitalizeTitle(title2));

        String title3="L hV";
        System.out.println(capitalizeTitle(title3));
    }

    private static String capitalizeTitle(String title) {
        String [] splitedTitle=title.split(" ");
        for (int i = 0; i < splitedTitle.length; i++)
            if(splitedTitle[i].length()>2)
                splitedTitle[i]=String.valueOf(splitedTitle[i].charAt(0)).toUpperCase()+splitedTitle[i].substring(1).toLowerCase();
            else
                splitedTitle[i]=String.valueOf(splitedTitle[i].charAt(0)).toLowerCase()+splitedTitle[i].substring(1).toLowerCase();
        return String.join(" ", splitedTitle);
    }

}
