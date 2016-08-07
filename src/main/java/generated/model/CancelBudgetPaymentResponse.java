package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class CancelBudgetPaymentResponse   {
  
  private String result = null;
  private List<NewPointsSetObjects> newPointsSet = new ArrayList<NewPointsSetObjects>();

  /**
   * Indicate if the API call succeeded or failed.
   **/
  public CancelBudgetPaymentResponse result(String result) {
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
   * An array of optional benefits.
   **/
  public CancelBudgetPaymentResponse newPointsSet(List<NewPointsSetObjects> newPointsSet) {
    this.newPointsSet = newPointsSet;
    return this;
  }

  
  @ApiModelProperty(value = "An array of optional benefits.")
  @JsonProperty("NewPointsSet")
  public List<NewPointsSetObjects> getNewPointsSet() {
    return newPointsSet;
  }
  public void setNewPointsSet(List<NewPointsSetObjects> newPointsSet) {
    this.newPointsSet = newPointsSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelBudgetPaymentResponse cancelBudgetPaymentResponse = (CancelBudgetPaymentResponse) o;
    return Objects.equals(result, cancelBudgetPaymentResponse.result) &&
        Objects.equals(newPointsSet, cancelBudgetPaymentResponse.newPointsSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, newPointsSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelBudgetPaymentResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    newPointsSet: ").append(toIndentedString(newPointsSet)).append("\n");
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

