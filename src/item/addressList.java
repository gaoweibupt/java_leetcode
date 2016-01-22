package item;

import java.util.Scanner;

/**
* @author : gaoweibupt
* Date:2016年1月22日下午10:18:16
* 通讯录
*/
public class addressList {
	public Node head;
	
	public  void showAllMember(){
		Node ptr = head;
		System.out.println("姓名        "+ "电话");
		while (ptr != null){
			ptr.print();
			ptr = ptr.ptr;
		}
	}
	
	public void insertMember(){
		Scanner s = new Scanner(System.in) ;
		System.out.println("请输入名字:");
		String name = s.nextLine();
		System.out.println("请输入电话");
		String number = s.nextLine();
		Node node = new Node(name, number);
		if (head == null){
			head = node;
		}
		else{
			Node ptrb = head;
			Node ptr = ptrb.ptr;
			if (ptrb.name.compareTo(name) > 0){
				node.ptr = ptrb;
				head = node;
			}
			else{
				while (ptr != null && ptr.name.compareTo(name) > 0){
					ptrb = ptrb.ptr;
					ptr = ptr.ptr;
				}
				ptrb.ptr = node;
				node.ptr = ptr;
			}
		}
	}
	
	public void deleteMember(){
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		Node ptr = head;
		 if (ptr.name.equals(name)){
			 head = head.ptr;
		 }
		 while(ptr.ptr != null){
			 if (ptr.ptr.name.equals(name)){
				 ptr.ptr = ptr.ptr.ptr;
			 }
			 else{
				 ptr = ptr.ptr;
			 }
		 }
	}
	
	public void selectMember(){
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		Node ptr = head;
		while (ptr != null){
			if (ptr.name.equals(name)){
				ptr.print();
			}
			ptr = ptr.ptr;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addressList ll = new addressList();
		char c;
		do{
			System.out.println("请选择");
			System.out.println("1: 显示所有联系人");
			System.out.println("2: 增加联系人");
			System.out.println("3: 删除联系人");
			System.out.println("4: 查询联系人");
			System.out.println("0: 退出");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			c = s.charAt(0);
			switch(c){
			case '1': {ll.showAllMember();break;}
			case '2': {ll.insertMember();break;}
			case '3': {ll.deleteMember();break;}
			case '4': {ll.selectMember();break;}
			case '0':break;
			}
		}
		while(c != '0');
	}

}
class Node{
	String name;
	String number;
	public Node ptr;
	Node(String name, String number){
		this.name = name;
		this.number = number;
		ptr = null;
	}
	public void print(){
		System.out.println(name + ":" + number);
	}
}
