package com.mercadolibre.pruebamutante.domain.repository;

import com.mercadolibre.pruebamutante.domain.entity.StatsDomain;

public interface StatsRepositoryDomain {

    public void updateStats(StatsDomain statsDomain);

    public StatsDomain getStats();
}
