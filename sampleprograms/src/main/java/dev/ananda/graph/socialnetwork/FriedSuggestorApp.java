package dev.ananda.graph.socialnetwork;

import java.util.Set;

public class FriedSuggestorApp {
	public static void main(String[] args) {
		SocialNetwork server = new SocialNetwork();
		Set<User> suggestions = server.getFriendSuggestions(6);
		suggestions.forEach(System.out::println);
	}
}
