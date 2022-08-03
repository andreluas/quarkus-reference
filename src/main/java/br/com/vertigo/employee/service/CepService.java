package br.com.vertigo.employee.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.vertigo.employee.dto.Cep;
import br.com.vertigo.employee.exceptionhandler.serviceExceptions.exceptions.CorreiosSoapException;
import br.com.vertigo.employee.mapper.CorreiosMapper;
import br.com.vertigo.employee.soapclient.CorreiosClientSoap;

@ApplicationScoped
public class CepService {

    @Inject
    CorreiosClientSoap correios;

    @Inject
    CorreiosMapper mapper;

    public Cep buscaCep(String cep) {
        AtendeCliente client = correios.proxy();
        EnderecoERP endereco;

        try {
            endereco = client.consultaCEP(cep);
        } catch (SQLException_Exception | SigepClienteException ex) {
            throw new CorreiosSoapException(ex.getMessage());
        }

        return mapper.correiosToCep(endereco);
    }
}
