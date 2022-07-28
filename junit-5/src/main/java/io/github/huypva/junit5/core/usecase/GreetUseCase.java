package io.github.huypva.junit5.core.usecase;

import io.github.huypva.junit5.core.entity.Greeting;

/**
 * @author huypva
 */
public interface GreetUseCase {

  Greeting greet(String name);
}
