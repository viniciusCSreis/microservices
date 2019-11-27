package com.example.demo.filter

import org.springframework.stereotype.Component
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletResponse

@Component
class CorsFilter : Filter {
    override fun doFilter(servletRequest: ServletRequest, servletResponse: ServletResponse, filterChain: FilterChain) {
        val response = servletResponse as HttpServletResponse
        response.addHeader("Access-Control-Allow-Origin", "*")
        response.setHeader("access-control-allow-methods", "POST, GET, PUT, OPTIONS, DELETE")
        response.setHeader("access-control-max-age", "3600")
        response.setHeader("access-control-allow-headers", "Origin, X-Requested-With, Content-Type, Accept")
        response.setHeader("access-control-expose-headers", "Location")
        filterChain.doFilter(servletRequest, servletResponse)
    }
}