package com.libcode.rama.rama.records.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libcode.rama.rama.records.entities.ClassActivities;


@Repository
public interface ClassActivitiesRepository extends JpaRepository<ClassActivities,Long> {
    
}
