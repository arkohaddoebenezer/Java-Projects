package bankaccountapp;

interface BaseRate {
// return base rate
	default double getBaseRate() {
		return 2.5;
	}
}
