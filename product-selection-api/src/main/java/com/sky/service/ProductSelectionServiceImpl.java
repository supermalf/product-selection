package com.sky.service;

import com.sky.model.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ProductSelectionServiceImpl implements ProductSelectionService {
    private static final long DUMMY_LIVERPOOL_USER_ID = 1L;
    private static final long DUMMY_LONDON_USER_ID = 2L;

    private static final Long LIVERPOOL_LOCATION_ID = 1L;
    private static final Long LONDON_LOCATION_ID = 2L;

    @Autowired
    private CatalogueService catalogueService;

    @Override
    public Collection<Channel> findByUserId(Long userId) {

        if (userId == DUMMY_LIVERPOOL_USER_ID) {
            return catalogueService.findByLocationId(LIVERPOOL_LOCATION_ID);
        }
        else if (userId == DUMMY_LONDON_USER_ID) {
            return catalogueService.findByLocationId(LONDON_LOCATION_ID);
        }
        return new ArrayList<>();
    }
}
