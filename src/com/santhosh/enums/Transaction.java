package com.santhosh.enums;

public class Transaction {

	private enum TransactionType {
		DEBIT("debit"),
		CREDIT("credit");

		private String type = null;

		TransactionType(String type) {
			this.type = type;
		}

		private static TransactionType fromValue(String str) {
			for (TransactionType type : values()) {
				if (type.name().equalsIgnoreCase(str)) {
					return type;
				}
			}
			throw new IllegalArgumentException(str + " type is invalid");
		}

		@Override
		public String toString() {
			return this.type;
		}
	}

	public void setTransactionType(String str) {
		TransactionType t = TransactionType.fromValue(str);
		System.out.println(t.toString());
	}
}
