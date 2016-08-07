package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class SubmitPurchaseResponse   {
  
  private String result = null;
  private String status = null;
  private String confirmation = null;
  private String expectedTotalSum = null;

  /**
   * Indicate if the API call succeeded or failed.
   **/
  public SubmitPurchaseResponse result(String result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "Indicate if the API call succeeded or failed.")
  @JsonProperty("Result")
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }

  /**
   * Inner status of the transaction.
   **/
  public SubmitPurchaseResponse status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Inner status of the transaction.")
  @JsonProperty("Status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The confirmation code provided by the SubmitPurchase function.
   **/
  public SubmitPurchaseResponse confirmation(String confirmation) {
    this.confirmation = confirmation;
    return this;
  }

  
  @ApiModelProperty(value = "The confirmation code provided by the SubmitPurchase function.")
  @JsonProperty("Confirmation")
  public String getConfirmation() {
    return confirmation;
  }
  public void setConfirmation(String confirmation) {
    this.confirmation = confirmation;
  }

  /**
   * The total sum as indicated by the items rows. Should be identical to the TotalSum - Can be used to identify problems.
   **/
  public SubmitPurchaseResponse expectedTotalSum(String expectedTotalSum) {
    this.expectedTotalSum = expectedTotalSum;
    return this;
  }

  
  @ApiModelProperty(value = "The total sum as indicated by the items rows. Should be identical to the TotalSum - Can be used to identify problems.")
  @JsonProperty("ExpectedTotalSum")
  public String getExpectedTotalSum() {
    return expectedTotalSum;
  }
  public void setExpectedTotalSum(String expectedTotalSum) {
    this.expectedTotalSum = expectedTotalSum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitPurchaseResponse submitPurchaseResponse = (SubmitPurchaseResponse) o;
    return Objects.equals(result, submitPurchaseResponse.result) &&
        Objects.equals(status, submitPurchaseResponse.status) &&
        Objects.equals(confirmation, submitPurchaseResponse.confirmation) &&
        Objects.equals(expectedTotalSum, submitPurchaseResponse.expectedTotalSum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status, confirmation, expectedTotalSum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitPurchaseResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    expectedTotalSum: ").append(toIndentedString(expectedTotalSum)).append("\n");
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

