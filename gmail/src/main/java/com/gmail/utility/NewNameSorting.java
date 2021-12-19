package com.gmail.utility;

import java.util.Comparator;

import com.gmail.entity.GmailUserEntity;

public class NewNameSorting implements Comparator<GmailUserEntity> {
	
	public int compare(GmailUserEntity o1, GmailUserEntity o2) {
		
		return o1.getName().compareTo(o2.getName());
		
	}

}
