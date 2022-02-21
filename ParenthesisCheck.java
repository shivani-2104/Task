package com.company.Day6.Assesment;

import java.util.Stack;

public class ParenthesisCheck {
    static boolean check(String s)
    {
        if(s.length()%2!=0)return false;
        boolean flag=true;
        int i=0,j=0;
        Stack <Character>stack=new Stack();
        while(i<s.length())
        {
            stack.push(s.charAt(i));
            i++;
        }
        while(!stack.isEmpty())
        {
            Character c=stack.peek();
            if(c==')')
            {
                if(stack.contains('('))
                {
                  stack.removeElement('(');
                   stack.removeElement(c);
                }
                else return false;
            }
            else if(c=='}')
            {
                if(stack.contains('{'))
                {
                    stack.removeElement(c);
                    stack.removeElement('{');
                }
                else return false;
            }
            else if(c==']')
            {
                if(stack.contains('['))
                {
                    stack.removeElement(c);
                    stack.removeElement('[');
                }
                else return false;
            }
            else
            {
                return false;
            }


        }
        return flag;
    }
    public static void main(String[] args) {
        String s="{()";
//        String s="({}{})";
        boolean flag=check(s);
        System.out.println(flag);
    }
}
