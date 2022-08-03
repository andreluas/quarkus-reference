package br.com.vertigo.employee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.vertigo.employee.dto.Cep;

@Mapper(componentModel = "cdi", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CorreiosMapper {

    @Mapping(source = "end", target = "endereco")
    @Mapping(source = "complemento2", target = "complemento")
    Cep correiosToCep(EnderecoERP endereco);
}
