package com.marlabs.collections.examples;

public class Customer implements Comparable<Customer> {
	private String customerId;
	private String customerName;
	private long customerNumber;

	@SuppressWarnings("unused")
	private Customer() {
		System.out.println("Default Constructor");
	}

	/**
	 * @param customerId
	 * @param customerName
	 * @param customerNumber
	 */
	public Customer(String customerId, String customerName, long customerNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		System.out.println("HashCode" + customerId);
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + (int) (customerNumber ^ (customerNumber >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals" + obj);
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		if (customerId == null) {
			if (other.customerId != null) {
				return false;
			}
		} else if (!customerId.equals(other.customerId)) {
			return false;
		}
		if (customerName == null) {
			if (other.customerName != null) {
				return false;
			}
		} else if (!customerName.equals(other.customerName)) {
			return false;
		}
		if (customerNumber != other.customerNumber) {
			return false;
		}
		return true;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the customerNumber
	 */
	public long getCustomerNumber() {
		return customerNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerNumber="
				+ customerNumber + "]";
	}

	@Override
	public int compareTo(Customer o) {
		System.out.println("In compareTo: " + this.customerId + " with " + o.customerId);
		System.out.println("The result is: " + this.customerId.compareTo(o.customerId));
		// System.out.println("In compareTo: " + this.customerName + " with " +
		// o.customerName);
		// System.out.println("The Result is: " +
		// this.customerName.compareTo(o.customerName));
		return this.customerId.compareTo(o.customerId);
		// return this.customerName.compareTo(o.customerName);
	}

}
