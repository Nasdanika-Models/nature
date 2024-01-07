package org.nasdanika.models.nature.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.common.Context;
import org.nasdanika.emf.persistence.ObjectLoaderExecutionParticipant;
import org.nasdanika.models.nature.NaturePackage;

/**
 * Registers {@link AppPackage}
 * @author Pavel
 *
 */
public abstract class NatureObjectLoaderExecutionParticipant extends ObjectLoaderExecutionParticipant {

	public NatureObjectLoaderExecutionParticipant(Context context) {
		super(context);
	}

	@Override
	protected Collection<EPackage> getEPackages() {
		Collection<EPackage> ret = new ArrayList<>(); 
		ret.add(NaturePackage.eINSTANCE);
		return ret;
	}
	
}
