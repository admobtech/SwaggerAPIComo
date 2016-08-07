package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;



/**
 * An array of optional benefits.
 **/

@ApiModel(description = "An array of optional benefits.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class OptionalBenefit   {
  
  private Integer multiSelectMax = null;
  private Benefit options = null;

  /**
   * The max number of options that the user can select.
   **/
  public OptionalBenefit multiSelectMax(Integer multiSelectMax) {
    this.multiSelectMax = multiSelectMax;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The max number of options that the user can select.")
  @JsonProperty("MultiSelectMax")
  public Integer getMultiSelectMax() {
    return multiSelectMax;
  }
  public void setMultiSelectMax(Integer multiSelectMax) {
    this.multiSelectMax = multiSelectMax;
  }

  /**
   **/
  public OptionalBenefit options(Benefit options) {
    this.options = options;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("Options")
  public Benefit getOptions() {
    return options;
  }
  public void setOptions(Benefit options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionalBenefit optionalBenefit = (OptionalBenefit) o;
    return Objects.equals(multiSelectMax, optionalBenefit.multiSelectMax) &&
        Objects.equals(options, optionalBenefit.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiSelectMax, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionalBenefit {\n");
    
    sb.append("    multiSelectMax: ").append(toIndentedString(multiSelectMax)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

