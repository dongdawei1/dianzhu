package dianzhu1.ceshi1;

import  java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPaiXu {

	public static void main(String[] args) {
		//��ȡ��������
				Scanner scanner=new  Scanner(System.in);
                boolean boolean1=true;
                int length_shu_zu=0;
                
        while(boolean1){
        	
        	System.out.println("���������鳤��");
        	String length1=scanner.nextLine();
            System.out.println("TestPaiXu.main()"+length1);
            boolean boolean2= isNumeric(length1);
            if(boolean2==true){
            	length_shu_zu=Integer.parseInt(length1)	;
            	System.out.println("TestPaiXu.main()"+length_shu_zu);
            	if(length_shu_zu>3){ boolean1=false; }
            	
            }else{System.out.println("������һ������"); }
        }
          
       int[] shu_zu=new int[length_shu_zu];   
       
       for(int i=0;i<length_shu_zu;i++){
    	 
    	   boolean boolean3=true;
    	    while(boolean3){
            	
            	System.out.println("�������"+(i+1)+"������");
            	String nummer=scanner.nextLine();
                System.out.println("TestPaiXu.main()"+nummer);
                boolean boolean2= isNumeric(nummer);
                if(boolean2==true){
                	shu_zu[i]=Integer.parseInt(nummer)	;
                	System.out.println("TestPaiXu.main()"+length_shu_zu);
                	 boolean3=false; 
                	
                }else{System.out.println("������һ������"); }
            }
    
       }
       
       for(int c=0;c<shu_zu.length;c++){
    	   System.out.println("TestPaiXu.main()"+shu_zu[c]);
       }
       
      int num_max= max(shu_zu);
     
      for (int c=0;c<shu_zu.length;c++){
    	  if(num_max-shu_zu[c]==0){System.out.println("��߷�"+shu_zu[c]);}
    	  else if (num_max-shu_zu[c]<=10) {
    		  System.out.println("���ķ�����"+shu_zu[c]+"�ȼ�ΪB");
		}  else if (num_max-shu_zu[c]<=20) {
  		  System.out.println("���ķ�����"+shu_zu[c]+"�ȼ�Ϊc");
		}
		else if (num_max-shu_zu[c]<=30) {
	  		  System.out.println("���ķ�����"+shu_zu[c]+"�ȼ�Ϊd");
			}else {
		  		  System.out.println("���ķ�����"+shu_zu[c]+"�ȼ�Ϊf");
			}
    	  
      }
     
      
      
	}
	
	/**
     * ����������ʽ�ж��ַ����Ƿ�������
     */
    public static boolean isNumeric(String str){
           Pattern pattern = Pattern.compile("[0-9]*");
           Matcher isNum = pattern.matcher(str);
           if( !isNum.matches() ){
               return false;
           }
           return true;
    }
	
	//��ð�ݻ�ȡ����������ֵ
    
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
