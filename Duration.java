/** 「期間」クラス。DAY_OF_MONTH日数は1ヶ月と自動的に換算する */
public class Duration {
  /** 1ヶ月とみなす日数 */
  public static final int DAY_OF_MONTH = 30;  

  // ユーザーが勝手に変更できないようにprivate（非公開）にする
  // Otherwise it will be considered as violation of encapsulation.
  private int monthNum; //月数
  private int dayNum; //日数

  /** monthNumヶ月dayNum日 */
  public Duration(int monthNum, int dayNum){
    //DAY_OF_MONTH(30)日は1ヶ月換算
    this.monthNum = monthNum + dayNum / DAY_OF_MONTH;
    this.dayNum = dayNum % DAY_OF_MONTH;
  }

  public void add(Duration duration){
    this.monthNum = this.monthNum + duration.getMonthNum();
    this.dayNum = this.dayNum + duration.getDayNum();

    //DAY_OF_MONTH(30)日は1ヶ月換算
    this.monthNum = this.monthNum + this.dayNum / DAY_OF_MONTH;
    this.dayNum = this.dayNum % DAY_OF_MONTH;
  }

  //ユーザーはセットはできないが取得はできるようにpublic（公開）にする
  public int getMonthNum(){
    return monthNum;
  }
  public int getDayNum(){
    return dayNum;
  }

  @Override
  public String toString(){
      return (monthNum / 12)+ "年" +(monthNum % 12) + "ヶ月" + dayNum + "日";
  }
}
