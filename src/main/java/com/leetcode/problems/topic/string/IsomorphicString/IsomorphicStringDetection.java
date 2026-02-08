package com.leetcode.problems.topic.string.IsomorphicString;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringDetection {
    public static void main(String[] args) {

        /*

        isomorphic : each char should have only 1:1 mapping
        if any mapping gets lost
        need to return false
        ex: egg
            add  a-> e  , g-> d

            foo and bar:  f-> b o->a  o->r
            o mapping is getting changed
         */
//        String str = "egg";
//        String str1= "add";

        String str = "foo";
        String str1= "bar";

        System.out.println("Is string isomorphic = "+isomorphic(str, str1));
    }

    private static  boolean isomorphic(String str1, String str2)
    {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int firstLength = chars1.length;
        int secondLength = chars2.length;
        Map<Character, Character> mapping = new HashMap<>();
        int i=0;
        int j= 0;
        while (i< chars1.length || j < chars2.length)
        {
           if (mapping.containsKey(chars1[i]))
           {
               Character chr = mapping.get(chars1[i]);
               if (chr != chars2[j])
               {
                return false;
               }
           }
           else {
               mapping.put(chars1[i], chars2[j]);
           }
            if(i < chars1.length)
            i++;

            if(j< chars2.length)
            j++;
        }
        return true;
    }
}
