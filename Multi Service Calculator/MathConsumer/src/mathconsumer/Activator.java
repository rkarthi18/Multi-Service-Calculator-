package mathconsumer;

import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

import conversionservice.conversionService;
import mathservice.MathService;
import utils.MathUtils;

public class Activator implements BundleActivator {

	private static BundleContext context = null;
	private static ServiceTracker tracker_math = null;
	private static ServiceTracker tracker_conv =null;
	private static ServiceTracker tracker =null;
	private static MathService service_math;
	private static conversionService service_conv;
	private static test test;

//	static BundleContext getContext() {
//		return context;
//	}


	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		
		tracker_math= new ServiceTracker(context,MathService.class.getName() , null);
		tracker_conv = new ServiceTracker(context,conversionService.class.getName(), null);
		tracker_math.open();
		tracker_conv.open();
		
		
	System.out.println("MathConsumer Starting");
		test= new test();
	
    	JFrame frame = new 	JFrame("Enter the type of calculator");
    	frame.setTitle("Calculator Type");
    
    	
    	int type=1;
    	while (type!=0) {
    		type= Integer.parseInt(JOptionPane.showInputDialog(null,"Press 1 - MathService \n Press 2 - ConversionService \n Press 0 - Exit "));
        	System.out.println("Input is : " + type);
        	
        	if (type==1) {
//        		ServiceReference<?> serviceReference_math = context.getServiceReference(MathService.class);
//        		if(serviceReference_math==null) {
//        			JOptionPane.showMessageDialog(null, "Please Run the MathService", "Service Failure",JOptionPane.OK_OPTION );
//        			continue;
//        		}
        		
//        		service_math = (MathService) context .getService(serviceReference_math);
        		service_math= (MathService) tracker_math.getService(); 
        		
        		if (service_math==null) {
        			JOptionPane.showMessageDialog(null, "Please Run the MathService", "Service Failure",JOptionPane.OK_OPTION );
        			continue;
        		}
        		test.getMathserviceAndRun(service_math);
        		System.out.println("Caught MathService bundle");
        	}
        	
        	if (type==2) {
//        		ServiceReference<?> serviceReference = context.getServiceReference(conversionService.class);
//        		if(serviceReference==null) {
//        			JOptionPane.showMessageDialog(null, "Please Run the Conversion Service", "Service Failure",JOptionPane.OK_OPTION );
//        		}	
        		
        		
//        		service_conv = (conversionService) context.getService(serviceReference);
        		service_conv = (conversionService) tracker_conv.getService();
        		if (service_conv==null) {
        			JOptionPane.showMessageDialog(null, "Please Run the MathService", "Service Failure",JOptionPane.OK_OPTION );
        			continue;
        		}
        		
        			System.out.println("caught ConversionService Bundle");
        		test t1  = new test();
        		t1.getServiceAndPrintHi(service_conv);
        		
        	} 
    	}
    	
    			
	System.out.println("MathConsumer Started");
	}

	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	System.out.println("MathConsumer Stopped");
	}

}
