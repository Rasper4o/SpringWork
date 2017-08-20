package com.tutorial;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	
	ArrayList<String> addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProperties;
	
	public ArrayList<String> getAddressList() {
		System.out.println("List elements: " + addressList);
		
		return addressList;
	}
	
	public void setAddressList(ArrayList<String> addressList) {
		this.addressList = addressList;
	}
	
	public Set getAddressSet() {
		System.out.println("Set elements: " + addressSet);
		
		return addressSet;
	}
	
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	
	public Map getAddressMap() {
		System.out.println("Map elements: " + addressMap);
		
		return addressMap;
	}
	
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	
	public Properties getAddressProperties() {
		System.out.println("Properties elements: " + addressProperties);
		
		return addressProperties;
	}
	
	public void setAddressProperties(Properties addressProperties) {
		this.addressProperties = addressProperties;
	}
	
}
