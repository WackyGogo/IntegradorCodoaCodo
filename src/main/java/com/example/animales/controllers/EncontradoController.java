package com.example.animales.controllers;
import java.util.ArrayList;
import java.util.Optional;
import com.example.animales.models.EncontradoModel;
import com.example.animales.services.EncontradoService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/encontrados")
public class EncontradoController {
    @Autowired
    EncontradoService encontradoService;
    @CrossOrigin
    @GetMapping()
    public ArrayList<EncontradoModel> obtenerEncontrados(){
        return encontradoService.obtenerEncontrados();
    }

    @CrossOrigin
    @PostMapping() 
    public EncontradoModel guardarEncontrado(@RequestBody EncontradoModel encontrado){
        return this.encontradoService.guardarEncontrado(encontrado);
    }

    @CrossOrigin
    @GetMapping( path = "/{id}") 
    public Optional<EncontradoModel> obtenerEncontradoPorId(@PathVariable("id") Long id) {
        return this.encontradoService.obtenerPorId(id);
    }

    @CrossOrigin
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.encontradoService.eliminarEncontrado(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }
}
