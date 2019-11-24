package com.bugzilla.bdd.util;



public class ResourceUtils {

	
	
	private static  String getBasePath() {
		String path = ResourceUtils.class.getClassLoader().getResource(".").getPath();
		return path;
	}

	public static String getResourcePath(String resourceName) {
		String path = getBasePath() + resourceName;
		return path;
	}
}

