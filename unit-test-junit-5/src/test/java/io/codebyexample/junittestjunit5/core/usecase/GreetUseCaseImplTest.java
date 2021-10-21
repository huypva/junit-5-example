package io.codebyexample.junittestjunit5.core.usecase;

import io.codebyexample.junittestjunit5.core.entity.Greeting;
import io.codebyexample.junittestjunit5.dataprovider.id.RandomIdProvider;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author huypva
 */
@ExtendWith(SpringExtension.class)
@Import(GreetUseCaseImpl.class)
class GreetUseCaseImplTest {

  @Autowired
  GreetUseCaseImpl greetUseCase;

  @MockBean
  RandomIdProvider randomIdProvider;

  @Test
  void greet_HelloWorldWithId1_ReturnGreeting() {
    Mockito.when(randomIdProvider.genId()).thenReturn(1);

    Greeting valueDefault = new Greeting(1, "Hello World!");

    Greeting greeting = greetUseCase.greet("World");
    Assertions.assertThat(valueDefault).usingRecursiveComparison().isEqualTo(greeting);
  }
}