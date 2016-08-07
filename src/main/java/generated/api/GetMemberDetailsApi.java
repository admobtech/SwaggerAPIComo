package generated.api;

import generated.api.factories.GetMemberDetailsApiServiceFactory;
import generated.model.GetMemberDetailsRequest;
import generated.model.GetMemberDetailsResponse;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/GetMemberDetails")


@io.swagger.annotations.Api(description = "the GetMemberDetails API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class GetMemberDetailsApi  {
   private final GetMemberDetailsApiService delegate = GetMemberDetailsApiServiceFactory.getGetMemberDetailsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Member Details", notes = "This API call is used to get details about existing Como club members. The response will return a list of Club Member objects or an error if the identifying customer is not a member of the club. With this API call the POS can enable Redeem via POS to allow gift redeeming directly from the POS.", response = GetMemberDetailsResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = GetMemberDetailsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = GetMemberDetailsResponse.class) })
    public Response getMemberDetailsPost(@ApiParam(value = "",required=true, allowableValues="application/json") @QueryParam("MimeType") String mimeType
,@ApiParam(value = "",required=true, allowableValues="json") @QueryParam("InputType") String inputType
,@ApiParam(value = "Identifiers: (PhoneNumber/MemberID/GovID/AppClientID)" ) GetMemberDetailsRequest body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMemberDetailsPost(mimeType,inputType,body,securityContext);
    }
}
