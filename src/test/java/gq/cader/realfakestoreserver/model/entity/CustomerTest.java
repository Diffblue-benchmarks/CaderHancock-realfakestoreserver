package gq.cader.realfakestoreserver.model.entity;

import gq.cader.realfakestoreserver.model.entity.Address;
import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.entity.Order;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomerTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue5() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName("foo");
    customer.setFirstName(null);
    customer.setEmail("foo");
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName("foo");
    o.setFirstName(null);
    o.setEmail("foo");

    // Act and Assert result
    Assert.assertTrue(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void canEqualInputPositiveOutputFalse() {

    // Arrange
    final Customer customer = new Customer();

    // Act and Assert result
    Assert.assertFalse(customer.canEqual(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse2() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName("foo");
    customer.setEmail(null);
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName(null);
    o.setFirstName(null);
    o.setEmail(null);

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse3() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName("foo");
    customer.setEmail("foo");
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName(null);
    o.setFirstName("foo");
    o.setEmail(null);

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse4() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName("foo");
    customer.setFirstName("foo");
    customer.setEmail("foo");
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName("foo");
    o.setFirstName("foo");
    o.setEmail(null);

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse5() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName("foo");
    customer.setEmail(null);
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName(null);
    o.setFirstName("foo");
    o.setEmail("foo");

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse6() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName("foo");
    customer.setFirstName("foo");
    customer.setEmail(null);
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName(null);
    o.setFirstName("foo");
    o.setEmail("foo");

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse7() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName("foo");
    customer.setEmail(null);
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName("foo");
    o.setFirstName("foo");
    o.setEmail("foo");

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse8() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName(null);
    customer.setEmail(null);
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName(null);
    o.setFirstName(null);
    o.setEmail("foo");

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse9() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName(null);
    customer.setEmail("foo");
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName(null);
    o.setFirstName(null);
    o.setEmail(null);

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse10() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName("foo");
    customer.setFirstName(null);
    customer.setEmail("foo");
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName("foo");
    o.setFirstName(null);
    o.setEmail(null);

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse11() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName("foo");
    customer.setFirstName(null);
    customer.setEmail("foo");
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName(null);
    o.setFirstName(null);
    o.setEmail("foo");

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue1() {

    // Arrange
    final Customer customer = new Customer();
    final Customer o = new Customer();

    // Act and Assert result
    Assert.assertTrue(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue2() {

    // Arrange
    final Customer customer = new Customer();
    final Customer o = new Customer();

    // Act and Assert result
    Assert.assertTrue(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue3() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName("foo");
    customer.setFirstName("foo");
    customer.setEmail("foo");
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName("foo");
    o.setFirstName("foo");
    o.setEmail("foo");

    // Act and Assert result
    Assert.assertTrue(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue4() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName("foo");
    customer.setFirstName("foo");
    customer.setEmail(null);
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName("foo");
    o.setFirstName("foo");
    o.setEmail(null);

    // Act and Assert result
    Assert.assertTrue(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName(null);
    customer.setEmail(null);
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName(null);
    o.setFirstName("foo");
    o.setEmail(null);

    // Act and Assert result
    Assert.assertFalse(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue6() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName(null);
    customer.setEmail(null);
    final Customer o = new Customer();
    o.setCustomerId(null);
    o.setShoppingCart(null);
    o.setOrders(null);
    o.setAddresses(null);
    o.setLastName(null);
    o.setFirstName(null);
    o.setEmail(null);

    // Act and Assert result
    Assert.assertTrue(customer.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final Customer customer = new Customer();

    // Act and Assert result
    Assert.assertFalse(customer.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void setEmailInputNotNullOutputVoid() {

    // Arrange
    final Customer customer = new Customer();

    // Act
    customer.setEmail("/");

    // Assert side effects
    Assert.assertEquals("/", customer.getEmail());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive5() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName("");
    customer.setEmail(null);

    // Act and Assert result
    Assert.assertEquals(207_959, customer.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive1() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName("");
    customer.setFirstName(null);
    customer.setEmail(null);

    // Act and Assert result
    Assert.assertEquals(355_105, customer.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive2() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName(null);
    customer.setEmail("");

    // Act and Assert result
    Assert.assertEquals(357_599, customer.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive3() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName(null);
    customer.setFirstName(null);
    customer.setEmail(null);

    // Act and Assert result
    Assert.assertEquals(357_642, customer.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive4() {

    // Arrange
    final Customer customer = new Customer();

    // Act and Assert result
    Assert.assertEquals(357_642, customer.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final Customer customer = new Customer();
    customer.setCustomerId(null);
    customer.setShoppingCart(null);
    customer.setOrders(null);
    customer.setAddresses(null);
    customer.setLastName("?????????????????");
    customer.setFirstName("??????????????????????????????");
    customer.setEmail("???");

    // Act and Assert result
    Assert.assertEquals(
        "Customer(customerId=null, firstName=??????????????????????????????, lastName=?????????????????, shoppingCart=null, addresses=null, email=???, orders=null)",
        customer.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCustomerIdOutputNull() {

    // Arrange
    final Customer customer = new Customer();

    // Act and Assert result
    Assert.assertNull(customer.getCustomerId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFirstNameOutputNull() {

    // Arrange
    final Customer customer = new Customer();

    // Act and Assert result
    Assert.assertNull(customer.getFirstName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLastNameOutputNull() {

    // Arrange
    final Customer customer = new Customer();

    // Act and Assert result
    Assert.assertNull(customer.getLastName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getShoppingCartOutputNotNull() {

    // Arrange
    final Customer customer = new Customer();

    // Act
    final ShoppingCart actual = customer.getShoppingCart();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getId());
    final HashMap<Product, Integer> hashMap = new HashMap<Product, Integer>();
    Assert.assertEquals(hashMap, actual.getProductQuantityMap());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getAddressesOutput0() {

    // Arrange
    final Customer customer = new Customer();

    // Act
    final List<Address> actual = customer.getAddresses();

    // Assert result
    final ArrayList<Address> arrayList = new ArrayList<Address>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getEmailOutputNull() {

    // Arrange
    final Customer customer = new Customer();

    // Act and Assert result
    Assert.assertNull(customer.getEmail());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOrdersOutput0() {

    // Arrange
    final Customer customer = new Customer();

    // Act
    final List<Order> actual = customer.getOrders();

    // Assert result
    final ArrayList<Order> arrayList = new ArrayList<Order>();
    Assert.assertEquals(arrayList, actual);
  }
}
