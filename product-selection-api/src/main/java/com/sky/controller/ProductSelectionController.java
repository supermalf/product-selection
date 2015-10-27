package com.sky.controller;

import com.sky.model.Channel;
import com.sky.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ProductSelectionController {

    @Autowired
    private CatalogueService service;

    @RequestMapping(
            value = "/buy-channels/{userId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Channel>> getChannelsByLocationId(
            @PathVariable Long userId) {
        Collection<Channel> channels = service.findByLocationId(userId);

        if (channels.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(channels, HttpStatus.OK);
    }
}
