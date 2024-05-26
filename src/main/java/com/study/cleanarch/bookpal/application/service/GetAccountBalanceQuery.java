package com.study.cleanarch.bookpal.application.service;

import com.study.cleanarch.bookpal.account.domain.Money;

import static com.study.cleanarch.bookpal.account.domain.Account.AccountId;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(AccountId accountId);
}
