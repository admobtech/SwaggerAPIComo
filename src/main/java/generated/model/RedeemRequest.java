package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class RedeemRequest   {
  
  private List<RedeemItem> redeemItems = new ArrayList<RedeemItem>();
  private Boolean markAsUsed = null;
  private Boolean returnExtendedItems = null;

  /**
   * An array of the gifts RedeemItems that the member requested to redeem for the current API call. If a RedeemItem was used successfully calling the Redeem API with that item should not be permitted in the same transaction.
   **/
  public RedeemRequest redeemItems(List<RedeemItem> redeemItems) {
    this.redeemItems = redeemItems;
    return this;
  }

  
  @ApiModelProperty(value = "An array of the gifts RedeemItems that the member requested to redeem for the current API call. If a RedeemItem was used successfully calling the Redeem API with that item should not be permitted in the same transaction.")
  @JsonProperty("RedeemItems")
  public List<RedeemItem> getRedeemItems() {
    return redeemItems;
  }
  public void setRedeemItems(List<RedeemItem> redeemItems) {
    this.redeemItems = redeemItems;
  }

  /**
   * If true all RedeemItems as used will be marked as used. When false the Redeem API call will not mark the RedeemItems as used.
   **/
  public RedeemRequest markAsUsed(Boolean markAsUsed) {
    this.markAsUsed = markAsUsed;
    return this;
  }

  
  @ApiModelProperty(value = "If true all RedeemItems as used will be marked as used. When false the Redeem API call will not mark the RedeemItems as used.")
  @JsonProperty("MarkAsUsed")
  public Boolean getMarkAsUsed() {
    return markAsUsed;
  }
  public void setMarkAsUsed(Boolean markAsUsed) {
    this.markAsUsed = markAsUsed;
  }

  /**
   * Show items with dependencies on other items on the purchase. Setting this property as true will change the format of the response to show item dependencies.
   **/
  public RedeemRequest returnExtendedItems(Boolean returnExtendedItems) {
    this.returnExtendedItems = returnExtendedItems;
    return this;
  }

  
  @ApiModelProperty(value = "Show items with dependencies on other items on the purchase. Setting this property as true will change the format of the response to show item dependencies.")
  @JsonProperty("ReturnExtendedItems")
  public Boolean getReturnExtendedItems() {
    return returnExtendedItems;
  }
  public void setReturnExtendedItems(Boolean returnExtendedItems) {
    this.returnExtendedItems = returnExtendedItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedeemRequest redeemRequest = (RedeemRequest) o;
    return Objects.equals(redeemItems, redeemRequest.redeemItems) &&
        Objects.equals(markAsUsed, redeemRequest.markAsUsed) &&
        Objects.equals(returnExtendedItems, redeemRequest.returnExtendedItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redeemItems, markAsUsed, returnExtendedItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedeemRequest {\n");
    
    sb.append("    redeemItems: ").append(toIndentedString(redeemItems)).append("\n");
    sb.append("    markAsUsed: ").append(toIndentedString(markAsUsed)).append("\n");
    sb.append("    returnExtendedItems: ").append(toIndentedString(returnExtendedItems)).append("\n");
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

