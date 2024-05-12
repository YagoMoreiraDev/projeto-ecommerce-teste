package com.cloud.yagodev.backend.domain.dtos;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {
    private List<FieldMessage> fieldMessages = new ArrayList<FieldMessage>();


    public ValidationError(Instant timestemp, Integer status, String error, String path) {
        super(timestemp, status, error, path);
    }

    public List<FieldMessage> getFieldMessages() {
        return fieldMessages;
    }

    public void addError(String fieldName, String message){
        fieldMessages.add(new FieldMessage(fieldName, message));
    }

}
