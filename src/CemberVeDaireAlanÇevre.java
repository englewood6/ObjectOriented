
public class CemberVeDaireAlanÇevre {
	
	public static void main(String[] args) {
		//CemberDaire isimli sınıfın yarıçap alan kurucusu olmalı.Çevre ve alanı hesaplayan metotlar.
				CemberDaire cember1= new CemberDaire(5);
				System.out.printf("Yarıçapı 5 olan çemberin çevresi : %.2f ", cember1.cevreBul());
				System.out.println();
				System.out.printf("Yarıçapı 5 olan çemberin alanı : %.2f ", cember1.alanBul());
			}

		}

		class CemberDaire {
			
			private int yariCap;
			public final static double PI =3.14;
			
			public CemberDaire(int r) {
				this.yariCap=r;
				
			}
			
			public double cevreBul() {
				return 2 * PI * yariCap; 
			}
			public double alanBul() {
				return PI * Math.pow(yariCap, 2);
				}
		


	}


