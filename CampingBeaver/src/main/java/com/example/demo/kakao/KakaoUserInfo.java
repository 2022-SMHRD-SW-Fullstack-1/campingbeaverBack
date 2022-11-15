//package com.example.demo.kakao;
//import java.io.*;
//
//import org.json.simple.JSONObject;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//import com.example.demo.controller.kakaologincontroller;
//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
//
//import okhttp3.*;
//
//public class KakaoUserInfo {
//	
//	
//	public static void kakaouserinfo() throws IOException{
//	    OkHttpClient client = new OkHttpClient().newBuilder()
//	      .build();
//	    MediaType mediaType = MediaType.parse("text/plain");
//	    //RequestBody body = RequestBody.create(mediaType, "");
////	    kakaologincontroller mykakaologincontroller = new kakaologincontroller();
////	    mykakaologincontroller.reservation(null);
//	    //String Bearer = mykakaologincontroller.reservation();
//	    
//	    
//	    Request request = new Request.Builder()
//	      .url("https://kapi.kakao.com/v2/user/me?property_keys=%5B%22kakao_account.profile%2C+kakao_account.name%2C++kakao_account.email%22%5D")
//	      //.method("GET", body)
//	      //Bearer 뒷부분 변수로 지정해서 kakaologincontroller에서 가져오기
//	      .addHeader("Authorization", "Bearer MfFKrGhHgc4MnbzmCGU98nbdFtTE8XUb8I1FN7KRCj11GgAAAYQ3eJaR")
//	      .build();
//	    Response response = client.newCall(request).execute();
//	    
//	    String json = response.body().string();
//	    
//	    JsonElement element = JsonParser.parseString(json);
//	    JsonObject object = element.getAsJsonObject();
//	    
//	    long id = object.get("id").getAsLong();
//        System.out.println("id : " + id);
//        
//        //response.body().string() 을 json형태로 바꾸기
//        System.out.println(response.body().string());
//        
//        
//        JsonArray propertiesJsonArray = object.get("properties").getAsJsonArray();
//        for (int i = 0; i < propertiesJsonArray.size(); i++) {
//            String properties = propertiesJsonArray.get(i).getAsString();
//            System.out.println("properties[" + i + "] : " + properties); // student[0] : Anna, student[1] : Jerry
//        }
//       
//        JsonObject subjectJsonObject = object.get("properties").getAsJsonObject();
//        String subjectName = subjectJsonObject.get("nickname").getAsString();
//        //String subjectProfessor = subjectJsonObject.get("profile_image").getAsString();
//        System.out.println("properties.nickname : " + subjectName); // subject.name : Java
//        //System.out.println("properties.profile_image : " + subjectProfessor); // subject.professor : Tony
// 
//  	   
//	    
//	    
//	    
//	  }
//}
