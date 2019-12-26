package hotantri.com;

import java.util.Scanner;

public class baiTapVeNha {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Mời bạn nhập vào số phần tử của chuỗi");
			int a = new Scanner(System.in).nextInt();
			int []chuoi = new int[a];
			for (int i = 0; i < chuoi.length; i++) {
				if (i != 0) {
					do {
						System.out.println("Nhập giá trị cho phần tử "+ (i+1));
						chuoi[i]=new Scanner(System.in).nextInt();
					}while (chuoi[i]<chuoi[i-1]);
				}
				else {
					chuoi[i]= new Scanner(System.in).nextInt();
				}
			}
			xuatMang(chuoi);
	}
	
	public static void xuatMang(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
