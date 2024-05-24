package com.acc.lkm.ManagePlayer;

public class Player {
	private String player_name;
	private int player_id;
	public Player(String player_name, int player_id) {
		super();
		this.player_name = player_name;
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.player_name+","+this.player_id;
	}

}
