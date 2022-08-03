package br.com.vertigo.employee.controller;

import javax.inject.Inject;
import javax.validation.constraints.Size;
import javax.ws.rs.core.Response;

import br.com.vertigo.employee.api.ConsultacepApi;
import br.com.vertigo.employee.dto.Cep;
import br.com.vertigo.employee.service.CepService;

public class CepController implements ConsultacepApi {

    @Inject
    CepService service;

    @Override
    public Response consultacepCepGet(@Size(min = 8, max = 9) String cep) {
        Cep dto = service.buscaCep(cep);
        return Response.ok().entity(dto).build();
    }

}
