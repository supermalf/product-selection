package com.sky.service;

import com.sky.AbstractTest;
import com.sky.model.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class CatalogueServiceTest extends AbstractTest {
    private static final Long UNKNOWN_LOCATION_ID = -1L;
    private static final Long LONDON_LOCATION_ID = 1L;
    private static final Long LIVERPOOL_LOCATION_ID = 2L;

    @Autowired
    private CatalogueService service;

    @Test
    public void testFindAllChannels() {
        Collection<Channel> channels = service.findAll();

        Assert.assertNotNull("failure - expected not null", channels);
        Assert.assertEquals("failure - expected 5 channels", 5, channels.size());
    }

    @Test
    public void testCatalogueForUnknownLocationShouldBeEmpty() {
        Collection<Channel> channels = service.findByLocationId(UNKNOWN_LOCATION_ID);

        Assert.assertNotNull("failure - expected not null", channels);
        Assert.assertEquals("failure - expected 0 channels", 0, channels.size());
    }

    @Test
    public void testCatalogueForLondon() {
        Collection<Channel> channels = service.findByLocationId(LONDON_LOCATION_ID);

        Assert.assertNotNull("failure - expected not null", channels);
        Assert.assertEquals("failure - expected 4 channels", 4, channels.size());

        Assert.assertTrue(channels.contains(service.findByName("Arsenal TV")));
        Assert.assertTrue(channels.contains(service.findByName("Chelsea TV")));
        Assert.assertTrue(channels.contains(service.findByName("Sky News")));
        Assert.assertTrue(channels.contains(service.findByName("Sky Sport News")));
    }

    @Test
    public void testCatalogueForLiverpool() {
        Collection<Channel> channels = service.findByLocationId(LIVERPOOL_LOCATION_ID);

        Assert.assertNotNull("failure - expected not null", channels);
        Assert.assertEquals("failure - expected 3 channels", 3, channels.size());

        Assert.assertTrue(channels.contains(service.findByName("Liverpool TV")));
        Assert.assertTrue(channels.contains(service.findByName("Sky News")));
        Assert.assertTrue(channels.contains(service.findByName("Sky Sport News")));
    }
}
