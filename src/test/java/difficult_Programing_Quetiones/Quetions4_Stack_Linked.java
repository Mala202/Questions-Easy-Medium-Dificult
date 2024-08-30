package difficult_Programing_Quetiones;

import ch.qos.logback.core.pattern.parser.Node;

public class Quetions4_Stack_Linked {

		//Write a program to implement a stack using a linked list in Java.
	
	    int data;
	    Node next;
	    void Node(int new_data) {
	        this.data = new_data;
	        this.next = null;
	    }
	}

	class Stack {

	    Node head;

	    Stack() { this.head = null; }

	    boolean isEmpty() {

	        return head == null;
	    }

	    void push(int new_data) {

	        Node new_node = new Node(new_data);

	        System.out.println("nStack Overflow");
	            return;
	    }

	    void pop() {

	        if (isEmpty()) {
	            System.out.println("\nStack Underflow");
	            return;
	        }
	        else {
	            Node temp = head;
	            head = head.getNext();
	            temp = null;
	        }
	    }
	    int peek() {
	        if (!isEmpty())
	            return head.hashCode();
	        else {
	            System.out.println("\nStack is empty");
	            return Integer.MIN_VALUE;
	        }
	    }
	}
	
	public class main {
	    public static void main(String[] args)
	    {

	        Stack st = new Stack();

	        st.push(11);
	        st.push(22);
	        st.push(33);
	        st.push(44);

	        System.out.println("Top element is " + st.peek());
	        System.out.println("Removing two elements...");
	        st.pop();
	        st.pop();

	        System.out.println("Top element is " + st.peek());
	    }
	}


	


