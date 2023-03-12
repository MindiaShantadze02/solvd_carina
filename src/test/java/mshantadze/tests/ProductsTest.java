package mshantadze.tests;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

import api.products.DeleteProductMethod;

public class ProductsTest extends AbstractTest {
	@Test()
	public void deleteProduct() {
		DeleteProductMethod deleteProductMethod = new DeleteProductMethod();
		deleteProductMethod.callAPI();
		deleteProductMethod.expectResponseStatus(HttpResponseStatusType.OK_200);;
		deleteProductMethod.validateResponse();
	}
}
