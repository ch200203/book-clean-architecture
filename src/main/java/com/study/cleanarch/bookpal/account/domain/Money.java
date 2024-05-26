package com.study.cleanarch.bookpal.account.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.math.BigInteger;

@Value
public class Money {

    public static Money ZERO = Money.of(0L);

    @NotNull
    private final BigInteger amount;

    private static Money of(long value) {
        return new Money(BigInteger.valueOf(value));
    }

    public static Money add(Money a, Money b) {
        return new Money(a.amount.add(b.amount));
    }
}
