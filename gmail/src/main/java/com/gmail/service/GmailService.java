package com.gmail.service;

import java.util.List;

import com.gmail.dao.GmailUserDAO;
import com.gmail.dao.GmailUserDAOInterface;
import com.gmail.entity.GmailUserEntity;

public class GmailService implements GmailServiceInterface {

	public int CreateProfileController(GmailUserEntity gu) {
		GmailUserDAOInterface gd=new GmailUserDAO();
		return gd.CreateProfileService(gu);
	}

	public List<GmailUserEntity> viewAllprofileService() {
		GmailUserDAOInterface gd=new GmailUserDAO();
		return gd.ViewAllProfile();
	}
	
	

}
