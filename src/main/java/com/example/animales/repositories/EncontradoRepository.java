package com.example.animales.repositories;


import com.example.animales.models.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository

public interface EncontradoRepository extends CrudRepository<EncontradoModel,Long>  {
    public abstract ArrayList<EncontradoModel> findById(Integer id);

}
