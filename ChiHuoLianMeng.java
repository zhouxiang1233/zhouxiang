package com.kgc.kh72.mrg;

import java.util.*;

public class ChiHuoLianMeng {
	// main����������ڣ�main?
	public static void main(String[] agrs) {
		// 1���̴���Scanner�����������
		Scanner sc = new Scanner(System.in);
		//��ʼ��������Ϣ
		//����������	��Ʒ��Ϣ	ʱ��	��ַ	����״̬	�������	������
		String[] names={"����","����"};
		String[] disNames={"��������1��","�²�233��"};
		int[] times= {14,15};
		String[] diZhi={"�Ͼ�","����"};
		int[] zhuangTai = {0,1};	//0��Ԥ��	1�����
		double[] zongJia ={20,233};
		int num = 0;
		String[] newnames =Arrays.copyOf(names,4);
		String[] newdisNames=Arrays.copyOf(disNames,4);
		int[] newtimes= Arrays.copyOf(times,4);
		String[] newdiZhi=Arrays.copyOf(diZhi,4);
		int[] newzhuangTai = Arrays.copyOf(zhuangTai,4);
		double[] newzongJia =Arrays.copyOf(zongJia,4);
		//��ʼ����Ʒ��Ϣ
		String[] dishname={"��������","�²�","�ײ�"};
		double[] price={20,1,10};
		int[] zans={0,1,1};
		
		do{
		System.out.println("��ӭ��½\"�Ի�����ϵͳ\"");
		System.out.println("1.��Ҫ����\t" + "2.�鿴�ʹ�\t" + "3.ǩ�ն���\t" + "4.ɾ������\t" + "5.��Ҫ����\t" + "6.�˳�ϵͳ");
		// ��ʾ�û�����
		System.out.println("������");
		int choice = sc.nextInt();
		// ʹ��switch���ṹ�����ж�
		switch (choice) {
		case 1:
			System.out.println("***��Ҫ����***");
			break;
		case 2:
			//ѭ���������Զ�����Ϣ
			System.out.println("***�鿴�ʹ�***");
			System.out.println("���\t������\t��Ʒ��Ϣ\t����ʱ��\t��ַ\t����״̬\t�������\t");
			for(int i =0;i<newnames.length;i++){
				/*
				 * String zhuangTai1;
				 * if(newnames[i]==0){
				 * 		zhuangTai1="��Ԥ��";
				 * }else {
				 * 		zhuangTai1="�����";
				 * }
				 */
				String zhuangTai1=newzhuangTai[i]==0?"��Ԥ��":"�����";
				System.out.println((i+1)+"\t"+newnames[i]
						+ "\t"+newdisNames[i]
						+ "\t"+newtimes[i]
						+ "\t"+newdiZhi[i]
						+ "\t"+zhuangTai1
						+ "\t"+newzongJia[i]
						+ "\t"
						+ "");
			}
			System.out.println("***�鿴�ʹ�***");
			System.out.println("���\t������\t��Ʒ��Ϣ\t����ʱ��\t��ַ\t����״̬\t���\t");
			for(int i=0;i<newnames.length;i++){
				if(newnames[i]!=null){
				String zhuangTai1 = newzhuangTai[i]==0?"��Ԥ��":"�����";
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
			System.out.println("***ǩ�ն���***");
			//����һ����ʶ��,��ȷ�������Ƿ����,Ĭ��Ϊfalse.������
			boolean isNow = false;
			//��ʾ�û�����Ҫǩ�յĶ���
			System.out.println("����Ҫǩ�յĶ������:");
			int orderId =sc.nextInt();
			//ѭ������������Ϣ
			for(int i=0;i<newnames.length;i++){
				//�жϲ˵��Ƿ�Ϊ��
				if(newnames[i]!=null&&newzhuangTai[i]==0){
					isNow = true;		//���Ķ����Ƿ���ڵı�ʶ��
					newzhuangTai[i] = 1;	//���Ķ���״̬
					System.out.println("ǩ�ճɹ�");
				}else if(newnames[i]!=null&&newzhuangTai[i]==1){
					isNow = true;
					System.out.println("�˶�����ǩ��,�����ظ�ǩ��");
				}
			}
			//�жϲ˵��Ƿ����
			if(isNow==false){
				System.out.println("�˶���������");
			}
			break;
		case 4:
			System.out.println("***ɾ������***");
			
			
			break;
		case 5:
			System.out.println("***��Ҫ����***");
			System.out.println("��Ʒ���\t����\t����\t������\t");
			for(int i =0;i<dishname.length;i++){
				
				System.out.println((i+1)+"\t"+dishname[i]
						+ "\t"+price[i]
						+ "\t"+zans[i]
						+ "\t");
				
			}
			//��ʾ�û�����Ҫ���޵Ĳ�Ʒ���
			System.out.println("������Ҫ���޵Ĳ�Ʒ���");
			int caiId= sc.nextInt();
			zans[caiId-1]++;		//��������1
			System.out.println("���޳ɹ�");
			break;
		case 6:
			System.out.println("***�˳�ϵͳ***");
			break;
		default:
			break;
		}
		}while(num==0);
		System.out.println("�����˳�");
	}
}