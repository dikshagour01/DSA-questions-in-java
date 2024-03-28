//+++++++++++++++++++++++++++ Reverse A STRING USING STACK +++++++++++++++++

import java.util.*;
public class stack5{
    public static void reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;

        //push character into stack
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        //pop character from stack
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        str=result.toString();
        System.out.println(str);

    }
    public static void main(String args[]){
        String str="abcd";
        System.out.println(str);
        reverseString(str);
    }
}