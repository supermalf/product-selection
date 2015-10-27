package com.sky.service;

import com.sky.model.Channel;

import java.util.Collection;

public interface CatalogueService {
    Collection<Channel> findAll();

    Channel findOne(Long id);

    Channel findByName(String name);

    Collection<Channel> findByLocationId(Long locationId);
}
