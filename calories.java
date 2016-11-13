/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

/**
 *
 * @author David
 */
import java.util.*;
public class calories {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean a = true;
        boolean b = true;
        boolean c = true;
        while(a){
            double total = 0;
            double totalFat = 0;
            while(b||c){ 
                double totalPercent =0;//all percents
                double calPercent =0;//cal percent for fat
                double totalCal=0; //in calories
                double totalfat=0; //in calories
                String cal = sc.next();
                if(cal.contains("-")){
                    if(b==false){
                        a=false;
                        break;
                    }
                    b=false; 
                    break; 
                }
                b=true;
                String pro = sc.next();
                String sug =sc.next();
                String sta = sc.next();
                String alc = sc.next();
               
                if(pro.contains("g")){
                    totalCal += Integer.parseInt(pro.subSequence(0, pro.length()-1).toString())*4;
                } else if(pro.contains("%")){
                    totalPercent += Integer.parseInt(pro.subSequence(0, pro.length()-1).toString());
                }else{
                    totalCal += Integer.parseInt(pro.subSequence(0, pro.length()-1).toString());
                }
                if(sug.contains("g")){
                    totalCal += Integer.parseInt(sug.subSequence(0, sug.length()-1).toString())*4;
                } else if(sug.contains("%")){
                    totalPercent += Integer.parseInt(sug.subSequence(0, sug.length()-1).toString());
                }else{
                    totalCal += Integer.parseInt(sug.subSequence(0, sug.length()-1).toString());
                }
                if(sta.contains("g")){
                    totalCal += Integer.parseInt(sta.subSequence(0, sta.length()-1).toString())*4;
                } else if(sta.contains("%")){
                    totalPercent += Integer.parseInt(sta.subSequence(0, sta.length()-1).toString());
                }else{
                    totalCal += Integer.parseInt(sta.subSequence(0, sta.length()-1).toString());
                }
                if(alc.contains("g")){
                    totalCal += Integer.parseInt(alc.subSequence(0, alc.length()-1).toString())*7;
                } else if(alc.contains("%")){
                    totalPercent += Integer.parseInt(alc.subSequence(0, alc.length()-1).toString());
                }else{
                    totalCal += Integer.parseInt(alc.subSequence(0, alc.length()-1).toString());
                }
                if(cal.contains("g")){
                    totalCal += Integer.parseInt(cal.subSequence(0, cal.length()-1).toString())*9;
                    totalfat += Integer.parseInt(cal.subSequence(0, cal.length()-1).toString())*9;
                } else if(cal.contains("%")){
                    calPercent += Integer.parseInt(cal.subSequence(0, cal.length()-1).toString());
                    totalPercent += Integer.parseInt(cal.subSequence(0, cal.length()-1).toString());
                }else{
                    totalCal += Integer.parseInt(cal.subSequence(0, cal.length()-1).toString());
                    totalfat += Integer.parseInt(cal.subSequence(0, cal.length()-1).toString());
                }
                
                if(totalPercent>0){ //this is where the error
                    double y = totalCal/(100-totalPercent);
                    y = y*totalPercent;
                    totalCal+=y;
                }
                if(calPercent>0){
                    double y = totalCal*(calPercent/100);
                    totalfat +=y;
                }
                if(totalCal>0){
                    total+=totalCal;
                }
                if(totalfat>0){
                    totalFat+=totalfat;
                }
                
                //System.out.println(totalPercent+":totalPercent   "+calPercent+":calPercent   "+totalCal+":totalCal    "+totalfat+":totalfat" );
            }
            if(!a)break; 
            //System.out.println(total+":total   "+totalFat+":totalFat    "+Math.round((totalFat/total)*100));
            System.out.println(Math.round((totalFat/total)*100)+"%");
        }
    }
}
