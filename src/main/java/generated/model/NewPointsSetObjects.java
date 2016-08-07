package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class NewPointsSetObjects   {
  
  private Integer weightedPoints = null;
  private Integer unweightedBudgetPoints = null;
  private Integer accumulatedPoints = null;
  private Integer points = null;

  /**
   * A secondary point measurement representing points with weight and accumulating.
   **/
  public NewPointsSetObjects weightedPoints(Integer weightedPoints) {
    this.weightedPoints = weightedPoints;
    return this;
  }

  
  @ApiModelProperty(value = "A secondary point measurement representing points with weight and accumulating.")
  @JsonProperty("WeightedPoints")
  public Integer getWeightedPoints() {
    return weightedPoints;
  }
  public void setWeightedPoints(Integer weightedPoints) {
    this.weightedPoints = weightedPoints;
  }

  /**
   * A secondary point measurement representing points without weight and not accumulating.
   **/
  public NewPointsSetObjects unweightedBudgetPoints(Integer unweightedBudgetPoints) {
    this.unweightedBudgetPoints = unweightedBudgetPoints;
    return this;
  }

  
  @ApiModelProperty(value = "A secondary point measurement representing points without weight and not accumulating.")
  @JsonProperty("UnweightedBudgetPoints")
  public Integer getUnweightedBudgetPoints() {
    return unweightedBudgetPoints;
  }
  public void setUnweightedBudgetPoints(Integer unweightedBudgetPoints) {
    this.unweightedBudgetPoints = unweightedBudgetPoints;
  }

  /**
   * A secondary point measurement representing points without weight but are accumulated.
   **/
  public NewPointsSetObjects accumulatedPoints(Integer accumulatedPoints) {
    this.accumulatedPoints = accumulatedPoints;
    return this;
  }

  
  @ApiModelProperty(value = "A secondary point measurement representing points without weight but are accumulated.")
  @JsonProperty("AccumulatedPoints")
  public Integer getAccumulatedPoints() {
    return accumulatedPoints;
  }
  public void setAccumulatedPoints(Integer accumulatedPoints) {
    this.accumulatedPoints = accumulatedPoints;
  }

  /**
   * Amount of points that the member has. the points are weighted and are treated like a budget.
   **/
  public NewPointsSetObjects points(Integer points) {
    this.points = points;
    return this;
  }

  
  @ApiModelProperty(value = "Amount of points that the member has. the points are weighted and are treated like a budget.")
  @JsonProperty("Points")
  public Integer getPoints() {
    return points;
  }
  public void setPoints(Integer points) {
    this.points = points;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPointsSetObjects newPointsSetObjects = (NewPointsSetObjects) o;
    return Objects.equals(weightedPoints, newPointsSetObjects.weightedPoints) &&
        Objects.equals(unweightedBudgetPoints, newPointsSetObjects.unweightedBudgetPoints) &&
        Objects.equals(accumulatedPoints, newPointsSetObjects.accumulatedPoints) &&
        Objects.equals(points, newPointsSetObjects.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weightedPoints, unweightedBudgetPoints, accumulatedPoints, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPointsSetObjects {\n");
    
    sb.append("    weightedPoints: ").append(toIndentedString(weightedPoints)).append("\n");
    sb.append("    unweightedBudgetPoints: ").append(toIndentedString(unweightedBudgetPoints)).append("\n");
    sb.append("    accumulatedPoints: ").append(toIndentedString(accumulatedPoints)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

