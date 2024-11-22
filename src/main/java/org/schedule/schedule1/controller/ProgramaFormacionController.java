package org.schedule.schedule1.controller;

import org.schedule.schedule1.model.ProgramaFormacion;
import org.schedule.schedule1.service.ProgramaFormacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programas")
public class ProgramaFormacionController {

    @Autowired
    private ProgramaFormacionService service;

    // Crear un nuevo programa
    @PostMapping
    public ProgramaFormacion create(@RequestBody ProgramaFormacion programa) {
        return service.create(programa);
    }

    // Obtener un programa por ID
    @GetMapping("/{id}")
    public ResponseEntity<ProgramaFormacion> getById(@PathVariable int id) {
        ProgramaFormacion programa = service.getById(id);
        return programa != null ? ResponseEntity.ok(programa) : ResponseEntity.notFound().build();
    }

    // Listar todos los programas
    @GetMapping
    public List<ProgramaFormacion> getAll() {
        return service.getAll();
    }

    // Actualizar un programa existente
    @PutMapping("/{id}")
    public ResponseEntity<ProgramaFormacion> update(@PathVariable int id, @RequestBody ProgramaFormacion programa) {
        ProgramaFormacion updated = service.update(id, programa);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    // Eliminar un programa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

