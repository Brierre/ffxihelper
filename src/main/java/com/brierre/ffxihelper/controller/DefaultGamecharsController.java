package com.brierre.ffxihelper.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.brierre.ffxihelper.entity.Gamechars;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultGamecharsController implements GamecharsController {
	
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
