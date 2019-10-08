package gq.cader.realfakestoreserver.model.entity;

import gq.cader.realfakestoreserver.model.entity.OrderStatus;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class OrderStatusTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  @Rule public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Act
    thrown.expect(IllegalArgumentException.class);
    OrderStatus.valueOf("foo");

    // The method is not expected to return due to exception thrown
  }
}
