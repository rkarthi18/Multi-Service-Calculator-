package com.sliit.sa.interfaces;

public interface FactoryService {

	public ShapeService getShape(String shapeType);
	public SolidShapeService getSolidShape(String solidShapeType);
	
}
