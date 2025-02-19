import java.io.*;
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty()
    {
      if(top < 0)
        return true;
      else
        return false;
    }

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if(top > MAX)
        {
          System.out.println("Stack is full");
          return false;
        }
        else
          {
            a[++top] = x;
            return true;
          }
    } 
  
    int pop() 
    { 
        if(top < 0)
        {
          System.out.println("Stack is empty");
          return 0;
        }
          else
        {
          int x= a[top--];
          return x;
        }
    } 
  
    int peek() 
    { 
      if(top < 0)
        {
          System.out.println("Stack is empty");
          return 0;
        }
          else
        {
          int x= a[top];
          return x;
        }
        
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
