package com.company.demo;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean check(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        Map<Character, Character> s1map = new HashMap<>();
        Map<Character, Character> s2map = new HashMap<>();
        for(int i=0; i<s1.length(); i++)
        {
            char s1char = s1.charAt(i);
            char s2char = s2.charAt(i);
            if(s1map.containsKey(s1char))
            {
                if(s1map.get(s1char)!=s2char)
                {
                    return false;
                }
            }
            if(s2map.containsKey(s2char))
            {
                if(s2map.get(s2char)!=s1char)
                {
                    return false;
                }
            }
            s1map.put(s1char,s2char);
            s2map.put(s2char,s1char);
        }
        return true;
    }
    public static void main(String[] args) {
        IsomorphicStrings i = new IsomorphicStrings();
        System.out.println(i.check("abc", "bcd"));
        System.out.println(i.check("foo", "bar"));
        System.out.println(i.check("paper", "title"));
        System.out.println(i.check("egg", "add"));
    }
}
