package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class Assets   {
  
  private String name = null;
  private String status = null;
  private String description = null;
  private String key = null;
  private Date validUntil = null;
  private Boolean redeemable = null;
  private Boolean archived = null;

  /**
   * Name of the benefit.
   **/
  public Assets name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty("Name of the benefit.")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The value can be; Pending /Assigned – the benefit is ready to be redeemed Redeemed – the benefit has been redeemed.
   **/
  public Assets status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "The value can be; Pending /Assigned – the benefit is ready to be redeemed Redeemed – the benefit has been redeemed.")
  @JsonProperty("Status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * A short detailed message of the benefit.
   **/
  public Assets description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A short detailed message of the benefit.")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The AssetKey of the benefit.
   **/
  public Assets key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(value = "The AssetKey of the benefit.")
  @JsonProperty("Key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Expiration date of the benefit.
   **/
  public Assets validUntil(Date validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  
  @ApiModelProperty(value = "Expiration date of the benefit.")
  @JsonProperty("ValidUntil")
  public Date getValidUntil() {
    return validUntil;
  }
  public void setValidUntil(Date validUntil) {
    this.validUntil = validUntil;
  }

  /**
   * Show if benefit can be redeemed.
   **/
  public Assets redeemable(Boolean redeemable) {
    this.redeemable = redeemable;
    return this;
  }

  
  @ApiModelProperty(value = "Show if benefit can be redeemed.")
  @JsonProperty("Redeemable")
  public Boolean getRedeemable() {
    return redeemable;
  }
  public void setRedeemable(Boolean redeemable) {
    this.redeemable = redeemable;
  }

  /**
   * Indicate if benefit is archived by; using/ expiration date/ user action.
   **/
  public Assets archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  
  @ApiModelProperty(value = "Indicate if benefit is archived by; using/ expiration date/ user action.")
  @JsonProperty("Archived")
  public Boolean getArchived() {
    return archived;
  }
  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assets assets = (Assets) o;
    return Objects.equals(name, assets.name) &&
        Objects.equals(status, assets.status) &&
        Objects.equals(description, assets.description) &&
        Objects.equals(key, assets.key) &&
        Objects.equals(validUntil, assets.validUntil) &&
        Objects.equals(redeemable, assets.redeemable) &&
        Objects.equals(archived, assets.archived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, description, key, validUntil, redeemable, archived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assets {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    redeemable: ").append(toIndentedString(redeemable)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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

