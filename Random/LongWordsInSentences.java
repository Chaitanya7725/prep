package Random;

import java.util.*;

public class LongWordsInSentences {

    public static void main(String[] args) {
        String input="Posted in: Science & Technology, Campus News: https://www.binghamton.edu/news/story/3806/binghamton-university-led-battery-initiative-wins-113-million-to-bolster-domestic-battery-manufacturing-and-supply-chain-reinvigorate-region Binghamton University's New Energy New York project has been awarded more than $113 million to establish a hub for battery technology innovation in upstate New York. The U.S. Economic Development Administration announced Friday that the region would receive $63.7 million; the State of New York will support the project with an additional $50 million. In a news conference held this morning, President Joe Biden and Commerce Secretary Gina Raimondo spoke directly to the 21 grant recipients, including the New Energy New York leadership team. \"I applaud every community that received the grant and those that applied. You're the reason I'm so optimistic about the future. There are nothing but possibilities here,\" said Biden. \"We designed this challenge to invest $1 billion to create jobs and opportunities for people in places where they live and where they have worked their entire careers, so they don't have to leave. This is for them,\" Biden said. \"We estimate that these grants will result in 100,000 jobs created or saved in these communities. Together these projects will uplift underserved communities.\" \"The New Energy New York team has worked hard on this project and without the leadership and guidance from Sen. Schumer from the beginning, we do not believe we would be here today,\" said Binghamton University President Harvey Stenger. \"Distinguished Professor and Nobel Prize-winner Stan Whittingham and our Associate Vice President Per Stromhaug had an idea they believed was crucial to our nation's energy security. They, along with their team and NENY coalition members, have carried the concept to this point where we can stand here today as winners of the EDA's Build Back Better Regional Challenge. With this win, and with the tremendous financial support from New York State Gov. Kathy Hochul, we are confident we can turn the Southern Tier and Finger Lakes regions of New York into the national hub for battery innovation, manufacturing and workforce development.\" .....";
        for (String word:getLongWords(input)) {
            System.out.println(word);
        }
    }

    private static List<String> getLongWords(String input){
        PriorityQueue<String> res=new PriorityQueue<>();
        Set<String> result=new HashSet<>();
//        String[] bigString=input.split(" ");
        String[] bigString=input.split("[./:\"\\-\\s]+");
        System.out.println(Arrays.toString(bigString));
        for (String words:bigString)
            if(words.length()>7)
                res.add(words.substring(0,7)+"...");
        while(!res.isEmpty())
            result.add(res.poll());
        return new ArrayList<>(result);
    }
}