package model;

import entity.Penalty;
import entity.Student;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class GetJson {
    private static HashMap<Penalty, Student> mapPenalty;

    public static void main(String[] args) throws IOException, JSONException {


    }

    public static ArrayList<Student> getJson_to_XLM( ) throws IOException, JSONException {
        ArrayList<Student> list = new ArrayList<>();


        String url = "http://focusteam-api.tk/FPT/api/student.json";
        URL test = new URL(url);

        HttpURLConnection con = (HttpURLConnection) test.openConnection ();
        con.setRequestMethod ("GET");
        con.setRequestProperty ("User-Agrent", "Mozilla/5.0");
        int responseCode = con.getResponseCode ();
        System.out.println ("Demo :"+ url );

        BufferedReader in = new BufferedReader (new InputStreamReader (con.getInputStream () ));
        String inputLine = null;
        StringBuffer response = new StringBuffer ();
        while (( inputLine = in.readLine ()) != null){
            response.append (inputLine);
        }
        in.close ();

        JSONObject obj_JsonObject = new JSONObject (response.toString ());
        JSONArray obj_JsonAray = obj_JsonObject.getJSONArray ("student");

        for (int i = 0 ; i< obj_JsonAray.length (); i++){
            JSONObject obj_JsonObject3 = obj_JsonAray.getJSONObject (i);
            System.out.println (i+1);
            System.out.println (obj_JsonObject3.getString ("name") );

            String rollNumber = obj_JsonObject3.getString ("rollNumber");
            String name = obj_JsonObject3.getString ("name");
            String email = obj_JsonObject3.getString ("email");
            String phone = obj_JsonObject3.getString ("phone");
            int status = obj_JsonObject3.getInt ("status");
            Student product = new Student (rollNumber, name, email,phone,status);
            list.add (product);

        }
        return list;
    }
    public static void test() throws IOException, JSONException {
        ArrayList<Student> products = getJson_to_XLM ( );
        Student p = new Student ( );
        for (int i = 0; i < products.size ( ); i++) {
            System.out.println (i + 1);
            System.out.println (products.get (i).getEmail ( ));
        }
    }

}

