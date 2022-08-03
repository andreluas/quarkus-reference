package br.com.vertigo.employee.soapclient;

import java.net.URL;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.vertigo.employee.exceptionhandler.serviceExceptions.exceptions.CorreiosSoapException;

@ApplicationScoped
public class CorreiosClientSoap {

    public AtendeCliente proxy() {

        URL urlCorreios;

        try {
            urlCorreios = new URL(
                    "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");

        } catch (Exception ex) {
            throw new CorreiosSoapException(ex.getMessage());
        }

        QName qnameCorreios = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                "AtendeClienteService");

        Service serviceCorreios = Service.create(urlCorreios, qnameCorreios);
        AtendeCliente correios = serviceCorreios.getPort(AtendeCliente.class);

        return correios;
    }
}
