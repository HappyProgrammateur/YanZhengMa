package com.majingzhe;

import java.util.Random;
import java.util.Scanner;
public class Main {

	public static boolean yz(String yuan,String shuru){
		
		String yuan_xiaoxie = yuan.toLowerCase();
		String shuru_xiaoxie = shuru.toLowerCase();
		if(yuan_xiaoxie.equals(shuru_xiaoxie)){
			return true;
		}else{
			return false;
		}
	}
	
	 public static String codeGen(){
	        char [] codeSequence = {'A','B','C','D','E','F','G','0','1','2','3','4','5','6','7','8','9'};
	        //��̬�ַ���
	        StringBuilder sb = new StringBuilder();
	        Random random = new Random();
	        int count =0;
	        while(true){
	            int index = random.nextInt(codeSequence.length); //����������ķ�Χ���Ҳ���һ��������±�
	            //�����ȡ��һ����
	             char c = codeSequence[index];
	             if (sb.indexOf(c+"")==-1) { //�����ַ��ظ�,���Ұ�һ���ַ�����ַ���
	                 sb.append(c);
	                 count++;
	                 if (count==4) {
	                    break;
	                }   
	            }
	        }
	        return sb.toString();

	    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i!=5){
			String yuan =codeGen();
			System.out.println("������֤��Ϊ��"+yuan);
			Scanner in = new Scanner(System.in);
			System.out.print("��������֤�룺");
			String shuru = in.nextLine();
			boolean result =yz(yuan, shuru);
			if(result){
				System.out.println("��֤����ȷ����");
				break;
			}else{
				System.out.println("��֤�������������������");
				i++;
			}
			if(i==5){
				System.out.println("���Ѿ�������Σ���һ���������");
			}
		} 
	}
}
