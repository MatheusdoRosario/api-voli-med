package med.voli.api.controller;

import med.voli.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    public void cadastrar(DadosCadastroPaciente dados) {

    }
}
