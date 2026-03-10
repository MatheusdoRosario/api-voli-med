package med.voli.api.controller;

import jakarta.validation.Valid;
import med.voli.api.paciente.DadosCadastroPaciente;
import med.voli.api.paciente.DadosListagemPacientes;
import med.voli.api.paciente.Paciente;
import med.voli.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPacientes> listar(@PageableDefault(sort = {"nome"}, size = 10) Pageable pageable) {
        return repository.findAll(pageable).map(DadosListagemPacientes::new);
    }
}
