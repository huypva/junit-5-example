package io.codebyexample.junittestjunit5.core.usecase;

import io.codebyexample.junittestjunit5.core.entity.Greeting;
import io.codebyexample.junittestjunit5.dataprovider.id.IdProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Component
public class GreetUseCaseImpl implements GreetUseCase {

  @Autowired
  IdProvider idProvider;

  @Override
  public Greeting greet(String name) {
    int randId = idProvider.genId();
    return new Greeting(randId, String.format("Hello %s!", name));
  }
}
