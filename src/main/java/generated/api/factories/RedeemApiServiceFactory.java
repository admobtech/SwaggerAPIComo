package generated.api.factories;

import generated.api.RedeemApiService;
import generated.api.impl.RedeemApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class RedeemApiServiceFactory {
    private final static RedeemApiService service = new RedeemApiServiceImpl();

    public static RedeemApiService getRedeemApi() {
        return service;
    }
}
