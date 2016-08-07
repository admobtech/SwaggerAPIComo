package generated.api;

import generated.api.factories.CancelBudgetPaymentApiServiceFactory;
import generated.model.CancelBudgetPaymentRequest;
import generated.model.CancelBudgetPaymentResponse;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/CancelBudgetPayment")


@io.swagger.annotations.Api(description = "the CancelBudgetPayment API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class CancelBudgetPaymentApi  {
   private final CancelBudgetPaymentApiService delegate = CancelBudgetPaymentApiServiceFactory.getCancelBudgetPaymentApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancel Budget Payment.", notes = "Allows the POS to cancel a Budget Payment using the payment UID code from the PayWithBudget.", response = CancelBudgetPaymentResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = CancelBudgetPaymentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CancelBudgetPaymentResponse.class) })
    public Response cancelBudgetPaymentPost(
    	@ApiParam(value = "",required=true, allowableValues="application/json")
		@QueryParam("MimeType") String mimeType
		,@ApiParam(value = "",required=true, allowableValues="json")
		@QueryParam("InputType") String inputType
		,@ApiParam(value = "CancelBudgetPayment" )
			CancelBudgetPaymentRequest body
		,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelBudgetPaymentPost(mimeType,inputType,body,securityContext);
    }
}
