/*
 14. Write a program to generate NoSuchMethodException.
 --------------------------------------------------------
 */


package JALA_Technologies_14;


	import java.io.*;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.net.URLConnection;

	public class Main {
	public static String address;
	public static String celebfilename;
	public static String pagesource;

	public static void Calculate() throws MalformedURLException {

	      URL url1 = new URL(address) ;
	    URLConnection connection1 = null;
	    try {
	        connection1 = url1.openConnection();
	    } catch (IOException e) {
	        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
	    }
	    BufferedReader br = null;
	    try {
	        br = new BufferedReader(
	                new InputStreamReader(connection1.getInputStream()));
	    } catch (IOException e) {
	        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
	    }
	    String fileName = "C:\\Users\\Dell\\Documents\\"+"pagesource"+".txt";
	    File file = new File(fileName);

	    if (!file.exists()) {
	        try {
	            file.createNewFile();
	        } catch (IOException e) {
	            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
	        }
	    }

	    FileWriter fw = null;
	    try {
	        fw = new FileWriter(fileName);
	    } catch (IOException e) {
	        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
	    }
	    BufferedWriter bw = new BufferedWriter(fw);

	    String textreader;
	    try {
	        while ((textreader = br.readLine()) != null) {
	            bw.write(textreader);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
	    }


	 }

	 public static void seturl(String addressname){

	   address = addressname;
	}

	 public static void settextfilename(String celebfilename1){
	   celebfilename = celebfilename1;
	}


	 public static void setpagesource(String pagesourcename){
	    pagesource = pagesourcename;
	 }
	 }