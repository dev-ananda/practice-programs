package dev.ananda.graph.socialnetwork;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import dev.ananda.dsa.graph.GraphImpl;
import dev.ananda.dsa.graph.IGraph;
import dev.ananda.utils.FilesUtility;

public class FriendShipBean {

	IGraph<User> friendshipGraph = new GraphImpl<>(Constants.MAX_USER_COUNT);

	FriendsSuggestor suggestor = new FriendsSuggestor();

	private FriendShipBean() {
		initiateRelationships();
	}

	private void initiateRelationships() {

		try {
			List<String> relations = FilesUtility.getAllLines(Constants.USER_RELATIONS_GRAPH_FILE);

			for (String relation : relations) {
				String[] relationship = relation.split(" ");
				addFriend(Integer.parseInt(relationship[0]), Integer.parseInt(relationship[1]));
			}

		} catch (IOException e1) {

			e1.printStackTrace();

			System.out.println("Relationship data doesnt exist!!");
			System.out.println("Unable to boot up !! Shutting down !!");
			System.exit(0);
		}

	}

	public static FriendShipBean instance = new FriendShipBean();

	public static FriendShipBean getInstance() {
		return instance;
	}

	public void addFriend(int userID, int friendID) {
		this.friendshipGraph.addEdge(userID, friendID);
	}

	public Set<User> getFriendSuggestionsForUser(int userID) {
		return suggestor.getFriendSuggestionsForUser(friendshipGraph, userID);
	}

	public void showFriends() {

	}

}
