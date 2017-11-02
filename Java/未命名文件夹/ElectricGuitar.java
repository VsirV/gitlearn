class ElectricGuitar {
	String brand;
	int numOfPickups;
	boolean rocksStarUsesIt;

	String getBrand () {
		return brand;//返回值为brand的值
	}

	void setBrand(String aBrand) {
	        brand = aBrand;  //把aBrand的值赋予brand
	}

	int getNumOfPickups () {
		return numOfPickups;//返回numOfPickups的值
	}

	void setNumOfPickus (int num) {
		numOfPickups = num;//把num的值赋值给numOfPickups
	}

	boolean getRockStarUsesIt() {
		return rocksStarUsesIt;//返回rockStarUsesIt

	}

	void setRockStarUsesIt (boolean YesOrNo) {      //调boolean类型YesOrNo的值入参
		rocksStarUsesIt = YesOrNo;     //赋值
	}
}






