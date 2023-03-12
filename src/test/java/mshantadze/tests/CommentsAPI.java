package mshantadze.tests;

import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import api.comments.GetCommentMethod;
import api.comments.PostCommentMethod;

public class CommentsAPI implements IAbstractTest {
	@Test()
	@MethodOwner(owner = "MindiaShantadze")
	public void testGetComments() {
		GetCommentMethod getCommentMethod = new GetCommentMethod();
		
		getCommentMethod.callAPI();
		getCommentMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getCommentMethod.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
	}
	
	@Test
	@MethodOwner(owner = "MindiaShantadze")
	public void testPostComment() {
		PostCommentMethod postCommentMethod = new PostCommentMethod();
		
		postCommentMethod.callAPI();
		postCommentMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postCommentMethod.validateResponse();
	}
}
