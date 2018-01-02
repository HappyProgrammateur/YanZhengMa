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
	        //动态字符串
	        StringBuilder sb = new StringBuilder();
	        Random random = new Random();
	        int count =0;
	        while(true){
	            int index = random.nextInt(codeSequence.length); //定义随机数的范围并且产生一个随机的下标
	            //随机的取出一个数
	             char c = codeSequence[index];
	             if (sb.indexOf(c+"")==-1) { //不让字符重复,并且把一个字符变成字符串
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
			System.out.println("您的验证码为："+yuan);
			Scanner in = new Scanner(System.in);
			System.out.print("请输入验证码：");
			String shuru = in.nextLine();
			boolean result =yz(yuan, shuru);
			if(result){
				System.out.println("验证码正确！！");
				break;
			}else{
				System.out.println("验证码错误，请重新再来！！");
				i++;
			}
			if(i==5){
				System.out.println("你已经输入五次，过一会儿再来试");
			}
		} 
	}
}
