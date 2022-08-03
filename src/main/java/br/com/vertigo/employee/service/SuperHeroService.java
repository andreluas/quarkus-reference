package br.com.vertigo.employee.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.vertigo.employee.dto.SuperHeros;
import br.com.vertigo.employee.restclient.SuperHeroProxy;

@ApplicationScoped
public class SuperHeroService {

    @RestClient
    SuperHeroProxy proxy;

    public List<SuperHeros> list() {
        return proxy.list();
    }
}
