public class SimpleDotComTestDrive {

	public static void main (String [] args) {

		SimpleDotCom dot = new SimpleDotCom();//声明对象
		
		int[] locations = {2,3,4};//定义 一个整型数组 	int numOfHits = 0;//

        
        dot.setLocationCells(locations);//调用方法，location为入参
        
        String userGuess = "2"; //定义一个字符串
        
        String result = dot.checkYourself(userGuess);//调用方法赋值

	}
}

