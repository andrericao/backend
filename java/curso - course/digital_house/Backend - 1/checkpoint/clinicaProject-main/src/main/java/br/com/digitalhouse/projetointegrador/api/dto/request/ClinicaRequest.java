package br.com.digitalhouse.projetointegrador.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;

@Getter
@Setter
public class ClinicaRequest {

    @NotBlank
    private String nome;
    @NotBlank
    @CNPJ
    private String cnpj;
    @NotBlank
    @Size(min = 3)
    private String razaoSocial;
    @NotBlank
    private String descricao;
    @NotNull
    private EnderecoRequest endereco;
    @NotNull
    private ContatoRequest contato;
}
