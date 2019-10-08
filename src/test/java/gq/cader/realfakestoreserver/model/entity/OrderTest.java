package gq.cader.realfakestoreserver.model.entity;

import gq.cader.realfakestoreserver.model.entity.Address;
import gq.cader.realfakestoreserver.model.entity.Order;
import gq.cader.realfakestoreserver.model.entity.OrderStatus;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class OrderTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue7() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertTrue(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void canEqualInputPositiveOutputFalse() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertFalse(order.canEqual(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(null);
    shoppingCart.setProductQuantityMap(null);
    order.setShoppingCart(shoppingCart);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse6() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(OrderStatus.DELIVERED);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse7() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(OrderStatus.DELIVERED);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity("foo");
    address.setStreetAddress(null);
    address.setAddressId(0);
    address.setState("foo");
    address.setPostalCode("foo");
    order.setAddress(address);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(null);
    o.setShoppingCart(null);
    final Address address1 = new Address();
    address1.setCountry("foo");
    address1.setCity("foo");
    address1.setStreetAddress(null);
    address1.setAddressId(null);
    address1.setState("foo");
    address1.setPostalCode("foo");
    o.setAddress(address1);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse8() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(OrderStatus.SHIPPED);
    order.setCustomerId(1);
    order.setShoppingCart(null);
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity("foo");
    address.setStreetAddress(null);
    address.setAddressId(0);
    address.setState("foo");
    address.setPostalCode("foo");
    order.setAddress(address);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(OrderStatus.SHIPPED);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    final Address address1 = new Address();
    address1.setCountry("foo");
    address1.setCity("foo");
    address1.setStreetAddress(null);
    address1.setAddressId(null);
    address1.setState("foo");
    address1.setPostalCode("foo");
    o.setAddress(address1);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse9() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(OrderStatus.SHIPPED);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity("foo");
    address.setStreetAddress(null);
    address.setAddressId(0);
    address.setState("foo");
    address.setPostalCode("foo");
    order.setAddress(address);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(OrderStatus.SHIPPED);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    final Address address1 = new Address();
    address1.setCountry("foo");
    address1.setCity("foo");
    address1.setStreetAddress(null);
    address1.setAddressId(null);
    address1.setState("foo");
    address1.setPostalCode("foo");
    o.setAddress(address1);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse10() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity("foo");
    address.setStreetAddress(null);
    address.setAddressId(0);
    address.setState("foo");
    address.setPostalCode("foo");
    order.setAddress(address);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(OrderStatus.PENDING);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    final Address address1 = new Address();
    address1.setCountry("foo");
    address1.setCity("foo");
    address1.setStreetAddress(null);
    address1.setAddressId(null);
    address1.setState("foo");
    address1.setPostalCode("foo");
    o.setAddress(address1);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse13() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse14() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(-2_147_483_648);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse16() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(OrderStatus.DELIVERED);
    order.setCustomerId(-2_147_483_648);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse17() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(-2_147_483_648);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(OrderStatus.DELIVERED);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse10() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse11() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(0);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertFalse(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue1() {

    // Arrange
    final Order order = new Order();
    final Order o = new Order();

    // Act and Assert result
    Assert.assertTrue(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue2() {

    // Arrange
    final Order order = new Order();
    final Order o = new Order();

    // Act and Assert result
    Assert.assertTrue(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue3() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(OrderStatus.SHIPPED);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity("foo");
    address.setStreetAddress(null);
    address.setAddressId(0);
    address.setState("foo");
    address.setPostalCode("foo");
    order.setAddress(address);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(OrderStatus.SHIPPED);
    o.setCustomerId(null);
    o.setShoppingCart(null);
    final Address address1 = new Address();
    address1.setCountry("foo");
    address1.setCity("foo");
    address1.setStreetAddress(null);
    address1.setAddressId(null);
    address1.setState("foo");
    address1.setPostalCode("foo");
    o.setAddress(address1);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertTrue(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue4() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(OrderStatus.SHIPPED);
    order.setCustomerId(0);
    order.setShoppingCart(null);
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity("foo");
    address.setStreetAddress(null);
    address.setAddressId(0);
    address.setState("foo");
    address.setPostalCode("foo");
    order.setAddress(address);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(OrderStatus.SHIPPED);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    final Address address1 = new Address();
    address1.setCountry("foo");
    address1.setCity("foo");
    address1.setStreetAddress(null);
    address1.setAddressId(null);
    address1.setState("foo");
    address1.setPostalCode("foo");
    o.setAddress(address1);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertTrue(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue5() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity("foo");
    address.setStreetAddress(null);
    address.setAddressId(0);
    address.setState("foo");
    address.setPostalCode("foo");
    order.setAddress(address);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(null);
    o.setShoppingCart(null);
    final Address address1 = new Address();
    address1.setCountry("foo");
    address1.setCity("foo");
    address1.setStreetAddress(null);
    address1.setAddressId(null);
    address1.setState("foo");
    address1.setPostalCode("foo");
    o.setAddress(address1);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertTrue(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue6() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(0);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(0);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertTrue(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertEquals(
        "Order(id=null, shoppingCart=null, address=null, timeOrderReceived=null, status=null, customerId=null)",
        order.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue8() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(OrderStatus.PENDING);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(OrderStatus.PENDING);
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertTrue(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue8() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);
    final Order o = new Order();
    o.setId(null);
    o.setStatus(null);
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setAddress(null);
    o.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertTrue(order.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertFalse(order.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void setStatusInputPendingOutputVoid() {

    // Arrange
    final Order order = new Order();
    final OrderStatus status = OrderStatus.PENDING;

    // Act
    order.setStatus(status);

    // Assert side effects
    Assert.assertEquals(OrderStatus.PENDING, order.getStatus());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(-1_244_954_339);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertEquals(0, order.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero5() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(43);
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(601_085_321);
    shoppingCart.setProductQuantityMap(null);
    order.setShoppingCart(shoppingCart);
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    order.setAddress(address);
    order.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertEquals(0, order.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero4() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(601_085_321);
    shoppingCart.setProductQuantityMap(null);
    order.setShoppingCart(shoppingCart);
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    order.setAddress(address);
    order.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertEquals(0, order.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive9() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    order.setAddress(address);
    order.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertEquals(729_078_391, order.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive8() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    order.setAddress(address);
    order.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertEquals(729_078_391, order.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive2() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertEquals(1_244_954_382, order.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive3() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertEquals(1_244_954_382, order.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive7() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(null);
    shoppingCart.setProductQuantityMap(null);
    order.setShoppingCart(shoppingCart);
    order.setAddress(null);
    order.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertEquals(1_959_878_681, order.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull1() {

    // Arrange
    final Order order = new Order();
    order.setId(null);
    order.setStatus(null);
    order.setCustomerId(null);
    order.setShoppingCart(null);
    order.setAddress(null);
    order.setTimeOrderReceived(null);

    // Act and Assert result
    Assert.assertEquals(
        "Order(id=null, shoppingCart=null, address=null, timeOrderReceived=null, status=null, customerId=null)",
        order.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIdOutputNull() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertNull(order.getId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getShoppingCartOutputNull() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertNull(order.getShoppingCart());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getAddressOutputNull() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertNull(order.getAddress());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTimeOrderReceivedOutputNull() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertNull(order.getTimeOrderReceived());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStatusOutputNull() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertNull(order.getStatus());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCustomerIdOutputNull() {

    // Arrange
    final Order order = new Order();

    // Act and Assert result
    Assert.assertNull(order.getCustomerId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNullNullNullNullOutputNotNull() {

    // Act, creating object to test constructor
    final Order actual = new Order(null, null, null, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getId());
    Assert.assertEquals(OrderStatus.PENDING, actual.getStatus());
    Assert.assertNull(actual.getCustomerId());
    Assert.assertNull(actual.getShoppingCart());
    Assert.assertNull(actual.getAddress());
    Assert.assertNull(actual.getTimeOrderReceived());
  }
}
