import java.util.Scanner;



public class BillChangeApp {

	public static void main(String args[]) {

		double QUARTERS = 0.25, DIMES = 0.10, NICKELS = 0.05, PENNIES = 0.01;

		int quatersCount = 100, dimesCount = 100, nickelsCount = 100, penniesCount = 100;

		int quatersChange, dimesChange, nickelsChange, penniesChange;

		double totalAmount = (QUARTERS * quatersCount) + (DIMES * dimesCount) + (NICKELS * nickelsCount)
				+ (PENNIES * penniesCount);
		Scanner in = new Scanner(System.in);
		double amount;
		do {
			int totalCoinCount = 0;
			System.out.println("Enter dollar bill amount");
			amount = in.nextDouble();
			if (amount <= totalAmount) {

				totalAmount = totalAmount - amount;

				if (quatersCount > 0 && amount > 0) {
					amount = Math.round(amount * 100.0) / 100.0;

					quatersChange = (int) (amount / QUARTERS);

					if (quatersChange > quatersCount) {

						System.out.println("Quaters Count for given amount: " + quatersCount);
						totalCoinCount = totalCoinCount + quatersCount;
						amount = amount - (quatersCount * QUARTERS);
						quatersCount = 0;

					} else {
						System.out.println("Quaters Count for given amount:  " + quatersChange);
						totalCoinCount = totalCoinCount + quatersChange;
						amount = amount - (quatersChange * QUARTERS);
						quatersCount = quatersCount - quatersChange;

					}
				}

				if (dimesCount > 0 && amount > 0) {
					amount = Math.round(amount * 100.0) / 100.0;
					dimesChange = (int) (amount / DIMES);

					if (dimesChange > dimesCount) {
						System.out.println("Dimes Count for given amount: " + dimesCount);
						totalCoinCount = totalCoinCount + dimesCount;
						amount = amount - (dimesCount * DIMES);
						dimesCount = 0;

					} else {
						System.out.println("Dimes Count for given amount: " + dimesChange);
						totalCoinCount = totalCoinCount + dimesChange;
						amount = amount - (dimesChange * DIMES);
						dimesCount = dimesCount - dimesChange;

					}
				}

				if (nickelsCount > 0 && amount > 0) {
					amount = Math.round(amount * 100.0) / 100.0;
					nickelsChange = (int) (amount / NICKELS);

					if (nickelsChange > nickelsCount) {
						System.out.println("NICKELS Change for given amount: " + nickelsCount);
						totalCoinCount = totalCoinCount + nickelsCount;
						amount = amount - (nickelsCount * NICKELS);
						nickelsCount = 0;
					} else {

						System.out.println("NICKELS Change for given amount: " + nickelsChange);
						totalCoinCount = totalCoinCount + nickelsChange;
						amount = amount - (nickelsChange * NICKELS);
						nickelsCount = nickelsCount - nickelsChange;
					}
				}

				if (penniesCount > 0 && amount > 0) {
					amount = Math.round(amount * 100.0) / 100.0;
					penniesChange = (int) (amount / PENNIES);
					if (penniesChange > penniesCount) {
						System.out.println("Pennies Change for given amount: " + penniesCount);
						totalCoinCount = totalCoinCount + penniesCount;
						amount = amount - (penniesCount * PENNIES);
						penniesCount = 0;

					} else {
						System.out.println("Pennies Change for given amount:  " + penniesChange);
						totalCoinCount = totalCoinCount + penniesChange;
						amount = amount - (penniesChange * PENNIES);
						penniesCount = penniesCount - penniesChange;
					}
				}

				System.out.println("Total number of coins that were given for the given amount " + totalCoinCount);

			} else {
				System.out.println("Machine doesnt have enough coins. Avaialble amount: " + totalAmount);

			}
			System.out.println("\nAvaialble amount: " + totalAmount);
			System.out.println("Remaining Quarters Count: " + quatersCount);
			System.out.println("Remaining Dimes Count: " + dimesCount);
			System.out.println("Remaining Nickles Count: " + nickelsCount);
			System.out.println("Remaining Pennies Count: " + penniesCount);

		} while (amount <= totalAmount);
	}
}
