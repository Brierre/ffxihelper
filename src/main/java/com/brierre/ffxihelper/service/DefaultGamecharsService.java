package com.brierre.ffxihelper.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brierre.ffxihelper.entity.Gamechars;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class DefaultGamecharsService implements GamecharsService {
	
	@Override
	public List<Gamechars> fetchGamecharsByAccountID(Integer accountId) {
		log.info("accountId={}", accountId); 
		return null;
	}

	@Override
	public List<Gamechars> fetchGamecharsByName(String characterName) {
		log.info("characterName={}", characterName); 
		return null;
	}

}
