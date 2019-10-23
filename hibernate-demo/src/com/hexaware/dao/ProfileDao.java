package com.hexaware.dao;

import java.time.LocalDate;
import java.util.List;

import com.hexaware.entities.Profile;

public interface ProfileDao {
	public int store(Profile profile);
	public Profile findProfile(int profileId);
	public List<Profile> findAllProfiles();
	public Profile updateDOB(int profileId, LocalDate dob);
	public Profile Login(int profileId, String password);
	public List<Profile> findProfilesByName(String name);
	public List<Profile> orderProfilesByName();
	public List<Profile> orderProfilesByDob();
	
}
