
package com.xiaoqiao.util;

import java.util.UUID;

public class StringUuid {
	
	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
