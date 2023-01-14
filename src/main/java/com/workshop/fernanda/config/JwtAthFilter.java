package com.workshop.fernanda.config;

import org.springframework.web.filter.OncePerRequestFilter;

//extends a filter class para que cada request sea interceptada por esse filtro primeiro

public class JwtAthFilter extends OncePerRequestFilter {

}
