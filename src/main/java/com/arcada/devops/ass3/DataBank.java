package com.arcada.devops.ass3;

public class DataBank {
	
	static void loadFriends() {
	FriendsList friendsList = new FriendsList();
	friendsList.addFriend(new Friend("Anders", "Andersson",23));
	friendsList.addFriend(new Friend("Anu", "Saukko",48));
	friendsList.addFriend(new Friend("Eetu", "Rauhanen",52));
	friendsList.addFriend(new Friend("Per", "Saukko",18));
	friendsList.addFriend(new Friend("Ann", "Ahlqvist",43));
	friendsList.addFriend(new Friend("Jamppa", "Tuominen",32));
	friendsList.addFriend(new Friend("Nalle", "Balle",36));
	friendsList.addFriend(new Friend("Matti", "Nykänen",65));
	friendsList.addFriend(new Friend("Walter", "Kindstedt",2));
	friendsList.addFriend(new Friend("Alina", "Kindstedt",5));
          
    }
}
