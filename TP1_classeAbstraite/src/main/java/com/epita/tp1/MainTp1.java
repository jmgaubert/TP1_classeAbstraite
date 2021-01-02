package com.epita.tp1;

public class MainTp1 {

	public static void main(String[] args) {
		
		//Solution 1
		Chat chat = new Chat();
		chat.communiquer();
		
		Chien chien = new Chien();
		chien.communiquer();
		
		//Solution 2 (polymorphisme
		Animal animal = new Chat();
		animal.communiquer();
				
		animal = new Chien();
		animal.communiquer();
			
	}
 
}
