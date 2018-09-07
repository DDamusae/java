package article.service;

import java.util.Map;

//게시글 수정 정보를 담는 클래스
public class DeleteRequest {
	private String userId;
	private int articleNumber;
	private String title;
	private String content;
	
	
	public DeleteRequest(String userId, int articleNumber, String title, String content) {
		this.userId = userId;
		this.articleNumber = articleNumber;
		this.title = title;
		this.content = content;
	}

	public String getUserId() {
		return userId;
	}

	public int getArticleNumber() {
		return articleNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}



}
