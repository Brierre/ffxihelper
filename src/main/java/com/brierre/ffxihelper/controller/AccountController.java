package com.brierre.ffxihelper.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.brierre.ffxihelper.entity.Account;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/account")
@OpenAPIDefinition(info = @Info(title = "FFXIHelper"), servers = {
		@Server(url = "http://localhost:8080", description = "Local server")})

public interface AccountController {

	//GET fetchAccountByInfo()
	// @formatter:off
	@Operation(
			summary = "Returns account information",
			description = "Returns account number given an account name or an account name given an account number",
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "An account is returned.",
							content = @Content(
								mediaType = "application/json",
								schema = @Schema(implementation = Account.class))),
						@ApiResponse(
							responseCode = "400",
							description = "Invalid request parameters",
							content = @Content(
								mediaType = "application/json")),
						@ApiResponse(
							responseCode = "404",
							description = "No account was found using the supplied criteria.",
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
								description = "Account ID"),
							@Parameter(
								name = "accountName",
								allowEmptyValue = false,
								required = false,
								description = "Name of account")
			}
		)
	@GetMapping(value = "/get-single-account")
	@ResponseStatus(code = HttpStatus.OK)
	Account fetchAccountByInfo(
			@RequestParam(required = false)
			Integer accountNumber,
			@RequestParam(required = false)
			String accountName);
	
	//GET fetchAccounts()
	// @formatter:off
	@Operation(
			summary = "Returns all account information",
			description = "Returns all account numbers and names",
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "Accounts are returned.",
							content = @Content(
								mediaType = "application/json",
								schema = @Schema(implementation = Account.class))),
						@ApiResponse(
							responseCode = "400",
							description = "Invalid request parameters",
							content = @Content(
								mediaType = "application/json")),
						@ApiResponse(
							responseCode = "404",
							description = "No accounts were found using the supplied criteria.",
							content = @Content(
								mediaType = "application/json")),
						@ApiResponse(
							responseCode = "500",
							description = "An unplanned error has occurred.",
							content = @Content(
								mediaType = "application/json"))
			}
		)
	@GetMapping(value = "/get-all-accounts")
	@ResponseStatus(code = HttpStatus.OK)
	List<Account> fetchAccounts();
}
