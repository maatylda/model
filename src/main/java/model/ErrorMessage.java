package model;

import lombok.Data;

import java.util.Map;

@Data

public class ErrorMessage {

    private Integer status;
    private Map<String, String> errors;

}

