package com.mercadolibre.pruebamutante.persistence.repository;

import com.mercadolibre.pruebamutante.persistence.entity.DnaClassification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DnaRepositoryJpa extends JpaRepository<DnaClassification, Long> {

    @Query("SELECT COUNT(u) FROM DnaClassification u WHERE u.isMutant='Yes'")
    long mutantCount();

    @Query("SELECT COUNT(u) FROM DnaClassification u WHERE u.isMutant='No'")
    long humanCount();
}
