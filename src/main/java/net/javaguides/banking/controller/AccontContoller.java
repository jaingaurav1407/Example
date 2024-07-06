package net.javaguides.banking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccontContoller {
	
	private AccountService accountService;

	public AccontContoller(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	//Add account rest API
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
		
		return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
	}

	
}
