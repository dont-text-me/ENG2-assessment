package com.eng2.assessment.vm.utils;

import io.micronaut.context.ApplicationContext;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.test.extensions.junit5.MicronautJunit5Extension;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class DbCleanupExtension implements BeforeEachCallback {

  @Override
  public void beforeEach(ExtensionContext context) {
    ApplicationContext applicationContext =
        context
            .getRoot()
            .getStore(ExtensionContext.Namespace.create(MicronautJunit5Extension.class))
            .get(ApplicationContext.class, ApplicationContext.class);
    applicationContext.getAllBeanDefinitions().stream()
        .filter(
            (beanDefinition ->
                beanDefinition.findAnnotation(Repository.class).isPresent()
                    && beanDefinition
                        .getName()
                        .contains("vm"))) // find all the @Repository's in the application context
        .toList()
        .forEach(
            it -> {
              System.out.println("Clearing everything from " + it.getName());
              ((CrudRepository<?, ?>) applicationContext.getBean(it)).deleteAll();
            }); // delete everything from them
  }
}
