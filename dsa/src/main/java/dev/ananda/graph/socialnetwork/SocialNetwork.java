package dev.ananda.graph.socialnetwork;

import java.util.Set;

public class SocialNetwork {
	
	private FriendShipBean relations;
	
	public SocialNetwork(){
		initServer();
	}
	
	public void initServer(){
		relations = FriendShipBean.getInstance();
	}
	
	public Set<User> getFriendSuggestions(int userID){
		return this.relations.getFriendSuggestionsForUser(userID);
	}

}
