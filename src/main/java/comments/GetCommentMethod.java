package comments;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/comments", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/comments/_get/rs.json")
public class GetCommentMethod extends AbstractApiMethodV2 {
	public GetCommentMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
