package br.com.vertigo.employee.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.vertigo.employee.api.EmployeeApi;
import br.com.vertigo.employee.dto.EmployeeCadastravel;
import br.com.vertigo.employee.dto.EmployeeSummary;
import br.com.vertigo.employee.dto.ObjectEmployee;
import br.com.vertigo.employee.logs.utils.LoggerUtil;
import br.com.vertigo.employee.service.EmployeeService;

public class EmployeeController implements EmployeeApi {
    protected final Logger log = LoggerFactory.getLogger(super.getClass());
    private static final String PATH = "/employee/";

    @Inject
    EmployeeService service;

    @Inject
    LoggerUtil logUtils;

    @Override
    public Response employeeEmployeeIdDelete(@Max(99999) Integer employeeId) {
        service.deleteById(employeeId);
        String logMessage = logUtils.factoryMessage(HttpMethod.DELETE, PATH + employeeId, Status.NO_CONTENT);
        log.info(logMessage);
        return Response.noContent().build();
    }

    @Override
    public Response employeeEmployeeIdGet(@Max(99999) Integer employeeId) {
        ObjectEmployee dto = service.findById(employeeId);
        String logMessage = logUtils.factoryMessage(HttpMethod.GET, PATH + employeeId, Status.OK);
        log.info(logMessage);
        return Response.ok().entity(dto).build();
    }

    @Override
    public Response employeeGet() {
        List<ObjectEmployee> list = service.findAll();
        String logMessage = logUtils.factoryMessage(HttpMethod.GET, PATH, Status.OK);
        log.info(logMessage);
        return Response.ok().entity(list).build();
    }

    @Override
    public Response employeePost(@Valid @NotNull EmployeeCadastravel employeeCadastravel) {
        EmployeeCadastravel dto = service.insert(employeeCadastravel);
        String logMessage = logUtils.factoryMessage(HttpMethod.POST, PATH, Status.CREATED);
        log.info(logMessage);
        return Response.status(Status.CREATED).entity(dto).build();
    }

    @Override
    public Response employeeEmployeeIdPatch(
            @Max(99999) Integer employeeId, @Valid ObjectEmployee objectEmployee) {
        ObjectEmployee dto = service.update(employeeId, objectEmployee);
        String logMessage = logUtils.factoryMessage(HttpMethod.PATCH, PATH + employeeId, Status.OK);
        log.info(logMessage);
        return Response.ok().entity(dto).build();
    }

    @Override
    public Response employeeEmployeeIdSummaryGet(@Max(99999) Integer employeeId) {
        EmployeeSummary dto = service.findBySummary(employeeId);
        String logMessage = logUtils.factoryMessage(HttpMethod.GET, PATH + employeeId + "/summary", Status.OK);
        log.info(logMessage);
        return Response.ok().entity(dto).build();
    }
}
