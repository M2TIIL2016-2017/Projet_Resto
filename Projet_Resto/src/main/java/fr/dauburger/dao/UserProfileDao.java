package fr.dauburger.dao;

import java.util.List;

import fr.dauburger.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
