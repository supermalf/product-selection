package com.sky.service;

import com.sky.model.Channel;

import java.util.Collection;

public interface ProductSelectionService {
    Collection<Channel> findByUserId(Long userId);
}
