package br.com.digitalhouse.projetointegrador.api.dto.response.List;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PacienteListResponse {
    private UUID id;
    private String nome;
}
