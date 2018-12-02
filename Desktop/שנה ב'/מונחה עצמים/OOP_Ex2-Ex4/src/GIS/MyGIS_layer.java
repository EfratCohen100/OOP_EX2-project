package GIS;

import java.util.ArrayList;
import Algorithms.MultiCSV;
import File_Format.CSVReader;
import Geom.Geom_element;
import Geom.Point3D;
	
	public class MyGIS_layer extends ArrayList<GIS_element> implements GIS_layer
	
	{
		private static final long serialVersionUID = 1L;
		private String file;
		
		@Override
		public Meta_data get_Meta_data() 
		{
			long timeUtc=this.get(3).getData().getUTC();
			GIS_element gElem = this.get(3);
			
			return gElem.getData();

		}
		void BuildLayer(String csvFileName)
		{
			ArrayList<String[]> arr = CSVReader.ReadFile(csvFileName);
			for (String[] stringsOfGisElem : arr) {
				//this.add(new MyGIS_element(stringsOfGisElem));
				
				
			}
		}
		
}
