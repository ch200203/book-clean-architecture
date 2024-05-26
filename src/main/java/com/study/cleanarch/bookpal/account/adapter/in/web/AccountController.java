package com.study.cleanarch.bookpal.account.adapter.in.web;

import com.study.cleanarch.bookpal.application.SendMoneyService;
import com.study.cleanarch.bookpal.application.service.GetAccountBalanceQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final GetAccountBalanceQuery getAccountBalanceQuery;
    private final ListAccountsQuery listAccountsQuery;
    private final LoadaccountQuery loadAccountQuery;

    private final SendMoneyService sendMoneyService;
    private final CreateAccountCommand createAccountCommand;

    @GetMapping("/accounts")
    public List<AccountResource> listAccounts() {

    }

    @GetMapping("/accounts/{accountId}")
    public AccountResource getAccount(@PathVariable Long accountId) {

    }

    @GetMapping("/accounts/{accountId}/balance")
    public long getAccountBalance(@PathVariable Long accountId) {

    }

    @PostMapping("/accounts")
    public AccountResource createAccount(@RequestBody AccountResource request) {

    }

}
