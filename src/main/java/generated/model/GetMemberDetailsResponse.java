package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class GetMemberDetailsResponse   {
  
  private String result = null;
  private List<ClubMember> membership = new ArrayList<ClubMember>();

  /**
   * Indicate if the API call succeeded or failed.
   **/
  public GetMemberDetailsResponse result(String result) {
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
   * An array of Club Member objects.
   **/
  public GetMemberDetailsResponse membership(List<ClubMember> membership) {
    this.membership = membership;
    return this;
  }

  
  @ApiModelProperty(value = "An array of Club Member objects.")
  @JsonProperty("Membership")
  public List<ClubMember> getMembership() {
    return membership;
  }
  public void setMembership(List<ClubMember> membership) {
    this.membership = membership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMemberDetailsResponse getMemberDetailsResponse = (GetMemberDetailsResponse) o;
    return Objects.equals(result, getMemberDetailsResponse.result) &&
        Objects.equals(membership, getMemberDetailsResponse.membership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, membership);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMemberDetailsResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    membership: ").append(toIndentedString(membership)).append("\n");
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

