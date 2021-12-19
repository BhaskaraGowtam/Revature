package com.gmail.dao;

import java.util.ArrayList;
import java.util.List;

import com.gmail.entity.GmailUserEntity;

public class GmailUserDAO implements GmailUserDAOInterface {
	private static List<GmailUserEntity> gue= new ArrayList<GmailUserEntity>();    
	
	public int CreateProfileService(GmailUserEntity gu) {
		int i=0;
		gue.add(gu);
		if (gue.size()>0)
		{
			i=1;
		}
		return i;
	}
	public List<GmailUserEntity> ViewAllProfile() {
		return gue;
		
	}
}