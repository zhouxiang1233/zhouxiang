import java.util.Scanner;
public class Game1 {
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int num = -1;//�û�����0�������˵��������˳�
		//boolean tuiChu=false;//��־�û��Ƿ��˳�ϵͳ��trueΪ�˳�ϵͳ
		System.out.println("��ӭʹ��\"�Ի����˶���ϵͳ\"");
		String[] names = new String[4];//���涩��������
		String[] canPin = new String[4];//������ѡ��Ʒ��Ϣ��������Ʒ������
		int[] times = new int[4];//�����Ͳ�ʱ�䱣��
		String[] diZhi = new String[4];//�����Ͳ͵�ַ
		int[] zhuangTai = new int[4];//���涩��״̬��0��ʾ��Ԥ����1��ʾ�����
		double[] zongJia = new double[4];//���涩�����ܽ��
		double[] prices = {38,20,10};//��Ʒ����
		int[] praiseNums = new int[3];//������
		String[] caiMing={"���մ���","������˿","ʱ���߲�"};
		double[] danJia={38,20,10};
		int[] dianZhan={0,0,0};
		//��ʼ����һ��������Ϣ
		names[0] ="����";
		canPin[0] = "���մ���2��";
		times[0] =12;
		diZhi[0] ="���·207��";
		zhuangTai[0] = 1;
		zongJia[0] = 76;
		//��ʼ���ڶ���������Ϣ
		names[1] ="����";
		canPin[1] = "���մ���2��";
		times[1] =18;
		diZhi[1] ="���·207��";
		zhuangTai[1] = 0;
		zongJia[1] = 45;
		do{
			//��ʾ���˵�
			System.out.println("******************************");
			String[] xiTong ={"��Ҫ����","�鿴�ʹ�","ǩ�ն���","ɾ������","��Ҫ����","�˳�ϵͳ"};
			for(int i=0;i<xiTong.length;i++){
				System.out.println((i+1)+","+xiTong[i]);
			}
			System.out.println("******************************");
			System.out.print("��ѡ��");
			int num0=sc.nextInt();//��¼�û�ѡ��Ĺ��ܱ��
			switch(num0){//�����û�����Ĺ��ܱ�ţ�ִ����Ӧ�Ĺ���
			case 1:
				System.out.println("******"+xiTong[num0-1]+"******");
				int weiZi=0;//����λ��Ϊ0
				for(int i =0;i<names.length;i++){
					if(names[i]==null){//�ҵ�һ����λ�ӣ����Զ���
						weiZi=1;
						System.out.println("�����붩����������");
						names[i]=sc.next();
						System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
						for(int j=0;j<caiMing.length;j++){
							System.out.println((j+1)+"\t"+caiMing[i]+"\t"+danJia[j]+"Ԫ"+"\t"+dianZhan[j]);
						}
						System.out.print("��������Ҫ��Ĳ�Ʒ��ţ�");
						int caiPinNum= sc.nextInt();
						System.out.print("����������Ҫ�ķ�����");
						int fenShu = sc.nextInt();
						System.out.print("�������Ͳ�ʱ��(�Ͳ�ʱ����10����20��������Ͳ�)��");
						times[i] = sc.nextInt();
						System.out.print("�������Ͳ͵�ַ��");
						diZhi[i] = sc.next();
						System.out.println("�Ͳͳɹ���");
						canPin[i]=caiMing[caiPinNum-1]+fenShu+"��";
						System.out.println("�������ǣ�"+canPin[i]);
						System.out.println("�Ͳ�ʱ�䣺"+times[i]+"��");
						double canFei=danJia[caiPinNum-1]*fenShu;
						zongJia[i]=canFei+5;
						if(zongJia[i]>50){
							zongJia[i]=canFei;
							System.out.println("�ͷ�"+canFei+"Ԫ,�Ͳͷ�0Ԫ,�ܼ�"+zongJia[i]+"Ԫ.");
							break;
						}else {
							System.out.println("�ͷ�"+canFei+"Ԫ,�Ͳͷ�5Ԫ,�ܼ�"+zongJia[i]+"Ԫ.");
							break;
						}
					}
				}
				if(weiZi==0){
					System.out.println("�Բ������Ĳʹ�������");
				}
				do{
					System.out.println("����0����");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("������Ч����������");
					}
				}while(num!=0);
				break;
			case 2:
				System.out.println("******"+xiTong[num0-1]+"******");
				System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
				for(int i=0;i<names.length;i++){
					if(names[i]!=null){
						String zhuangTai1=zhuangTai[i]==0?"��Ԥ��":"�����";
						System.out.println((i+1)+"\t"+names[i]+"��"+"\t"+canPin[i]+"\t\t"+times[i]+"\t"+diZhi[i]+"\t"+zongJia[i]+"Ԫ"+"\t"+zhuangTai1);
					}
				}
				do{
					System.out.println("����0����");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("������Ч����������");
					}
				}while(num!=0);
				break;
			case 3:
				System.out.println("******"+xiTong[num0-1]+"******");
				System.out.println("������Ҫǩ�յĶ������:");
				int num3 =sc.nextInt();
				if(zhuangTai[num3-1]==0){
					if(names[num3-1]!=null){//�������ڶ���ΪΪԤ��״̬
						zhuangTai[num3-1]=1;
						System.out.println("����ǩ�ճɹ���");
					}else{//����������
						System.out.println("���Ķ���������");
					}
				}else{//�������ڣ������������״̬
					System.out.println("��ѡ��Ķ��������ǩ�գ������ٴ�ǩ�գ�");
				}
				do{
					System.out.println("����0����");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("������Ч����������");
					}
				}while(num!=0);
				break;
			case 4:
				System.out.println("******"+xiTong[num0-1]+"******");
				System.out.println("������Ҫɾ���Ķ������:");
				int num4 =sc.nextInt();
				if(zhuangTai[num4-1]!=0){//����״̬�������
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
					System.out.println("ɾ�������ɹ���");
				}else if(names[num4-1]!=null){//����״̬Ϊ��ԤԼ��ȷ���ж���
					System.out.println("��ѡ��Ķ���δǩ��,������ǩ��!");
				}else{//����������
					System.out.println("����Ҫɾ���Ķ���������");
				}
				do{
					System.out.println("����0����");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("������Ч����������");
					}
				}while(num!=0);
				break;
			case 5:
				System.out.println("******"+xiTong[num0-1]+"******");
				System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
				for(int i=0;i<caiMing.length;i++){
					System.out.println((i+1)+"\t"+caiMing[i]+"\t"+danJia[i]+"Ԫ"+"\t"+dianZhan[i]);
				}
				System.out.println("��ѡ����Ҫ���޵Ĳ�Ʒ���:");
				int num5=sc.nextInt();
				dianZhan[num5-1]++;//������+1
				System.out.println("���޳ɹ���");
				do{
					System.out.println("����0����");
					num=sc.nextInt();
					if(num!=0){
						System.out.println("������Ч����������");
					}
				}while(num!=0);
				break;
			case 6://����Ϊ6�˳�ϵͳ
				num = -1;
				break;
			default://���Ϊ0�������������˵�
				System.out.println("������󷵻����˵�");
				num=0;
				break;
			}
		}while(num==0);
	}
}
