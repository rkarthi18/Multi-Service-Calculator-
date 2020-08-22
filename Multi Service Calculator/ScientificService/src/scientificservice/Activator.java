package scientificservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.sliit.sa.implementations.ScientificImplementations;
import com.sliit.sa.interfaces.ScientificInterfaces;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		this.registerScientificService();
		System.out.println("Scientific Calculator Service Started");
	}
	
	private void registerScientificService() {
		ScientificInterfaces scientific_service = new ScientificImplementations();
		context.registerService(ScientificInterfaces.class, scientific_service, null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Scientific Calculator Service Stopped");
	}

}
