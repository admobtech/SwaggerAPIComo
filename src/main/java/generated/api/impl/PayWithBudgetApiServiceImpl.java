package generated.api.impl;

import generated.api.ApiResponseMessage;
import generated.api.NotFoundException;
import generated.api.PayWithBudgetApiService;
import generated.model.PayWithBudgetRequest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class PayWithBudgetApiServiceImpl extends PayWithBudgetApiService {
    @Override
    public Response payWithBudgetPost(String mimeType, String inputType, PayWithBudgetRequest body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
