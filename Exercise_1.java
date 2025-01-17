class Stack {
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return (top < 0);

    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        if(top<MAX)
        {

            top++;
            a[top]= x;

            return true;
        }
         return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1)
        {
            System.out.println("Stack Underflow ");
            return 0;
        }
        else  if(top>0)
        {
            top = top-1;
            System.out.println("Item popped");
            return a[top];


        }

        return -1;
    } 
  
    int peek() 
    { 
        return top;
    } 
} 
  
// Driver code 
public class Exercise_1 {
    public static void main(String[] args)
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
