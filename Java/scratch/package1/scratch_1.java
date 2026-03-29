

public class scratch_1 {
	public static void main(String[] argv) {
		String s = "abcdefghijklmonopqrstuvwxyzsksdjfhiqehbqjwrebljausihrwqknrkqu";
		long sz = s.chars().distinct().count();
		System.out.println("count = "+ sz);
	}
}
