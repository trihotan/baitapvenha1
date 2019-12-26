package hotantri.com;

import java.util.HashMap;
import java.util.Scanner;

public class baiTapVeHashMap {

	static HashMap<Integer, String>dsSV = new HashMap<Integer, String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CHÀO MỪNG BẠN ĐẾN VỚI CHƯƠNG TRÌNH");
		for (;;)
		{
			System.out.println("-----------------------------");
			System.out.println("Danh sách hiện tại gồm có: ");
			System.out.println("0.");
			for (Integer key : dsSV.keySet()) {
				System.out.println(key + ". " + dsSV.get(key));
			}
			System.out.println("-----------------------------");
			
			System.out.println("Lựa chọn tác vụ: ");
			System.out.println("1. Thêm Sinh Viên");
			System.out.println("2. Sửa Sinh Viên");
			System.out.println("3. Xóa Sinh Viên chưa tên bất kỳ");
			System.out.println("4. Tìm Sinh Viên tên có chữ An");
			System.out.println("5. Xuất ra các mã sinh viên");
			System.out.println("6. Xuất ra các tên sinh viên");
			System.out.println("7. Sắp xếp danh sách.");
			System.out.println("8. Thoát chương trình");
			int a = new Scanner(System.in).nextInt();
			switch (a) {
			case 1:
				themSinhVien();
				break;

			case 2:
				suaSinhVien();
				break;
				
			case 3:
				xoaSinhVien();
				break;	
				
			case 4:
				timAn();
				break;
				
			case 5:
				xuatMa();
				break;
				
			case 6:
				xuatTen();
				break;
			
			case 7:
				xapSep();
				break;
				
			case 8:
				System.out.println("Tạm biệt!");
				System.exit(0);
				break;
			}
		}
	}

	//thêm sinh viên
	public static void themSinhVien() {
		System.out.println("Bạn chọn thêm sinh viên, hãy nhập mã số sinh viên:");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Hãy nhập tên sinh viên:");
		String b = new Scanner(System.in).nextLine();
		dsSV.put(a, b);
	}
	
	//sửa sinh viên
	public static void suaSinhVien() {
		System.out.println("Bạn chọn sửa sinh viên, hãy nhập mã số sinh viên:");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Hãy nhập tên sinh viên:");
		String b = new Scanner(System.in).nextLine();
		dsSV.put(a, b);
	}
	
	//xóa sinh viên
	public static void xoaSinhVien() {
		System.out.println("Bạn chọn xóa sinh viên, hãy nhập mã số sinh viên:");
		int a = new Scanner(System.in).nextInt();
		dsSV.remove(a);
	}
	
	//tìm sinh viên tên An
	public static void timAn() {
		for (Integer key : dsSV.keySet()) {
			if (dsSV.get(key).contains("An")) {
				System.out.println(key + ". " + dsSV.get(key));
			}
		}
	}
	
	//xuất mã số sinh viên
	public static void xuatMa() {
		for (Integer key : dsSV.keySet()) {
			System.out.println(key);}
	}
	
	//xuất tên
	public static void xuatTen() {
		for (String value : dsSV.values()) {
			System.out.println(value);
		}
	}
	
	//sắp xếp
	public static void xapSep() {
		// tạo them nhiều arraylist cho tên, họ tên, mã số sinh viên, thay đổi thứ tự sắp xếp của cả 3 arraylist accordingly
	}
}
