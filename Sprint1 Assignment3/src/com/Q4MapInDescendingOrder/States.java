package com.Q4MapInDescendingOrder;

public class States implements Comparable<States> {

	String state;

	public States(String state) {
		super();
		this.state = state;

	}



	@Override
	public String toString() {
		return "\nState: " + state +" " ;
	}



	@Override
	public int compareTo(States o) {
		
		return o.state.compareTo(state);
	}

	
	
}
