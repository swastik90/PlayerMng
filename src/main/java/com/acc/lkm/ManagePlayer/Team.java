package com.acc.lkm.ManagePlayer;

import java.util.HashSet;
import java.util.Scanner;

public class Team {
	HashSet<Player> team = new HashSet();
	Scanner sc = new Scanner(System.in);
	
	public void addPlayer() {
		System.out.println("Enter the Player Name");
		String name = sc.next();
		System.out.println("Enter the Player id");
		int id = sc.nextInt();
		
		team.add(new Player(name,id));
		
		
	}
	
	public void removePlayer() {
		System.out.println("Enter the player id you want to remove from the team");
		int id = sc.nextInt();
		Player player = null;
		for(Player p:team) {
			if(p.getPlayer_id()==id) {
				player = p;
			}
		}
		if(player.equals(null)) {
			System.out.println("No Player found with this id");
			return;
		}
		
		team.remove(player);
	}
	
	public void displayPlayers() {
		for(Player p:team) {
			System.out.println("Player{"+p.toString()+"}");
		}
	}
	
	public void checkPlayerInTeam() {
		System.out.println("Enter the player id you want to check");
		int id = sc.nextInt();
		for(Player p:team) {
			if(p.getPlayer_id()==id) {
				System.out.println("Yes, The player is in the team");
				return;
			}
		}
		System.out.println("Player is not in the team");
	}

}
