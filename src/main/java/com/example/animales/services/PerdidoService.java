package com.example.animales.services;

import java.util.ArrayList;
import com.example.animales.models.PerdidoModel;
import com.example.animales.repositories.PerdidoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PerdidoService {
    @Autowired
    PerdidoRepository perdidoRepository;
    public ArrayList<PerdidoModel> obtenerPerdidos(){
        return (ArrayList<PerdidoModel>) perdidoRepository.findAll();
    }

    public PerdidoModel guardarPerdido(PerdidoModel perdidos){
        return perdidoRepository.save(perdidos);
    }
    public Optional<PerdidoModel> obtenerPorId(Long id){
        return perdidoRepository.findById(id);
    }
    public ArrayList<PerdidoModel>  obtenerPorEdad(Integer edad) {
        return perdidoRepository.findByEdad(edad);
    }
    public boolean eliminarPerdido(Long id) {
        try{
            perdidoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
