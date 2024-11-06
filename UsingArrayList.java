import java.util.*;
public class UsingArrayList {
    static class stack{
        static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void Push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        stack s=new stack();
        s.Push(25);
        s.Push(74);
        s.Push(52);
        s.Push(45);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        
        }
        System.out.println(s.peek());
    }

    
}
