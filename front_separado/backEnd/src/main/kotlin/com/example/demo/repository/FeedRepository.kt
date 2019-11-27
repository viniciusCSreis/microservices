package com.example.demo.repository

import com.example.demo.entity.Feed
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


@RepositoryRestResource(collectionResourceRel = "feeds", path = "feeds")
interface FeedRepository : PagingAndSortingRepository<Feed, Long>