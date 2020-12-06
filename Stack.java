

/**
 * My Name    : Awad abdallrahman
 * Class      : 2th
 * Department : computer Engineering 
 */
   class Stack
   {
       
       int top;
       int a[] = new int[40]; //  size of Stack
     
       Stack(){
            top = -1;
       }

       boolean isEmpty() {
           return (top < 0);
       }
     
   
       boolean push(int x) {
           if (top >= 40)
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
   
       int pop()  {
           if (top < 0)
           {
               System.out.println("Stack is empity");
               return 0;
           }
           else
           {
               int x = a[top--];
               return x;
           }
       }
   }
   
 
   class Main
   {
       public static void main(String args[])
       {
           Stack s = new Stack();
           s.push(12);
           s.push(14);
           s.push(16);
           System.out.println(s.pop() + "  stack");
       }
   }
