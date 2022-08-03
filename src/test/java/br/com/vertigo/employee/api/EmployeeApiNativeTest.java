package br.com.vertigo.employee.api;

import io.quarkus.test.junit.QuarkusIntegrationTest;

// @NativeImageTest -> deprecated
@QuarkusIntegrationTest
public class EmployeeApiNativeTest extends EmployeeApiTest {

  // Execute the same tests but in native mode.
}
