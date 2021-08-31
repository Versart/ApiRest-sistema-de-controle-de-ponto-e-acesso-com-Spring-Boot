package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }
    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return  jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity getJornadaById(@PathVariable("idJornada") long idJornada) throws Exception{
       return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Não encontrado")));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.update(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteById(@PathVariable("idJornada") long idJornada) throws Exception{
        try {
            jornadaService.delete(idJornada);
        }
        catch (Exception e){
            e.getMessage();
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
