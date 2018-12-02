package GIS;

import Geom.Geom_element;
import Geom.Point3D;
import Coords.MyCoords;
import Coords.coords_converter;
import Geom.Geom_element;

import java.sql.Timestamp;

import javax.xml.crypto.Data;
import File_Format.CSVReader;
import Algorithms.MultiCSV;

public class MyGIS_element implements GIS_element {
	
	private Point3D geom;
	private Meta_data data;
	//private String Timestamp;
	
	public MyGIS_element(GIS_element [] stringsOfGisElem) 
	{
		
	   for (int i =0; i < stringsOfGisElem.length; i++) 
	  {
		   GIS_element Timestamp= stringsOfGisElem[2];
	  }
	   
	}

	
	@Override
	public Geom_element getGeom()
	{
		
		return this.geom;
	}

	@Override
	public Meta_data getData() 
	{
		return this.data;
	}
	
	@Override
	public void translate(Point3D vec)
	{
		geom=(new MyCoords().add(geom,vec));
	}

}
