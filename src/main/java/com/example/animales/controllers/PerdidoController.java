package com.example.animales.controllers;
import java.util.ArrayList;
import java.util.Optional;
import com.example.animales.models.PerdidoModel;
import com.example.animales.services.PerdidoService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/perdidos")
public class PerdidoController {
    @Autowired
    PerdidoService perdidoService;
    @CrossOrigin
    @GetMapping()
    public ArrayList<PerdidoModel> obtenerPerdidos(){
        return perdidoService.obtenerPerdidos();
    }

    @CrossOrigin
    @PostMapping() 
    public PerdidoModel guardarPerdido(@RequestBody PerdidoModel perdido){
        return this.perdidoService.guardarPerdido(perdido);
    }

    @CrossOrigin
    @GetMapping( path = "/{id}") 
    public Optional<PerdidoModel> obtenerPerdidoPorId(@PathVariable("id") Long id) {
        return this.perdidoService.obtenerPorId(id);
    }

    @CrossOrigin
    @GetMapping("/query")
    public ArrayList<PerdidoModel> obtenerUsuarioPorEdad(@RequestParam("edad") Integer edad){
        return this.perdidoService.obtenerPorEdad(edad);
    }

    @CrossOrigin
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.perdidoService.eliminarPerdido(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }


}
