package strings;

import java.util.*;

public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> paths=new ArrayList<>(){
            {
                add(Arrays.asList("London","New York"));
                add(Arrays.asList("New York","Lima"));
                add(Arrays.asList("Lima","Sao Paulo"));
            }
        };
        System.out.println(destCity(paths));//Sau paulo

        List<List<String>> paths1=new ArrayList<>(){
            {
                add(Arrays.asList("B","C"));
                add(Arrays.asList("D","B"));
                add(Arrays.asList("C","A"));
            }
        };
        System.out.println(destCity(paths1));//A

        List<List<String>> paths2=new ArrayList<>(){
            {
                add(Arrays.asList("A","Z"));
            }
        };
        System.out.println(destCity(paths2));//Z
    }

    private static String destCity(List<List<String>> paths) {
        Set<String> destinations=new HashSet<>();
        for (List<String> cities: paths)
            destinations.add(cities.get(1));
        for (List<String> cities: paths) {
            if(destinations.contains(cities.get(0)))
                destinations.remove(cities.get(0));
        }
        String[] geeks = destinations.toArray(new String[destinations.size()]);
        if(geeks.length>0)
            return geeks[0];
        return "";
    }

}
