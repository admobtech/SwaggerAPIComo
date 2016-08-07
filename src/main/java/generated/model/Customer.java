package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class Customer   {
  
  private String phoneNumber = null;
  private String govID = null;
  private String memberID = null;
  private String appClientID = null;

  /**
   * Customer phone number
   **/
  public Customer phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Customer phone number")
  @JsonProperty("PhoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * The locally relevant government issued ID number, driver license etc.
   **/
  public Customer govID(String govID) {
    this.govID = govID;
    return this;
  }

  
  @ApiModelProperty(value = "The locally relevant government issued ID number, driver license etc.")
  @JsonProperty("GovID")
  public String getGovID() {
    return govID;
  }
  public void setGovID(String govID) {
    this.govID = govID;
  }

  /**
   * An external number representing the customer like physical card number etc.
   **/
  public Customer memberID(String memberID) {
    this.memberID = memberID;
    return this;
  }

  
  @ApiModelProperty(value = "An external number representing the customer like physical card number etc.")
  @JsonProperty("MemberID")
  public String getMemberID() {
    return memberID;
  }
  public void setMemberID(String memberID) {
    this.memberID = memberID;
  }

  /**
   * A temporary/permanent customer ID that the app generates. If QR code scanning is available the app can present a QR image for the POS to scan.
   **/
  public Customer appClientID(String appClientID) {
    this.appClientID = appClientID;
    return this;
  }

  
  @ApiModelProperty(value = "A temporary/permanent customer ID that the app generates. If QR code scanning is available the app can present a QR image for the POS to scan.")
  @JsonProperty("AppClientID")
  public String getAppClientID() {
    return appClientID;
  }
  public void setAppClientID(String appClientID) {
    this.appClientID = appClientID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(phoneNumber, customer.phoneNumber) &&
        Objects.equals(govID, customer.govID) &&
        Objects.equals(memberID, customer.memberID) &&
        Objects.equals(appClientID, customer.appClientID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, govID, memberID, appClientID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    govID: ").append(toIndentedString(govID)).append("\n");
    sb.append("    memberID: ").append(toIndentedString(memberID)).append("\n");
    sb.append("    appClientID: ").append(toIndentedString(appClientID)).append("\n");
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

