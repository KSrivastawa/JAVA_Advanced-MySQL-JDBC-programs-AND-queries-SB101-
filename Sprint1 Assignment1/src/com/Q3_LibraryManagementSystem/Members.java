package com.Q3_LibraryManagementSystem;

import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Members implements Comparable<Members> {

	private int memberId;
	private int membershipNo;
	private String memberName;
	private String membershipEndDate;
	
	public Members(int memberId, int membershipNo, String memberName, String memebershipEndDate) {
		super();
		this.memberId = memberId;
		this.membershipNo = membershipNo;
		this.memberName = memberName;
		this.membershipEndDate =  memebershipEndDate;
	}

	
	
	public int getMemberId() {
		return memberId;
	}



	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}



	public int getMembershipNo() {
		return membershipNo;
	}



	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}



	public String getMemberName() {
		return memberName;
	}



	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}



	public String getMemebershipEndDate() {
		return membershipEndDate;
	}



	public void setMemebershipEndDate(String memebershipEndDate) {
		this.membershipEndDate = memebershipEndDate;
	}



	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Members other = (Members) obj;
		return memberId == other.memberId;
	}



	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", membershipNo=" + membershipNo + ", memberName=" + memberName
				+ ", memebershipEndDate=" + membershipEndDate + "]";
	}



	@Override
	public int compareTo(Members o) {
		
	    DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
	    
		String formattedDate = o.membershipEndDate.formatted(myDateFormat);

		return membershipEndDate.compareTo(o.membershipEndDate);
		
	}



	
	
}
