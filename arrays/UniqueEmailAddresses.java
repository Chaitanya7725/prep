package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueEmailAddresses {

    public static void main(String[] args) {
        String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));//2
        String[] emails1={"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numUniqueEmails(emails1));//3
        String[] emails2={"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(numUniqueEmails(emails2));//2
    }

    private static int numUniqueEmails(String[] emails) {
        Set<String> records=new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String before=emails[i].split("@")[0].split("\\+")[0].replace(".","");
            String after=emails[i].split("@")[1];
            if(!records.contains(before+after))
                records.add(before+"@"+after);
        }
        return records.size();
    }

}
