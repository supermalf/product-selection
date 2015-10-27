package com.sky.service;

import com.sky.model.Channel;
import com.sky.repository.ChannelByLocationRepository;
import com.sky.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class CatalogueServiceImpl implements CatalogueService {

    @Autowired
    private ChannelRepository channelRepository;

    @Autowired
    private ChannelByLocationRepository channelByLocationRepository;

    @Override
    public Collection<Channel> findAll() {
        return channelRepository.findAll();
    }

    @Override
    public Channel findOne(Long id) {
        return channelRepository.findOne(id);
    }

    @Override
    public Channel findByName(String name) {
        return channelRepository.findByName(name);
    }

    @Override
    public Collection<Channel> findByLocationId(Long locationId) {
        return channelByLocationRepository.findByLocationId(locationId).stream()
                .map(channelByLocation -> findOne(channelByLocation.getChannelId()))
                .collect(Collectors.toList());
    }
}
