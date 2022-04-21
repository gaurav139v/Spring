package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Person {
	@Value("#{myBestFriends}")
	private List<String> friends;
	
//	private Map<String, Integer> feeStructure;
//	private Properties props;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	
//	public Map<String, Integer> getFeeStructure() {
//		return feeStructure;
//	}
//	
//	public Properties getProps() {
//		return props;
//	}
//
//	public void setProps(Properties props) {
//		this.props = props;
//	}
//
//	public void setFeeStructure(Map<String, Integer> feeStructure) {
//		this.feeStructure = feeStructure;
//	}

//	@Override
//	public String toString() {
//		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", props=" + props + "]";
//	}

			
	
}
