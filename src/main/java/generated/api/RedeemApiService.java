package generated.api;

import generated.api.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import generated.model.RedeemItemsResponse;
import generated.model.RedeemRequest;

import generated.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public abstract class RedeemApiService {
    public abstract Response redeemPost(RedeemRequest body,String mimeType,String inputType,SecurityContext securityContext) throws NotFoundException;
}
