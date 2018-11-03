package com.uhire.util;

import com.uhire.pkg.Sample;

public class Demo {
	
	private Sample sample;
	
	public Sample getSample()
	{
		return sample;
	}
	
	public void setSample(Sample sample)
	{
		this.sample=sample;
	}
	
	public void show()
	{
		System.out.println(sample);
	}

}
