package com.skilrock.springsDemo;

import java.util.List;

public class Geometry {
	
	private List<Coordinate> coordinateList;
	
	
	public List<Coordinate> getCoordinateList() {
		return coordinateList;
	}


	public void setCoordinateList(List<Coordinate> coordinateList) {
		this.coordinateList = coordinateList;
	}


	public void drawGraph(){
		
		for(Coordinate coordinate : coordinateList){
			System.out.println("Coordinates : ("+coordinate.getX()+","+coordinate.getY()+","+coordinate.getZ()+")");
		}
	}

}
