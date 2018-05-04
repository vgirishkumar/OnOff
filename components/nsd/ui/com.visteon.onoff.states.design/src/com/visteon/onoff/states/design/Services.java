package com.visteon.onoff.states.design;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import com.visteon.onoff.states.NodeState;
import com.visteon.onoff.states.NodeStateDiagram;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		return self;
	}

	public List<NodeState> initialStates(NodeStateDiagram m) {
		return m.getStates().stream().filter(s -> s.isInitial()).collect(Collectors.toList());
	}

	public List<NodeState> nonInitialStates(NodeStateDiagram m) {
		return m.getStates().stream().filter(s -> !s.isInitial()).collect(Collectors.toList());
	}
	
    public NodeStateDiagram test(EObject self) {
    	return (NodeStateDiagram) self.eContainer();
    }
}
