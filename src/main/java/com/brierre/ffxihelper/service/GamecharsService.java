package com.brierre.ffxihelper.service;

import java.util.List;

import com.brierre.ffxihelper.entity.Gamechars;

public interface GamecharsService {

	List<Gamechars> fetchGamecharsByAccountID(Integer accountId);

	List<Gamechars> fetchGamecharsByName(String characterName);

}
