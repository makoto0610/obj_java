public class NonObj {
	public static void main(String[] args){

    int monthNum = 0;
    int dayNum = 0;

    // 1ヶ月24日働く
    monthNum = monthNum + 1;
    dayNum = dayNum + 24;
    ////30日を1ヶ月換算
    monthNum = monthNum + dayNum/30;
    dayNum = dayNum%30;

    //3ヶ月15日働く
    monthNum = monthNum + 3;
    dayNum = dayNum + 15;
    ////30日を1ヶ月換算
    monthNum = monthNum + dayNum/30;
    dayNum = dayNum%30;

    System.out.println((monthNum/12)+"年"+(monthNum%12)+"ヶ月"+dayNum+"日");//0年5ヶ月9日 
  }
}
