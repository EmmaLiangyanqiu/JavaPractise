import java.util.Scanner;

/**
 * Created by Emma on 2018/8/4.
 */
public class practise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入日期：");
        String date=in.next();

        String[] result=date.split("-");
        int year=Integer.parseInt( result[0]);
        int month=Integer.parseInt( result[1]);
        int day=Integer.parseInt( result[2]);

        if(year%4==0&&year%100!=0||year%400==0){

            if(month==02){
                if(day==29){
                    month=month+01;day=01;
                }
                else if(day>29){
                    System.out.println("你输入的日期不存在");
                    return;
                } else{
                    day=day+1;
                }
            }
            else if(month==9||month==04||month==06||month==11){
                if (day==30){
                    month=month+1;day=01;
                }else if(day>30){
                    System.out.println("你输入的日期不存在");
                    return;
                } else{
                    day=day+1;
                }
            }
            else if(month==01||month==03||month==05||month==07||month==8||month==10||month==12){
                if (day==31){
                    month=month+1;day=01;
                }else if (day>31){

                    System.out.println("你输入的日期不存在");
                    return;
                } else{
                    day=day+1;
                }
            }
            String str="";
            str=str+year+"-"+month+"-"+day;
            System.out.println("下一天为："+str);
       }else{
            if(month==02){
                if(day==28){
                month=month+01;day=01;
                }
                else if(day>28){
                    System.out.println("你输入的日期不存在");
                    return;
                } else{
                    day=day+1;
                }
            }
            else if(month==9||month==04||month==06||month==11){
                if (day==30){
                month=month+1;day=01;
                }else if(day>30){
                    System.out.println("你输入的日期不存在");
                    return;
                } else{
                    day=day+1;
                }
            }
            else if(month==01||month==03||month==05||month==07||month==8||month==10||month==12){
                if (day==31){
                month=month+1;day=01;
                }else if (day>31){

                    System.out.println("你输入的日期不存在");
                    return;
                } else{
                    day=day+1;
                }
            }
            String str="";
            str=str+year+"-"+month+"-"+day;
            System.out.println("下一天为："+str);
        }


    }
}
