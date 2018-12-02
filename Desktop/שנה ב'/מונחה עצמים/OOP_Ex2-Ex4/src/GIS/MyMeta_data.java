package GIS;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import GIS.Meta_data;
import Geom.Point3D;




public class MyMeta_data implements Meta_data 
{
	private String SSID;
	private String MAC;
	private String Channel;
	private String RSSI;
	private String Type;
	private String Capabilities;
	
	private long duration = (4 * 60 * 60 * 1000);
    String [] data = null;
	
	@Override
	public long getUTC()
	{
	String time= this.data[3];
	
	SimpleDateFormat newDate = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
	java.util.Date date;
	
	try {
		date=newDate.parse(time);
		long timeUtc = duration+date.getTime();
		return timeUtc;
	}
	catch (ParseException e) 
	{
		e.printStackTrace();
	}
	
	//timeUtc= (date.format(new Date(duration - TimeZone.getDefault().getRawOffset())));
	//SimpleDateFormat date = new SimpleDateFormat("yyyy-dd-MM hh:mm:ss");

     return 0;
	}
	
	public String GetSSID() 
	{
		return this.SSID;
	}

	@Override
	public Point3D get_Orientation() 
	{
		
		return null;
	}
	
	public String getType() 
	{
		return this.Type;
	}

	public String getMAC() {
		return this.MAC;
	}
	
	public String getChannel() {
		return this.Channel;
	}

	public String getRSSI() {
		return this.RSSI;
	}
	
	public String getCapabilities() 
	{
		return this.Capabilities;
	}
	
	@Override
	public String toString() 
	{
		
		String strData="";
		strData+= "MAC:" + data[1] + "Capabilities:" + data[2]+ "time:"+ getUTC()
				+ "Channel:"+ data[4] + "RSSI:"+ data[5] +"Type:" + data[10] ;
		
		return strData;
	}

	

	

	

	

}
