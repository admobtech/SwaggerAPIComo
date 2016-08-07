package generated.api.factories;

import generated.api.SubmitPurchaseApiService;
import generated.api.impl.SubmitPurchaseApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class SubmitPurchaseApiServiceFactory {
    private final static SubmitPurchaseApiService service = new SubmitPurchaseApiServiceImpl();

    public static SubmitPurchaseApiService getSubmitPurchaseApi() {
        return service;
    }
}
