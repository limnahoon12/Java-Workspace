package com.kh.chap03_class.model.vo;

public class Product {
	// 클래스 선언 구문에 사용 가능한 접근제한자 : public , default
	// public으로 해야 다른 패키지에서 접근가능
	// default로 설정한 경우 같은 패키지에서만 접근가능. / 다른 패키지에서 접근 불가
	
	// 상품명, 상품가격, 브랜드
	private String pName;
	private int price;
	private String brand = "애플";
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String information() {   
	      return "상품명 : "+pName+", 가격: "+price+" 브랜드: "+brand;
	   }
	
	// setter메서드 3개
	
	// getter메서드 3개
	
	//모든 필드값 하나의 문자열로 합쳐서 반환 하는 메서드
	
	
}
