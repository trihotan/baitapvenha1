package hotantri.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class baiTapVeArraylist {
	static ArrayList<String>dsSV = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CHÀO MỪNG BẠN ĐẾN VỚI CHƯƠNG TRÌNH");
		for (;;)
		{
			System.out.println("-----------------------------");
			System.out.println("Danh sách hiện tại gồm có: ");
			System.out.println("0.");
			for (int i = 0; i < dsSV.size(); i++)
			{
				System.out.println((i+1)+". "+ dsSV.get(i));
			}
			System.out.println("-----------------------------");
			System.out.println("Lựa chọn tác vụ: ");
			System.out.println("1. Thêm Sinh Viên");
			System.out.println("2. Sửa Sinh Viên");
			System.out.println("3. Xóa Sinh Viên chưa tên bất kỳ");
			System.out.println("4. Tìm Sinh Viên tên có chữ An");
			System.out.println("5. Sắp Xếp Sinh Viên");
			System.out.println("6. Xuất ra số lượng Sinh Viên");
			System.out.println("7. Thoát chương trình");
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
				timTenCoChuAn();
				break;
				
			case 5:
				sapXepSinhVien();
				break;
				
			case 6:
				xuatSoLuong();
				break;
			
			case 7:
				System.out.println("Tạm biệt!");
				System.exit(0);
				break;
			}
		}
	}
	
	//thêm sinh viên
	public static void themSinhVien() {
		System.out.println("Bạn chọn thêm sinh viên, hãy nhập tên sinh viên:");
		dsSV.add(new Scanner(System.in).nextLine().trim());
	}
	
	//sửa sinh viên
	public static void suaSinhVien() {
		System.out.println("Bạn chọn sửa sinh viên, vị trí của tên sinh viên muốn sửa");
		int a;
		do {
		a = new Scanner(System.in).nextInt();
		}while (a > dsSV.size());
		System.out.println("Nhập nội dung sửa");
		dsSV.set(a-1, new Scanner(System.in).nextLine().trim());
	}
	
	//xóa sinh viên có tên bất kỳ
	public static void xoaSinhVien() {
		System.out.println("Bạn chọn xóa sinh viên có tên bất kỳ, bạn muốn xóa sinh viên có tên nào:");
		String a = new Scanner(System.in).nextLine().trim();
		if (dsSV.contains(a)) {
			dsSV.remove(a);
		}
		else {
			System.out.println("Làm gì có tên đó hả mẹ");
		}
	}
	
	//tìm sinh viên bất kỳ tên có chữ An
	public static void timTenCoChuAn() {
		System.out.println("Bạn chọn tìm sinh viên tên có chữ An");
		for ( int i = 0; i < dsSV.size(); i++) {
			if (dsSV.get(i).contains("An")) {
				System.out.println(dsSV.get(i));
			}
		}
	}
	
	//sắp xếp sinh viên
	public static void sapXepSinhVien() {
		System.out.println("Bạn chọn sắp xếp sinh viên: ");
		for (int i = 0; i < dsSV.size() - 1; i++) {
			for (int j = dsSV.size() - 1; j > i; j--) {
				if (dsSV.get(j).compareTo(dsSV.get(j-1)) < 0) {
					String temp = dsSV.get(j);
					dsSV.set(j, dsSV.get(j - 1));
					dsSV.set(j - 1, temp);
				}
			}
		}
	}
	
	//xuất số lượng
	public static void xuatSoLuong() {
		System.out.println("số lượng sinh viên trong danh sách là:" + dsSV.size());
	}
}
