package cn.toma.planmodel.handler;

import sun.security.krb5.internal.LastReqEntry;

/**
 * @Author: zqx
 * @Date: 2019-08-06 15:26
 * @Description:
 */
public class Level
{


	private int level = 0;

	public Level(int level)
	{
		this.level = level;
	}


	public boolean above(Level level)
	{
		if (this.level >= level.level) {
			return true;
		}
		return false;
	}

}
