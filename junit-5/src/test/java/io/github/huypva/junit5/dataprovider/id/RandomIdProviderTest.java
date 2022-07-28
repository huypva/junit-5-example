package io.github.huypva.junit5.dataprovider.id;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author huypva
 */
@ExtendWith(SpringExtension.class)
@Import(RandomIdProvider.class)
class RandomIdProviderTest {

  @Autowired
  RandomIdProvider randomIdProvider;

  @Test
  void genId() {
    Assertions.assertThat(randomIdProvider).isNotNull();
    Assertions.assertThat(randomIdProvider.genId()).isGreaterThan(Integer.MIN_VALUE);
    Assertions.assertThat(randomIdProvider.genId()).isLessThan(Integer.MAX_VALUE);
  }
}