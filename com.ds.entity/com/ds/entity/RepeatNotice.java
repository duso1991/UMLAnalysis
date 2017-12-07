package com.ds.entity;

import java.util.List;

/**   
  * @Title: RepeatNotice.java
  * @Description:业务重保
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月7日 上午10:12:58
  * @version V1.0   
*/
public class RepeatNotice extends Notice{
		private List<Case> cases;//预案库 

		public List<Case> getCases() {
			return cases;
		}

		public void setCases(List<Case> cases) {
			this.cases = cases;
		}
}
