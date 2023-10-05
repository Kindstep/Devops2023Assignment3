package com.arcada.devops.ass3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AppTest {

	@Test
	public void getName() {
		Friend test = new Friend("Testy","Testerson",10);
		assertEquals("Testy Testerson", test.getName());
	}
	
	@Test
	public void getAge()	{
		Friend test = new Friend("Testy","Testerson",10);
		assertEquals(10, test.getAge());
	}
	
	@Test
	public void getFriends() {
		
		FriendsList testList = new FriendsList();
		testList.addFriend(new Friend("Anders", "Andersson",23));
		testList.addFriend(new Friend("Anu", "Saukko",48));
		testList.addFriend(new Friend("Eetu", "Rauhanen",52));
		testList.addFriend(new Friend("Per", "Saukko",18));
		testList.addFriend(new Friend("Ann", "Ahlqvist",43));
		
		assertEquals("Anders Andersson", testList.getFriends(0).getName());	
	}
	
	@Test
	public void removeFriend() {
		
		FriendsList testList = new FriendsList();
		testList.addFriend(new Friend("Anders", "Andersson",23));
		testList.addFriend(new Friend("Anu", "Saukko",48));
		testList.addFriend(new Friend("Eetu", "Rauhanen",52));
		testList.addFriend(new Friend("Per", "Saukko",18));
		testList.addFriend(new Friend("Ann", "Ahlqvist",43));
		
		testList.removeFriend(2);
		
		assertNotEquals(5, testList.getFriends().size());
	}
	
}
