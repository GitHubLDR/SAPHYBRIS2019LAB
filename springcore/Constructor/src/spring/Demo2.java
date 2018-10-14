package spring;

import java.awt.image.SampleModel;

public class Demo2 {

	private String msg;
	private String construct;
	private SampleModel samp;
	
	public Demo2(String construct, String msg){
	 this.construct= construct;
     this.msg=msg;
     
	
}

	public SampleModel getSamp() {
		return samp;
	}

	public void setSamp(SampleModel samp) {
		this.samp = samp;
	}

	public void show() {
		System.out.println("msg:"+msg);
		System.out.println("construct:"+construct);
		
	}

	//public void show() {
		// TODO Auto-generated method stub
		
	}
