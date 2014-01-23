package com.moict.main;

public final class CameraIps {
	public final static String cam1 = "http://192.168.125.55:8081/";
	public final static String cam2 = "http://180.234.104.105:8081/";
	public static String getIp(String str){
		if(str.equals("cam1"))
			return cam1;
		else if(str.equals("cam2"))
			return cam2;
		return null;
	}
}
