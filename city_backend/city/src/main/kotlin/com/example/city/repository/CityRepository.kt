package com.example.city.repository

import com.example.city.entity.City
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
interface CityRepository : PagingAndSortingRepository<City, Long>