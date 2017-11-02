class Clock {
	int time ;

	void setTime(int t) {
		time = t ;    //给函数赋值
	}

	int getTime() {
		return time ;  //获取time的值
	}
}

class ClockTestDrive {
	public static void main (String [] args) {


		Clock c = new Clock () ;
		c.setTime(12345);
		int tod = c.getTime();
		System.out.println("time:" + tod);		//输出时间和时间的值
	}
}
