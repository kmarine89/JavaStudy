package pattern.E.Strategy;

public class PhoneSeller implements Seller {

	@Override
	public void sell() {
		System.out.println("전화기를 팔아요.");
	}

}
