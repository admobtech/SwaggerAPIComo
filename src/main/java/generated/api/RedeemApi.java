package generated.api;

import generated.api.factories.RedeemApiServiceFactory;
import generated.model.RedeemItemsResponse;
import generated.model.RedeemRequest;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/Redeem")


@io.swagger.annotations.Api(description = "the Redeem API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class RedeemApi  {
   private final RedeemApiService delegate = RedeemApiServiceFactory.getRedeemApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Redeem", notes = "The API call retrieves the Benefits of gifts that the customer asked to redeem. The gifts are referenced by a RedeemItem (RedeemCode/AssetKey).RedeemCodes will be provided by the customer(as a code/QR/barcode provided by the app) *AssetKeys are acquired from the GetMemberDetails call (see Redeem via POS).<br>Allows the POS to send club members' purchase details and information to Como. The purchase details can contain the complete shopping cart or only the total amount paid; With this module a set of purchase based reward tools and features become available to the business through the Como control panel; including: cash-back, points accumulation, automatic punching of the customer’s punch cards based on specific items in the cart; and special deals such as 'buy an item and receive a coupon for your next visit' and more. When to use; After the final payment. <br>As long as a RedeemItem is not marked as 'used', future Redeem API calls will succeed. If the Benefits were delivered to the customer it must be marked as 'used' with one of the following methods: *Pass the RedeemItem to the SubmitPurchase API call via the RedeemItems field. NOTE; To protect RedeemItem from multiple redeem attempts, a lock is implemented using the BranchID, PosID and TransactionID, if provided. The lock will be active for a limited time frame set by the business in the admin panel,     *Pass MarkAsUsed flag to the Redeem API call.", response = RedeemItemsResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = RedeemItemsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = RedeemItemsResponse.class) })
    public Response redeemPost(@ApiParam(value = "RedeemCodes will be provided by the customer(as a code/QR/barcode provided by the app)" ,required=true) RedeemRequest body
,@ApiParam(value = "",required=true, allowableValues="application/json") @QueryParam("MimeType") String mimeType
,@ApiParam(value = "",required=true, allowableValues="json") @QueryParam("InputType") String inputType
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.redeemPost(body,mimeType,inputType,securityContext);
    }
}
