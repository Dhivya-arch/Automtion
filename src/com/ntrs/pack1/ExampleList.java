package com.ntrs.pack1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ExampleList {

	public static void main(String[] args) {

		ExampleList  exl = new ExampleList();
		Map<Group,List<User>> usergrp =exl.assignValues();
	
		//System.out.println("Map"+objmap);
	
		Iterator<Map.Entry<Group,List<User>>> itr =  usergrp.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Group,List<User>> entry = itr.next();
			System.out.println("Key"+entry.getKey().getGroupname());
			System.out.println("Key"+entry.getKey().getMemebrs());
			System.out.println("Value"+entry.getValue().get(0));
		}
		
	}

	private Map<Group, List<User>> assignValues() {
	
	ArrayList<User> l= new ArrayList<User>();
		
		User u= new User();
		u.setFirstname("Divi");
		u.setLastname("k");
		u.setDept(6542);
		
		l.add(u);
		
		
		for(User user:l)
		{
			System.out.println(user.getFirstname());
		}
		
		Map<Group,List<User>> objmap= new HashMap<Group,List<User>>();
		Group grp = new Group();
		grp.setGroupname("Cost center");
		grp.setMemebrs(10);
		objmap.put(grp, l);
		System.out.println("First List values"+l.get(0));
		Group grp1 = new Group();
		grp1.setGroupname("Business unit");
		grp1.setMemebrs(15);
		
		objmap.put(grp1, l);
		
		return objmap;
	}
	

}
