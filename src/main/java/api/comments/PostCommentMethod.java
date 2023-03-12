package api.comments;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url="${base_url}/comments", methodType=HttpMethodType.POST)
@ResponseTemplatePath(path = "api/comments/_post/rs.json")
@RequestTemplatePath(path = "api/comments/_post/rs.json")
public class PostCommentMethod extends AbstractApiMethodV2{
	public PostCommentMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
