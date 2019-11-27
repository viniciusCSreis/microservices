package com.example.news.repository

import com.example.news.entity.News
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


@RepositoryRestResource(collectionResourceRel = "news", path = "news")
interface NewsRepository : PagingAndSortingRepository<News, Long>