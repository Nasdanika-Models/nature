package org.nasdanika.models.nature.processors;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.nature.NaturePackage;

@EPackageNodeProcessorFactory(nsURI = NaturePackage.eNS_URI)
public class EcoreGenNatureProcessorsFactory {

	private Context context = Context.EMPTY_CONTEXT; // TODO - from constructor	

	@Factory
	public final AnimalProcessorsFactory animalProcessorsFactory;

	@Factory
	public final ColorProcessorsFactory colorProcessorsFactory;

	@Factory
	public final FoxProcessorsFactory foxProcessorsFactory;
	
	public EcoreGenNatureProcessorsFactory(Context context) {
		animalProcessorsFactory = new AnimalProcessorsFactory(context);
		colorProcessorsFactory = new ColorProcessorsFactory(context);
		foxProcessorsFactory = new FoxProcessorsFactory(context);
	}
	
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EPackageNodeProcessorFactory(
			label = "Nature", // Not needed here because defaults to "Nature", just for demonstration 
			icon = "https://img.icons8.com/fluency/40/afternoon.png",
			description = "My description",
			documentation =  """
				# Look at this!
				
				```drawio-resource
				aws.drawio
				```
						
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object obj, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(obj, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
