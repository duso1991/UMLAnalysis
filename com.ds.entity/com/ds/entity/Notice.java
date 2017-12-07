package com.ds.entity;
import java.util.List;

/**   
  * @Title: Notice.java
  * @Description:通知单
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月7日 上午10:06:54
  * @version V1.0   
*/
public class Notice {
	private Long id;
	private String name;
	private List<Reply> replies;//回复列表
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Reply> getReplies() {
		return replies;
	}
	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}

}
