package com.bookrealm.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    EMAIL_DUPLICATED(HttpStatus.CONFLICT, ""),
    EMAIL_NOT_FOUND(HttpStatus.NOT_FOUND, ""),
    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED, ""),
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, ""),
    REVIEW_NOT_FOUND(HttpStatus.NOT_FOUND, ""),
    BOOK_NOT_FOUND(HttpStatus.NOT_FOUND, "");


    private HttpStatus httpStatus;
    private String message;
}
