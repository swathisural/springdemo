package com.demos.SpringEmailDemo.dto;

public class EmailResponseDTO {
    private String status;
    private String message;

    public EmailResponseDTO() {}

    public EmailResponseDTO(String status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getters and setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
