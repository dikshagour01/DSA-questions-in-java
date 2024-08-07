//++++++++++++++++++++++++++++ PUSH ELEMENT AT BOTTOM OF STACK ++++++++++++++++++++++++++
import java.util.*;
public class PushAtBottom{
    public static void push_At_Bottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        push_At_Bottom(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s =  new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        push_At_Bottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}