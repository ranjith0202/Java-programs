package com.ranjith.programs;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class LinkedListExample {

	public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);
        
        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list); 
        
        //list.remove();       
        //list.removeFirst();
        //list.removeLast();
        list.remove("B");//Here iteration happen but its not visible
        System.out.println(list);
        
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2)); // index-based
      
	}
	
	 
	 
	 class Node<E> {
		    E data;
		    Node<E> next;

		    Node(E data) {
		        this.data = data;
		    }
		}


}
