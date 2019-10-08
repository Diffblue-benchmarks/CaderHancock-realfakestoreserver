package gq.cader.realfakestoreserver.model.entity;

import gq.cader.realfakestoreserver.model.entity.Address;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AddressTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity(null);
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry("foo");
    o.setCity(null);
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertTrue(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void canEqualInputPositiveOutputFalse() {

    // Arrange
    final Address address = new Address();

    // Act and Assert result
    Assert.assertFalse(address.canEqual(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry(null);
    o.setCity(null);
    o.setStreetAddress(null);
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse1() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry(null);
    o.setCity(null);
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse2() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity("foo");
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry(null);
    o.setCity("foo");
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse3() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity("foo");
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry(null);
    o.setCity("foo");
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse4() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity("foo");
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry(null);
    o.setCity("foo");
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse5() {

    // Arrange
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity(null);
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry(null);
    o.setCity(null);
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse6() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry("foo");
    o.setCity(null);
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse7() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry("foo");
    o.setCity(null);
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse8() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry("foo");
    o.setCity(null);
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse9() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity("foo");
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry("foo");
    o.setCity(null);
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse10() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry("foo");
    o.setCity("foo");
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse11() {

    // Arrange
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry(null);
    o.setCity(null);
    o.setStreetAddress(null);
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse12() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity("foo");
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry("foo");
    o.setCity("foo");
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse13() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry("?");
    o.setCity(null);
    o.setStreetAddress(null);
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse14() {

    // Arrange
    final Address address = new Address();
    address.setCountry("?");
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry(null);
    o.setCity(null);
    o.setStreetAddress(null);
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue1() {

    // Arrange
    final Address address = new Address();
    final Address o = new Address();

    // Act and Assert result
    Assert.assertTrue(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue2() {

    // Arrange
    final Address address = new Address();
    final Address o = new Address();

    // Act and Assert result
    Assert.assertTrue(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue3() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity("foo");
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry(null);
    o.setCity("foo");
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertTrue(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse15() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry(null);
    o.setCity(null);
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertFalse(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue4() {

    // Arrange
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity(null);
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry("foo");
    o.setCity(null);
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertTrue(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue5() {

    // Arrange
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity("foo");
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry("foo");
    o.setCity("foo");
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertTrue(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue6() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity("foo");
    address.setStreetAddress("foo");
    address.setAddressId(null);
    address.setState("foo");
    address.setPostalCode("foo");
    final Address o = new Address();
    o.setCountry(null);
    o.setCity("foo");
    o.setStreetAddress("foo");
    o.setAddressId(null);
    o.setState("foo");
    o.setPostalCode("foo");

    // Act and Assert result
    Assert.assertTrue(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue7() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry(null);
    o.setCity(null);
    o.setStreetAddress(null);
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertTrue(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue8() {

    // Arrange
    final Address address = new Address();
    address.setCountry(
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000??????????????????????????????");
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);
    final Address o = new Address();
    o.setCountry(
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000??????????????????????????????");
    o.setCity(null);
    o.setStreetAddress(null);
    o.setAddressId(null);
    o.setState(null);
    o.setPostalCode(null);

    // Act and Assert result
    Assert.assertTrue(address.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final Address address = new Address();

    // Act and Assert result
    Assert.assertFalse(address.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress("");
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);

    // Act and Assert result
    Assert.assertEquals(723_907_859, address.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive1() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity("");
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);

    // Act and Assert result
    Assert.assertEquals(1_236_123_085, address.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive2() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode("");

    // Act and Assert result
    Assert.assertEquals(1_244_804_699, address.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive3() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState("");
    address.setPostalCode(null);

    // Act and Assert result
    Assert.assertEquals(1_244_951_845, address.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive4() {

    // Arrange
    final Address address = new Address();
    address.setCountry("");
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);

    // Act and Assert result
    Assert.assertEquals(1_244_954_339, address.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive5() {

    // Arrange
    final Address address = new Address();
    address.setCountry(null);
    address.setCity(null);
    address.setStreetAddress(null);
    address.setAddressId(null);
    address.setState(null);
    address.setPostalCode(null);

    // Act and Assert result
    Assert.assertEquals(1_244_954_382, address.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive6() {

    // Arrange
    final Address address = new Address();

    // Act and Assert result
    Assert.assertEquals(1_244_954_382, address.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final Address address = new Address();
    address.setCountry("foo");
    address.setCity("foo");
    address.setStreetAddress("foo");
    address.setAddressId(-89);
    address.setState("foo");
    address.setPostalCode("foo");

    // Act and Assert result
    Assert.assertEquals(
        "Address(addressId=-89, streetAddress=foo, city=foo, postalCode=foo, state=foo, country=foo)",
        address.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStreetAddressOutputNull() {

    // Arrange
    final Address address = new Address();

    // Act and Assert result
    Assert.assertNull(address.getStreetAddress());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStateOutputNull() {

    // Arrange
    final Address address = new Address();

    // Act and Assert result
    Assert.assertNull(address.getState());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPostalCodeOutputNull() {

    // Arrange
    final Address address = new Address();

    // Act and Assert result
    Assert.assertNull(address.getPostalCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCountryOutputNull() {

    // Arrange
    final Address address = new Address();

    // Act and Assert result
    Assert.assertNull(address.getCountry());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCityOutputNull() {

    // Arrange
    final Address address = new Address();

    // Act and Assert result
    Assert.assertNull(address.getCity());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getAddressIdOutputNull() {

    // Arrange
    final Address address = new Address();

    // Act and Assert result
    Assert.assertNull(address.getAddressId());
  }
}
