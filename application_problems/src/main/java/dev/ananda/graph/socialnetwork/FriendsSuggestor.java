package dev.ananda.graph.socialnetwork;

import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.dsa.graph.IGraph;
import dev.ananda.dsa.queue.IQueue;
import dev.ananda.dsa.queue.QueueImpl;

import java.util.HashSet;
import java.util.Set;

public class FriendsSuggestor {
	
	private Users users = Users.getInstance();
	public FriendsSuggestor(){
		this.users = Users.getInstance();
	}
	
	public Set<User> getFriendSuggestionsForUser(IGraph<User> friendshipGraph, int userID) {

		Set<User> suggestions = new HashSet<>();
		int[] level = new int[Constants.MAX_USER_COUNT];
		boolean[] visited = new boolean[Constants.MAX_USER_COUNT];

		IQueue<Integer> queue = new QueueImpl<>();
		queue.enqueue(userID);

		level[userID] = -1;
		visited[userID] = true;
		try {
			while (!queue.isEmpty()) {
				int queuedUser = queue.dequeue();
				for (int curruser : friendshipGraph.getAdjacentNodes(queuedUser)) {
					if (!visited[curruser]) {
						visited[curruser] = true;
						level[curruser] = level[queuedUser] + 1;
						if (Constants.FRIEND_SUGGESTION_LEVEL > level[curruser]) {
							queue.enqueue(curruser);
						}
						if (level[curruser] > 0 && Constants.FRIEND_SUGGESTION_LEVEL >= level[curruser]) {
							suggestions.add(users.getUser(curruser));
						}
					}
				}
			}
		} catch (QueueEmptyException e) {
			e.printStackTrace();
		}
		return suggestions;
	}

}
