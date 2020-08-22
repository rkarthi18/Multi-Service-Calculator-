package shapecalculatorservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.sliit.sa.factory.ShapeFactory;
import com.sliit.sa.factory.SolidShapeFactory;
import com.sliit.sa.interfaces.FactoryService;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		System.out.println("Register service ShapeService");
		
		//exposing the services
		this.registerShapeService();
		this.registerSolidShapeService();
		
		System.out.println("OSGI ShapeService started");
	}

	//Registering the service for flat shapes
	public void registerShapeService() {
		
		FactoryService serviceFactory = new ShapeFactory();
		context.registerService(FactoryService.class, serviceFactory, null);
	
	}
	
	//Registering the service for flat shapes
	public void registerSolidShapeService() {
		
		FactoryService serviceFactory = new SolidShapeFactory();
		context.registerService(FactoryService.class, serviceFactory, null);
	
	}
	
//	public void registerShapeService() {
//		
//		ShapeFactory serviceFactory = new ShapeFactory();
//		context.registerService(ShapeFactory.class, serviceFactory, null);
//	
//	}
//	
//	public void registerSolidShapeService() {
//		
//		SolidShapeFactory serviceFactory = new SolidShapeFactory();
//		context.registerService(SolidShapeFactory.class, serviceFactory, null);
//	
//	}
	
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("OSGI ShapeService stopped");
	}

}
