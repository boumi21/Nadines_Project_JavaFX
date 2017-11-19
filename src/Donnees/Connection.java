package Donnees;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Connection extends Thread  {
    @Override
    public synchronized void start() {
        super.start();
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        try {
            URL url = new URL("http://127.0.0.1/proximite/");
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream stream = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(stream));

            StringBuffer buffer = new StringBuffer();
            String line = "";
            while((line = reader.readLine()) != null){
                buffer.append(line);
            }

            System.out.println(buffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
