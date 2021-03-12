import java.util.Date;

public class TestCheckTypeValue {

	public static void main(String[] args) {
		
		CheckValueType objet0 = new CheckValueType("Jonas");
		System.out.println();

		CheckValueType objet1 = new CheckValueType(0.20);
		System.out.println();

		Date now = new Date();
		CheckValueType objet2 = new CheckValueType(now.getTime());
		System.out.println();

		CheckValueType objet3 = new CheckValueType(1);
		System.out.println();

		CheckValueType objet4 = new CheckValueType(now);
		System.out.println();

		CheckValueType objet5 = new CheckValueType(2.6F);
		System.out.println();

	}

}
