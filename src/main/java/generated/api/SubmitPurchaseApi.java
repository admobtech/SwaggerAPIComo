package generated.api;

import generated.api.factories.SubmitPurchaseApiServiceFactory;
import generated.model.SubmitPurchaseRequest;
import generated.model.SubmitPurchaseResponse;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/SubmitPurchase")


@io.swagger.annotations.Api(description = "the SubmitPurchase API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class SubmitPurchaseApi  {
   private final SubmitPurchaseApiService delegate = SubmitPurchaseApiServiceFactory.getSubmitPurchaseApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Submit Purchase", notes = "Allows the POS to send club members' purchase details and information to Como. <br>The purchase details can contain the complete shopping cart or only the total amount paid.<br>With this module a set of purchase based reward tools and features become available to the business through the Como control panel, including: cash-back, points accumulation, automatic punching of the customer’s punch cards based on specific items in the cart, and special deals such as 'buy an item and receive a coupon for your next visit' and more. <br>When to use: After the final payment.", response = SubmitPurchaseResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = SubmitPurchaseResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = SubmitPurchaseResponse.class) })
    public Response submitPurchasePost(@ApiParam(value = "SubmitPurchase" ,required=true) SubmitPurchaseRequest body
,@ApiParam(value = "",required=true, allowableValues="application/json") @QueryParam("MimeType") String mimeType
,@ApiParam(value = "",required=true, allowableValues="json") @QueryParam("InputType") String inputType
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.submitPurchasePost(body,mimeType,inputType,securityContext);
    }
}
