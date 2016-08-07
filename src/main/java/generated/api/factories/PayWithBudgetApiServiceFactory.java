package generated.api.factories;

import generated.api.PayWithBudgetApiService;
import generated.api.impl.PayWithBudgetApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class PayWithBudgetApiServiceFactory {
    private final static PayWithBudgetApiService service = new PayWithBudgetApiServiceImpl();

    public static PayWithBudgetApiService getPayWithBudgetApi() {
        return service;
    }
}
