package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class Payment   {
  
  private String type = null;
  private String details = null;
  private String sum = null;

  /**
   * The type of the payment as one of the following; 'cash', 'credit_card', 'debit_card', 'club_budget', 'voucher', 'coupon', 'cheque', 'pre_paid', 'debt' For other types please contact us.
   **/
  public Payment type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of the payment as one of the following; 'cash', 'credit_card', 'debit_card', 'club_budget', 'voucher', 'coupon', 'cheque', 'pre_paid', 'debt' For other types please contact us.")
  @JsonProperty("Type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Additional information. i.e. – last 4 digits of credit card, the payment confirmation number.
   **/
  public Payment details(String details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(value = "Additional information. i.e. – last 4 digits of credit card, the payment confirmation number.")
  @JsonProperty("Details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   * Sum of the payment in cents.
   **/
  public Payment sum(String sum) {
    this.sum = sum;
    return this;
  }

  
  @ApiModelProperty(value = "Sum of the payment in cents.")
  @JsonProperty("Sum")
  public String getSum() {
    return sum;
  }
  public void setSum(String sum) {
    this.sum = sum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(type, payment.type) &&
        Objects.equals(details, payment.details) &&
        Objects.equals(sum, payment.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, details, sum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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

