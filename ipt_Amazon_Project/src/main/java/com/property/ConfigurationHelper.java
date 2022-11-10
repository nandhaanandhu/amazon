package com.property;

import java.io.IOException;

public class ConfigurationHelper {
	public static  ConfigurationReader getinstance() throws IOException {
ConfigurationReader cr=new ConfigurationReader();
return cr;

	}
private ConfigurationHelper() {
	
}
}
