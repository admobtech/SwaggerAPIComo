package generated.api;

import generated.api.factories.CancelPurchaseApiServiceFactory;
import generated.model.CancelPurchaseRequest;
import generated.model.CancelPurchaseResponse;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/CancelPurchase")


@io.swagger.annotations.Api(description = "the CancelPurchase API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class CancelPurchaseApi  {
   private final CancelPurchaseApiService delegate = CancelPurchaseApiServiceFactory.getCancelPurchaseApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancel Purchase", notes = "Allows the POS to cancel a transaction using the confirmation code from the SubmitPurchase call. Submitting a purchase can result in several automatic, cascading, loyalty club operations on this customer. Due to this cascading effect, the business has an option to delay the performing of the automated purchase tasks, thus creating a 'cancellation window'", response = CancelPurchaseResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = CancelPurchaseResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CancelPurchaseResponse.class) })
    public Response cancelPurchasePost(@ApiParam(value = "",required=true, allowableValues="application/json") @QueryParam("MimeType") String mimeType
,@ApiParam(value = "",required=true, allowableValues="json") @QueryParam("InputType") String inputType
,@ApiParam(value = "Allows the POS to cancel a transaction using the confirmation code from the SubmitPurchase call." ) CancelPurchaseRequest body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelPurchasePost(mimeType,inputType,body,securityContext);
    }
}
