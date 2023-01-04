package Voll.med.api.medico;

import Voll.med.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizaMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco
) {
}
