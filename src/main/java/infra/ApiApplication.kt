package infra

import org.glassfish.jersey.filter.LoggingFilter
import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature
import org.glassfish.jersey.server.validation.ValidationConfig
import java.util.logging.Logger
import javax.ws.rs.ext.ContextResolver

/**
 * .
 * Created by eliran on 07/08/2016.
 */
class ApiApplication: ResourceConfig {

	constructor() {

		register(ComoApplicationBinder());
		register(LoggingFilter(Logger.getLogger(LoggingFilter::class.java.name), true))
		register(ContextResolver<ValidationConfig> {
			ValidationConfig().parameterNameProvider(RestParameterNameProvider());
		})
		register(JacksonMapperProvider());
		register(RolesAllowedDynamicFeature::class.java)
	}

}
