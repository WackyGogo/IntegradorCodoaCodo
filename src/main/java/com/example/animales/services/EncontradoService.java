package com.example.animales.services;

import java.util.ArrayList;
import com.example.animales.models.EncontradoModel;
import com.example.animales.repositories.EncontradoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EncontradoService {
    @Autowired
    EncontradoRepository encontradoRepository;
    public ArrayList<EncontradoModel> obtenerEncontrados(){
        return (ArrayList<EncontradoModel>) encontradoRepository.findAll();
    }

    public EncontradoModel guardarEncontrado(EncontradoModel encontrados){
        return encontradoRepository.save(encontrados);
    }
    public Optional<EncontradoModel> obtenerPorId(Long id){
        return encontradoRepository.findById(id);
    }

    public boolean eliminarEncontrado(Long id) {
        try{
            encontradoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
