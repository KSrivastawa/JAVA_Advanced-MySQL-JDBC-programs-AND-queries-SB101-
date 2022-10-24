package com.lms;

import java.util.Objects;

public class Members  {

	private int memberId;
	private String memberName;
	private int memberShipNo;
	private String membershipEndDate;
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberShipNo() {
		return memberShipNo;
	}
	public void setMemberShipNo(int memberShipNo) {
		this.memberShipNo = memberShipNo;
	}
	public String getMembershipEndDate() {
		return membershipEndDate;
	}
	public void setMembershipEndDate(String membershipEndDate) {
		this.membershipEndDate = membershipEndDate;
	}
	
	
	public Members(int memberId, String memberName, int memberShipNo, String membershipEndDate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberShipNo = memberShipNo;
		this.membershipEndDate = membershipEndDate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(memberId | memberShipNo);
		
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
		return this.memberId == other.memberId || this.memberShipNo == other.memberShipNo;
	}
	
	
	
	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", memberName=" + memberName + ", memberShipNo=" + memberShipNo
				+ ", membershipEndDate=" + membershipEndDate + "]";
	}
	
	
	
}
