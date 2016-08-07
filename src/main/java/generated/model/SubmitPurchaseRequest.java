package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class SubmitPurchaseRequest   {
  
  private List<Customer> customers = new ArrayList<Customer>();
  private List<RedeemItem> redeemItems = new ArrayList<RedeemItem>();
  private List<Item> items = new ArrayList<Item>();
  private List<Payment> payments = new ArrayList<Payment>();
  private String posID = null;
  private String branchID = null;
  private String transactionID = null;
  private Date timeStamp = null;
  private Integer totalSum = null;
  private String tags = null;
  private String cashier = null;

  /**
   **/
  public SubmitPurchaseRequest customers(List<Customer> customers) {
    this.customers = customers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Customers")
  public List<Customer> getCustomers() {
    return customers;
  }
  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }

  /**
   **/
  public SubmitPurchaseRequest redeemItems(List<RedeemItem> redeemItems) {
    this.redeemItems = redeemItems;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("RedeemItems")
  public List<RedeemItem> getRedeemItems() {
    return redeemItems;
  }
  public void setRedeemItems(List<RedeemItem> redeemItems) {
    this.redeemItems = redeemItems;
  }

  /**
   **/
  public SubmitPurchaseRequest items(List<Item> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Items")
  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  /**
   **/
  public SubmitPurchaseRequest payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Payments")
  public List<Payment> getPayments() {
    return payments;
  }
  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  /**
   * Transmitting POS identifier in the branch, NOT required field
   **/
  public SubmitPurchaseRequest posID(String posID) {
    this.posID = posID;
    return this;
  }

  
  @ApiModelProperty(value = "Transmitting POS identifier in the branch, NOT required field")
  @JsonProperty("PosID")
  public String getPosID() {
    return posID;
  }
  public void setPosID(String posID) {
    this.posID = posID;
  }

  /**
   * Transmitting branch identifier, Required field *
   **/
  public SubmitPurchaseRequest branchID(String branchID) {
    this.branchID = branchID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Transmitting branch identifier, Required field *")
  @JsonProperty("BranchID")
  public String getBranchID() {
    return branchID;
  }
  public void setBranchID(String branchID) {
    this.branchID = branchID;
  }

  /**
   * Transaction id from the POS, Required field *
   **/
  public SubmitPurchaseRequest transactionID(String transactionID) {
    this.transactionID = transactionID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Transaction id from the POS, Required field *")
  @JsonProperty("TransactionID")
  public String getTransactionID() {
    return transactionID;
  }
  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }

  /**
   * Transaction time or time of purchase, Required field *
   **/
  public SubmitPurchaseRequest timeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Transaction time or time of purchase, Required field *")
  @JsonProperty("TimeStamp")
  public Date getTimeStamp() {
    return timeStamp;
  }
  public void setTimeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
  }

  /**
   * Total amount paid in cents, Required field *
   * minimum: 1.0
   **/
  public SubmitPurchaseRequest totalSum(Integer totalSum) {
    this.totalSum = totalSum;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total amount paid in cents, Required field *")
  @JsonProperty("TotalSum")
  public Integer getTotalSum() {
    return totalSum;
  }
  public void setTotalSum(Integer totalSum) {
    this.totalSum = totalSum;
  }

  /**
   * Array of strings, Includes optional tags that are available to the business.
   **/
  public SubmitPurchaseRequest tags(String tags) {
    this.tags = tags;
    return this;
  }

  
  @ApiModelProperty(value = "Array of strings, Includes optional tags that are available to the business.")
  @JsonProperty("Tags")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  /**
   * Information about the current transaction operator.
   **/
  public SubmitPurchaseRequest cashier(String cashier) {
    this.cashier = cashier;
    return this;
  }

  
  @ApiModelProperty(value = "Information about the current transaction operator.")
  @JsonProperty("Cashier")
  public String getCashier() {
    return cashier;
  }
  public void setCashier(String cashier) {
    this.cashier = cashier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitPurchaseRequest submitPurchaseRequest = (SubmitPurchaseRequest) o;
    return Objects.equals(customers, submitPurchaseRequest.customers) &&
        Objects.equals(redeemItems, submitPurchaseRequest.redeemItems) &&
        Objects.equals(items, submitPurchaseRequest.items) &&
        Objects.equals(payments, submitPurchaseRequest.payments) &&
        Objects.equals(posID, submitPurchaseRequest.posID) &&
        Objects.equals(branchID, submitPurchaseRequest.branchID) &&
        Objects.equals(transactionID, submitPurchaseRequest.transactionID) &&
        Objects.equals(timeStamp, submitPurchaseRequest.timeStamp) &&
        Objects.equals(totalSum, submitPurchaseRequest.totalSum) &&
        Objects.equals(tags, submitPurchaseRequest.tags) &&
        Objects.equals(cashier, submitPurchaseRequest.cashier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customers, redeemItems, items, payments, posID, branchID, transactionID, timeStamp, totalSum, tags, cashier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitPurchaseRequest {\n");
    
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    redeemItems: ").append(toIndentedString(redeemItems)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    posID: ").append(toIndentedString(posID)).append("\n");
    sb.append("    branchID: ").append(toIndentedString(branchID)).append("\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    totalSum: ").append(toIndentedString(totalSum)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    cashier: ").append(toIndentedString(cashier)).append("\n");
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

