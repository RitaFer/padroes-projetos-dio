package br.com.rita.projects.controllers.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
public class StandartError implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING
            ,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'"
            ,timezone = "GMT")
    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private Map<String, String> message;
    private String path;
}
