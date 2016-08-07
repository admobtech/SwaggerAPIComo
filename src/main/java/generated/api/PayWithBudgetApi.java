package generated.api;

import generated.api.factories.PayWithBudgetApiServiceFactory;
import generated.model.PayWithBudgetRequest;
import generated.model.PayWithBudgetResponse;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/PayWithBudget")


@io.swagger.annotations.Api(description = "the PayWithBudget API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class PayWithBudgetApi  {
   private final PayWithBudgetApiService delegate = PayWithBudgetApiServiceFactory.getPayWithBudgetApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Pay With Budget", notes = "The call allows Como’s customers to use their club budget to pay at the POS. <br>The business may select one of the following identification processes for payment; <br>*Providing club identification (Customers field) and an optional verification code; <br>*Providing a verification code that also encodes the club member identity <br>Note; the business can control the identification and verification options in the administration panel. <br>The POS must present a UI that supports all options in the API, to a support any setting selected by the business.", response = PayWithBudgetResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = PayWithBudgetResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = PayWithBudgetResponse.class) })
    public Response payWithBudgetPost(@ApiParam(value = "",required=true, allowableValues="application/json") @QueryParam("MimeType") String mimeType
,@ApiParam(value = "",required=true, allowableValues="json") @QueryParam("InputType") String inputType
,@ApiParam(value = "The verification code will be provided by the member (from the app, SMS, etc.)" ) PayWithBudgetRequest body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.payWithBudgetPost(mimeType,inputType,body,securityContext);
    }
}
