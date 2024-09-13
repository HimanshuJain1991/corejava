package in.com.list_interface;

import java.util.Stack;

public class StackExample {
 public static void main(String[] args) {
    Stack st=new Stack();
    st.push(2);st.push(4);
    st.push(5);st.push(99);st.push(88);
    System.out.println(st);
    System.out.println(st.peek());//top of element
    System.out.println(st.pop());//remove top of element
    System.out.println(st);
 }   
}
