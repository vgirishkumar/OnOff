package com.visteon.onoff.coom.design;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import com.visteon.onoff.coom.ComponentOnOffManifest;
import com.visteon.onoff.coom.FullComponentOnOffManifest;
import com.visteon.onoff.coom.State;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public List<State> initialStates(FullComponentOnOffManifest m) {
    	return m.getCoom().getStates().stream().filter(s-> s.isInitial()).collect(Collectors.toList());
    }
    
    public List<State> nonInitialStates(FullComponentOnOffManifest m) {
    	return m.getCoom().getStates().stream().filter(s-> !s.isInitial()).collect(Collectors.toList());
    }
    
    public ComponentOnOffManifest test(EObject self) {
    	return (ComponentOnOffManifest) self.eContainer();
    }
}
