package com.qjh.wx.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class JsonUtil {

	//java对象--》》json字符串
		public static String beanToJson(Object obj) {
	        JSONObject json = JSONObject.fromObject(obj);
	        String strJson=json.toString();
	        return strJson;
	    }
		
		//JSON字符串--》》java对象
		@SuppressWarnings("rawtypes")
		public static Object jsonToBean(Class cls,String jsonStr){
	        JSONObject jsonObject=JSONObject.fromObject(jsonStr);
	        Object jsonObj=(Object)JSONObject.toBean(jsonObject,cls);
	        return jsonObj;
	    }
		
		//list--》》json字符串
		@SuppressWarnings("rawtypes")
		public static String listToJson(List list){
			JSONArray json=JSONArray.fromObject(list);
	        String strJson=json.toString();
	        return strJson;
	    }
		
		//json字符串--》》list
		@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
		public static<T> List jsonToList(Class cls,String jsonStr){
	        List<T> list=(List<T>)JSONArray.toList(JSONArray.fromObject(jsonStr),cls);
	        return list;
	    }
		
		//map--》》json字符串
		@SuppressWarnings("rawtypes")
		public static String mapToJson(Map map){
	        JSONObject json=JSONObject.fromObject(map);
	        String strJson=json.toString();
	        return strJson;
	    }
		
		//json字符串--》》map
		@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
		public static<T> Map jsonToMap(Class cls,String jsonStr){
	        JSONObject jsonObject=JSONObject.fromObject(jsonStr);
	        Map map=new HashMap();
	        Iterator<String> male_Iterator = jsonObject.keys();
	        while(male_Iterator.hasNext()){
	        	String key = male_Iterator.next();
	        	String value = jsonObject.getString(key);
	        	List<T> list=(List<T>)JSONArray.toList(JSONArray.fromObject(value),cls);
	        	map.put(key, list);
	        }
	        return map;
	    }
}
