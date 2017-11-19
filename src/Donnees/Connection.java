package Donnees;

import Modeles.Proximite;
import Modeles.Temperature;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Connection extends Thread  {
    private boolean fini;

    @Override
    public synchronized void start() {
        super.start();
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        try {
            URL url = new URL("http://127.0.0.1/proximite/liste");
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream stream = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(stream));

            StringBuffer buffer = new StringBuffer();
            String line = "";
            while((line = reader.readLine()) != null){
                buffer.append(line);
            }

            DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            org.w3c.dom.Document document = parser.parse(new StringBufferInputStream(buffer.toString()));

            NodeList listeValeur = document.getElementsByTagName("proximite");
            ProximiteDAO.getInstance().nettoyerListe();
            for (int positon = 0; positon < listeValeur.getLength(); positon++) {
                Node noeudValeur = listeValeur.item(positon);
                if(noeudValeur.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element)noeudValeur;
                    String valeur = getProximiteAttribut(element, "valeur");
                    String date = getProximiteAttribut(element, "date");
                    ProximiteDAO.getInstance().ajouterDansListeProximite(new Proximite(Float.parseFloat(valeur), date));
                }
            }


            fini = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            URL url = new URL("http://127.0.0.1/temperature/liste");
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream stream = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(stream));

            StringBuffer buffer = new StringBuffer();
            String line = "";
            while((line = reader.readLine()) != null){
                buffer.append(line);
            }

            DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            org.w3c.dom.Document document = parser.parse(new StringBufferInputStream(buffer.toString()));

            NodeList listeValeur = document.getElementsByTagName("temperature");
            TemperatureDAO.getInstance().nettoyerListe();
            for (int positon = 0; positon < listeValeur.getLength(); positon++) {
                Node noeudValeur = listeValeur.item(positon);
                if(noeudValeur.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element)noeudValeur;
                    String degres = getProximiteAttribut(element, "degres");
                    String date = getProximiteAttribut(element, "date");
                    TemperatureDAO.getInstance().ajouterDansListeTemperature(new Temperature(Float.parseFloat(degres), date));
                }
            }


            fini = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isInterrupted() {
        System.out.println("Ayé yé fini");
        return super.isInterrupted();
    }

    private String getInfoXML(String xml, String valeur){
        return (xml.split("<" + valeur + ">")[1]).split("</" + valeur + ">")[0];
    }

    private String getProximiteAttribut(Element proximite, String balise){
        NodeList typeList = proximite.getElementsByTagName(balise);
        Element elementType = (Element)typeList.item(0);
        return elementType.getChildNodes().item(0).getNodeValue();
    }

    public boolean isFini() {
        return fini;
    }
}
