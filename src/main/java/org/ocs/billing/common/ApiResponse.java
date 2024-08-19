package org.ocs.billing.common;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ApiResponse<T> {
    private T data;

    private String errors;

}