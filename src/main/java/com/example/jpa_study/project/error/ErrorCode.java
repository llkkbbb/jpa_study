package com.example.jpa_study.project.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // member
    NOT_FOUND_MEMBER_ENTITY(HttpStatus.NOT_FOUND, "존재하지 않는 회원입니다."),
    EXISTS_MEMBER_INFO(HttpStatus.BAD_REQUEST, "이미 존재하는 회원입니다."),

    // order
    NOT_FOUND_ORDER_ENTITY(HttpStatus.NOT_FOUND, "존재하지 않는 주문입니다."),

    // item
    NOT_ENOUGH_STOCK(HttpStatus.INSUFFICIENT_STORAGE, "재고가 충분하지 않습니다."),
    EXISTS_ITEM_INFO(HttpStatus.BAD_REQUEST, "이미 존재하는 아이템입니다."),;

    private final HttpStatus httpStatus;
    private final String message;
}
