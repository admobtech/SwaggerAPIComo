package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class Discount   {
  
  private String description = null;
  private Integer sum = null;

  /**
   * Human readable description of the discount.
   **/
  public Discount description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Human readable description of the discount.")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sum of the discount in cents. The sum should be inserted as is (no sign changes are needed).
   **/
  public Discount sum(Integer sum) {
    this.sum = sum;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Sum of the discount in cents. The sum should be inserted as is (no sign changes are needed).")
  @JsonProperty("Sum")
  public Integer getSum() {
    return sum;
  }
  public void setSum(Integer sum) {
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
    Discount discount = (Discount) o;
    return Objects.equals(description, discount.description) &&
        Objects.equals(sum, discount.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, sum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discount {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

