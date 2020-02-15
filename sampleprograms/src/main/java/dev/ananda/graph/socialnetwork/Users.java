package dev.ananda.graph.socialnetwork;

import dev.ananda.utils.FilesUtility;

import java.io.IOException;
import java.util.List;

public class Users {

	private Users() {
		initiateUserRecords();
	}

	private static User[] users = new User[Constants.MAX_USER_COUNT];
	private static Users instance = new Users();

	public static Users getInstance() {
		return instance;
	}

	private void initiateUserRecords() {

		System.out.println("Initiating user records...");

		try {
			List<String> lines = FilesUtility.getAllLines(Constants.USER_DATA_FILE);
			for (String line : lines) {
				addUser(line);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("User data doesnt exist!!");
			System.out.println("Unable to boot up !! Shutting down !!");
			System.exit(0);
		}

	}

	private int userCount = 0;

	public synchronized void addUser(String name) {
		if (null == name) {
			throw new RuntimeException("Invalid user details !!");
		}
		User newUser = new User(this.userCount, name);
		users[userCount] = newUser;
		this.userCount++;
	}

	public User getUser(int userID) {
		if (this.userCount < userID) {
			throw new RuntimeException("Invalid user ID");
		}
		return users[userID];
	}

}
