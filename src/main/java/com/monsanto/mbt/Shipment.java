package com.monsanto.mbt;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Shipment {

	public static void main(String[] args){
		
		// Sort by Color : 
		System.out.println("SN\tColor\tProductionDate");
		
		List<Widget> widgetList = WidgetUtils.getSampleWidgets();
		Collections.sort(widgetList, new SortByColor());
		for(Widget widget : widgetList){
			System.out.println(widget.getSerialNumber()+ "\t"+ widget.getColor()+ "\t"+ widget.getProductionDate());
		}
		
		//Sort By Production Date :
		System.out.println("=================================================");
		System.out.println("SN\tColor\tProductionDate");
		
		List<Widget> widgetList1 = WidgetUtils.getSampleWidgets();
		Collections.sort(widgetList1, new SortByDate());
		for(Widget widget : widgetList){
			System.out.println(widget.getSerialNumber()+ "\t"+ widget.getColor()+ "\t"+ widget.getProductionDate());
		}
	}
	
}
