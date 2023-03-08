package Random;

import java.util.*;

public class LongWordsInSentences {

    public static void main(String[] args) {
        String input="After a decade helping pharmacists at clinics and hospitals in Uganda improve " +
                "healthcare and cultivate a new generation of pharmaceutical care experts, KarenBeth " +
                "Bohan has learned to value a very simple lesson: Let your patient tell you what’s wrong. " +
                "Basics like these are what Bohan, professor and interim associate dean for education and " +
                "engagement in Binghamton University’s School of Pharmacy and Pharmaceutical Sciences, " +
                "hopes her students take from classrooms to clinical work and into whatever careers they " +
                "pursue in a rapidly evolving medical field. Bohan’s mantra is further explored in her blog, " +
                "“Out of the Pharmacy Classroom and Into Africa,” which delves into her work developing a " +
                "learning and serving experience for pharmacy students in Uganda.";
        System.out.println(getLongWords(input));
    }

    private static List<String> getLongWords(String input){
        PriorityQueue<String> res=new PriorityQueue<>();
        List<String> result=new ArrayList<>();
        String[] bigString=input.split(" ");
        for (String words:bigString) {
            if(words.length()>7)
                res.add(words.substring(0,7)+"...");
        }
        while(!res.isEmpty())
            result.add(res.poll());

        return result;
    }
}