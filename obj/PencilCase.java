package com.test.java.obj;

import java.util.Arrays;

public class PencilCase {

	private String color;
	private Pencil[] pencil = new Pencil[5];// *** 필통 안에 여러 개의 연필이 담겨 있다는 표현
	private int index = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/*
	public Pencil[] getPencil() {
		return pencil;
	}

	public void setPencil(Pencil[] pencil) {
		this.pencil = pencil;
	}
	*/
	
	// 연필을 필통 안에 넣기
	public void add(Pencil p) {

		if (this.index < this.pencil.length) {
			this.pencil[index] = p; // 배열의 0번째 방에 연필을 넣음
			this.index++;
		}
		else {
			System.out.println("필통에 연필이 꽉 찼습니둥");
		}
		
	}
	
	// 필동에서 연필을 꺼내기 (제거)
	public Pencil get(int index) {
		Pencil p = this.pencil[index];
		
		// Left Shift
		for (int i=index; i<this.pencil.length-1; i++) {
			this.pencil[i] = this.pencil[i+1];
		}
		
		this.pencil[this.pencil.length-1] = null;
		
		this.index--;
		
		return p;
	}
	
	public String info() {
		return Arrays.toString(this.pencil);
	}
}
