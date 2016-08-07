package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class CancelPurchaseRequest   {
  
  private String confirmation = null;

  /**
   * The confirmation code provided by the SubmitPurchase function.
   **/
  public CancelPurchaseRequest confirmation(String confirmation) {
    this.confirmation = confirmation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The confirmation code provided by the SubmitPurchase function.")
  @JsonProperty("Confirmation")
  public String getConfirmation() {
    return confirmation;
  }
  public void setConfirmation(String confirmation) {
    this.confirmation = confirmation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelPurchaseRequest cancelPurchaseRequest = (CancelPurchaseRequest) o;
    return Objects.equals(confirmation, cancelPurchaseRequest.confirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPurchaseRequest {\n");
    
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
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

