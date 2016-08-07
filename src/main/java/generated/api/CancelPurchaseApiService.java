package generated.api;

import generated.model.CancelPurchaseRequest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public abstract class CancelPurchaseApiService {
    public abstract Response cancelPurchasePost(String mimeType,String inputType,CancelPurchaseRequest body,SecurityContext securityContext) throws NotFoundException;
}
