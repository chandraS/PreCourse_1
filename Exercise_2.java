import java.io.*;
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int number) 
        { 
            //Constructor here 
            data=number;
            next = null; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null)
            return true;
        else
            return false;
    } 
  
    public void push(int x) 
    { 
        StackNode temp = new StackNode(x);

        if(temp == null)
        {
            System.out.println("Stack full");
        }
        else
        {
            temp.data = x;
            temp.next=root;
            root=temp;
        }
         
    } 
  
    public int pop() 
    { 
        if(root==null)
        {
            return 0;
        }
        else{
            int numb = root.data;
            root = root.next;
            return (root.data);
        }
    
    } 
  
    public int peek() 
    { 
        if(!isEmpty())
            return root.data;
        else
            return 0;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
