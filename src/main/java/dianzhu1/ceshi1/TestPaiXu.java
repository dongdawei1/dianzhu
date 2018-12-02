package dianzhu1.ceshi1;

import  java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPaiXu {

	public static void main(String[] args) {
		//获取键盘输入
				Scanner scanner=new  Scanner(System.in);
                boolean boolean1=true;
                int length_shu_zu=0;
                
        while(boolean1){
        	
        	System.out.println("请输入数组长度");
        	String length1=scanner.nextLine();
            System.out.println("TestPaiXu.main()"+length1);
            boolean boolean2= isNumeric(length1);
            if(boolean2==true){
            	length_shu_zu=Integer.parseInt(length1)	;
            	System.out.println("TestPaiXu.main()"+length_shu_zu);
            	if(length_shu_zu>3){ boolean1=false; }
            	
            }else{System.out.println("请输入一个数字"); }
        }
          
       int[] shu_zu=new int[length_shu_zu];   
       
       for(int i=0;i<length_shu_zu;i++){
    	 
    	   boolean boolean3=true;
    	    while(boolean3){
            	
            	System.out.println("请输入第"+(i+1)+"个数字");
            	String nummer=scanner.nextLine();
                System.out.println("TestPaiXu.main()"+nummer);
                boolean boolean2= isNumeric(nummer);
                if(boolean2==true){
                	shu_zu[i]=Integer.parseInt(nummer)	;
                	System.out.println("TestPaiXu.main()"+length_shu_zu);
                	 boolean3=false; 
                	
                }else{System.out.println("请输入一个数字"); }
            }
    
       }
       
       for(int c=0;c<shu_zu.length;c++){
    	   System.out.println("TestPaiXu.main()"+shu_zu[c]);
       }
       
      int num_max= max(shu_zu);
     
      for (int c=0;c<shu_zu.length;c++){
    	  if(num_max-shu_zu[c]==0){System.out.println("最高分"+shu_zu[c]);}
    	  else if (num_max-shu_zu[c]<=10) {
    		  System.out.println("您的分数是"+shu_zu[c]+"等级为B");
		}  else if (num_max-shu_zu[c]<=20) {
  		  System.out.println("您的分数是"+shu_zu[c]+"等级为c");
		}
		else if (num_max-shu_zu[c]<=30) {
	  		  System.out.println("您的分数是"+shu_zu[c]+"等级为d");
			}else {
		  		  System.out.println("您的分数是"+shu_zu[c]+"等级为f");
			}
    	  
      }
     
      
      
	}
	
	/**
     * 利用正则表达式判断字符串是否是数字
     */
    public static boolean isNumeric(String str){
           Pattern pattern = Pattern.compile("[0-9]*");
           Matcher isNum = pattern.matcher(str);
           if( !isNum.matches() ){
               return false;
           }
           return true;
    }
	
	//用冒泡获取数组中最大的值
    
    public static int  max(int[] num_list){
    	
    	int max=0;
    	
    	for(int c=0;c<num_list.length-1;c++){
    		
    		for(int c1=c+1;c1<num_list.length;c1++){
    			if(num_list[c1]>num_list[c]){
    				max=num_list[c1];
    				num_list[c1]=num_list[c];
    				num_list[c]=max;
    			}
			
    		}
		
    	}
	
    	System.err.println(num_list[0]);
    	
    	return num_list[0];
    	
    }
    
}
