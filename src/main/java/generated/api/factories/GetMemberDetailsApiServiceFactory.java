package generated.api.factories;

import generated.api.GetMemberDetailsApiService;
import generated.api.impl.GetMemberDetailsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class GetMemberDetailsApiServiceFactory {
    private final static GetMemberDetailsApiService service = new GetMemberDetailsApiServiceImpl();

    public static GetMemberDetailsApiService getGetMemberDetailsApi() {
        return service;
    }
}
