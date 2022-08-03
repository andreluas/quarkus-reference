/*
 *  Copyright (c) 2022, Vertigo Employees API. Todos os direitos reservados.
 *  API Logger Utils
 * 
 * A mesma foi implementada no projeto Employee API - Quarkus
 * visando reunir e facilitar o uso de Loggers no projeto, contendo toda a documentação necessária
 * dos métodos para o uso dos logs no projeto.
 */

package br.com.vertigo.employee.logs.utils;

import java.time.LocalDateTime;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response.Status;

/**
 * Reune todos os métodos de implentação de Loggers da API
 *
 * @author Andre Almeida
 * @see factoryMessage
 * @see factoryErrorLog
 * @since 1.0
 */
@ApplicationScoped
public class LoggerUtil {

    /**
     * factoryMessage method:
     * Método responsável pela criação de loggers para mensagem padrão passada nos
     * Controllers, onde recebe os parâmetros
     * String method, String endpoint e Status Status.
     */
    public String factoryMessage(String method, String endpoint, Status status) {
        return "Employee-api:"
                + " method=" + method
                + " endpoint=" + endpoint
                + " timestamp=" + LocalDateTime.now().toString()
                + " status=" + status.toString();
    }

    /**
     * factoryErrorLog static method:
     * Método responsável pela criação de loggers de erro, utilizados em services e
     * handlers, onde recebe os parâmetros
     * String timestamp, String status, String message, String from.
     */
    public static String factoryErrorLog(String timestamp, String status, String message, String from) {
        return "ErrorLog:"
                + " from=" + from
                + " timestamp=" + timestamp
                + " status=" + status
                + " message=" + "\"" + message + "\"";
    }
}
