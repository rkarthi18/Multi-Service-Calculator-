package discountbonuscalservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


import com.sliit.sa.implementations.SpecialOfferCalculation;
import com.sliit.sa.interfaces.SpecialOfferService;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		System.out.println("Register service SepcialOfferService");
		
		//exposing the services
		this.registerSpecialOffer();
		
		System.out.println("OSGI ShapeService started");
	}

	//Registering the service for special offers
	public void registerSpecialOffer() {		
		SpecialOfferService serviceSpecialOffers = new SpecialOfferCalculation();
		context.registerService(SpecialOfferService.class, serviceSpecialOffers, null);
	}
		
		
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
