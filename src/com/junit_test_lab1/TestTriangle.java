package com.junit_test_lab1;

public class TestTriangle {
	public static String getKind(int a,int b,int c){
		if(a+b<c||a+c<b||b+c<a){
			return "不是三角形";
		}else if(a==b&&a==c&&b==c){
			return "等边三角形";
		}else if(a==b||b==c||a==c){
			return "等腰三角形";
		}else{
			return "普通三角形";
		}
	}
}
