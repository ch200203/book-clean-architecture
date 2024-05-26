package com.study.cleanarch.bookpal.application;

import com.study.cleanarch.bookpal.application.port.in.SendMoneyCommand;
import com.study.cleanarch.bookpal.application.port.in.SendMoneyUseCase;
import com.study.cleanarch.bookpal.application.port.out.LoadAccountPort;
import com.study.cleanarch.bookpal.application.port.out.UpdateAccountStatePort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
public class SendMoneyService implements SendMoneyUseCase {

    private final LoadAccountPort loadAccountPort;
    private final AccountLock AccountLock;
    private final UpdateAccountStatePort updateAccountStatePort;

    private boolean sendMoney(SendMoneyCommand sendMoneyCommand) {
        // TODO: 비즈니스 규칙 검증
        // TODO: 모델 상태 조작
        // TODO: 출력 값 변환
        return true;
    }
}
