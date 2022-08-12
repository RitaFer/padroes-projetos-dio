package br.com.rita.projects.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDtoRequest {

    @NotBlank
    @Size(min = 3, max = 50)
    private String nome;
    @NotBlank
    @Size(min = 8, max = 8)
    private String cep;
}
