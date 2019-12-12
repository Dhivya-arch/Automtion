package com.ntrs.pack1;

import java.util.List;

public class IteratingListDao {

	public void formNewList(List<Delegate> li, List<Delegate> lil) {

		Delegate d=new Delegate();
		d.setAppId(10);
		li.add(d);
		d.setAppId(20);
		li.add(d);
		
		d.setAppName("IDM");
		lil.add(d);
		d.setAppName("IDC");
		lil.add(d);
		
		
	}

}
