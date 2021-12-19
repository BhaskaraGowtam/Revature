package com.gmail.service;

import java.util.List;

import com.gmail.entity.GmailUserEntity;

public interface GmailServiceInterface {
		
		int CreateProfileController(GmailUserEntity gu);
		
		List<GmailUserEntity> viewAllprofileService();
}
