package org.schedule.schedule1.service;

import org.schedule.schedule1.model.ProgramaFormacion;
import org.schedule.schedule1.repository.ProgramaFormacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramaFormacionService {

    @Autowired
    private ProgramaFormacionRepository repository;

    // Crear nuevo programa
    public ProgramaFormacion create(ProgramaFormacion programa) {
        return repository.save(programa);
    }

    // Obtener programa por ID
    public ProgramaFormacion getById(int id) {
        return repository.findById(id).orElse(null);
    }

    // Listar todos los programas
    public List<ProgramaFormacion> getAll() {
        return repository.findAll();
    }

    // Actualizar programa existente
    public ProgramaFormacion update(int id, ProgramaFormacion programa) {
        ProgramaFormacion existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setNombre(programa.getNombre());
            existing.setDuracion(programa.getDuracion());
            return repository.save(existing);
        }
        return null;
    }

    // Eliminar programa por ID
    public void delete(int id) {
        repository.deleteById(id);
    }
}