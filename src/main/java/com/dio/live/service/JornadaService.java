package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }


    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void delete(long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }

}
