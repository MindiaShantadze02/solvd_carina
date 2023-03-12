package api.products;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${base_url}/products/1", methodType = HttpMethodType.DELETE)
@ResponseTemplatePath(path = "api/products/_delete/rs.json")
public class DeleteProductMethod extends AbstractApiMethodV2 {
	public DeleteProductMethod() {
		replaceUrlPlaceholder("base_url", "https://dummyjson.com");
	}
}
