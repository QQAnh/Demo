package model;

import entity.Penalty;
import entity.Student;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Scanner;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class Connection {
    public static class ReadFileXml {

        public static Document readFileXml(String fileXml) {
            Document document = null;
            File file = new File(fileXml);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder;
            try {
                documentBuilder = documentBuilderFactory.newDocumentBuilder();
                document = documentBuilder.parse(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return document;
        }


        private static HashMap<Penalty, Student> mapPenalty;

        public String parseStringFromUrl(String url) {
            return url;
        }


        public static class HttpURLConnectionExample {

            private final String USER_AGENT = "Mozilla/5.0";

            public static void main(String[] args) throws Exception {

                HttpURLConnectionExample http = new HttpURLConnectionExample();

                System.out.println("Testing 1 - Send Http GET request");
                http.sendGet();


            }

            // HTTP GET request
            private void sendGet() throws Exception {


                String url = "https://too-late-to-apologize.appspot.com/_api/v1/users/";

                URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();

                // optional default is GET
                con.setRequestMethod("GET");

                //add request header
                con.setRequestProperty("User-Agent", USER_AGENT);

                int responseCode = con.getResponseCode();
                System.out.println("\nSending 'GET' request to URL : " + url);
                System.out.println("Response Code : " + responseCode);

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println(response.toString());

                System.out.println("============================================================");
                StringBuilder jsonObj = new StringBuilder("");


                JSONObject json = new JSONObject(response.toString());
                String xml = XML.toString(json);

                System.out.println(xml);
//            FileOutputStream fos = new FileOutputStream("/Users/Quynh_Anh/IdeaProjects/Chart/src/vidu.txt");
//            FileOutputStream fout = null;
//            OutputStreamWriter out = null;


                try (OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("/Users/Quynh_Anh/IdeaProjects/Chart/src/vidu.xml"), "UTF-8");) {
                    out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
                    out.write("<data>");
                    out.write(xml);
                    out.write("</data>");

                } catch (IOException e) {
                    e.printStackTrace();
                }
                Document document = ReadFileXml.readFileXml("/Users/Quynh_Anh/IdeaProjects/Chart/src/vidu.xml");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập Id : ");
                int id = scanner.nextInt();
                scanner.nextLine();

                String packageName = document.getElementsByTagName("name").item(id).getTextContent();


                System.out.println(packageName);




            }
        }

    }
}


