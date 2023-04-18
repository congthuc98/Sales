package com.manager.sales.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Xử lý thông báo khi không tìm được data (404 not found)
 *
 * @author thucnc
 * @date 2023/04/18
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Xử lý bắn message khi xảy ra 404 not found
     *
     * @param message
     * @return Nội dung lỗi
     * */
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
