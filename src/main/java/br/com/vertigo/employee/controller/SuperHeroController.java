package br.com.vertigo.employee.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.vertigo.employee.api.HerosApi;
import br.com.vertigo.employee.dto.SuperHeros;
import br.com.vertigo.employee.logs.utils.LoggerUtil;
import br.com.vertigo.employee.service.SuperHeroService;

public class SuperHeroController implements HerosApi {
    protected final Logger log = LoggerFactory.getLogger(super.getClass());
    private static final String PATH = "/heros/";

    @Inject
    SuperHeroService service;

    @Inject
    LoggerUtil logUtils;

    @Override
    public Response herosGet() {
        List<SuperHeros> list = service.list();
        String logMessage = logUtils.factoryMessage(HttpMethod.GET, PATH, Status.OK);
        log.info(logMessage);
        return Response.ok().entity(list).build();
    }

}
