package com.ds.daoimpl;

import com.ds.dao.BaseDao;
import com.ds.entity.Notice;

/**   
  * @Title: BaseDaoImpl.java
  * @Description:
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月7日 上午10:19:08
  * @version V1.0   
*/
public class BaseDaoImpl implements BaseDao{

	/**
	  *@Description:数据访问实现
	  *@param id 
	  *@return
	  *@author  杜松   
	  *@date 2017年12月7日 上午10:19:19  
	*/
	@Override
	public Notice findObjectById(Long id) {
		Notice notice=new Notice();
		notice.setId(new Long(1));
		notice.setName("有问题咨询？");
		return notice;
	}

}
