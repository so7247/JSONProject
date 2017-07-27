package com.tacademy.test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.tacademy.vo.Student;

public class JSONTest {

	public JSONTest() {
		Student student = new Student();
		student.setName("안성호");
		student.setHakbun("t001");
		student.setAge(20);
		student.setSex(true);
		student.setHobby(new String[]{"축구", "야구", "배구"});
		
//		홍길동
//		A홍길동
//		(name : '홍길동')
//		<!xml><name>홍길동</name><age>20</age>;
		
//		student  => Json 문자열로 변경
		
//		String jsonCtn = "{name : 안성호, 예구,}";
		
//		['축구','야구','농구']
		String[] hobbys = student.getHobby();
		String hobbyStr = "[";
		for(String s : hobbys){
			hobbyStr += "'" + s + "',";
		}
		hobbyStr = hobbyStr.substring(0, hobbyStr.length() - 1);
		hobbyStr += "]";
		
		String jsonstn = String.format("{name : '%s', Age : %d, hakbun : '%s', sex : %b, hobby : %s}"
			, student.getName(), student.getAge(), student.getHakbun(), student.isSex(), hobbyStr);
		
		System.out.println(jsonstn);
		
		
		JSONObject obj = new JSONObject();
		obj.put("name" , student.getName());
		obj.put("hakbun" , student.getHakbun());
		obj.put("age" , student.getAge());
		obj.put("sex" , student.isSex());
		JSONArray arr = new JSONArray();
//		String[] hobbys = student.getHobby();
		for(String s : hobbys){
			arr.put(s);
		}
		
		String jsonStr1 = obj.toString();
		System.out.println(jsonStr1);
		
		
//		JSON문자열 -> 자바의 객체로 변환
//		JSON 파싱
		Student student2 = new Student();
		
		JSONObject obj1 = null;
		try{
		obj1 = new JSONObject(jsonStr1);
		student2.setSex(obj1.getBoolean("sex"));
		student2.setName(obj1.getString("name"));//없는 키를 입력하면 입셉션이 일어난다
		student2.setHakbun(obj1.getString("hakbun"));
		student2.setAge(obj1.getInt("age"));
		JSONArray jsonArr = obj1.getJSONArray("hobby");
		
		String[] hobbys1 = new String[jsonArr.length()];
		
		for(int i = 0; i < hobbys1.length; i++){
			hobbys1[i] = jsonArr.getString(i);
		}
		student2.setHobby(hobbys1);
		
		}catch(JSONException e){
			e.printStackTrace();
		}
		
		System.out.println(student2);
		
	}

	public static void main(String[] args) {
		new JSONTest();
	}

}
