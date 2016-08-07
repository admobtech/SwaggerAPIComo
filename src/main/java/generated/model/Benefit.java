package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class Benefit   {
  
  private List<String> itemCodes = new ArrayList<String>();
  private List<String> dealCodes = new ArrayList<String>();
  private List<Discount> discounts = new ArrayList<Discount>();

  /**
   * An array of POS Item codes that should be added to the purchase.
   **/
  public Benefit itemCodes(List<String> itemCodes) {
    this.itemCodes = itemCodes;
    return this;
  }

  
  @ApiModelProperty(value = "An array of POS Item codes that should be added to the purchase.")
  @JsonProperty("ItemCodes")
  public List<String> getItemCodes() {
    return itemCodes;
  }
  public void setItemCodes(List<String> itemCodes) {
    this.itemCodes = itemCodes;
  }

  /**
   * An array of POS codes that have complex behavior, i.e. promotion triggers, discounts etc.
   **/
  public Benefit dealCodes(List<String> dealCodes) {
    this.dealCodes = dealCodes;
    return this;
  }

  
  @ApiModelProperty(value = "An array of POS codes that have complex behavior, i.e. promotion triggers, discounts etc.")
  @JsonProperty("DealCodes")
  public List<String> getDealCodes() {
    return dealCodes;
  }
  public void setDealCodes(List<String> dealCodes) {
    this.dealCodes = dealCodes;
  }

  /**
   * An array of discounts.
   **/
  public Benefit discounts(List<Discount> discounts) {
    this.discounts = discounts;
    return this;
  }

  
  @ApiModelProperty(value = "An array of discounts.")
  @JsonProperty("Discounts")
  public List<Discount> getDiscounts() {
    return discounts;
  }
  public void setDiscounts(List<Discount> discounts) {
    this.discounts = discounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benefit benefit = (Benefit) o;
    return Objects.equals(itemCodes, benefit.itemCodes) &&
        Objects.equals(dealCodes, benefit.dealCodes) &&
        Objects.equals(discounts, benefit.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCodes, dealCodes, discounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benefit {\n");
    
    sb.append("    itemCodes: ").append(toIndentedString(itemCodes)).append("\n");
    sb.append("    dealCodes: ").append(toIndentedString(dealCodes)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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

