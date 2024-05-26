package com.study.cleanarch.bookpal.application.port.in;

import com.study.cleanarch.bookpal.shared.SelfValidating;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import static java.util.Objects.requireNonNull;

@Getter
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

    @NotNull
    private final AccountId sourceAccountId;

    @NotNull
    private final AccountId targetAccountId;

    @NotNull
    private final Money money;

    public SendMoneyCommand(AccountId sourceAccountId, AccountId targetAccountId, Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;

        requireNonNull(sourceAccountId);
        requireNonNull(targetAccountId);
        requireNonNull(money);
        requireGreaterThan(money, 0);
        this.validateSelf();

    }
}