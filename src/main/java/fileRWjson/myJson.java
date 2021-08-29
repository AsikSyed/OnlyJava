package fileRWjson;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class myJson {
    public static void main(String[] args) throws IOException, ParseException {

        //writeJson();
        readJson();

    }
    public static void writeJson() throws IOException {
        JSONObject jsob= new JSONObject();
        jsob.put("name","Myself Asik Syed");
        jsob.put("Age","27");
        jsob.put("Designation","Software Engineer is my designation");
        JSONObject addobj = new JSONObject();
        addobj.put("Area","Basundhara");
        addobj.put("Postal code","1200");
        addobj.put("City","Dhaka");
        jsob.put("address",addobj);
        //System.out.println(jsob);
        FileWriter fR = new FileWriter("myInfo.json");
        fR.write(jsob.toJSONString());
        fR.flush();
        fR.close();
    }
    public static void readJson() throws IOException, ParseException {
        JSONParser jparser= new JSONParser();
        Object obj = jparser.parse(new FileReader("myInfo.json"));
        JSONObject jsob = (JSONObject) obj;
       // System.out.println(jsob);
        String name= (String) jsob.get("name");
        System.out.println(name);
        String age= (String) jsob.get("Age");
        System.out.println(age);
        String designation = (String) jsob.get("Designation");
        System.out.println(designation);
        JSONObject addressObj = (JSONObject) jsob.get("address");
        String area=(String) addressObj.get("Area");
        System.out.println(area);
        String city=(String) addressObj.get("City");
        System.out.println(city);
        String pc= (String) addressObj .get("Postal code");
        System.out.println(pc);
        String present_address=(String) addressObj.get("present_address");
        System.out.println(present_address);
    }
}
