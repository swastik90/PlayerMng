package com.acc.lkm.ManagePlayer;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		System.out.println("Welcome to Player Management System");
		Team team = new Team();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Choose a option from the list");
			System.out.println("1.Add Player");
			System.out.println("2.Remove Player");
			System.out.println("3.Display Players");
			System.out.println("4.Check if player is in the team");
			System.out.println("5.Exit Program");
			int option = sc.nextInt();
			if (option <= 0 || option > 5) {
				System.out.println("You have slected a wrong option, Try again");
				continue;
			}
			switch (option) {
			case 1:
				team.addPlayer();;
				break;
			case 2:
				team.removePlayer();
				break;
			case 3:
				team.displayPlayers();
				break;
			case 4:
				team.checkPlayerInTeam();
				break;
			case 5:
				return;
			}
		}
	}
}
