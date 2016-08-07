package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class PayWithBudgetResponse   {
  
  private String result = null;
  private Integer actualCharge = null;
  private String paymentUID = null;

  /**
   * Indicate if the API call succeeded or failed.
   **/
  public PayWithBudgetResponse result(String result) {
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
   * The real payment amount.
   **/
  public PayWithBudgetResponse actualCharge(Integer actualCharge) {
    this.actualCharge = actualCharge;
    return this;
  }

  
  @ApiModelProperty(value = "The real payment amount.")
  @JsonProperty("ActualCharge")
  public Integer getActualCharge() {
    return actualCharge;
  }
  public void setActualCharge(Integer actualCharge) {
    this.actualCharge = actualCharge;
  }

  /**
   * The Payment code provided by the PayWithBudget API call. Will be used for canceling the payment.
   **/
  public PayWithBudgetResponse paymentUID(String paymentUID) {
    this.paymentUID = paymentUID;
    return this;
  }

  
  @ApiModelProperty(value = "The Payment code provided by the PayWithBudget API call. Will be used for canceling the payment.")
  @JsonProperty("PaymentUID")
  public String getPaymentUID() {
    return paymentUID;
  }
  public void setPaymentUID(String paymentUID) {
    this.paymentUID = paymentUID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayWithBudgetResponse payWithBudgetResponse = (PayWithBudgetResponse) o;
    return Objects.equals(result, payWithBudgetResponse.result) &&
        Objects.equals(actualCharge, payWithBudgetResponse.actualCharge) &&
        Objects.equals(paymentUID, payWithBudgetResponse.paymentUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, actualCharge, paymentUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayWithBudgetResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    actualCharge: ").append(toIndentedString(actualCharge)).append("\n");
    sb.append("    paymentUID: ").append(toIndentedString(paymentUID)).append("\n");
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

