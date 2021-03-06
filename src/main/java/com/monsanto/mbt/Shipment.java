package com.monsanto.mbt;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shipment {

	public static void main(String[] args){
		
		// Sort by Color : 
		System.out.println("SN\tColor\tProductionDate");
		
		List<Widget> widgetList = WidgetUtils.getSampleWidgets();
		Collections.sort(widgetList, new SortByColor());
		int count = 1;
		for(Widget widget : widgetList){
			System.out.println(widget.getSerialNumber()+ "\t"+ widget.getColor()+ "\t"+ widget.getProductionDate());
			count++;
			if (count > 10) {
				break;
			}
		}
		
		//Sort By Production Date :
		System.out.println("=================================================");
		System.out.println("SN\tColor\tProductionDate");
		
		List<Widget> widgetList1 = WidgetUtils.getSampleWidgets();
		Collections.sort(widgetList1, new SortByDate());
		count = 1 ;
		for (Widget widget : widgetList1) {
			System.out.println(widget.getSerialNumber() + "\t" + widget.getColor() + "\t" + widget.getProductionDate());
			count++;
			if (count > 10) {
				break;
			}
		}
		
		/*System.out.println("=================================================");
		System.out.println("SN\tColor\tProductionDate");
		
		List<Widget> list = WidgetUtils.getSampleWidgets();
		
		Collections.sort(list, new Comparator<Widget>() {

			public int compare(Widget o1, Widget o2) {
				
				return o1.getProductionDate().compareTo(o2.getProductionDate());
			}
		});
		count = 1;
		for (Widget widget : list) {
			System.out.println(widget.getSerialNumber() + "\t" + widget.getColor() + "\t" + widget.getProductionDate());
			count++;
			if (count > 10) {
				break;
			}
			
		}*/
		
	}
	
}
