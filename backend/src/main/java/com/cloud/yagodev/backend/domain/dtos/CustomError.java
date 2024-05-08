package com.cloud.yagodev.backend.domain.dtos;

import java.time.Instant;

public class CustomError {
    private Instant timestemp;
    private Integer status;
    private String error;
    private String path;

    public CustomError(Instant timestemp, Integer status, String error, String path) {
        this.timestemp = timestemp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getTimestemp() {
        return timestemp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }
}
