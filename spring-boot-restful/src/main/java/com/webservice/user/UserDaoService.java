package com.webservice.user;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Sasaki", new Date()));
		users.add(new User(2, "Kimura", new Date()));
		users.add(new User(3, "Yamada", new Date()));
	}
	
	public User saveData(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	public List<User> findAll() {
		return users;
	}
		public User findOne(int id) {
			for(User user:users) {
				if(user.getId()==id) {
					return user;
				}
			}
			return null;
		}
}
