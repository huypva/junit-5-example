package io.codebyexample.junittestjunit5.core.usecase;

import io.codebyexample.junittestjunit5.core.entity.Greeting;

/**
 * @author huypva
 */
public interface GreetUseCase {

  Greeting greet(String name);
}
