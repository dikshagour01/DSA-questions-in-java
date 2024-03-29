//+++++++++++++++++++++++++++ Reverse A STRING USING STACK +++++++++++++++++

import java.util.*;
public class stack5{
   public static String reverseString(String str){
    Stack<Character> s = new Stack<>();
    int idx=0;
    //push the element in the stack
    while(idx<str.length()){
        s.push(str.charAt(idx));
        idx++;
    }
   
    //pop the elements from the stack
    StringBuilder result = new StringBuilder("");
    while(!s.isEmpty()){
        char curr = s.pop();
        result.append(curr);
    }

    return result.toString();
   }
    public static void main(String args[]){
        String str="abcd";
        System.out.println(str);
        System.out.println(reverseString(str));
    }
}