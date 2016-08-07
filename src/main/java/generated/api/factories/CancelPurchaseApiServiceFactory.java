package generated.api.factories;

import generated.api.CancelPurchaseApiService;
import generated.api.impl.CancelPurchaseApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class CancelPurchaseApiServiceFactory {
    private final static CancelPurchaseApiService service = new CancelPurchaseApiServiceImpl();

    public static CancelPurchaseApiService getCancelPurchaseApi() {
        return service;
    }
}
