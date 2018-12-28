
public class Problem31 {
	public static void main(String[] args) {
		int target = 200;
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int[] ways = new int[target + 1];
		ways[0] = 1;

		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <= target; j++) {
				ways[j] += ways[j - coins[i]];
			}
		}
		System.out.println(ways[target]);
	}
}
