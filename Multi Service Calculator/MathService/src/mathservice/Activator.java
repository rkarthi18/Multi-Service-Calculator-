package mathservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

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
	System.out.println("Mathservice starting");
	
	this.registryMathService();
	
	System.out.println("OSGi MathService Started");
	
	}

	 private void registryMathService() {
	       MathService service = new MatheServiceImpl();
	       context.registerService(MathService.class, service, null);
	   }
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("OSGi MathService Stopped!");
	}

}
