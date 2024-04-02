import java.util.*;
// VALID PARANTHESIS

public class stack9{
    public static boolean validParanthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            // for opening braces
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else{
                //for closing braces
                if(s.isEmpty()){
                    return false;
                }
                if((ch==')' && s.peek()=='(') ||( ch=='}' && s.peek()=='{') || (ch==']' && s.peek()=='[') ){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        String str ="({[]})";
        System.out.println(validParanthesis(str));
    }
}