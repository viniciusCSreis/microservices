package com.example.city

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CityApplication

fun main(args: Array<String>) {
	runApplication<CityApplication>(*args)
}
