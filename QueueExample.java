package com.lists;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
	public static void main(String[] args) {
	      Queue<String> q = new LinkedList<>();
	      q.offer("abc");
	      q.offer("def");
	      q.offer("ghi");
	      q.offer("jkl");
	      q.offer("mno");
	      q.offer("pqr");
	      q.offer("stu");
	      q.offer("vwx");
	      System.out.println("Queue head = " + q.element());
	      System.out.println("Removing element from queue = " + q.remove());
	      System.out.println("\nRemaining Queue elements...");
	      Object ob;
	      while ((ob = q.poll()) != null) {
	         System.out.println(ob);
	      }
	   }
}
