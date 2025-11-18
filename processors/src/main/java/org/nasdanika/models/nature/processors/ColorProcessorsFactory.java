package org.nasdanika.models.nature.processors;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EEnumLiteralNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EEnumLiteralNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EEnumNodeProcessor;
import org.nasdanika.models.nature.NaturePackage;

@EClassifierNodeProcessorFactory(classifierID = NaturePackage.COLOR)
public class ColorProcessorsFactory {
	
	private Context context;
	
	public ColorProcessorsFactory(Context context) {
		this.context = context;
	}
		
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EClassifierNodeProcessorFactory(
			label = "Цвет",
			description = "Цвет животного"
	)
	public EEnumNodeProcessor createColorProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EEnumNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object obj, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(obj, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}			
			
		};
	}
	
	@EEnumLiteralNodeProcessorFactory(
			literal = "White",
			label = "Белый",
			description = "White color",
			documentation = "Test of enum literal"
	)
	public EEnumLiteralNodeProcessor createWhiteColorProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EEnumLiteralNodeProcessor(config, context, prototypeProvider) {
			
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
