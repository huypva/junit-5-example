package io.codebyexample.junittestjunit5.dataprovider.id;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

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
    assertThat(randomIdProvider).isNotNull();
    assertThat(randomIdProvider.genId()).isGreaterThan(Integer.MIN_VALUE);
    assertThat(randomIdProvider.genId()).isLessThan(Integer.MAX_VALUE);
  }
}