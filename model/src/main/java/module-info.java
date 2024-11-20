import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.nature.util.NatureEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.nature {
		
	requires transitive org.eclipse.emf.common;
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.nasdanika.emf;
	
	exports org.nasdanika.models.nature;	
	exports org.nasdanika.models.nature.util;
	
	provides CapabilityFactory with NatureEPackageResourceSetCapabilityFactory;
	
}
