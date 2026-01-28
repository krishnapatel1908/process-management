/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testexample;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 *
 * @author patel
 */
public class CurrencyConverter {
     public double convertUsdToCad(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        try {
            URL url = new URL("https://open.er-api.com/v6/latest/usd");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(conn.getInputStream()));

            StringBuilder json = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
            reader.close();

            // Very simple parsing (acceptable for ICE)
            String marker = "\"CAD\":";
            int index = json.indexOf(marker);
            int start = index + marker.length();
            int end = json.indexOf(",", start);

            double cadRate =
                    Double.parseDouble(json.substring(start, end));

            return amount * cadRate;

        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch exchange rate", e);
        }
    }

    double convert(double d, String usd, String cad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
