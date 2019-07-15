package com.kgc.kh72.mrg;

import java.util.*;

public class ChiHuoLianMeng {
	// main方法程序入口：main?
	public static void main(String[] agrs) {
		// 1键盘创建Scanner键盘输入对象
		Scanner sc = new Scanner(System.in);
		//初始化订单信息
		//订单人姓名	菜品信息	时间	地址	订单状态	订单金额	点赞数
		String[] names={"季磊","程亮"};
		String[] disNames={"宫保鸡丁1份","韭菜233份"};
		int[] times= {14,15};
		String[] diZhi={"南京","扬州"};
		int[] zhuangTai = {0,1};	//0已预订	1已完成
		double[] zongJia ={20,233};
		int num = 0;
		String[] newnames =Arrays.copyOf(names,4);
		String[] newdisNames=Arrays.copyOf(disNames,4);
		int[] newtimes= Arrays.copyOf(times,4);
		String[] newdiZhi=Arrays.copyOf(diZhi,4);
		int[] newzhuangTai = Arrays.copyOf(zhuangTai,4);
		double[] newzongJia =Arrays.copyOf(zongJia,4);
		//初始化菜品信息
		String[] dishname={"宫保鸡丁","韭菜","白菜"};
		double[] price={20,1,10};
		int[] zans={0,1,1};
		
		do{
		System.out.println("欢迎登陆\"吃货联盟系统\"");
		System.out.println("1.我要订餐\t" + "2.查看餐袋\t" + "3.签收订单\t" + "4.删除订单\t" + "5.我要点赞\t" + "6.退出系统");
		// 提示用户输入
		System.out.println("请输入");
		int choice = sc.nextInt();
		// 使用switch语句结构进行判断
		switch (choice) {
		case 1:
			System.out.println("***我要订餐***");
			break;
		case 2:
			//循环遍历初试订单信息
			System.out.println("***查看餐袋***");
			System.out.println("编号\t订单人\t菜品信息\t订单时间\t地址\t订单状态\t订单金额\t");
			for(int i =0;i<newnames.length;i++){
				/*
				 * String zhuangTai1;
				 * if(newnames[i]==0){
				 * 		zhuangTai1="已预订";
				 * }else {
				 * 		zhuangTai1="已完成";
				 * }
				 */
				String zhuangTai1=newzhuangTai[i]==0?"已预订":"已完成";
				System.out.println((i+1)+"\t"+newnames[i]
						+ "\t"+newdisNames[i]
						+ "\t"+newtimes[i]
						+ "\t"+newdiZhi[i]
						+ "\t"+zhuangTai1
						+ "\t"+newzongJia[i]
						+ "\t"
						+ "");
			}
			System.out.println("***查看餐带***");
			System.out.println("编号\t订单人\t菜品信息\t订单时间\t地址\t订单状态\t金额\t");
			for(int i=0;i<newnames.length;i++){
				if(newnames[i]!=null){
				String zhuangTai1 = newzhuangTai[i]==0?"已预订":"已完成";
				System.out.println((i+1)+"\t"+newnames[i]
						+ "\t"+newdisNames[i]
						+ "\t"+newtimes[i]
						+ "\t"+newdiZhi[i]
						+ "\t"+zhuangTai1
						+ "\t"+newzongJia[i]
						+ "\t");
				}
			}
			break;
		case 3:
			System.out.println("***签收订单***");
			//定义一个标识符,来确定订单是否存在,默认为false.不存在
			boolean isNow = false;
			//提示用户输入要签收的订单
			System.out.println("请问要签收的订单编号:");
			int orderId =sc.nextInt();
			//循环遍历订单信息
			for(int i=0;i<newnames.length;i++){
				//判断菜单是否为空
				if(newnames[i]!=null&&newzhuangTai[i]==0){
					isNow = true;		//更改订单是否存在的标识符
					newzhuangTai[i] = 1;	//更改订单状态
					System.out.println("签收成功");
				}else if(newnames[i]!=null&&newzhuangTai[i]==1){
					isNow = true;
					System.out.println("此订单已签收,不能重复签收");
				}
			}
			//判断菜单是否存在
			if(isNow==false){
				System.out.println("此订单不存在");
			}
			break;
		case 4:
			System.out.println("***删除订单***");
			
			
			break;
		case 5:
			System.out.println("***我要点赞***");
			System.out.println("菜品编号\t名称\t单价\t点赞数\t");
			for(int i =0;i<dishname.length;i++){
				
				System.out.println((i+1)+"\t"+dishname[i]
						+ "\t"+price[i]
						+ "\t"+zans[i]
						+ "\t");
				
			}
			//提示用户输入要点赞的菜品编号
			System.out.println("请输入要点赞的菜品编号");
			int caiId= sc.nextInt();
			zans[caiId-1]++;		//点赞数加1
			System.out.println("点赞成功");
			break;
		case 6:
			System.out.println("***退出系统***");
			break;
		default:
			break;
		}
		}while(num==0);
		System.out.println("程序退出");
	}
}