package com.ntrs.pack1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IteratingList {
	
	private IteratingListDao dao;

	List<Delegate> li= new ArrayList<Delegate>();
	List<Delegate> lil= new ArrayList<Delegate>();

	public static void main(String[] args) {

		IteratingList ii= new IteratingList();
		ii.beginHere();		
		
	}
	
	public void beginHere()
	{
	 //dao.formNewList(li,lil);
	 Delegate d=new Delegate();
		d.setAppId(10);
		li.add(d);
		Delegate d2=new Delegate();
		d2.setAppId(20);
		li.add(d2);
		
		Delegate d1=new Delegate();
		d1.setAppName("IDM");
		lil.add(d1);
		Delegate d3=new Delegate();
		d3.setAppName("IDC");
		lil.add(d3);
		
		List<Delegate> finalList= new ArrayList<Delegate>();
		
		
		for (Delegate livalue:li)
		{
			
			for(Delegate lilvalue:lil )
			{
				Delegate vl= new Delegate();
				vl.setAppId(livalue.getAppId());
				System.out.println(vl.getAppId());
				vl.setAppName(lilvalue.getAppName());
				System.out.println(vl.getAppName());
				finalList.add(vl);
			}
		
			
		}
		System.out.println("List values"+finalList.get(0).getAppId());
		System.out.println("List values"+finalList.get(0).getAppName());
		System.out.println("Get(1)"+finalList.get(1).getAppId());
		System.out.println("Get(1)"+finalList.get(1).getAppName());
	}

}
