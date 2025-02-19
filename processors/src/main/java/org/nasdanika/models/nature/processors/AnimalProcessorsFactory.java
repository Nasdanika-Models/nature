package org.nasdanika.models.nature.processors;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EmfUtil.EModelElementDocumentation;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EAttributeNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EGenericTypeNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EOperationNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EOperationNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EParameterNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EParameterNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.ETypeParameterBoundNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.ETypeParameterNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.ETypeParameterNodeProcessorFactory;
import org.nasdanika.models.nature.NaturePackage;

@EClassifierNodeProcessorFactory(classifierID = NaturePackage.ANIMAL)
public class AnimalProcessorsFactory {
	private Context context;
	
	public AnimalProcessorsFactory(Context context) {
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
			label = "Животное",
			description = "Животные относятся к эукариотам (в клетках имеются ядра). Классическими признаками животных считаются: гетеротрофность (питание готовыми органическими соединениями) и способность активно передвигаться."
	)
	public EClassNodeProcessor createAnimalProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object obj, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(obj, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}			
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = NaturePackage.eNS_URI,
			classID = NaturePackage.ANIMAL,
			featureID = NaturePackage.ANIMAL__NAME,
			label = "Имя",
			description = "Имя животного, например 'Мурзик'",
			documentation = "Test of attribute documentation"
	)
	public EAttributeNodeProcessor createAnimalNameProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object obj, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(obj, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
			@Override
			public String getLoadDescription() {
				return "Some description for animal name load";
			}
			
			@Override
			protected EModelElementDocumentation getLoadDocumentation() {
				return new EModelElementDocumentation("""
						Some ``documentation``:
						
						```yaml
						key: value
						```
						
						""", 
						Util.createClassURI(getClass()));
			}
			
		};
	}
	
	@EOperationNodeProcessorFactory(
			nsURI = NaturePackage.eNS_URI,
			classID = NaturePackage.ANIMAL,
			operationID = NaturePackage.ANIMAL___EATS__FOOD,
			label = "Ест",
			documentation = "Test of operation documentation"
	)
	public EOperationNodeProcessor createAnimalEatsProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		
//		throw new NasdanikaException("Pizdec");
		
		return new EOperationNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object obj, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(obj, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EParameterNodeProcessorFactory(
			nsURI = NaturePackage.eNS_URI,
			classID = NaturePackage.ANIMAL,
			operationID = NaturePackage.ANIMAL___EATS__FOOD,
			name = "food",
			label = "пища",
			description = "Food which animal eats",
			documentation = "Test of parameter documentation"
	)
	public EParameterNodeProcessor createAnimalEatsFoodProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EParameterNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object obj, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(obj, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@ETypeParameterNodeProcessorFactory(
			name = "F",
			label = "Пища",
			description = "Food which animal eats",
			documentation = "Test of type parameter documentation"
	)
	public ETypeParameterNodeProcessor createAnimalFoodTypeParameterProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new ETypeParameterNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object obj, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(obj, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@ETypeParameterBoundNodeProcessorFactory(
			typeParameterName = "F",
			label = "Hmmm",
			description = "Hmmm description",
			documentation = "Hmm documentation"
	)
	public EGenericTypeNodeProcessor createAnimalFoodTypeParameterBoundProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {			
		return new EGenericTypeNodeProcessor(config, context, prototypeProvider) {
			
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
