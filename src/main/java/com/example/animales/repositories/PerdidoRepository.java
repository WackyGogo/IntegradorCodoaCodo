package com.example.animales.repositories;

import com.example.animales.models.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface PerdidoRepository extends CrudRepository<PerdidoModel,Long> {
    public abstract ArrayList<PerdidoModel> findByEdad(Integer edad);
}
