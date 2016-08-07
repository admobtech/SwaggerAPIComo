package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class RedeemItem   {
  
  private String redeemCode = null;
  private String assetKey = null;

  /**
   * A code given by the customer to the POS.
   **/
  public RedeemItem redeemCode(String redeemCode) {
    this.redeemCode = redeemCode;
    return this;
  }

  
  @ApiModelProperty(value = "A code given by the customer to the POS.")
  @JsonProperty("RedeemCode")
  public String getRedeemCode() {
    return redeemCode;
  }
  public void setRedeemCode(String redeemCode) {
    this.redeemCode = redeemCode;
  }

  /**
   * The asset key as provided by the POS from the 'GetMemberDetails' API call response.
   **/
  public RedeemItem assetKey(String assetKey) {
    this.assetKey = assetKey;
    return this;
  }

  
  @ApiModelProperty(value = "The asset key as provided by the POS from the 'GetMemberDetails' API call response.")
  @JsonProperty("AssetKey")
  public String getAssetKey() {
    return assetKey;
  }
  public void setAssetKey(String assetKey) {
    this.assetKey = assetKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedeemItem redeemItem = (RedeemItem) o;
    return Objects.equals(redeemCode, redeemItem.redeemCode) &&
        Objects.equals(assetKey, redeemItem.assetKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redeemCode, assetKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedeemItem {\n");
    
    sb.append("    redeemCode: ").append(toIndentedString(redeemCode)).append("\n");
    sb.append("    assetKey: ").append(toIndentedString(assetKey)).append("\n");
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

