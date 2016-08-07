package generated.api.factories;

import generated.api.GetMemberBenefitsApiService;
import generated.api.impl.GetMemberBenefitsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class GetMemberBenefitsApiServiceFactory {
    private final static GetMemberBenefitsApiService service = new GetMemberBenefitsApiServiceImpl();

    public static GetMemberBenefitsApiService getGetMemberBenefitsApi() {
        return service;
    }
}
