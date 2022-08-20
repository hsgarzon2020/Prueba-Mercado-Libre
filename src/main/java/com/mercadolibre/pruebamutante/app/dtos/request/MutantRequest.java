package com.mercadolibre.pruebamutante.app.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MutantRequest {

    @NotNull
    public List<String> listDna;

}
