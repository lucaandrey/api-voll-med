package Voll.med.api.domain.medico;

import Voll.med.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizaMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco
) {
}
