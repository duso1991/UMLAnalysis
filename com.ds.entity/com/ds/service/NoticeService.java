package com.ds.service;

import com.ds.entity.Notice;

/**   
  * @Title: NoticeService.java
  * @Description:通知相关业务类
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月7日 上午10:23:15
  * @version V1.0   
*/
public interface NoticeService {
	
	/**
	 * 
	  *@Description:根据ID查找通知单
	  *@param Id
	  *@return
	  *@author  杜松   
	  *@date 2017年12月7日 上午10:32:57
	 */
	public Notice getNoticeById(Long Id);
	
	
	/**
	 * 
	  *@Description:保存通知单
	  *@param notice
	  *@author  杜松   
	  *@date 2017年12月7日 上午10:32:38
	 */
	public void saveNotice(Notice notice);

}
