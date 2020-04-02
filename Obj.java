public class Obj {
	public static void main(String[] args){

    Duration durationSum = new Duration(0, 0);

    //1ヶ月24日働く
    Duration duration1 = new Duration(1, 24);
    durationSum.add(duration1);

    //3ヶ月15日働く
    Duration duration2 = new Duration(3, 15);
    durationSum.add(duration2);

    //自動的にtoString()が呼ばれる
    System.out.println(durationSum);//0年5ヶ月9日
  }
}
