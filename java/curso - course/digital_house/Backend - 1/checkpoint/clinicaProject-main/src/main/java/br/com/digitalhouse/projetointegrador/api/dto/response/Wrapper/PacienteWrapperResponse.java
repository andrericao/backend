package br.com.digitalhouse.projetointegrador.api.dto.response.Wrapper;

import br.com.digitalhouse.projetointegrador.api.dto.response.List.PacienteListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PacienteWrapperResponse {
    List<PacienteListResponse> pacientes;
}
