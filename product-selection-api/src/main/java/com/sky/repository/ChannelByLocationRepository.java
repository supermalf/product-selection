package com.sky.repository;

import com.sky.model.ChannelByLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChannelByLocationRepository extends JpaRepository<ChannelByLocation, Long> {
    List<ChannelByLocation> findByLocationId(Long locationId);
}
