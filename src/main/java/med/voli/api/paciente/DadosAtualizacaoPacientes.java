package med.voli.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voli.api.endereco.DadosEndereco;

public record DadosAtualizacaoPacientes(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
