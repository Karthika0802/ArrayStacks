
/**
 * Write a description of class ArrayStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;


public class ArrayStack
{
    int arr[];
    int top;
    ArrayStack(int n){
        arr = new int[n]; 
        top = -1; 
    }
    
    void Push(int n){
        
        if(top+1>=arr.length-1){
            System.out.println("This Stack is full! Pop something to add something else!");
        }
        
        else{
            top++;
            arr[top] = n;
        }
    
    }
    
    int Pop(){
    
        if(top==-1){
            System.out.println("This Stack is empty, please push some things to this Stack!");
            return 0;
        }
        
        int hold = arr[top];
        arr[top] = 0;
        top--;
        
        return hold;
        
    
    }
    
    boolean isEmpty(){
    
        return top == -1;
    
    }
    
    boolean isFull(){
    
        return top == arr.length-1;
    
    }
    
    void printStack(){
        System.out.println(Arrays.toString(arr));
    }
}
