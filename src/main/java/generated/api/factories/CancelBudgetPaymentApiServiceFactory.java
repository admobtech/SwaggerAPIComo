package generated.api.factories;

import generated.api.CancelBudgetPaymentApiService;
import generated.api.impl.CancelBudgetPaymentApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-07T00:15:22.653+03:00")
public class CancelBudgetPaymentApiServiceFactory {
    private final static CancelBudgetPaymentApiService service = new CancelBudgetPaymentApiServiceImpl();

    public static CancelBudgetPaymentApiService getCancelBudgetPaymentApi() {
        return service;
    }
}
