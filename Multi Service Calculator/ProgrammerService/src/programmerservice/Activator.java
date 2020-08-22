package programmerservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.sliit.sa.implementations.ProgrammerImplementations;
import com.sliit.sa.interfaces.ProgrammerInterfaces;

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
		this.registerProgrammerService();
		System.out.println("Programmer Calculator Service Started");
	}
	
	public void registerProgrammerService() {
		ProgrammerInterfaces program_service = new ProgrammerImplementations();
		context.registerService(ProgrammerInterfaces.class, program_service, null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Programmer Calculator Service Stopped");
	}

}
