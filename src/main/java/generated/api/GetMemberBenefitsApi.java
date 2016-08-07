package generated.api;

import generated.api.factories.GetMemberBenefitsApiServiceFactory;
import generated.model.GetMemberBenefitsRequest;
import generated.model.GetMemberBenefitsResponse;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/GetMemberBenefits")


@io.swagger.annotations.Api(description = "the GetMemberBenefits API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class GetMemberBenefitsApi  {
   private final GetMemberBenefitsApiService delegate = GetMemberBenefitsApiServiceFactory.getGetMemberBenefitsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Member Benefits", notes = "This API call returns the Benefits a member should receive just for being a club member. <br> The Benefits returned from this API are not for one time use. A typical reward could be; 10% discount for every club member. NOTE: Benefits returned from this service may take into account the contents of the shopping cart. <br> Therefore it is advisable to perform this request when the shopping cart is finalized just before closing the purchase and optionally when the cart is changed or upon explicit request by the cashier.When to use,<br> *After identifying a customer 'for benefits that are independent of the cart' <br> *A partial bill was requested by the customers <br> *At the final checkout.<br> NOTE, If GetMemberBenefits is called multiple times, make sure you clear the previously returned benefits and add the new resulted benefits each time. <br>Note that some POS systems cannot delete items from the shopping cart. It is the responsibility of the business not to send items as benefits for GetMemberBenefits.", response = GetMemberBenefitsResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = GetMemberBenefitsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = GetMemberBenefitsResponse.class) })
    public Response getMemberBenefitsPost(@ApiParam(value = "",required=true, allowableValues="application/json") @QueryParam("MimeType") String mimeType
,@ApiParam(value = "",required=true, allowableValues="json") @QueryParam("InputType") String inputType
,@ApiParam(value = "This API call returns the Benefits a member should receive just for being a club member. The Benefits returned from this API are not for one time use. A typical reward could be: 10% discount for every club member." ) GetMemberBenefitsRequest body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMemberBenefitsPost(mimeType,inputType,body,securityContext);
    }
}
