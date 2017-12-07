package com.ds.serviceimpl;

import com.ds.dao.BaseDao;
import com.ds.daoimpl.BaseDaoImpl;
import com.ds.entity.Notice;
import com.ds.service.NoticeService;

import sun.net.spi.nameservice.NameService;

/**   
  * @Title: NoticeServiceImpl.java
  * @Description:
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月7日 上午10:33:54
  * @version V1.0   
*/
public class NoticeServiceImpl implements NoticeService{
	
	BaseDao baseDao=new BaseDaoImpl();

	/**
	 * 
	  *@Description:根据ID查找通知单
	  *@param Id
	  *@return
	  *@author  杜松   
	  *@date 2017年12月7日 上午10:32:57
	 */
	@Override
	public Notice getNoticeById(Long Id) {
		return baseDao.findObjectById(Id);
	}

	/**
	 * 
	  *@Description:保存通知单
	  *@param notice
	  *@author  杜松   
	  *@date 2017年12月7日 上午10:32:38
	 */
	@Override
	public void saveNotice(Notice notice) {

	}

}
