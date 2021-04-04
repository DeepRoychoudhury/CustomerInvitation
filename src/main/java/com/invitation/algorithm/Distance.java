package com.invitation.algorithm;

public interface Distance<T> {
	public boolean isCustomerEligible(double distance);

	public T findDistance(T list);
}
