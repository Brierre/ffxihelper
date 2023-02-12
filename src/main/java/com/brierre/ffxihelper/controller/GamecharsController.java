package com.brierre.ffxihelper.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.brierre.ffxihelper.entity.Gamechars;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/gamechars")
@OpenAPIDefinition(info = @Info(title = "FFXIHelper"), servers = {
		@Server(url = "http//localhost:8080", description = "Local server")})
public interface GamecharsController {
	//GET fetchGameChars()
	// @formatter:off
	@Operation(
			summary = "Returns a list of characters",
			description = "Returns a list of characters assigned to an account number",
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "A list of game characters is returned.",
							content = @Content(
									mediaType = "application/json",
									schema = @Schema(implementation = Gamechars.class))),
					@ApiResponse(
							responseCode = "400",
							description = "Invalid request parameters",
							content = @Content(
									mediaType = "application/json")),
					@ApiResponse(
							responseCode = "404",
							description = "No cast members were found using the supplied criteria.",
							content = @Content(
									mediaType = "application/json")),
					@ApiResponse(
							responseCode = "500",
							description = "An unplanned error has occurred.",
							content = @Content(
									mediaType = "application/json"))
			},
			
			parameters = {
					@Parameter(
							name = "accountId",
							allowEmptyValue = false,
							required = false,
							description = "Account number")
			
			})
	@GetMapping(value = "/chars-by-account")
	@ResponseStatus(code = HttpStatus.OK)
	List<Gamechars> fetchGamecharsByAccountID(
			@RequestParam(required = false)
			Integer accountId);
	
	
	@Operation(
			summary = "Returns a list of characters",
			description = "Returns a list of characters from the same account as a given character name",
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "A list of game characters is returned.",
							content = @Content(
									mediaType = "application/json",
									schema = @Schema(implementation = Gamechars.class))),
					@ApiResponse(
							responseCode = "400",
							description = "Invalid request parameters",
							content = @Content(
									mediaType = "application/json")),
					@ApiResponse(
							responseCode = "404",
							description = "No cast members were found using the supplied criteria.",
							content = @Content(
									mediaType = "application/json")),
					@ApiResponse(
							responseCode = "500",
							description = "An unplanned error has occurred.",
							content = @Content(
									mediaType = "application/json"))
			},
			
			parameters = {
					@Parameter(
							name = "characterName",
							allowEmptyValue = false,
							required = false,
							description = "Any character name associated with the account")
			
			})
	
	@GetMapping(value = "/chars-by-char-name")
	@ResponseStatus(code = HttpStatus.OK)
	List<Gamechars> fetchGamecharsByName(
			@RequestParam(required = false)
			String characterName);
	// @formatter:on
}
