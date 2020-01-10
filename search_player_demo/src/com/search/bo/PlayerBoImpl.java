package com.search.bo;

public class PlayerBoImpl implements PlayerSearchBO {
	public Player getPlayerById(String id) throws BusinessException{
		Player player = null;
		if(id.matches("PL[A-Z]{2}[0-9]{6}")) {
			//DAO code
		}else {
			throw new BusinessException("Entered PlayerID incorrectly");
		}
	}
}
