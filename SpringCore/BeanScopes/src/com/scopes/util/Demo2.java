package com.scopes.util;

import com.scopes.pkg.Sample;

public class Demo2 {
	
	private Sample sam1;

	public Sample getSam1() {
		return sam1;
	}

	public void setSam1(Sample sam1) {
		this.sam1 = sam1;
	}
	
	public void display()
	{
		System.out.println(sam1);
	}

}
