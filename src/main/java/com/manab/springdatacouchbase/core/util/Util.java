package com.manab.springdatacouchbase.core.util;

import java.util.List;

/**
 * Util class for constants and generic methods
 * 
 */

public class Util {

	private Util() {
	}

	public static boolean isNullOrEmpty(String param) {
		return param == null || param.trim().length() == 0;
	}

	public static boolean isNullOrEmpty(List<?> element) {
		return element == null || element.isEmpty();
	}

}
