package generated.api;

import generated.model.GetMemberBenefitsRequest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public abstract class GetMemberBenefitsApiService {
    public abstract Response getMemberBenefitsPost(String mimeType,String inputType,GetMemberBenefitsRequest body,SecurityContext securityContext) throws NotFoundException;
}
