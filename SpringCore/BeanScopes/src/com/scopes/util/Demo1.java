package com.scopes.util;

import com.scopes.pkg.Sample;

public class Demo1 {

	private Sample sam;

	public Sample getSam() {
		return sam;
	}

	public void setSam(Sample sam) {
		this.sam = sam;
	}
	
	public void show()
	{
		System.out.println(sam);
	}
}
