package com.ds.dao;

import com.ds.entity.Notice;

/**   
  * @Title: BaseDao.java
  * @Description:数据访问
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月7日 上午10:16:40
  * @version V1.0   
*/
public interface BaseDao {
	Notice findObjectById(Long id);

}
