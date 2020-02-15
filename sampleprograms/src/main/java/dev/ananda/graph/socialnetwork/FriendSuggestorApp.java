package dev.ananda.graph.socialnetwork;

import java.util.Set;

public class FriendSuggestorApp {
    public static void main(String[] args) {
        SocialNetwork server = new SocialNetwork();
        Set<User> suggestions = server.getFriendSuggestions(6);
        System.out.println("Suggested friends are....");
        suggestions.forEach(System.out::println);
    }
}
