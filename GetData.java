package HubSpotKlipfolioConnect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class GetData {
	
	public static String Data_List614 = "";
	public static String Data_List615 = "";
	public static String Data_List636 = "";
	
	public static void localmain() {
		System.out.println();
		System.out.println("Getting Data From List - 614");
		HubSpotList614_Data();
		//PostDataToDashboard.postList614(Data_List614);
		
		System.out.println();
		System.out.println("Getting Data From List - 615");
		HubSpotList615_Data();
		PostDataToDashboard.postList615(Data_List615);
		
		System.out.println();
		System.out.println("Getting Data From List - 636");
		HubSpotList636_Data();
		PostDataToDashboard.postList636(Data_List636);
	}
	
	public static void HubSpotList614_Data() {
		Data_List614 = "";
		String vid = "", addedAt = "", properties = "", email = "", firstname = "", lastname = "", company = "", salesforce_opp_created_date_mis_driven = "", recent_conversion_event_name = "", lifecyclestage = "", hs_lifecyclestage_opportunity_date = "", transfer_to_pa = "", transfered_to_pa = "", priority_segment = "";
		try {
			String EndPoint = "https://api.hubapi.com/contacts/v1/lists/614/contacts/all?hapikey=27878313-73f3-4c3f-bae8-931656454b20&count=100&property=email&property=firstname&property=lastname&property=company&property=salesforce_opp_created_date_mis_driven&property=recent_conversion_event_name&property=lifecyclestage&property=hs_lifecyclestage_opportunity_date&property=transfer_to_pa&property=transfered_to_pa&property=priority_segment";
			URL obj = new URL(EndPoint);
			URLConnection conn = obj.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection)conn;
			httpConn.setRequestMethod("GET");
			httpConn.setRequestProperty("Content-Type", "application/json");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			InputStreamReader isr =	new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);	
			StringBuilder sb = new StringBuilder();
			
						
			String line = "";
			while((line=in.readLine())!=null) {
				sb.append(line);
			}
			
			JSONParser parser = new JSONParser();
			Object jsonobject = parser.parse(sb.toString());
			JSONObject json = (JSONObject)jsonobject;
			JSONArray jArray = (JSONArray) json.get("contacts");		
			
			for(int tmpIterator = 0; tmpIterator < jArray.size(); tmpIterator++) {
				JSONObject jobj1 = (JSONObject) jArray.get(tmpIterator);
				
				if(jobj1.containsKey("vid")) {
					vid = jobj1.get("vid").toString();
				}
								
				if(jobj1.containsKey("addedAt")) {
					addedAt = jobj1.get("addedAt").toString();
				}
				
				if(jobj1.containsKey("properties")) {
					properties = jobj1.get("properties").toString();
					
					JSONParser parser2 = new JSONParser();
					Object obj1 = parser2.parse(properties);
					JSONObject jobj2 = (JSONObject) obj1;
					
					if(jobj2.containsKey("email")) {
						String emailfull = jobj2.get("email").toString();
						JSONParser innerparser1 = new JSONParser();
						Object innerObj1 = innerparser1.parse(emailfull);
						JSONObject jInnerObj1 = (JSONObject) innerObj1;
						if(jInnerObj1.containsKey("value")) {
							email = jInnerObj1.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("firstname")) {
						String firstnamefull = jobj2.get("firstname").toString();
						JSONParser innerparser2 = new JSONParser();
						Object innerObj2 = innerparser2.parse(firstnamefull);
						JSONObject jInnerObj2 = (JSONObject) innerObj2;
						if(jInnerObj2.containsKey("value")) {
							firstname = jInnerObj2.get("value").toString();
						}			
					}
					
					if(jobj2.containsKey("lastname")) {
						String lastnamefull = jobj2.get("lastname").toString();
						JSONParser innerparser3 = new JSONParser();
						Object innerObj3 = innerparser3.parse(lastnamefull);
						JSONObject jInnerObj3 = (JSONObject) innerObj3;
						if(jInnerObj3.containsKey("value")) {
							lastname = jInnerObj3.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("company")) {
						String companyfull = jobj2.get("company").toString();
						JSONParser innerparser4 = new JSONParser();
						Object innerObj4 = innerparser4.parse(companyfull);
						JSONObject jInnerObj4 = (JSONObject) innerObj4;
						if(jInnerObj4.containsKey("value")) {
							company = jInnerObj4.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("salesforce_opp_created_date_mis_driven")) {
						String salesforce_opp_created_date_mis_drivenfull = jobj2.get("salesforce_opp_created_date_mis_driven").toString();
						JSONParser innerparser5 = new JSONParser();
						Object innerObj5 = innerparser5.parse(salesforce_opp_created_date_mis_drivenfull);
						JSONObject jInnerObj5 = (JSONObject) innerObj5;
						if(jInnerObj5.containsKey("value")) {
							salesforce_opp_created_date_mis_driven = jInnerObj5.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("recent_conversion_event_name")) {
						String recent_conversion_event_namefull = jobj2.get("recent_conversion_event_name").toString();
						JSONParser innerparser6 = new JSONParser();
						Object innerObj6 = innerparser6.parse(recent_conversion_event_namefull);
						JSONObject jInnerObj6 = (JSONObject) innerObj6;
						if(jInnerObj6.containsKey("value")) {
							recent_conversion_event_name = jInnerObj6.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lifecyclestage")) {
						String lifecyclestagefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser7 = new JSONParser();
						Object innerObj7 = innerparser7.parse(lifecyclestagefull);
						JSONObject jInnerObj7 = (JSONObject) innerObj7;
						if(jInnerObj7.containsKey("value")) {
							lifecyclestage = jInnerObj7.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("hs_lifecyclestage_opportunity_date")) {
						String hs_lifecyclestage_opportunity_datefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser8 = new JSONParser();
						Object innerObj8 = innerparser8.parse(hs_lifecyclestage_opportunity_datefull);
						JSONObject jInnerObj8 = (JSONObject) innerObj8;
						if(jInnerObj8.containsKey("value")) {
							hs_lifecyclestage_opportunity_date = jInnerObj8.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("transfer_to_pa")) {
						String transfer_to_pafull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser9 = new JSONParser();
						Object innerObj9 = innerparser9.parse(transfer_to_pafull);
						JSONObject jInnerObj9 = (JSONObject) innerObj9;
						if(jInnerObj9.containsKey("value")) {
							transfer_to_pa = jInnerObj9.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("transfered_to_pa")) {
						String transfered_to_pafull = jobj2.get("transfered_to_pa").toString();
						JSONParser innerparser10 = new JSONParser();
						Object innerObj10 = innerparser10.parse(transfered_to_pafull);
						JSONObject jInnerObj10 = (JSONObject) innerObj10;
						if(jInnerObj10.containsKey("value")) {
							transfered_to_pa = jInnerObj10.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("priority_segment")) {
						String priority_segmentfull = jobj2.get("priority_segment").toString();
						JSONParser innerparser11 = new JSONParser();
						Object innerObj11 = innerparser11.parse(priority_segmentfull);
						JSONObject jInnerObj11 = (JSONObject) innerObj11;
						if(jInnerObj11.containsKey("value")) {
							priority_segment = jInnerObj11.get("value").toString();
						}
					}

				}
				Data_List614 = Data_List614 + "{\"vid\":\""+vid+"\",\"addedAt\":\""+addedAt+"\",\"email\":\""+email+"\",\"firstname\":\""+firstname+"\",\"lastname\":\""+lastname+"\",\"company\":\""+company+"\",\"salesforce_opp_created_date_mis_driven\":\""+salesforce_opp_created_date_mis_driven+"\",\"recent_conversion_event_name\":\""+recent_conversion_event_name+"\",\"lifecyclestage\":\""+lifecyclestage+"\",\"hs_lifecyclestage_opportunity_date\":\""+hs_lifecyclestage_opportunity_date+"\",\"transfer_to_pa\":\""+transfer_to_pa+"\",\"transfered_to_pa\":\""+transfered_to_pa+"\",\"priority_segment\":\""+priority_segment+"\"},";
				
			}
			
			if(json.containsKey("has-more")) {
				boolean hasmore = Boolean.valueOf(json.get("has-more").toString());
				if(hasmore == true) {
					Long vidOffset = (Long)json.get("vid-offset");
					String ExtendedEndPoint = EndPoint.concat("&vidOffset="+vidOffset);				
					HubSpotList614_NextPages(ExtendedEndPoint);
				}
			}
			
			if(Data_List614.length() > 0) {
				Data_List614 = Data_List614.substring(0, Data_List614.length()-1);
				Data_List614 = "{\"ContactList\":{\"Contact\":["+Data_List614+"]}}";
			}
			
		} catch(Exception e) {
			//System.out.println("Exception Found In Method - HubSpotList614_Data: "+e);
			e.printStackTrace();
		}
	}
	
	public static void HubSpotList614_NextPages(String ExtendedURL) {
		String vid = "", addedAt = "", properties = "", email = "", firstname = "", lastname = "", company = "", salesforce_opp_created_date_mis_driven = "", recent_conversion_event_name = "", lifecyclestage = "", hs_lifecyclestage_opportunity_date = "", transfer_to_pa = "", transfered_to_pa = "", priority_segment = "";
		try {
			String EndPoint = ExtendedURL;
			URL obj = new URL(EndPoint);
			URLConnection conn = obj.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection)conn;
			httpConn.setRequestMethod("GET");
			httpConn.setRequestProperty("Content-Type", "application/json");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			InputStreamReader isr =	new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);	
			StringBuilder sb = new StringBuilder();
			
			String line = "";
			while((line=in.readLine())!=null) {
				sb.append(line);
			}
			
			JSONParser parser = new JSONParser();
			Object jsonobject = parser.parse(sb.toString());
			JSONObject json = (JSONObject)jsonobject;
			JSONArray jArray = (JSONArray) json.get("contacts");		
			
			for(int tmpIterator = 0; tmpIterator < jArray.size(); tmpIterator++) {
				JSONObject jobj1 = (JSONObject) jArray.get(tmpIterator);
				
				if(jobj1.containsKey("vid")) {
					vid = jobj1.get("vid").toString();
				}
								
				if(jobj1.containsKey("addedAt")) {
					addedAt = jobj1.get("addedAt").toString();
				}
				
				if(jobj1.containsKey("properties")) {
					properties = jobj1.get("properties").toString();
					
					JSONParser parser2 = new JSONParser();
					Object obj1 = parser2.parse(properties);
					JSONObject jobj2 = (JSONObject) obj1;
					
					if(jobj2.containsKey("email")) {
						String emailfull = jobj2.get("email").toString();
						JSONParser innerparser1 = new JSONParser();
						Object innerObj1 = innerparser1.parse(emailfull);
						JSONObject jInnerObj1 = (JSONObject) innerObj1;
						if(jInnerObj1.containsKey("value")) {
							email = jInnerObj1.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("firstname")) {
						String firstnamefull = jobj2.get("firstname").toString();
						JSONParser innerparser2 = new JSONParser();
						Object innerObj2 = innerparser2.parse(firstnamefull);
						JSONObject jInnerObj2 = (JSONObject) innerObj2;
						if(jInnerObj2.containsKey("value")) {
							firstname = jInnerObj2.get("value").toString();
						}			
					}
					
					if(jobj2.containsKey("lastname")) {
						String lastnamefull = jobj2.get("lastname").toString();
						JSONParser innerparser3 = new JSONParser();
						Object innerObj3 = innerparser3.parse(lastnamefull);
						JSONObject jInnerObj3 = (JSONObject) innerObj3;
						if(jInnerObj3.containsKey("value")) {
							lastname = jInnerObj3.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("company")) {
						String companyfull = jobj2.get("company").toString();
						JSONParser innerparser4 = new JSONParser();
						Object innerObj4 = innerparser4.parse(companyfull);
						JSONObject jInnerObj4 = (JSONObject) innerObj4;
						if(jInnerObj4.containsKey("value")) {
							company = jInnerObj4.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("salesforce_opp_created_date_mis_driven")) {
						String salesforce_opp_created_date_mis_drivenfull = jobj2.get("salesforce_opp_created_date_mis_driven").toString();
						JSONParser innerparser5 = new JSONParser();
						Object innerObj5 = innerparser5.parse(salesforce_opp_created_date_mis_drivenfull);
						JSONObject jInnerObj5 = (JSONObject) innerObj5;
						if(jInnerObj5.containsKey("value")) {
							salesforce_opp_created_date_mis_driven = jInnerObj5.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("recent_conversion_event_name")) {
						String recent_conversion_event_namefull = jobj2.get("recent_conversion_event_name").toString();
						JSONParser innerparser6 = new JSONParser();
						Object innerObj6 = innerparser6.parse(recent_conversion_event_namefull);
						JSONObject jInnerObj6 = (JSONObject) innerObj6;
						if(jInnerObj6.containsKey("value")) {
							recent_conversion_event_name = jInnerObj6.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lifecyclestage")) {
						String lifecyclestagefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser7 = new JSONParser();
						Object innerObj7 = innerparser7.parse(lifecyclestagefull);
						JSONObject jInnerObj7 = (JSONObject) innerObj7;
						if(jInnerObj7.containsKey("value")) {
							lifecyclestage = jInnerObj7.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("hs_lifecyclestage_opportunity_date")) {
						String hs_lifecyclestage_opportunity_datefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser8 = new JSONParser();
						Object innerObj8 = innerparser8.parse(hs_lifecyclestage_opportunity_datefull);
						JSONObject jInnerObj8 = (JSONObject) innerObj8;
						if(jInnerObj8.containsKey("value")) {
							hs_lifecyclestage_opportunity_date = jInnerObj8.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("transfer_to_pa")) {
						String transfer_to_pafull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser9 = new JSONParser();
						Object innerObj9 = innerparser9.parse(transfer_to_pafull);
						JSONObject jInnerObj9 = (JSONObject) innerObj9;
						if(jInnerObj9.containsKey("value")) {
							transfer_to_pa = jInnerObj9.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("transfered_to_pa")) {
						String transfered_to_pafull = jobj2.get("transfered_to_pa").toString();
						JSONParser innerparser10 = new JSONParser();
						Object innerObj10 = innerparser10.parse(transfered_to_pafull);
						JSONObject jInnerObj10 = (JSONObject) innerObj10;
						if(jInnerObj10.containsKey("value")) {
							transfered_to_pa = jInnerObj10.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("priority_segment")) {
						String priority_segmentfull = jobj2.get("priority_segment").toString();
						JSONParser innerparser11 = new JSONParser();
						Object innerObj11 = innerparser11.parse(priority_segmentfull);
						JSONObject jInnerObj11 = (JSONObject) innerObj11;
						if(jInnerObj11.containsKey("value")) {
							priority_segment = jInnerObj11.get("value").toString();
						}
					}

				}
				Data_List614 = Data_List614 + "{\"vid\":\""+vid+"\",\"addedAt\":\""+addedAt+"\",\"email\":\""+email+"\",\"firstname\":\""+firstname+"\",\"lastname\":\""+lastname+"\",\"company\":\""+company+"\",\"salesforce_opp_created_date_mis_driven\":\""+salesforce_opp_created_date_mis_driven+"\",\"recent_conversion_event_name\":\""+recent_conversion_event_name+"\",\"lifecyclestage\":\""+lifecyclestage+"\",\"hs_lifecyclestage_opportunity_date\":\""+hs_lifecyclestage_opportunity_date+"\",\"transfer_to_pa\":\""+transfer_to_pa+"\",\"transfered_to_pa\":\""+transfered_to_pa+"\",\"priority_segment\":\""+priority_segment+"\"},";
			}
			
			if(json.containsKey("has-more")) {
				boolean hasmore = Boolean.valueOf(json.get("has-more").toString());
				if(hasmore == true) {
					Long vidOffset = (Long)json.get("vid-offset");
					EndPoint = "https://api.hubapi.com/contacts/v1/lists/614/contacts/all?hapikey=27878313-73f3-4c3f-bae8-931656454b20&count=100&property=email&property=firstname&property=lastname&property=company&property=salesforce_opp_created_date_mis_driven&property=recent_conversion_event_name&property=lifecyclestage&property=hs_lifecyclestage_opportunity_date&property=transfer_to_pa&property=transfered_to_pa&property=priority_segment";
					String ExtendedEndPoint = EndPoint.concat("&vidOffset="+vidOffset);				
					HubSpotList614_NextPages(ExtendedEndPoint);
				}
			}
			
		} catch(Exception e) {
			//System.out.println("Exception Found In Method - HubSpotList614_NextPages: "+e);
			e.printStackTrace();
		}
	}
	
	public static void HubSpotList615_Data() {
		Data_List615 = "";
		String vid = "", addedAt = "", properties = "", email = "", firstname = "", lastname = "", marketing_inquiry_specailist = "", company = "", recent_conversion_event_name = "", lifecyclestage = "", hs_lifecyclestage_opportunity_date = "", lead_score_sales_force_ = "", mis_assigned = "", priority_segment = "";
		try {
			String EndPoint = "https://api.hubapi.com/contacts/v1/lists/615/contacts/all?hapikey=27878313-73f3-4c3f-bae8-931656454b20&count=100&property=email&property=firstname&property=lastname&property=marketing_inquiry_specailist&property=company&property=recent_conversion_event_name&property=lifecyclestage&property=hs_lifecyclestage_opportunity_date&property=lead_score_sales_force_&property=mis_assigned&property=priority_segment";
			URL obj = new URL(EndPoint);
			URLConnection conn = obj.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection)conn;
			httpConn.setRequestMethod("GET");
			httpConn.setRequestProperty("Content-Type", "application/json");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			InputStreamReader isr =	new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);	
			StringBuilder sb = new StringBuilder();
			
			String line = "";
			while((line=in.readLine())!=null) {
				sb.append(line);
			}
			
			JSONParser parser = new JSONParser();
			Object jsonobject = parser.parse(sb.toString());
			JSONObject json = (JSONObject)jsonobject;
			JSONArray jArray = (JSONArray) json.get("contacts");		
			
			for(int tmpIterator = 0; tmpIterator < jArray.size(); tmpIterator++) {
				JSONObject jobj1 = (JSONObject) jArray.get(tmpIterator);
				
				if(jobj1.containsKey("vid")) {
					vid = jobj1.get("vid").toString();
				}
								
				if(jobj1.containsKey("addedAt")) {
					addedAt = jobj1.get("addedAt").toString();
				}
				
				if(jobj1.containsKey("properties")) {
					properties = jobj1.get("properties").toString();
					
					JSONParser parser2 = new JSONParser();
					Object obj1 = parser2.parse(properties);
					JSONObject jobj2 = (JSONObject) obj1;
					
					if(jobj2.containsKey("email")) {
						String emailfull = jobj2.get("email").toString();
						JSONParser innerparser1 = new JSONParser();
						Object innerObj1 = innerparser1.parse(emailfull);
						JSONObject jInnerObj1 = (JSONObject) innerObj1;
						if(jInnerObj1.containsKey("value")) {
							email = jInnerObj1.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("firstname")) {
						String firstnamefull = jobj2.get("firstname").toString();
						JSONParser innerparser2 = new JSONParser();
						Object innerObj2 = innerparser2.parse(firstnamefull);
						JSONObject jInnerObj2 = (JSONObject) innerObj2;
						if(jInnerObj2.containsKey("value")) {
							firstname = jInnerObj2.get("value").toString();
						}			
					}
					
					if(jobj2.containsKey("lastname")) {
						String lastnamefull = jobj2.get("lastname").toString();
						JSONParser innerparser3 = new JSONParser();
						Object innerObj3 = innerparser3.parse(lastnamefull);
						JSONObject jInnerObj3 = (JSONObject) innerObj3;
						if(jInnerObj3.containsKey("value")) {
							lastname = jInnerObj3.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("company")) {
						String companyfull = jobj2.get("company").toString();
						JSONParser innerparser4 = new JSONParser();
						Object innerObj4 = innerparser4.parse(companyfull);
						JSONObject jInnerObj4 = (JSONObject) innerObj4;
						if(jInnerObj4.containsKey("value")) {
							company = jInnerObj4.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("marketing_inquiry_specailist")) {
						String marketing_inquiry_specailistfull = jobj2.get("marketing_inquiry_specailist").toString();
						JSONParser innerparser5 = new JSONParser();
						Object innerObj5 = innerparser5.parse(marketing_inquiry_specailistfull);
						JSONObject jInnerObj5 = (JSONObject) innerObj5;
						if(jInnerObj5.containsKey("value")) {
							marketing_inquiry_specailist = jInnerObj5.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("recent_conversion_event_name")) {
						String recent_conversion_event_namefull = jobj2.get("recent_conversion_event_name").toString();
						JSONParser innerparser6 = new JSONParser();
						Object innerObj6 = innerparser6.parse(recent_conversion_event_namefull);
						JSONObject jInnerObj6 = (JSONObject) innerObj6;
						if(jInnerObj6.containsKey("value")) {
							recent_conversion_event_name = jInnerObj6.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lifecyclestage")) {
						String lifecyclestagefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser7 = new JSONParser();
						Object innerObj7 = innerparser7.parse(lifecyclestagefull);
						JSONObject jInnerObj7 = (JSONObject) innerObj7;
						if(jInnerObj7.containsKey("value")) {
							lifecyclestage = jInnerObj7.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("hs_lifecyclestage_opportunity_date")) {
						String hs_lifecyclestage_opportunity_datefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser8 = new JSONParser();
						Object innerObj8 = innerparser8.parse(hs_lifecyclestage_opportunity_datefull);
						JSONObject jInnerObj8 = (JSONObject) innerObj8;
						if(jInnerObj8.containsKey("value")) {
							hs_lifecyclestage_opportunity_date = jInnerObj8.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lead_score_sales_force_")) {
						String lead_score_sales_force_full = jobj2.get("lead_score_sales_force_").toString();
						JSONParser innerparser9 = new JSONParser();
						Object innerObj9 = innerparser9.parse(lead_score_sales_force_full);
						JSONObject jInnerObj9 = (JSONObject) innerObj9;
						if(jInnerObj9.containsKey("value")) {
							lead_score_sales_force_ = jInnerObj9.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("mis_assigned")) {
						String mis_assignedfull = jobj2.get("mis_assigned").toString();
						JSONParser innerparser10 = new JSONParser();
						Object innerObj10 = innerparser10.parse(mis_assignedfull);
						JSONObject jInnerObj10 = (JSONObject) innerObj10;
						if(jInnerObj10.containsKey("value")) {
							mis_assigned = jInnerObj10.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("priority_segment")) {
						String priority_segmentfull = jobj2.get("priority_segment").toString();
						JSONParser innerparser11 = new JSONParser();
						Object innerObj11 = innerparser11.parse(priority_segmentfull);
						JSONObject jInnerObj11 = (JSONObject) innerObj11;
						if(jInnerObj11.containsKey("value")) {
							priority_segment = jInnerObj11.get("value").toString();
						}
					}

				}
				Data_List615 = Data_List615 + "{\"vid\":\""+vid+"\",\"addedAt\":\""+addedAt+"\",\"email\":\""+email+"\",\"firstname\":\""+firstname+"\",\"lastname\":\""+lastname+"\",\"marketing_inquiry_specailist\":\""+marketing_inquiry_specailist+"\",\"company\":\""+company+"\",\"recent_conversion_event_name\":\""+recent_conversion_event_name+"\",\"lifecyclestage\":\""+lifecyclestage+"\",\"hs_lifecyclestage_opportunity_date\":\""+hs_lifecyclestage_opportunity_date+"\",\"lead_score_sales_force_\":\""+lead_score_sales_force_+"\",\"mis_assigned\":\""+mis_assigned+"\",\"priority_segment\":\""+priority_segment+"\"},";
			}
			
			if(json.containsKey("has-more")) {
				boolean hasmore = Boolean.valueOf(json.get("has-more").toString());
				if(hasmore == true) {
					Long vidOffset = (Long)json.get("vid-offset");
					String ExtendedEndPoint = EndPoint.concat("&vidOffset="+vidOffset);				
					HubSpotList615_NextPages(ExtendedEndPoint);
				}
			}
			
			if(Data_List615.length() > 0) {
				Data_List615 = Data_List615.substring(0, Data_List615.length()-1);
				Data_List615 = "{\"ContactList\":{\"Contact\":["+Data_List615+"]}}";
			}
			
		} catch(Exception e) {
			//System.out.println("Exception Found In Method - HubSpotList615_Data: "+e);
			e.printStackTrace();
		}
	}

	public static void HubSpotList615_NextPages(String ExtendedURL) {
		String vid = "", addedAt = "", properties = "", email = "", firstname = "", lastname = "", marketing_inquiry_specailist = "", company = "", recent_conversion_event_name = "", lifecyclestage = "", hs_lifecyclestage_opportunity_date = "", lead_score_sales_force_ = "", mis_assigned = "", priority_segment = "";
		try {
			String EndPoint = ExtendedURL;
			URL obj = new URL(EndPoint);
			URLConnection conn = obj.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection)conn;
			httpConn.setRequestMethod("GET");
			httpConn.setRequestProperty("Content-Type", "application/json");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			InputStreamReader isr =	new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);	
			StringBuilder sb = new StringBuilder();
			
			String line = "";
			while((line=in.readLine())!=null) {
				sb.append(line);
			}
			
			JSONParser parser = new JSONParser();
			Object jsonobject = parser.parse(sb.toString());
			JSONObject json = (JSONObject)jsonobject;
			JSONArray jArray = (JSONArray) json.get("contacts");		
			
			for(int tmpIterator = 0; tmpIterator < jArray.size(); tmpIterator++) {
				JSONObject jobj1 = (JSONObject) jArray.get(tmpIterator);
				
				if(jobj1.containsKey("vid")) {
					vid = jobj1.get("vid").toString();
				}
								
				if(jobj1.containsKey("addedAt")) {
					addedAt = jobj1.get("addedAt").toString();
				}
				
				if(jobj1.containsKey("properties")) {
					properties = jobj1.get("properties").toString();
					
					JSONParser parser2 = new JSONParser();
					Object obj1 = parser2.parse(properties);
					JSONObject jobj2 = (JSONObject) obj1;
					
					if(jobj2.containsKey("email")) {
						String emailfull = jobj2.get("email").toString();
						JSONParser innerparser1 = new JSONParser();
						Object innerObj1 = innerparser1.parse(emailfull);
						JSONObject jInnerObj1 = (JSONObject) innerObj1;
						if(jInnerObj1.containsKey("value")) {
							email = jInnerObj1.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("firstname")) {
						String firstnamefull = jobj2.get("firstname").toString();
						JSONParser innerparser2 = new JSONParser();
						Object innerObj2 = innerparser2.parse(firstnamefull);
						JSONObject jInnerObj2 = (JSONObject) innerObj2;
						if(jInnerObj2.containsKey("value")) {
							firstname = jInnerObj2.get("value").toString();
						}			
					}
					
					if(jobj2.containsKey("lastname")) {
						String lastnamefull = jobj2.get("lastname").toString();
						JSONParser innerparser3 = new JSONParser();
						Object innerObj3 = innerparser3.parse(lastnamefull);
						JSONObject jInnerObj3 = (JSONObject) innerObj3;
						if(jInnerObj3.containsKey("value")) {
							lastname = jInnerObj3.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("company")) {
						String companyfull = jobj2.get("company").toString();
						JSONParser innerparser4 = new JSONParser();
						Object innerObj4 = innerparser4.parse(companyfull);
						JSONObject jInnerObj4 = (JSONObject) innerObj4;
						if(jInnerObj4.containsKey("value")) {
							company = jInnerObj4.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("marketing_inquiry_specailist")) {
						String marketing_inquiry_specailistfull = jobj2.get("marketing_inquiry_specailist").toString();
						JSONParser innerparser5 = new JSONParser();
						Object innerObj5 = innerparser5.parse(marketing_inquiry_specailistfull);
						JSONObject jInnerObj5 = (JSONObject) innerObj5;
						if(jInnerObj5.containsKey("value")) {
							marketing_inquiry_specailist = jInnerObj5.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("recent_conversion_event_name")) {
						String recent_conversion_event_namefull = jobj2.get("recent_conversion_event_name").toString();
						JSONParser innerparser6 = new JSONParser();
						Object innerObj6 = innerparser6.parse(recent_conversion_event_namefull);
						JSONObject jInnerObj6 = (JSONObject) innerObj6;
						if(jInnerObj6.containsKey("value")) {
							recent_conversion_event_name = jInnerObj6.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lifecyclestage")) {
						String lifecyclestagefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser7 = new JSONParser();
						Object innerObj7 = innerparser7.parse(lifecyclestagefull);
						JSONObject jInnerObj7 = (JSONObject) innerObj7;
						if(jInnerObj7.containsKey("value")) {
							lifecyclestage = jInnerObj7.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("hs_lifecyclestage_opportunity_date")) {
						String hs_lifecyclestage_opportunity_datefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser8 = new JSONParser();
						Object innerObj8 = innerparser8.parse(hs_lifecyclestage_opportunity_datefull);
						JSONObject jInnerObj8 = (JSONObject) innerObj8;
						if(jInnerObj8.containsKey("value")) {
							hs_lifecyclestage_opportunity_date = jInnerObj8.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lead_score_sales_force_")) {
						String lead_score_sales_force_full = jobj2.get("lead_score_sales_force_").toString();
						JSONParser innerparser9 = new JSONParser();
						Object innerObj9 = innerparser9.parse(lead_score_sales_force_full);
						JSONObject jInnerObj9 = (JSONObject) innerObj9;
						if(jInnerObj9.containsKey("value")) {
							lead_score_sales_force_ = jInnerObj9.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("mis_assigned")) {
						String mis_assignedfull = jobj2.get("mis_assigned").toString();
						JSONParser innerparser10 = new JSONParser();
						Object innerObj10 = innerparser10.parse(mis_assignedfull);
						JSONObject jInnerObj10 = (JSONObject) innerObj10;
						if(jInnerObj10.containsKey("value")) {
							mis_assigned = jInnerObj10.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("priority_segment")) {
						String priority_segmentfull = jobj2.get("priority_segment").toString();
						JSONParser innerparser11 = new JSONParser();
						Object innerObj11 = innerparser11.parse(priority_segmentfull);
						JSONObject jInnerObj11 = (JSONObject) innerObj11;
						if(jInnerObj11.containsKey("value")) {
							priority_segment = jInnerObj11.get("value").toString();
						}
					}

				}
				Data_List615 = Data_List615 + "{\"vid\":\""+vid+"\",\"addedAt\":\""+addedAt+"\",\"email\":\""+email+"\",\"firstname\":\""+firstname+"\",\"lastname\":\""+lastname+"\",\"marketing_inquiry_specailist\":\""+marketing_inquiry_specailist+"\",\"company\":\""+company+"\",\"recent_conversion_event_name\":\""+recent_conversion_event_name+"\",\"lifecyclestage\":\""+lifecyclestage+"\",\"hs_lifecyclestage_opportunity_date\":\""+hs_lifecyclestage_opportunity_date+"\",\"lead_score_sales_force_\":\""+lead_score_sales_force_+"\",\"mis_assigned\":\""+mis_assigned+"\",\"priority_segment\":\""+priority_segment+"\"},";
			}
			
			if(json.containsKey("has-more")) {
				boolean hasmore = Boolean.valueOf(json.get("has-more").toString());
				if(hasmore == true) {
					Long vidOffset = (Long)json.get("vid-offset");
					EndPoint = "https://api.hubapi.com/contacts/v1/lists/615/contacts/all?hapikey=27878313-73f3-4c3f-bae8-931656454b20&count=100&property=email&property=firstname&property=lastname&property=marketing_inquiry_specailist&property=company&property=recent_conversion_event_name&property=lifecyclestage&property=hs_lifecyclestage_opportunity_date&property=lead_score_sales_force_&property=mis_assigned&property=priority_segment";
					String ExtendedEndPoint = EndPoint.concat("&vidOffset="+vidOffset);				
					HubSpotList615_NextPages(ExtendedEndPoint);
				}
			}	
			
		} catch(Exception e) {
			//System.out.println("Exception Found In Method - HubSpotList615_NextPages: "+e);
			e.printStackTrace();
		}
	}
	
	public static void HubSpotList636_Data() {
		Data_List636 = "";
		String vid = "", addedAt = "", properties = "", email = "", firstname = "", lastname = "", company = "", hs_analytics_last_visit_timestamp = "", recent_conversion_event_name = "", lifecyclestage = "", hs_lifecyclestage_opportunity_date = "", lead_score_sales_force_ = "", mis_assigned = "", priority_segment = "";
		try {
			String EndPoint = "https://api.hubapi.com/contacts/v1/lists/636/contacts/all?hapikey=27878313-73f3-4c3f-bae8-931656454b20&count=100&property=email&property=firstname&property=lastname&property=company&property=hs_analytics_last_visit_timestamp&property=recent_conversion_event_name&property=lifecyclestage&property=hs_lifecyclestage_opportunity_date&property=lead_score_sales_force_&property=mis_assigned&property=priority_segment";
			URL obj = new URL(EndPoint);
			URLConnection conn = obj.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection)conn;
			httpConn.setRequestMethod("GET");
			httpConn.setRequestProperty("Content-Type", "application/json");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			InputStreamReader isr =	new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);	
			StringBuilder sb = new StringBuilder();
			
						
			String line = "";
			while((line=in.readLine())!=null) {
				sb.append(line);
			}
			
			JSONParser parser = new JSONParser();
			Object jsonobject = parser.parse(sb.toString());
			JSONObject json = (JSONObject)jsonobject;
			JSONArray jArray = (JSONArray) json.get("contacts");		
			
			for(int tmpIterator = 0; tmpIterator < jArray.size(); tmpIterator++) {
				JSONObject jobj1 = (JSONObject) jArray.get(tmpIterator);
				
				if(jobj1.containsKey("vid")) {
					vid = jobj1.get("vid").toString();
				}
								
				if(jobj1.containsKey("addedAt")) {
					addedAt = jobj1.get("addedAt").toString();
				}
				
				if(jobj1.containsKey("properties")) {
					properties = jobj1.get("properties").toString();
					
					JSONParser parser2 = new JSONParser();
					Object obj1 = parser2.parse(properties);
					JSONObject jobj2 = (JSONObject) obj1;
					
					if(jobj2.containsKey("email")) {
						String emailfull = jobj2.get("email").toString();
						JSONParser innerparser1 = new JSONParser();
						Object innerObj1 = innerparser1.parse(emailfull);
						JSONObject jInnerObj1 = (JSONObject) innerObj1;
						if(jInnerObj1.containsKey("value")) {
							email = jInnerObj1.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("firstname")) {
						String firstnamefull = jobj2.get("firstname").toString();
						JSONParser innerparser2 = new JSONParser();
						Object innerObj2 = innerparser2.parse(firstnamefull);
						JSONObject jInnerObj2 = (JSONObject) innerObj2;
						if(jInnerObj2.containsKey("value")) {
							firstname = jInnerObj2.get("value").toString();
						}			
					}
					
					if(jobj2.containsKey("lastname")) {
						String lastnamefull = jobj2.get("lastname").toString();
						JSONParser innerparser3 = new JSONParser();
						Object innerObj3 = innerparser3.parse(lastnamefull);
						JSONObject jInnerObj3 = (JSONObject) innerObj3;
						if(jInnerObj3.containsKey("value")) {
							lastname = jInnerObj3.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("company")) {
						String companyfull = jobj2.get("company").toString();
						JSONParser innerparser4 = new JSONParser();
						Object innerObj4 = innerparser4.parse(companyfull);
						JSONObject jInnerObj4 = (JSONObject) innerObj4;
						if(jInnerObj4.containsKey("value")) {
							company = jInnerObj4.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("hs_analytics_last_visit_timestamp")) {
						String hs_analytics_last_visit_timestampfull = jobj2.get("hs_analytics_last_visit_timestamp").toString();
						JSONParser innerparser5 = new JSONParser();
						Object innerObj5 = innerparser5.parse(hs_analytics_last_visit_timestampfull);
						JSONObject jInnerObj5 = (JSONObject) innerObj5;
						if(jInnerObj5.containsKey("value")) {
							hs_analytics_last_visit_timestamp = jInnerObj5.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("recent_conversion_event_name")) {
						String recent_conversion_event_namefull = jobj2.get("recent_conversion_event_name").toString();
						JSONParser innerparser6 = new JSONParser();
						Object innerObj6 = innerparser6.parse(recent_conversion_event_namefull);
						JSONObject jInnerObj6 = (JSONObject) innerObj6;
						if(jInnerObj6.containsKey("value")) {
							recent_conversion_event_name = jInnerObj6.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lifecyclestage")) {
						String lifecyclestagefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser7 = new JSONParser();
						Object innerObj7 = innerparser7.parse(lifecyclestagefull);
						JSONObject jInnerObj7 = (JSONObject) innerObj7;
						if(jInnerObj7.containsKey("value")) {
							lifecyclestage = jInnerObj7.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("hs_lifecyclestage_opportunity_date")) {
						String hs_lifecyclestage_opportunity_datefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser8 = new JSONParser();
						Object innerObj8 = innerparser8.parse(hs_lifecyclestage_opportunity_datefull);
						JSONObject jInnerObj8 = (JSONObject) innerObj8;
						if(jInnerObj8.containsKey("value")) {
							hs_lifecyclestage_opportunity_date = jInnerObj8.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lead_score_sales_force_")) {
						String lead_score_sales_force_full = jobj2.get("lead_score_sales_force_").toString();
						JSONParser innerparser9 = new JSONParser();
						Object innerObj9 = innerparser9.parse(lead_score_sales_force_full);
						JSONObject jInnerObj9 = (JSONObject) innerObj9;
						if(jInnerObj9.containsKey("value")) {
							lead_score_sales_force_ = jInnerObj9.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("mis_assigned")) {
						String mis_assignedfull = jobj2.get("mis_assigned").toString();
						JSONParser innerparser10 = new JSONParser();
						Object innerObj10 = innerparser10.parse(mis_assignedfull);
						JSONObject jInnerObj10 = (JSONObject) innerObj10;
						if(jInnerObj10.containsKey("value")) {
							mis_assigned = jInnerObj10.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("priority_segment")) {
						String priority_segmentfull = jobj2.get("priority_segment").toString();
						JSONParser innerparser11 = new JSONParser();
						Object innerObj11 = innerparser11.parse(priority_segmentfull);
						JSONObject jInnerObj11 = (JSONObject) innerObj11;
						if(jInnerObj11.containsKey("value")) {
							priority_segment = jInnerObj11.get("value").toString();
						}
					}

				}
				Data_List636 = Data_List636 + "{\"vid\":\""+vid+"\",\"addedAt\":\""+addedAt+"\",\"email\":\""+email+"\",\"firstname\":\""+firstname+"\",\"lastname\":\""+lastname+"\",\"company\":\""+company+"\",\"hs_analytics_last_visit_timestamp\":\""+hs_analytics_last_visit_timestamp+"\",\"recent_conversion_event_name\":\""+recent_conversion_event_name+"\",\"lifecyclestage\":\""+lifecyclestage+"\",\"hs_lifecyclestage_opportunity_date\":\""+hs_lifecyclestage_opportunity_date+"\",\"lead_score_sales_force_\":\""+lead_score_sales_force_+"\",\"mis_assigned\":\""+mis_assigned+"\",\"priority_segment\":\""+priority_segment+"\"},";
				
			}
			
			if(json.containsKey("has-more")) {
				boolean hasmore = Boolean.valueOf(json.get("has-more").toString());
				if(hasmore == true) {
					Long vidOffset = (Long)json.get("vid-offset");
					String ExtendedEndPoint = EndPoint.concat("&vidOffset="+vidOffset);				
					HubSpotList636_NextPages(ExtendedEndPoint);
				}
			}
			
			if(Data_List636.length() > 0) {
				Data_List636 = Data_List636.substring(0, Data_List636.length()-1);
				Data_List636 = "{\"ContactList\":{\"Contact\":["+Data_List636+"]}}";
			}
			
		} catch(Exception e) {
			//System.out.println("Exception Found In Method - HubSpotList636_Data: "+e);
			e.printStackTrace();
		}
	}
	
	public static void HubSpotList636_NextPages(String ExtendedURL) {
		String vid = "", addedAt = "", properties = "", email = "", firstname = "", lastname = "", company = "", hs_analytics_last_visit_timestamp = "", recent_conversion_event_name = "", lifecyclestage = "", hs_lifecyclestage_opportunity_date = "", lead_score_sales_force_ = "", mis_assigned = "", priority_segment = "";
		try {
			String EndPoint = ExtendedURL;
			URL obj = new URL(EndPoint);
			URLConnection conn = obj.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection)conn;
			httpConn.setRequestMethod("GET");
			httpConn.setRequestProperty("Content-Type", "application/json");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			InputStreamReader isr =	new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);	
			StringBuilder sb = new StringBuilder();
			
						
			String line = "";
			while((line=in.readLine())!=null) {
				sb.append(line);
			}
			
			JSONParser parser = new JSONParser();
			Object jsonobject = parser.parse(sb.toString());
			JSONObject json = (JSONObject)jsonobject;
			JSONArray jArray = (JSONArray) json.get("contacts");		
			
			for(int tmpIterator = 0; tmpIterator < jArray.size(); tmpIterator++) {
				JSONObject jobj1 = (JSONObject) jArray.get(tmpIterator);
				
				if(jobj1.containsKey("vid")) {
					vid = jobj1.get("vid").toString();
				}
								
				if(jobj1.containsKey("addedAt")) {
					addedAt = jobj1.get("addedAt").toString();
				}
				
				if(jobj1.containsKey("properties")) {
					properties = jobj1.get("properties").toString();
					
					JSONParser parser2 = new JSONParser();
					Object obj1 = parser2.parse(properties);
					JSONObject jobj2 = (JSONObject) obj1;
					
					if(jobj2.containsKey("email")) {
						String emailfull = jobj2.get("email").toString();
						JSONParser innerparser1 = new JSONParser();
						Object innerObj1 = innerparser1.parse(emailfull);
						JSONObject jInnerObj1 = (JSONObject) innerObj1;
						if(jInnerObj1.containsKey("value")) {
							email = jInnerObj1.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("firstname")) {
						String firstnamefull = jobj2.get("firstname").toString();
						JSONParser innerparser2 = new JSONParser();
						Object innerObj2 = innerparser2.parse(firstnamefull);
						JSONObject jInnerObj2 = (JSONObject) innerObj2;
						if(jInnerObj2.containsKey("value")) {
							firstname = jInnerObj2.get("value").toString();
						}			
					}
					
					if(jobj2.containsKey("lastname")) {
						String lastnamefull = jobj2.get("lastname").toString();
						JSONParser innerparser3 = new JSONParser();
						Object innerObj3 = innerparser3.parse(lastnamefull);
						JSONObject jInnerObj3 = (JSONObject) innerObj3;
						if(jInnerObj3.containsKey("value")) {
							lastname = jInnerObj3.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("company")) {
						String companyfull = jobj2.get("company").toString();
						JSONParser innerparser4 = new JSONParser();
						Object innerObj4 = innerparser4.parse(companyfull);
						JSONObject jInnerObj4 = (JSONObject) innerObj4;
						if(jInnerObj4.containsKey("value")) {
							company = jInnerObj4.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("hs_analytics_last_visit_timestamp")) {
						String hs_analytics_last_visit_timestampfull = jobj2.get("hs_analytics_last_visit_timestamp").toString();
						JSONParser innerparser5 = new JSONParser();
						Object innerObj5 = innerparser5.parse(hs_analytics_last_visit_timestampfull);
						JSONObject jInnerObj5 = (JSONObject) innerObj5;
						if(jInnerObj5.containsKey("value")) {
							hs_analytics_last_visit_timestamp = jInnerObj5.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("recent_conversion_event_name")) {
						String recent_conversion_event_namefull = jobj2.get("recent_conversion_event_name").toString();
						JSONParser innerparser6 = new JSONParser();
						Object innerObj6 = innerparser6.parse(recent_conversion_event_namefull);
						JSONObject jInnerObj6 = (JSONObject) innerObj6;
						if(jInnerObj6.containsKey("value")) {
							recent_conversion_event_name = jInnerObj6.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lifecyclestage")) {
						String lifecyclestagefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser7 = new JSONParser();
						Object innerObj7 = innerparser7.parse(lifecyclestagefull);
						JSONObject jInnerObj7 = (JSONObject) innerObj7;
						if(jInnerObj7.containsKey("value")) {
							lifecyclestage = jInnerObj7.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("hs_lifecyclestage_opportunity_date")) {
						String hs_lifecyclestage_opportunity_datefull = jobj2.get("lifecyclestage").toString();
						JSONParser innerparser8 = new JSONParser();
						Object innerObj8 = innerparser8.parse(hs_lifecyclestage_opportunity_datefull);
						JSONObject jInnerObj8 = (JSONObject) innerObj8;
						if(jInnerObj8.containsKey("value")) {
							hs_lifecyclestage_opportunity_date = jInnerObj8.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("lead_score_sales_force_")) {
						String lead_score_sales_force_full = jobj2.get("lead_score_sales_force_").toString();
						JSONParser innerparser9 = new JSONParser();
						Object innerObj9 = innerparser9.parse(lead_score_sales_force_full);
						JSONObject jInnerObj9 = (JSONObject) innerObj9;
						if(jInnerObj9.containsKey("value")) {
							lead_score_sales_force_ = jInnerObj9.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("mis_assigned")) {
						String mis_assignedfull = jobj2.get("mis_assigned").toString();
						JSONParser innerparser10 = new JSONParser();
						Object innerObj10 = innerparser10.parse(mis_assignedfull);
						JSONObject jInnerObj10 = (JSONObject) innerObj10;
						if(jInnerObj10.containsKey("value")) {
							mis_assigned = jInnerObj10.get("value").toString();
						}
					}
					
					if(jobj2.containsKey("priority_segment")) {
						String priority_segmentfull = jobj2.get("priority_segment").toString();
						JSONParser innerparser11 = new JSONParser();
						Object innerObj11 = innerparser11.parse(priority_segmentfull);
						JSONObject jInnerObj11 = (JSONObject) innerObj11;
						if(jInnerObj11.containsKey("value")) {
							priority_segment = jInnerObj11.get("value").toString();
						}
					}

				}
				Data_List636 = Data_List636 + "{\"vid\":\""+vid+"\",\"addedAt\":\""+addedAt+"\",\"email\":\""+email+"\",\"firstname\":\""+firstname+"\",\"lastname\":\""+lastname+"\",\"company\":\""+company+"\",\"hs_analytics_last_visit_timestamp\":\""+hs_analytics_last_visit_timestamp+"\",\"recent_conversion_event_name\":\""+recent_conversion_event_name+"\",\"lifecyclestage\":\""+lifecyclestage+"\",\"hs_lifecyclestage_opportunity_date\":\""+hs_lifecyclestage_opportunity_date+"\",\"lead_score_sales_force_\":\""+lead_score_sales_force_+"\",\"mis_assigned\":\""+mis_assigned+"\",\"priority_segment\":\""+priority_segment+"\"},";
				
			}
			
			if(json.containsKey("has-more")) {
				boolean hasmore = Boolean.valueOf(json.get("has-more").toString());
				if(hasmore == true) {
					Long vidOffset = (Long)json.get("vid-offset");
					EndPoint = "https://api.hubapi.com/contacts/v1/lists/636/contacts/all?hapikey=27878313-73f3-4c3f-bae8-931656454b20&count=100&property=email&property=firstname&property=lastname&property=company&property=hs_analytics_last_visit_timestamp&property=recent_conversion_event_name&property=lifecyclestage&property=hs_lifecyclestage_opportunity_date&property=lead_score_sales_force_&property=mis_assigned&property=priority_segment";
					String ExtendedEndPoint = EndPoint.concat("&vidOffset="+vidOffset);				
					HubSpotList636_NextPages(ExtendedEndPoint);
				}
			}
						
		} catch(Exception e) {
			//System.out.println("Exception Found In Method - HubSpotList636_NextPages: "+e);
			e.printStackTrace();
		}
	}	
}