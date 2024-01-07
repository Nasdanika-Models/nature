module org.nasdanika.models.nature.processors {
		
	requires transitive org.nasdanika.models.nature;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.nature.processors;
	opens org.nasdanika.models.nature.processors; // For loading resources
	
}
