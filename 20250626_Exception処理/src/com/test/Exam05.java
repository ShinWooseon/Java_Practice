package com.test;
import java.util.*;

class Car implements Runnable{
	  int a;
	  
	  public void run(){
	     System.out.println("Hello");
	  }
	}
	  
	public class Exam05{
	  public static void main(String[] args){
	    Thread t1 = new Thread(new Car());
	    t1.start();
	  }
	}