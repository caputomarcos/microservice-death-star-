package com.deathstar.utils;

public class Statics {

	public static final int PORT_FOR_GATEWAY = 8080;
	public static final int PORT_FOR_COMMANDS = 9000;
	public static final int PORT_FOR_QUERIES = 9001;
	public static final int PORT_FOR_DISCOVERY = 8761;
	public static final int PORT_FOR_CONFIG = 8888;
	public static final String QRY_SERVICE_ID = "PLANET-QUERY-SIDE";
	public static final String CMD_SERVICE_ID = "PLANET-COMMAND-SIDE";

	public static final String API = "";
	public static final String VERSION = "";
	public static final String CMD_ROUTE = "/commands";
	public static final String QRY_ROUTE = "/queries";
	public static final String PLANETS_CMD_BASE_PATH = API + VERSION + CMD_ROUTE + "/planets";
	public static final String PLANETS_QRY_BASE_PATH = API + VERSION + QRY_ROUTE + "/planets";
	public static final String CMD_PLANET_ADD = "/add";

	public static final String PROD_CMD_MESSAGE = "Greetings from the PLANET-COMMAND-SIDE microservice [using the PRODUCTION config].";
	public static final String PROD_QRY_MESSAGE = "Greetings from the PLANET-QUERY-SIDE microservice [using the PRODUCTION config].";

	public static final String LOCAL_CMD_MESSAGE = "Greetings from the PLANET-COMMAND-SIDE microservice [using the LOCALHOST config].";
	public static final String LOCAL_QRY_MESSAGE = "Greetings from the PLANET-QUERY-SIDE microservice [using the LOCALHOST config].";

	public static final boolean PRODUCTION = Boolean.valueOf(System.getProperty("production", "true"));

}
