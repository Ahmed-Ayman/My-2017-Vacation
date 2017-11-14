package com.example.webjson;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonReaderFactory;
import javax.json.JsonValue;


public class JsonpJsonParser {

	
	public Object parseJson(InputStream in) {
		JsonReader reader = Json.createReader(in);
		JsonObject json = reader.readObject();
		reader.close();
		
		// parse the json object, return something
		return json;
	}
	
}
