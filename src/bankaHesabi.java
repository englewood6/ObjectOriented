
public class bankaHesabi {

	public static void main(String[] args) {
		//Bir banka hesabı için sınıf tasarla. Hesabın kime ait olduğunu tutan çeşitli metotlar olsun.
		//Hesaplardaki tüm parayı,hesap sayısını,para çekme ve yatırma sayısı gösteren metotları yazın.
		//En sonunda iki hesabı para değişkenine göre birbiriyle kıyaslayacak metot bul.
		
		BankaHesap alper = new BankaHesap(123, 500);
		BankaHesap hasan = new BankaHesap(456, 1500);
		BankaHesap ayca = new BankaHesap(789, 200);
		
		ayca.paraYatir(500);
		alper.paraCek(600);
		hasan.paraCek(450);
		BankaHesap.bankaOzetiGoster();
		
		ayca.kiyasla(alper);
		alper.kiyasla(hasan);
	}

}

class BankaHesap{
	
	private int hesapNo;
	private int hesapBakiye;
	private static int tumBankaBakiyesi=0;
	private static int tumHesapSayisi=0;
	private static int operasyonSayisi=0;
	
	
	
	public BankaHesap(int hesapNo, int hesapBakiye) {
	
		this.hesapNo = hesapNo;
		this.hesapBakiye = hesapBakiye;
		tumBankaBakiyesi +=hesapBakiye;
		tumHesapSayisi ++;
	}
	
	public int getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}
	public int getHesapBakiye() {
		return hesapBakiye;
	}
	public void setHesapBakiye(int hesapBakiye) {
		this.hesapBakiye = hesapBakiye;
	}
	public void kiyasla(BankaHesap kiyaslanacakHesap) {
		
		if(this.getHesapBakiye() <kiyaslanacakHesap.getHesapBakiye()) {
			System.out.println(this.getHesapNo() + " nolu kişinin parası "+ kiyaslanacakHesap.getHesapNo()+" nolu kişinin parasından azdır ");
		}else if(this.getHesapBakiye() >kiyaslanacakHesap.getHesapBakiye()) {
			System.out.println(this.getHesapNo() + " nolu kişinin parası "+ kiyaslanacakHesap.getHesapNo()+" nolu kişinin parasından fazladır ");
		}
		else {
			System.out.println(this.getHesapNo() + " nolu kişinin parası "+ kiyaslanacakHesap.getHesapNo()+" nolu kişinin parasına eşittir ");
		}
		
		
	}
	
	public void paraYatir(int paraMiktari) {
		this.hesapBakiye += paraMiktari; 
		operasyonSayisi++;
		
	}
	
	public void paraCek(int paraMiktari) {
		
		if(this.hesapBakiye >=paraMiktari) {
			this.hesapBakiye -=paraMiktari;
			operasyonSayisi++;
			tumBankaBakiyesi -=paraMiktari;

		}
		else {
			System.out.println("Hesabınızda yeterli para yok");
		}
	}
	
	public static void bankaOzetiGoster() {
		
		System.out.println("Bankadaki hesap sayısı : "+ tumHesapSayisi);
		System.out.println("Bankadaki toplam para : "+ tumBankaBakiyesi);
		System.out.println("Bankadaki yapılan tüm operasyonların sayısı : "+ operasyonSayisi);
	}
	
}