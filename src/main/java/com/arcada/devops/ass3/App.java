package com.arcada.devops.ass3;

public class App 
{
	
    public static void main( String[] args )
    {
    	FriendsList friendsList = new FriendsList();
    	
    	DataBank.loadFriends();
    	
    	System.out.println("Your list of friends: \n");
    	
		for (int i = 0; i < friendsList.getFriends().size(); i++) {
    		System.out.printf("%d: %s, age: %d\n",
                    i+1,
                    friendsList.getFriends(i).getName(),
    				friendsList.getFriends(i).getAge());    	
        }
    }
}
