package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class ClubMember   {
  
  private String firstName = null;
  private String lastName = null;
  private Boolean pushNotificationEnabled = null;
  private Boolean locationEnabled = null;
  private Boolean mobileAppUsed = null;
  private Date mobileAppUsedLastDate = null;
  private String phoneNumber = null;
  private Boolean allowSMS = null;
  private String govID = null;
  private String email = null;
  private String status = null;
  private String memberID = null;
  private String locationID = null;
  private Integer points = null;
  private Integer accumulatedPoints = null;
  private Integer unweightedBudgetPoints = null;
  private Integer weightedPoints = null;
  private Date birthday = null;
  private Date anniversary = null;
  private String gender = null;
  private Date genericString1 = null;
  private Integer genericInteger1 = null;
  private Boolean genericCheckBox1 = null;
  private String genericDate1 = null;
  private String tag = null;
  private List<Assets> assets = new ArrayList<Assets>();

  /**
   * First name of the member.
   **/
  public ClubMember firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(value = "First name of the member.")
  @JsonProperty("FirstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Last name of the member.
   **/
  public ClubMember lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @ApiModelProperty(value = "Last name of the member.")
  @JsonProperty("LastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The member enabled push notification in the app.
   **/
  public ClubMember pushNotificationEnabled(Boolean pushNotificationEnabled) {
    this.pushNotificationEnabled = pushNotificationEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "The member enabled push notification in the app.")
  @JsonProperty("PushNotificationEnabled")
  public Boolean getPushNotificationEnabled() {
    return pushNotificationEnabled;
  }
  public void setPushNotificationEnabled(Boolean pushNotificationEnabled) {
    this.pushNotificationEnabled = pushNotificationEnabled;
  }

  /**
   * The member enabled location for the app.
   **/
  public ClubMember locationEnabled(Boolean locationEnabled) {
    this.locationEnabled = locationEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "The member enabled location for the app.")
  @JsonProperty("LocationEnabled")
  public Boolean getLocationEnabled() {
    return locationEnabled;
  }
  public void setLocationEnabled(Boolean locationEnabled) {
    this.locationEnabled = locationEnabled;
  }

  /**
   * Member used mobile app.
   **/
  public ClubMember mobileAppUsed(Boolean mobileAppUsed) {
    this.mobileAppUsed = mobileAppUsed;
    return this;
  }

  
  @ApiModelProperty(value = "Member used mobile app.")
  @JsonProperty("MobileAppUsed")
  public Boolean getMobileAppUsed() {
    return mobileAppUsed;
  }
  public void setMobileAppUsed(Boolean mobileAppUsed) {
    this.mobileAppUsed = mobileAppUsed;
  }

  /**
   * Last login from the mobile app.
   **/
  public ClubMember mobileAppUsedLastDate(Date mobileAppUsedLastDate) {
    this.mobileAppUsedLastDate = mobileAppUsedLastDate;
    return this;
  }

  
  @ApiModelProperty(value = "Last login from the mobile app.")
  @JsonProperty("MobileAppUsedLastDate")
  public Date getMobileAppUsedLastDate() {
    return mobileAppUsedLastDate;
  }
  public void setMobileAppUsedLastDate(Date mobileAppUsedLastDate) {
    this.mobileAppUsedLastDate = mobileAppUsedLastDate;
  }

  /**
   * Member phone number.
   **/
  public ClubMember phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Member phone number.")
  @JsonProperty("PhoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * The member enabled SMS from Como.
   **/
  public ClubMember allowSMS(Boolean allowSMS) {
    this.allowSMS = allowSMS;
    return this;
  }

  
  @ApiModelProperty(value = "The member enabled SMS from Como.")
  @JsonProperty("AllowSMS")
  public Boolean getAllowSMS() {
    return allowSMS;
  }
  public void setAllowSMS(Boolean allowSMS) {
    this.allowSMS = allowSMS;
  }

  /**
   * The locally relevant government issued ID number.
   **/
  public ClubMember govID(String govID) {
    this.govID = govID;
    return this;
  }

  
  @ApiModelProperty(value = "The locally relevant government issued ID number.")
  @JsonProperty("GovID")
  public String getGovID() {
    return govID;
  }
  public void setGovID(String govID) {
    this.govID = govID;
  }

  /**
   * Member Email.
   **/
  public ClubMember email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "Member Email.")
  @JsonProperty("Email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Member Como status i.e. deleted.
   **/
  public ClubMember status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Member Como status i.e. deleted.")
  @JsonProperty("Status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * An external number representing the member.
   **/
  public ClubMember memberID(String memberID) {
    this.memberID = memberID;
    return this;
  }

  
  @ApiModelProperty(value = "An external number representing the member.")
  @JsonProperty("MemberID")
  public String getMemberID() {
    return memberID;
  }
  public void setMemberID(String memberID) {
    this.memberID = memberID;
  }

  /**
   * The id of the business that the member is in.
   **/
  public ClubMember locationID(String locationID) {
    this.locationID = locationID;
    return this;
  }

  
  @ApiModelProperty(value = "The id of the business that the member is in.")
  @JsonProperty("LocationID")
  public String getLocationID() {
    return locationID;
  }
  public void setLocationID(String locationID) {
    this.locationID = locationID;
  }

  /**
   * Amount of points that the member has. The points are weighted and are treated like a budget.
   **/
  public ClubMember points(Integer points) {
    this.points = points;
    return this;
  }

  
  @ApiModelProperty(value = "Amount of points that the member has. The points are weighted and are treated like a budget.")
  @JsonProperty("Points")
  public Integer getPoints() {
    return points;
  }
  public void setPoints(Integer points) {
    this.points = points;
  }

  /**
   * A secondary point measurement representing points without weight but are accumulated.
   **/
  public ClubMember accumulatedPoints(Integer accumulatedPoints) {
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
   * A secondary point measurement representing points without weight and not accumulating.
   **/
  public ClubMember unweightedBudgetPoints(Integer unweightedBudgetPoints) {
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
   * A secondary point measurement representing points with weight and accumulating.
   **/
  public ClubMember weightedPoints(Integer weightedPoints) {
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
   * Member birthday.
   **/
  public ClubMember birthday(Date birthday) {
    this.birthday = birthday;
    return this;
  }

  
  @ApiModelProperty(value = "Member birthday.")
  @JsonProperty("Birthday")
  public Date getBirthday() {
    return birthday;
  }
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  /**
   * Member anniversary.
   **/
  public ClubMember anniversary(Date anniversary) {
    this.anniversary = anniversary;
    return this;
  }

  
  @ApiModelProperty(value = "Member anniversary.")
  @JsonProperty("Anniversary")
  public Date getAnniversary() {
    return anniversary;
  }
  public void setAnniversary(Date anniversary) {
    this.anniversary = anniversary;
  }

  /**
   * Member gender as defined by the business. Note that this field can change from business to business.
   **/
  public ClubMember gender(String gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(value = "Member gender as defined by the business. Note that this field can change from business to business.")
  @JsonProperty("Gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * A general purpose string variable.
   **/
  public ClubMember genericString1(Date genericString1) {
    this.genericString1 = genericString1;
    return this;
  }

  
  @ApiModelProperty(value = "A general purpose string variable.")
  @JsonProperty("GenericString1")
  public Date getGenericString1() {
    return genericString1;
  }
  public void setGenericString1(Date genericString1) {
    this.genericString1 = genericString1;
  }

  /**
   * A general purpose integer variable.
   **/
  public ClubMember genericInteger1(Integer genericInteger1) {
    this.genericInteger1 = genericInteger1;
    return this;
  }

  
  @ApiModelProperty(value = "A general purpose integer variable.")
  @JsonProperty("GenericInteger1")
  public Integer getGenericInteger1() {
    return genericInteger1;
  }
  public void setGenericInteger1(Integer genericInteger1) {
    this.genericInteger1 = genericInteger1;
  }

  /**
   * A general purpose boolean variable.
   **/
  public ClubMember genericCheckBox1(Boolean genericCheckBox1) {
    this.genericCheckBox1 = genericCheckBox1;
    return this;
  }

  
  @ApiModelProperty(value = "A general purpose boolean variable.")
  @JsonProperty("GenericCheckBox1")
  public Boolean getGenericCheckBox1() {
    return genericCheckBox1;
  }
  public void setGenericCheckBox1(Boolean genericCheckBox1) {
    this.genericCheckBox1 = genericCheckBox1;
  }

  /**
   * A general purpose date variable.
   **/
  public ClubMember genericDate1(String genericDate1) {
    this.genericDate1 = genericDate1;
    return this;
  }

  
  @ApiModelProperty(value = "A general purpose date variable.")
  @JsonProperty("GenericDate1")
  public String getGenericDate1() {
    return genericDate1;
  }
  public void setGenericDate1(String genericDate1) {
    this.genericDate1 = genericDate1;
  }

  /**
   * Business tags that provide additional information on the member.
   **/
  public ClubMember tag(String tag) {
    this.tag = tag;
    return this;
  }

  
  @ApiModelProperty(value = "Business tags that provide additional information on the member.")
  @JsonProperty("Tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   * An array of assets(gifts) of the member. Present only if customer ask to ExpandAssets.
   **/
  public ClubMember assets(List<Assets> assets) {
    this.assets = assets;
    return this;
  }

  
  @ApiModelProperty(value = "An array of assets(gifts) of the member. Present only if customer ask to ExpandAssets.")
  @JsonProperty("Assets")
  public List<Assets> getAssets() {
    return assets;
  }
  public void setAssets(List<Assets> assets) {
    this.assets = assets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClubMember clubMember = (ClubMember) o;
    return Objects.equals(firstName, clubMember.firstName) &&
        Objects.equals(lastName, clubMember.lastName) &&
        Objects.equals(pushNotificationEnabled, clubMember.pushNotificationEnabled) &&
        Objects.equals(locationEnabled, clubMember.locationEnabled) &&
        Objects.equals(mobileAppUsed, clubMember.mobileAppUsed) &&
        Objects.equals(mobileAppUsedLastDate, clubMember.mobileAppUsedLastDate) &&
        Objects.equals(phoneNumber, clubMember.phoneNumber) &&
        Objects.equals(allowSMS, clubMember.allowSMS) &&
        Objects.equals(govID, clubMember.govID) &&
        Objects.equals(email, clubMember.email) &&
        Objects.equals(status, clubMember.status) &&
        Objects.equals(memberID, clubMember.memberID) &&
        Objects.equals(locationID, clubMember.locationID) &&
        Objects.equals(points, clubMember.points) &&
        Objects.equals(accumulatedPoints, clubMember.accumulatedPoints) &&
        Objects.equals(unweightedBudgetPoints, clubMember.unweightedBudgetPoints) &&
        Objects.equals(weightedPoints, clubMember.weightedPoints) &&
        Objects.equals(birthday, clubMember.birthday) &&
        Objects.equals(anniversary, clubMember.anniversary) &&
        Objects.equals(gender, clubMember.gender) &&
        Objects.equals(genericString1, clubMember.genericString1) &&
        Objects.equals(genericInteger1, clubMember.genericInteger1) &&
        Objects.equals(genericCheckBox1, clubMember.genericCheckBox1) &&
        Objects.equals(genericDate1, clubMember.genericDate1) &&
        Objects.equals(tag, clubMember.tag) &&
        Objects.equals(assets, clubMember.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, pushNotificationEnabled, locationEnabled, mobileAppUsed, mobileAppUsedLastDate, phoneNumber, allowSMS, govID, email, status, memberID, locationID, points, accumulatedPoints, unweightedBudgetPoints, weightedPoints, birthday, anniversary, gender, genericString1, genericInteger1, genericCheckBox1, genericDate1, tag, assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClubMember {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    pushNotificationEnabled: ").append(toIndentedString(pushNotificationEnabled)).append("\n");
    sb.append("    locationEnabled: ").append(toIndentedString(locationEnabled)).append("\n");
    sb.append("    mobileAppUsed: ").append(toIndentedString(mobileAppUsed)).append("\n");
    sb.append("    mobileAppUsedLastDate: ").append(toIndentedString(mobileAppUsedLastDate)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    allowSMS: ").append(toIndentedString(allowSMS)).append("\n");
    sb.append("    govID: ").append(toIndentedString(govID)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    memberID: ").append(toIndentedString(memberID)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    accumulatedPoints: ").append(toIndentedString(accumulatedPoints)).append("\n");
    sb.append("    unweightedBudgetPoints: ").append(toIndentedString(unweightedBudgetPoints)).append("\n");
    sb.append("    weightedPoints: ").append(toIndentedString(weightedPoints)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    anniversary: ").append(toIndentedString(anniversary)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    genericString1: ").append(toIndentedString(genericString1)).append("\n");
    sb.append("    genericInteger1: ").append(toIndentedString(genericInteger1)).append("\n");
    sb.append("    genericCheckBox1: ").append(toIndentedString(genericCheckBox1)).append("\n");
    sb.append("    genericDate1: ").append(toIndentedString(genericDate1)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

