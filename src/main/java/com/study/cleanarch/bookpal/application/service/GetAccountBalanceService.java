package com.study.cleanarch.bookpal.application.service;

import com.study.cleanarch.bookpal.account.domain.Account;
import com.study.cleanarch.bookpal.account.domain.Money;
import com.study.cleanarch.bookpal.application.port.out.LoadAccountPort;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(Account.AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}
