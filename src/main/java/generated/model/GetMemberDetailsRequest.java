package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class GetMemberDetailsRequest   {
  
  private List<Customer> customers = new ArrayList<Customer>();
  private Boolean expandAssets = null;
  private Boolean testRedeemConditions = null;
  private Boolean includeArchivedAssets = null;

  /**
   **/
  public GetMemberDetailsRequest customers(List<Customer> customers) {
    this.customers = customers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Customers")
  public List<Customer> getCustomers() {
    return customers;
  }
  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }

  /**
   * Get the Assets of the customer. The assets can then be converted to RedeemItems and allow the POS to get Benefits with the Redeem API call.
   **/
  public GetMemberDetailsRequest expandAssets(Boolean expandAssets) {
    this.expandAssets = expandAssets;
    return this;
  }

  
  @ApiModelProperty(value = "Get the Assets of the customer. The assets can then be converted to RedeemItems and allow the POS to get Benefits with the Redeem API call.")
  @JsonProperty("ExpandAssets")
  public Boolean getExpandAssets() {
    return expandAssets;
  }
  public void setExpandAssets(Boolean expandAssets) {
    this.expandAssets = expandAssets;
  }

  /**
   * Adds the 'Redeemable' flag to the Assets. Indicating that the asset is currently in a redeemable state.
   **/
  public GetMemberDetailsRequest testRedeemConditions(Boolean testRedeemConditions) {
    this.testRedeemConditions = testRedeemConditions;
    return this;
  }

  
  @ApiModelProperty(value = "Adds the 'Redeemable' flag to the Assets. Indicating that the asset is currently in a redeemable state.")
  @JsonProperty("TestRedeemConditions")
  public Boolean getTestRedeemConditions() {
    return testRedeemConditions;
  }
  public void setTestRedeemConditions(Boolean testRedeemConditions) {
    this.testRedeemConditions = testRedeemConditions;
  }

  /**
   * Show Assets(gifts) that the client has redeemed or marked as archived.
   **/
  public GetMemberDetailsRequest includeArchivedAssets(Boolean includeArchivedAssets) {
    this.includeArchivedAssets = includeArchivedAssets;
    return this;
  }

  
  @ApiModelProperty(value = "Show Assets(gifts) that the client has redeemed or marked as archived.")
  @JsonProperty("IncludeArchivedAssets")
  public Boolean getIncludeArchivedAssets() {
    return includeArchivedAssets;
  }
  public void setIncludeArchivedAssets(Boolean includeArchivedAssets) {
    this.includeArchivedAssets = includeArchivedAssets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMemberDetailsRequest getMemberDetailsRequest = (GetMemberDetailsRequest) o;
    return Objects.equals(customers, getMemberDetailsRequest.customers) &&
        Objects.equals(expandAssets, getMemberDetailsRequest.expandAssets) &&
        Objects.equals(testRedeemConditions, getMemberDetailsRequest.testRedeemConditions) &&
        Objects.equals(includeArchivedAssets, getMemberDetailsRequest.includeArchivedAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customers, expandAssets, testRedeemConditions, includeArchivedAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMemberDetailsRequest {\n");
    
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    expandAssets: ").append(toIndentedString(expandAssets)).append("\n");
    sb.append("    testRedeemConditions: ").append(toIndentedString(testRedeemConditions)).append("\n");
    sb.append("    includeArchivedAssets: ").append(toIndentedString(includeArchivedAssets)).append("\n");
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

