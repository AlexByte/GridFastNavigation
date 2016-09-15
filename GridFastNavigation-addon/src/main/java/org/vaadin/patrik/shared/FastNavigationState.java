package org.vaadin.patrik.shared;

import java.util.HashSet;
import java.util.Set;

import com.vaadin.shared.communication.SharedState;

@SuppressWarnings("serial")
public class FastNavigationState extends SharedState {
    
    public boolean tabCapture = false;
    
    public boolean selectRowOnFocus = false;
    
    public boolean hasFocusListener = false;
    
    public boolean hasRowFocusListener = false;
    
    public boolean hasCellFocusListener = false;
    
    public Set<Integer> openShortcuts = new HashSet<Integer>();
    
    public Set<Integer> closeShortcuts = new HashSet<Integer>();

}
