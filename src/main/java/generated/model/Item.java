package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class Item   {
  
  private String itemCode = null;
  private String itemName = null;
  private String departmentCode = null;
  private String departmentName = null;
  private Integer quantity = null;
  private Double amount = null;
  private String price = null;
  private String tags = null;
  private String cashier = null;

  /**
   * Item identification code.
   **/
  public Item itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

  
  @ApiModelProperty(value = "Item identification code.")
  @JsonProperty("ItemCode")
  public String getItemCode() {
    return itemCode;
  }
  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  /**
   * Human readable item name.
   **/
  public Item itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  
  @ApiModelProperty(value = "Human readable item name.")
  @JsonProperty("ItemName")
  public String getItemName() {
    return itemName;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  /**
   * Department or other relevant hierarchy information.
   **/
  public Item departmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
    return this;
  }

  
  @ApiModelProperty(value = "Department or other relevant hierarchy information.")
  @JsonProperty("DepartmentCode")
  public String getDepartmentCode() {
    return departmentCode;
  }
  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }

  /**
   * Human readable hierarchy information.
   **/
  public Item departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  
  @ApiModelProperty(value = "Human readable hierarchy information.")
  @JsonProperty("DepartmentName")
  public String getDepartmentName() {
    return departmentName;
  }
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  /**
   * Number of items purchased from the current item.
   **/
  public Item quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
  @ApiModelProperty(value = "Number of items purchased from the current item.")
  @JsonProperty("Quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Amount of the current item. Used for weighable items etc. If the item is weighable the Quantity must be 1.
   **/
  public Item amount(Double amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "Amount of the current item. Used for weighable items etc. If the item is weighable the Quantity must be 1.")
  @JsonProperty("Amount")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   * Price of the item with quantity and amount taken in to consideration paid in cents.
   **/
  public Item price(String price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "Price of the item with quantity and amount taken in to consideration paid in cents.")
  @JsonProperty("Price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * Array of strings. Includes optional tags that are available to the business; that are relevant for the specific item.
   **/
  public Item tags(String tags) {
    this.tags = tags;
    return this;
  }

  
  @ApiModelProperty(value = "Array of strings. Includes optional tags that are available to the business; that are relevant for the specific item.")
  @JsonProperty("Tags")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  /**
   * Information about the current transaction operator.
   **/
  public Item cashier(String cashier) {
    this.cashier = cashier;
    return this;
  }

  
  @ApiModelProperty(value = "Information about the current transaction operator.")
  @JsonProperty("Cashier")
  public String getCashier() {
    return cashier;
  }
  public void setCashier(String cashier) {
    this.cashier = cashier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(itemCode, item.itemCode) &&
        Objects.equals(itemName, item.itemName) &&
        Objects.equals(departmentCode, item.departmentCode) &&
        Objects.equals(departmentName, item.departmentName) &&
        Objects.equals(quantity, item.quantity) &&
        Objects.equals(amount, item.amount) &&
        Objects.equals(price, item.price) &&
        Objects.equals(tags, item.tags) &&
        Objects.equals(cashier, item.cashier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCode, itemName, departmentCode, departmentName, quantity, amount, price, tags, cashier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    cashier: ").append(toIndentedString(cashier)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

