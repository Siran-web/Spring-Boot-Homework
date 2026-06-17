package com.example.department.advices;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class APIResponse <T>{

    private LocalDateTime timestamp;
    private T data;
    private APIError error;

    public APIResponse() {
        this.timestamp = LocalDateTime.now();
    }

    public APIResponse(T data){
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    public APIResponse(APIError error){
        this.error = error;
    }

}
