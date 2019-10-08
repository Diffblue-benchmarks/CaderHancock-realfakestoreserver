package gq.cader.realfakestoreserver.model.entity;

import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(null);
    shoppingCart.setProductQuantityMap(null);
    final ShoppingCart o = new ShoppingCart();
    o.setSubtotal(null);
    o.setId(null);
    o.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertTrue(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void canEqualInputPositiveOutputFalse() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();

    // Act and Assert result
    Assert.assertFalse(shoppingCart.canEqual(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(null);
    shoppingCart.setProductQuantityMap(null);
    final ShoppingCart o = new ShoppingCart();
    o.setSubtotal(null);
    o.setId(0);
    o.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertFalse(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse1() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(-2_147_483_648);
    shoppingCart.setProductQuantityMap(null);
    final ShoppingCart o = new ShoppingCart();
    o.setSubtotal(null);
    o.setId(0);
    o.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertFalse(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse2() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(null);
    shoppingCart.setProductQuantityMap(null);
    final ShoppingCart o = new ShoppingCart();
    o.setSubtotal(null);
    o.setId(0);
    o.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertFalse(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse3() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(0);
    shoppingCart.setProductQuantityMap(null);
    final ShoppingCart o = new ShoppingCart();
    o.setSubtotal(null);
    o.setId(null);
    o.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertFalse(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue1() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    final ShoppingCart o = new ShoppingCart();

    // Act and Assert result
    Assert.assertTrue(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue2() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    final ShoppingCart o = new ShoppingCart();

    // Act and Assert result
    Assert.assertTrue(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue3() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(0);
    shoppingCart.setProductQuantityMap(null);
    final ShoppingCart o = new ShoppingCart();
    o.setSubtotal(null);
    o.setId(0);
    o.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertTrue(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse4() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(0);
    shoppingCart.setProductQuantityMap(null);
    final ShoppingCart o = new ShoppingCart();
    o.setSubtotal(null);
    o.setId(null);
    o.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertFalse(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue4() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(0);
    shoppingCart.setProductQuantityMap(null);
    final ShoppingCart o = new ShoppingCart();
    o.setSubtotal(null);
    o.setId(0);
    o.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertTrue(shoppingCart.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();

    // Act and Assert result
    Assert.assertFalse(shoppingCart.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(-59);
    shoppingCart.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertEquals(0, shoppingCart.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(null);
    shoppingCart.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertEquals(102, shoppingCart.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive1() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();

    // Act and Assert result
    Assert.assertEquals(102, shoppingCart.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero1() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setSubtotal(null);
    shoppingCart.setId(-59);
    shoppingCart.setProductQuantityMap(null);

    // Act and Assert result
    Assert.assertEquals(0, shoppingCart.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIdOutputNull() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();

    // Act and Assert result
    Assert.assertNull(shoppingCart.getId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getProductQuantityMapOutput0() {

    // Arrange
    final ShoppingCart shoppingCart = new ShoppingCart();

    // Act
    final Map<Product, Integer> actual = shoppingCart.getProductQuantityMap();

    // Assert result
    final HashMap<Product, Integer> hashMap = new HashMap<Product, Integer>();
    Assert.assertEquals(hashMap, actual);
  }
}
