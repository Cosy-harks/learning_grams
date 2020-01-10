package com.search.dao;

import java.util.List;

import com.search.to.Player;

public interface PlayerSearchDAO {
	public Player getPlayerById(String id);
	public List<Player> getPlayerByName(String name);
//	public List<Player> getPlayerByName(String name);
//	public List<Player> getPlayerByName(String name);
}