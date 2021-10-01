package com.csse.pms.dal.adapter;

import java.util.Collection;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.csse.pms.dal.model.SupplierModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class SupplierDetailsServiceImpl implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;
	private String contactNo;
	private String address;
	private String location;
	private String status;

	@JsonIgnore
	private String password;
	
	
	public SupplierDetailsServiceImpl(String id,String name,String email,String password,String contactNo, String address,String location,  String status) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNo = contactNo;
		this.address = address;
		this.location = location;
		this.status = status;
	}
	
	public static SupplierDetailsServiceImpl build(SupplierModel supplier) {
		return new SupplierDetailsServiceImpl(  supplier.getId(),
												supplier.getName(), 
												supplier.getEmail(), 
												supplier.getPassword(), 
												supplier.getContactNo(), 
												supplier.getAddress(),
												supplier.getLocation(), 
												supplier.getStatus());
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean equals(Object object) {
		
		if (this == object) {
			return true;
		}
		
		if (object == null || getClass() != object.getClass()) {
			return false;	
		}
			
		SupplierDetailsServiceImpl user = (SupplierDetailsServiceImpl) object;
		
		return Objects.equals(id, user.id);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public String getAddress() {
		return address;
	}

	public String getLocation() {
		return location;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
