package br.com.vertigo.employee.exceptionhandler;

import java.time.LocalDateTime;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;

import org.jboss.resteasy.reactive.server.ServerResponseFilter;

import io.quarkus.logging.Log;

public class GenericFilterException {

    @ServerResponseFilter
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        if (responseContext.getStatus() == 404 || responseContext.getStatus() == 400
                || responseContext.getStatus() == 500) {
            Log.warnf(
                    "from=employee-api method=%s path=%s statuscode=%d timestamp=%s",
                    requestContext.getMethod(),
                    requestContext.getUriInfo().getRequestUri().getPath(),
                    responseContext.getStatus(),
                    LocalDateTime.now().toString());
        }
    }
}
