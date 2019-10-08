package gq.cader.realfakestoreserver.model.entity;

import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ProductTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getDescriptionOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getDescription());
  }

  // Test written by Diffblue Cover.
  @Test
  public void canEqualInputPositiveOutputFalse() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertFalse(product.canEqual(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse2() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC("foo");
    o.setCategory(null);
    o.setNumInInventory(0);
    o.setName(null);
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertFalse(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse3() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName("foo");
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC("foo");
    o.setCategory(null);
    o.setNumInInventory(0);
    o.setName("foo");
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertFalse(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse4() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC("foo");
    product.setCategory(ProductCategory.TOYS);
    product.setNumInInventory(0);
    product.setName("foo");
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC(null);
    o.setCategory(null);
    o.setNumInInventory(0);
    o.setName("foo");
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertFalse(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse5() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC("foo");
    product.setCategory(ProductCategory.TOYS);
    product.setNumInInventory(0);
    product.setName("foo");
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC("foo");
    o.setCategory(null);
    o.setNumInInventory(0);
    o.setName("foo");
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertFalse(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse6() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC("foo");
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName("foo");
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC("foo");
    o.setCategory(ProductCategory.TOYS);
    o.setNumInInventory(0);
    o.setName(null);
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertFalse(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse7() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC(null);
    o.setCategory(ProductCategory.TOYS);
    o.setNumInInventory(0);
    o.setName(null);
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertFalse(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse8() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC(null);
    o.setCategory(ProductCategory.HOME);
    o.setNumInInventory(0);
    o.setName(null);
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertFalse(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse9() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(ProductCategory.TOYS);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC(null);
    o.setCategory(ProductCategory.HOME);
    o.setNumInInventory(0);
    o.setName(null);
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertFalse(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final Product product = new Product();
    final Product o = new Product();

    // Act and Assert result
    Assert.assertTrue(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue2() {

    // Arrange
    final Product product = new Product();
    final Product o = new Product();

    // Act and Assert result
    Assert.assertTrue(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue3() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC("foo");
    product.setCategory(ProductCategory.TOYS);
    product.setNumInInventory(0);
    product.setName("foo");
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC("foo");
    o.setCategory(ProductCategory.TOYS);
    o.setNumInInventory(0);
    o.setName("foo");
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertTrue(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue4() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC("foo");
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName("foo");
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC("foo");
    o.setCategory(null);
    o.setNumInInventory(0);
    o.setName("foo");
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertTrue(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue5() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC(null);
    o.setCategory(null);
    o.setNumInInventory(0);
    o.setName(null);
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertTrue(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue6() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(ProductCategory.HOME);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC(null);
    o.setCategory(ProductCategory.HOME);
    o.setNumInInventory(0);
    o.setName(null);
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertTrue(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertFalse(product.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCategoryOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getCategory());
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);
    final Product o = new Product();
    o.setProductId(null);
    o.setImgPath(null);
    o.setUPC(null);
    o.setCategory(null);
    o.setNumInInventory(0);
    o.setName("foo");
    o.setPrice(null);
    o.setDescription(null);

    // Act and Assert result
    Assert.assertFalse(product.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getImgPathOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getImgPath());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNameOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNumInInventoryOutputZero() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertEquals(0, product.getNumInInventory());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPriceOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getPrice());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getProductIdOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getProductId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getUPCOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getUPC());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertEquals(357_642, product.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive1() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);

    // Act and Assert result
    Assert.assertEquals(357_642, product.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive2() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);

    // Act and Assert result
    Assert.assertEquals(357_642, product.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive6() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC("");
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName(null);
    product.setPrice(null);
    product.setDescription(null);

    // Act and Assert result
    Assert.assertEquals(355_105, product.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive7() {

    // Arrange
    final Product product = new Product();
    product.setProductId(null);
    product.setImgPath(null);
    product.setUPC(null);
    product.setCategory(null);
    product.setNumInInventory(0);
    product.setName("");
    product.setPrice(null);
    product.setDescription(null);

    // Act and Assert result
    Assert.assertEquals(207_959, product.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCategoryInputTechnologyOutputVoid() {

    // Arrange
    final Product product = new Product();
    final ProductCategory category = ProductCategory.TECHNOLOGY;

    // Act
    product.setCategory(category);

    // Assert side effects
    Assert.assertEquals(ProductCategory.TECHNOLOGY, product.getCategory());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setDescriptionInputNotNullOutputVoid() {

    // Arrange
    final Product product = new Product();

    // Act
    product.setDescription("/");

    // Assert side effects
    Assert.assertEquals("/", product.getDescription());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setImgPathInputNotNullOutputVoid() {

    // Arrange
    final Product product = new Product();

    // Act
    product.setImgPath("/");

    // Assert side effects
    Assert.assertEquals("/", product.getImgPath());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setNumInInventoryInputPositiveOutputVoid() {

    // Arrange
    final Product product = new Product();

    // Act
    product.setNumInInventory(2);

    // Assert side effects
    Assert.assertEquals(2, product.getNumInInventory());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setUPCInputNotNullOutputVoid() {

    // Arrange
    final Product product = new Product();

    // Act
    product.setUPC("/");

    // Assert side effects
    Assert.assertEquals("/", product.getUPC());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final Product product = new Product();
    product.setProductId(-2_147_352_576);
    product.setImgPath("foo");
    product.setUPC("foo");
    product.setCategory(ProductCategory.BOOKS);
    product.setNumInInventory(-21);
    product.setName("foo");
    product.setPrice(null);
    product.setDescription("foo");

    // Act and Assert result
    Assert.assertEquals(
        "Product(productId=-2147352576, name=foo, price=null, description=foo, imgPath=foo, numInInventory=-21, UPC=foo, category=BOOKS)",
        product.toString());
  }
}
