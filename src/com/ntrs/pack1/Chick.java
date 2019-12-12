package com.ntrs.pack1;

 public class Chick {
 private String name = "Fluffy";
 
 int c=2147483647+1;

 { 
 System.out.println("nt value" +c);
 
 String sb = new String("start");
 sb.concat("+middle");
 System.out.println("String class"+sb);
 
 StringBuilder sbb = new StringBuilder("start");

 sbb.append("+middle");
 System.out.println(sbb);
 
 
 StringBuilder a = new StringBuilder("abc");
  StringBuilder b ;
		  a.append("de");
 b = b.append("f").append("g");
  System.out.println("a=" + a);
  System.out.println("b=" + b);
  
  StringBuilder sc = new StringBuilder("animals");
  sc = sc.substring(sc.indexOf("a"), sc.indexOf("al"));
  int len = sb.length();
  char ch = sb.charAt(6);
  System.out.println(sub + " " + len + " " + ch);
 }
 
 
 public Chick() {
 name = "Tiny";
System.out.println("setting constructor");
Integer h=null;
//int k=null;
 }
 public static void main(String[] args) {
 Chick chick = new Chick();
 
		 //short x = 14;
		 float y = 13;
		 double z = 30;
		 double c= y / z;
		 
 System.out.println(chick.name); } }