import java.util.Scanner;
public class Game1 {
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int num = -1;//用户输入0返回主菜单，否则退出
		//boolean tuiChu=false;//标志用户是否退出系统：true为退出系统
		System.out.println("欢迎使用\"吃货联盟订餐系统\"");
		String[] names = new String[4];//保存订餐人姓名
		String[] canPin = new String[4];//保存所选餐品信息，包括菜品及份数
		int[] times = new int[4];//保存送餐时间保存
		String[] diZhi = new String[4];//保存送餐地址
		int[] zhuangTai = new int[4];//保存订单状态：0表示已预订，1表示已完成
		double[] zongJia = new double[4];//保存订单的总金额
		double[] prices = {38,20,10};//菜品单价
		int[] praiseNums = new int[3];//点赞数
		String[] caiMing={"红烧带鱼","鱼香肉丝","时令蔬菜"};
		double[] danJia={38,20,10};
		int[] dianZhan={0,0,0};
		//初始化第一条订单信息
		names[0] ="张晴";
		canPin[0] = "红烧带鱼2份";
		times[0] =12;
		diZhi[0] ="天成路207号";
		zhuangTai[0] = 1;
		zongJia[0] = 76;
		//初始化第二条订单信息
		names[1] ="张晴";
		canPin[1] = "红烧带鱼2份";
		times[1] =18;
		diZhi[1] ="天成路207号";
		zhuangTai[1] = 0;
		zongJia[1] = 45;
		do{
			//显示主菜单
			System.out.println("******************************");
			String[] xiTong ={"我要订餐","查看餐袋","签收订单","删除订单","我要点赞","退出系统"};
			for(int i=0;i<xiTong.length;i++){
				System.out.println((i+1)+","+xiTong[i]);
			}
			System.out.println("******************************");
			System.out.print("请选择：");
			int num0=sc.nextInt();//记录用户选择的功能编号
			switch(num0){//根据用户输入的功能编号，执行相应的功能
			case 1:
				System.out.println("******"+xiTong[num0-1]+"******");
				int weiZi=0;//设置位置为0
				for(int i =0;i<names.length;i++){
					if(names[i]==null){//找到一个空位子，可以订餐
						weiZi=1;
						System.out.println("请输入订餐人姓名：");
						names[i]=sc.next();
						System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
						for(int j=0;j<caiMing.length;j++){
							System.out.println((j+1)+"\t"+caiMing[i]+"\t"+danJia[j]+"元"+"\t"+dianZhan[j]);
						}
						System.out.print("请输入您要点的菜品编号：");
						int caiPinNum= sc.nextInt();
						System.out.print("请输入您需要的份数：");
						int fenShu = sc.nextInt();
						System.out.print("请输入送餐时间(送餐时间是10点至20点间整点送餐)：");
						times[i] = sc.nextInt();
						System.out.print("请输入送餐地址：");
						diZhi[i] = sc.next();
						System.out.println("送餐成功！");
						canPin[i]=caiMing[caiPinNum-1]+fenShu+"份";
						System.out.println("您订的是："+canPin[i]);
						System.out.println("送餐时间："+times[i]+"点");
						double canFei=danJia[caiPinNum-1]*fenShu;
						zongJia[i]=canFei+5;
						if(zongJia[i]>50){
							zongJia[i]=canFei;
							System.out.println("餐费"+canFei+"元,送餐费0元,总计"+zongJia[i]+"元.");
							break;
						}else {
							System.out.println("餐费"+canFei+"元,送餐费5元,总计"+zongJia[i]+"元.");
							break;
						}
					}
				}
				if(weiZi==0){
					System.out.println("对不起，您的餐带已满！");
				}
				do{
					System.out.println("输入0返回");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("输入无效请重新输入");
					}
				}while(num!=0);
				break;
			case 2:
				System.out.println("******"+xiTong[num0-1]+"******");
				System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
				for(int i=0;i<names.length;i++){
					if(names[i]!=null){
						String zhuangTai1=zhuangTai[i]==0?"已预订":"已完成";
						System.out.println((i+1)+"\t"+names[i]+"点"+"\t"+canPin[i]+"\t\t"+times[i]+"\t"+diZhi[i]+"\t"+zongJia[i]+"元"+"\t"+zhuangTai1);
					}
				}
				do{
					System.out.println("输入0返回");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("输入无效请重新输入");
					}
				}while(num!=0);
				break;
			case 3:
				System.out.println("******"+xiTong[num0-1]+"******");
				System.out.println("请输入要签收的订单序号:");
				int num3 =sc.nextInt();
				if(zhuangTai[num3-1]==0){
					if(names[num3-1]!=null){//订单存在而且为为预订状态
						zhuangTai[num3-1]=1;
						System.out.println("订单签收成功！");
					}else{//订单不存在
						System.out.println("您的订单不存在");
					}
				}else{//订单存在，但是是已完成状态
					System.out.println("您选择的订单已完成签收，不能再次签收！");
				}
				do{
					System.out.println("输入0返回");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("输入无效请重新输入");
					}
				}while(num!=0);
				break;
			case 4:
				System.out.println("******"+xiTong[num0-1]+"******");
				System.out.println("请输入要删除的订单序号:");
				int num4 =sc.nextInt();
				if(zhuangTai[num4-1]!=0){//订单状态是已完成
					for(int i=num4-1;i<names.length-1;i++){
						names[i] =names[i+1];
						canPin[i] = canPin[i+1];
						times[i] =times[i+1];
						diZhi[i] =diZhi[i+1];
						zhuangTai[i] = zhuangTai[i+1];
						zongJia[i] = zongJia[i+1];
					}
					names[names.length-1] =null;
					canPin[names.length-1] = null;
					times[names.length-1] =0;
					diZhi[names.length-1] =null;
					zhuangTai[names.length-1] = 0;
					zongJia[names.length-1] = 0;
					System.out.println("删除订单成功！");
				}else if(names[num4-1]!=null){//订单状态为已预约且确定有订单
					System.out.println("您选择的订单未签收,不能能签收!");
				}else{//订单不存在
					System.out.println("您的要删除的订单不存在");
				}
				do{
					System.out.println("输入0返回");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("输入无效请重新输入");
					}
				}while(num!=0);
				break;
			case 5:
				System.out.println("******"+xiTong[num0-1]+"******");
				System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
				for(int i=0;i<caiMing.length;i++){
					System.out.println((i+1)+"\t"+caiMing[i]+"\t"+danJia[i]+"元"+"\t"+dianZhan[i]);
				}
				System.out.println("请选择您要点赞的菜品序号:");
				int num5=sc.nextInt();
				dianZhan[num5-1]++;//点赞数+1
				System.out.println("点赞成功！");
				do{
					System.out.println("输入0返回");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("输入无效请重新输入");
					}
				}while(num!=0);
				break;
			case 6://输入为6退出系统
				num = -1;
				break;
			default://输出为0或其他返回主菜单
				System.out.println("输入错误返回主菜单");
				num=0;
				break;
			}
		}while(num==0);
	}
}
