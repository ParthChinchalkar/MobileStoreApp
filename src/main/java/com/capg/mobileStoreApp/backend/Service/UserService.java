package com.capg.mobileStoreApp.backend.Service;

import java.util.List;

import com.capg.mobileStoreApp.backend.Exceptions.UserNotFoundException;
import com.capg.mobileStoreApp.backend.Model.User;

public interface UserService {
	public User addUser(User User);
	public User updateUser(User User) throws UserNotFoundException;
	public User removeUser(int userId) throws UserNotFoundException;
	public List<User> showAllUsers();
	public boolean validateUser(int userid,String userName);
}
