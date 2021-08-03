package com.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class ValidateParenthesis {
    public static void main(String[] args) throws IOException {
        StringBuilder input=new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            input.append(line);
        }
        boolean isValidCode= checkValidateParenthesis(input.toString());
         System.out.println(isValidCode?"Valid":"invalid");

    }

    private static boolean checkValidateParenthesis(String input) {
        Stack<Character>  parenthesisStack=new Stack<>();
        for (int i=0;i<input.length();i++){
            Character ch=input.charAt(i);
             if(ch =='{'){
                 parenthesisStack.push(ch);
             }
             if (ch=='}'){
                 if (parenthesisStack.empty()){
                     return  false;
                 }else{
                     parenthesisStack.pop();
                 }
             }
        }
        if(parenthesisStack.empty()){
            return true;
        }
        return false;
    }
}
