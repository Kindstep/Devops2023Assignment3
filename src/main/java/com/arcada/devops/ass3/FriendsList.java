package com.arcada.devops.ass3;

import java.util.ArrayList;

public class FriendsList {
	
	public static ArrayList<Friend> friends = new ArrayList<>();

	public void addFriend(Friend friend) {
    friends.add(friend);
	}
	
	public ArrayList<Friend> getFriends(){
		return friends;
	}
	
	public Friend getFriends(int index) {
	return friends.get(index);
	}
	
	public void removeFriend(int index) {
		friends.remove(index);
	}
}
